package com.andreu.taskmaster.controller;

import com.andreu.taskmaster.model.Task;
import com.andreu.taskmaster.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks") // La URL base para todas las peticiones de este controlador
public class TaskController {

    private final TaskService taskService;

    // Inyectamos el servicio
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Endpoint para CREAR una nueva tarea
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}