package com.kickstarter.entitiesRepositories;

import com.kickstarter.logic.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends RepositoryBase<User> implements IUserRepository{

    public UserRepository(){
        super(User.class);
    }
}
