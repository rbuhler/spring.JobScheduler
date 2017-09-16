package com.training.JobScheduler.controller;

import com.training.JobScheduler.service.ReceiveRecording;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {

    @Autowired
    ReceiveRecording service;

//    @PostMapping(value = "/record")
//    public @ResponseBody HttpStatus postRecord() throws Exception{
//        RecordRequest recordRequest = new RecordRequest();
//
//        final Recording recording = service.saveRecording(recordRequest);
//        return HttpStatus.CREATED;
//    }

    @RequestMapping("/")
    public @ResponseBody String welcome(){
        String message ="JobScheduler home page.";

        return message;
    }

    @RequestMapping(value = "/health")
    public @ResponseBody HttpStatus health(){

        return HttpStatus.OK;
    }

}