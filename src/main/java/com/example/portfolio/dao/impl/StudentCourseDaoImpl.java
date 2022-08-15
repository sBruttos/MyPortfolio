package com.example.portfolio.dao.impl;

import com.example.portfolio.dao.StudentCourseDao;
import com.example.portfolio.dao.dbConnection.ConnectionPool;
import com.example.portfolio.dao.dbConnection.ProxyConnection;
import com.example.portfolio.entity.StudentCourse;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCourseDaoImpl implements StudentCourseDao {

    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String SQL_CREATE_STUDENT_COURSE = "insert into studentCourse (comment,mark,Course_id,User_id) values (?,?,?,?)";

    private static final String SQL_EDIT_STUDENT_COURSE = "update studentCourse set studentCourse.comment =?,studentcourse.mark = ?  where studentCourse.id = ?";

    private static final String SQL_DELETE_STUDENT_COURSE = "delete from studentCourse where studentCourse.id = ?";

    @Override
    public int createStudentCourse(StudentCourse studentCourse)
    {
        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
             PreparedStatement createStatement = connection.prepareStatement(SQL_CREATE_STUDENT_COURSE)) {

            createStatement.setString(1,studentCourse.getComment());
            createStatement.setInt(2,studentCourse.getMark());
            createStatement.setInt(4,studentCourse.getUser().getId());
            createStatement.setInt(3,studentCourse.getCourse().getId());

            createStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int editStudentCourse(StudentCourse studentCourse) {

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
        PreparedStatement editStatement = connection.prepareStatement(SQL_EDIT_STUDENT_COURSE))
        {
            editStatement.setString(1, studentCourse.getComment());
            editStatement.setInt(2,studentCourse.getMark());
            editStatement.setInt(3,studentCourse.getId());

            editStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public int deleteStudentCourse(StudentCourse studentCourse) {

        try (ProxyConnection connection = (ProxyConnection) connectionPool.getConnection();
        PreparedStatement deleteStatement = connection.prepareStatement(SQL_DELETE_STUDENT_COURSE)) {

            deleteStatement.setInt(1,studentCourse.getId());
            deleteStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
