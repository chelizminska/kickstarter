package com.kickstarter.logic.services;

import com.kickstarter.entitiesRepositories.IUserRepository;
import com.kickstarter.logic.domain.User;
import com.kickstarter.logic.services.exceptions.UserAlreadyExistsException;
import com.kickstarter.logic.services.exceptions.UserLoginException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {

    @Resource(name = "userRepository")
    private IUserRepository userRepository;

    @Override
    public User getUserByName(String userName) {
        return userRepository.getFirst("userName", userName);
    }

    @Override
    public void RegisterUser(User user) throws Exception {
        User existingUser = getUserByName(user.getUserName());
        if (existingUser != null){
            throw new UserAlreadyExistsException(user.getUserName());
        }
    }

    @Override
    public User LoginUser(String userName, String password) throws Exception{
        User existingUser = getUserByName(userName);
        if(existingUser == null){
            throw new UserLoginException();
        }

        return null;
    }
}
