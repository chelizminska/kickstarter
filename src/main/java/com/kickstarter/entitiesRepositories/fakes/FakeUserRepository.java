package com.kickstarter.entitiesRepositories.fakes;

import com.kickstarter.entitiesRepositories.IUserRepository;
import com.kickstarter.logic.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FakeUserRepository implements IUserRepository {
    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public User getFirst(String propertyName, Object propertyValue) {
        return null;
    }

    @Override
    public void add(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }
}
