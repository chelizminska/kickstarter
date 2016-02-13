package com.kickstarter.entitiesRepositories;

import com.kickstarter.logic.domain.User;

import java.util.List;

public interface IUserRepository {

    User getById(Integer id);
    List<User> getAll();
    void add(User entity);
    void update(User entity);
    void delete(User entity);
}
