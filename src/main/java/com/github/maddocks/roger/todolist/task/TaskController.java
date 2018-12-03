package com.github.maddocks.roger.todolist.task;

import com.sun.javafx.tools.packager.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Logger;

@RestController // MVC View logic
@RequestMapping("/v1/tasks")
public class TaskController {

    private final TaskService taskService; //Need to add Logger, is this correct position?

    @Autowired
    public TaskController(
            TaskService taskService
    ) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.create(task);
    }

    @GetMapping
    public List<Task> list() {
        return taskService.list();
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable String id) {
        return taskService.findById(id);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable String id, @RequestBody Task task) {
        return taskService.update(id, task);
    }

    @DeleteMapping("/{id}")
    public Task delete(@PathVariable String id) {
        return taskService.delete(id);
    }
}
