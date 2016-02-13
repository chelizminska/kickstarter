package com.kickstarter.logic.domain;

import java.util.List;

public class Role extends EntityBase {
    private String roleName;
    private List<User> users;

    public static final String UserRoleName = "User";
    public static final String AdminRoleName = "Administrator";

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
