package com.example.portfolio.dao;

import com.example.portfolio.dao.impl.CourseDaoImpl;
import com.example.portfolio.dao.impl.StudentCourseDaoImpl;
import com.example.portfolio.dao.impl.UserDaoImpl;

public class DaoFactory {
    private static DaoFactory instance = new DaoFactory();

    private final UserDao userDaoImpl = new UserDaoImpl();
    private final CourseDao courseDaoImpl = new CourseDaoImpl();

    private final StudentCourseDao studentCourseDaoImpl = new StudentCourseDaoImpl();

    private DaoFactory (){
    }
    public static DaoFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao () {
        return userDaoImpl;
    }

    public CourseDao getCourseDao (){
        return courseDaoImpl;
    }

    public StudentCourseDao getStudentCourseDao() {
        return studentCourseDaoImpl;
    }
}
