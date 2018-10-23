package com.github.maddocks.roger.todolist.task;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    private List<Task> tasks;

    public TaskController() {
        tasks = new ArrayList<>();
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }

    @GetMapping
    public List<Task> list() {
        return tasks;
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable String id, @RequestBody Task task) {
        Task existing = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findAny()
                .orElse(null);
        if (existing == null) {
            return null;
        }

        tasks.remove(existing);
        tasks.add(task);
        return task;
    }

    @DeleteMapping("/{id}")
    public Task delete(@PathVariable String id) {
        Task existing = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findAny()
                .orElse(null);
        if (existing == null) {
            return  null;
        }

        tasks.remove(existing);
        return existing;
    }
}
