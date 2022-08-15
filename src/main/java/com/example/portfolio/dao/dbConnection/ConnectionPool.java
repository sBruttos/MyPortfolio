package com.example.portfolio.dao.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private int poolsize;
    private String driver;
    private String url;
    private String user;
    private String password;
    private String encoding;
    private String useUnicode;
    private String charSet;

    private static ConnectionPool instance = new ConnectionPool();
    private BlockingQueue<ProxyConnection> freeConnection;
    private Queue<ProxyConnection> giveAwayConnection;


    public static ConnectionPool getInstance() {
        if (instance == null)
            instance = new ConnectionPool();
        return instance;
    }

    private ConnectionPool() {

        DBResManager dbResManager = DBResManager.getInstance();
        this.driver = dbResManager.getValue(DBParameter.DRIVER);
        this.url = dbResManager.getValue(DBParameter.URL);
        this.encoding = dbResManager.getValue(DBParameter.ENCODING);
        this.user = dbResManager.getValue(DBParameter.USER);
        this.password = dbResManager.getValue(DBParameter.PASSWORD);
        try {
            this.poolsize = Integer.parseInt(dbResManager.getValue(DBParameter.POOL_SIZE));
        } catch (NumberFormatException e) {
            poolsize = 10;
        }
        this.useUnicode = dbResManager.getValue(DBParameter.USE_UNICODE);
        this.charSet = dbResManager.getValue(DBParameter.CHAR_SET);
        freeConnection = new ArrayBlockingQueue<>(poolsize);
        giveAwayConnection = new ArrayDeque<>(poolsize);
        initPoolData();
    }

    private void initPoolData()  {
        try {
            Class.forName(driver);
            for (int i = 0; i < poolsize; i++) {
                Connection connection = DriverManager.getConnection(url, user,
                        password);
                ProxyConnection proxyConnection = new ProxyConnection(connection);
                freeConnection.add(proxyConnection);
            }
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        ProxyConnection connection;
        try {
            connection = freeConnection.take();
            giveAwayConnection.offer(connection);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void releaseConnection(Connection connection) throws SQLException {
        if (connection.getClass().equals(ProxyConnection.class)) {
            giveAwayConnection.remove(connection);
            freeConnection.offer((ProxyConnection) connection);
        }
    }

    public void removeConnection() {
        for (int i = 0; i < poolsize; i++) {
            try {
                freeConnection.take().realClose();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        deregisterDriver();
    }

    private void deregisterDriver() {
        DriverManager.getDrivers().asIterator().forEachRemaining(driver -> {
            try {
                DriverManager.deregisterDriver(driver);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
