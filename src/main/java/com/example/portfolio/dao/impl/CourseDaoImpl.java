package com.example.portfolio.dao.impl;

import com.example.portfolio.dao.CourseDao;
import com.example.portfolio.dao.dbConnection.ConnectionPool;
import com.example.portfolio.dao.dbConnection.ProxyConnection;
import com.example.portfolio.entity.Course;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDaoImpl implements CourseDao {

    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String SQL_CREATE_COURSE = "insert into course (name,startDate,endDate,User_id) values (?,?,?,?)";
    private static final String SQL_EDIT_COURSE = "update course set course.User_id = ? where course.id = ?";

    private static final String SQL_DELETE_COURSE = "delete from  course where course.id = ?";

    @Override
    public int createCourse(Course course) {

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement createStatement = connection.prepareStatement(SQL_CREATE_COURSE)) {

            createStatement.setString(1, course.getName());
            createStatement.setDate(2, java.sql.Date.valueOf(course.getStartDate()));
            createStatement.setDate(3, java.sql.Date.valueOf(course.getEndDate()));
            createStatement.setInt(4, course.getUser().getId());

            createStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int editCourse(Course course) {

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement editStatement = connection.prepareStatement(SQL_EDIT_COURSE)) {

            editStatement.setInt(1, course.getUser().getId());
            editStatement.setInt(2, course.getId());

            editStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int deleteCourse(Course course) {

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
        PreparedStatement deleteStatement = connection.prepareStatement(SQL_DELETE_COURSE)) {

            deleteStatement.setInt(1,course.getId());

            deleteStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
