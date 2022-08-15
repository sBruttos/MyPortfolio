package com.example.portfolio.dao;

import com.example.portfolio.entity.StudentCourse;

public interface StudentCourseDao {

    int createStudentCourse(StudentCourse studentCourse);

    int editStudentCourse(StudentCourse studentCourse);

    int deleteStudentCourse(StudentCourse studentCourse);
}
