package com.kickstarter.logic.services;

import com.kickstarter.logic.domain.User;

public interface IUserService {
    User getUserByName(String name);
    void RegisterUser(User user) throws Exception;
    User LoginUser(String userName, String password) throws Exception;
}
