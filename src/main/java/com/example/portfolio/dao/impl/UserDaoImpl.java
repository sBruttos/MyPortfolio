package com.example.portfolio.dao.impl;

import com.example.portfolio.dao.UserDao;
import com.example.portfolio.dao.dbConnection.ConnectionPool;
import com.example.portfolio.dao.dbConnection.ProxyConnection;
import com.example.portfolio.entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String SQL_CREATE_USER = "insert into user (name,surname,login,password,status) values (?,?,?,?,?)";
    private static final String SQL_UPDATE_USER = "update user set user.password = ? where user.id = ?";
    private static final String SQL_DELETE_USER = "delete from user where user.id = ?";

    @Override
    public boolean createUser(User user) {
        boolean result;

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement createStatement = connection.prepareStatement(SQL_CREATE_USER)) {

            createStatement.setString(1, user.getName());
            createStatement.setString(2,user.getSurname());
            createStatement.setString(3, user.getLogin());
            createStatement.setString(4, user.getPassword());
            createStatement.setString(5, user.getStatus());
            createStatement.executeUpdate();
            result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    @Override
    public boolean editUser(User user) {
        boolean result;

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement editStatement = connection.prepareStatement(SQL_UPDATE_USER)) {

            editStatement.setString(1, user.getPassword());
            editStatement.setInt(2, user.getId());

            editStatement.executeUpdate();
            result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    @Override
    public boolean deleteUser(User user) {
        boolean result;

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement editStatement = connection.prepareStatement(SQL_DELETE_USER)) {

            editStatement.setInt(1, user.getId());

            editStatement.executeUpdate();
            result = true;

        } catch (SQLException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }
}
