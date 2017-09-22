package com.training.JobScheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {

    @RequestMapping("/")
    public @ResponseBody String welcome(){
        String message ="JobScheduler home page.";

        return message;
    }
}