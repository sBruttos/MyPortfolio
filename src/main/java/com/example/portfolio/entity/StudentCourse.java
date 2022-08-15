package com.example.portfolio.entity;

import java.io.Serializable;

public class StudentCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private User user;
    private Course course;
    private int mark;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentCourse that = (StudentCourse) o;

        if (id != that.id) return false;
        if (mark != that.mark) return false;
        if (!user.equals(that.user)) return false;
        if (!course.equals(that.course)) return false;
        return comment.equals(that.comment);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user.hashCode();
        result = 31 * result + course.hashCode();
        result = 31 * result + mark;
        result = 31 * result + comment.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "id=" + id +
                ", user=" + user +
                ", course=" + course +
                ", mark=" + mark +
                ", comment='" + comment + '\'' +
                '}';
    }
}
