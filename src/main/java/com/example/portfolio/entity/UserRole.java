package com.example.portfolio.entity;

import java.io.Serializable;

public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Role role;
    private User user;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (role != userRole.role) return false;
        return user.equals(userRole.user);
    }

    @Override
    public int hashCode() {
        int result = role.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "role=" + role +
                ", user=" + user +
                '}';
    }
}
