package com.kickstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class ProjectController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String ValidateProject() {
        return "index";
    }

}
