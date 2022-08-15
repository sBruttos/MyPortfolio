package com.example.portfolio.dao;

import com.example.portfolio.entity.Course;

public interface CourseDao {
    int createCourse(Course course);

    int editCourse(Course course);

    int deleteCourse(Course course);
}
