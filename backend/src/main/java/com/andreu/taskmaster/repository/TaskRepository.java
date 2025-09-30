package com.andreu.taskmaster.repository;

import com.andreu.taskmaster.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
