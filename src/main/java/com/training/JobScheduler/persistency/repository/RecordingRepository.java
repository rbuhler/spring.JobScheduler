package com.training.JobScheduler.persistency.repository;

import com.training.JobScheduler.persistency.entity.Recording;
import com.training.JobScheduler.persistency.entity.RecordingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordingRepository extends JpaRepository<Recording, Long>{
    List<Recording> findByStatus(RecordingStatus status);

}
