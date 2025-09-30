package com.andreu.taskmaster.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;

@Document(collection = "tasks")
@Data
public class Task {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
}