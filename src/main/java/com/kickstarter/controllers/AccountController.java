package com.kickstarter.controllers;

import com.kickstarter.controllers.Extentions.CustomJsonResult;
import com.kickstarter.logic.domain.User;
import com.kickstarter.logic.services.IUserService;
import com.kickstarter.models.UserLoginModel;
import com.kickstarter.models.UserRegistrationModel;
import org.jboss.logging.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AccountController {

    @Resource(name = "userService")
    private IUserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CustomJsonResult Register(@Param UserRegistrationModel model) {

        User user = new User();
        user.setUserName("fake_user");
        return CustomJsonResult.TryGetJsonResult(userService, "registerUser", user);
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CustomJsonResult Login(@Param UserLoginModel model) {

        return CustomJsonResult.TryGetJsonResult(userService, "loginUser", model.getEmail(), model.getPassword());
    }


    @RequestMapping(value = "/logoff", method = RequestMethod.GET)
    @ResponseBody
    public String Logoff() {
        userService.getUserByName("lol");
        return "index";
    }
}
