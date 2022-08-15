package com.example.portfolio.dao;

import com.example.portfolio.entity.User;

public interface UserDao {
    boolean createUser (User user);

    boolean editUser (User user);

    boolean deleteUser(User user);
}
