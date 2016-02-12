package com.kickstarter.logic.services;

import com.kickstarter.logic.domain.User;

public interface IUserService {
    User getUserByName(String name);
    void registerUser(User user) throws Exception;
    User loginUser(String userName, String password) throws Exception;
}
