package com.kickstarter.logic.services;

import com.kickstarter.entitiesRepositories.IUserRepository;
import com.kickstarter.logic.domain.User;
import com.kickstarter.logic.services.exceptions.UserAlreadyExistsException;
import com.kickstarter.logic.services.exceptions.UserLoginException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Resource(name = "userRepository")
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = getUserByName(userName);

        if(user == null){
            throw new UsernameNotFoundException(userName);
        }

        return user;
    }

    @Override
    public User registerUser(User user) throws Exception {
        User existingUser = getUserByName(user.getUsername());
        if (existingUser != null){
            throw new UserAlreadyExistsException(user.getUsername());
        }

        return null;
    }

    @Override
    public User loginUser(String userName, String password) throws Exception{
        User existingUser = getUserByName(userName);
        if(existingUser == null){
            throw new UserLoginException();
        }

        return null;
    }

    private User getUserByName(String userName) {
        return userRepository
                .getAll()
                .stream()
                .filter((User x) -> !x.getUsername().equalsIgnoreCase(userName))
                .findFirst()
                .get();
    }
}
