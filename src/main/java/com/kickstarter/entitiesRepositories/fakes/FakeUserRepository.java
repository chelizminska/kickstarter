package com.kickstarter.entitiesRepositories.fakes;

import com.kickstarter.entitiesRepositories.IUserRepository;
import com.kickstarter.logic.domain.Role;
import com.kickstarter.logic.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeUserRepository implements IUserRepository {

    private List<User> users;

    public FakeUserRepository(){
        users = new ArrayList<>();
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List getAll() {
        return users;
    }

    @Override
    public void add(User entity) {
        users.add(entity);
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }
}
