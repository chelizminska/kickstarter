package com.kickstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class ProjectController {

    @RequestMapping(value = "/validateProject", method = RequestMethod.GET)
    public @ResponseBody String ValidateProject() {
        return "index";
    }

}
