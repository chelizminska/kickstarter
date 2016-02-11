package com.kickstarter.controllers;

import com.kickstarter.logic.services.IUserService;
import com.kickstarter.models.UserLoginModel;
import com.kickstarter.models.UserRegistrationModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class AccountController {

    @Resource(name = "userService")
    private IUserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String Register(UserRegistrationModel model) {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(UserLoginModel model) {
        return "index";
    }

    @RequestMapping(value = "/logoff", method = RequestMethod.GET)
    public String Logoff() {
        userService.getUserByName("lol");
        return "index";
    }
}
