package com.example.portfolio.dao.dbConnection;

import java.util.ResourceBundle;

public class DBResManager {
    private final static DBResManager instance = new DBResManager();
    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

    public static DBResManager getInstance() {
        return instance;
    }
    private DBResManager(){
    }
    public String getValue(String key){
        return resourceBundle.getString(key);
    }
}
