package com.training.JobScheduler.service;

import com.training.JobScheduler.models.RecordRequest;
import com.training.JobScheduler.persistency.entity.Recording;
import com.training.JobScheduler.persistency.repository.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class ReceiveRecording {

    @Autowired
    private RecordingRepository repository;

    public Recording saveRecording(RecordRequest request){
        Recording rec  = new Recording();

        Calendar calendar = new GregorianCalendar();
        Date date = new Date();

        calendar.setTime(date);

        // TODO: 16/09/2017
        /*
            Take the "request" unMarshall it and store into "observation"
         */

        rec.setIssueDate(calendar.getTimeInMillis());
        rec.setChangeDate(calendar.getTimeInMillis());
        rec.setObservation("");

        return repository.save(rec);
    }

}
