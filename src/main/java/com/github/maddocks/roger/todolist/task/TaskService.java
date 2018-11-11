package com.github.maddocks.roger.todolist.task;

import org.springframework.stereotype.Service;

import java.util.List;

// MVC model view controller

// controller code is business logic
// repository data persistence logic

@Service // MVC controller logic
public class TaskService {

    private List<Task> tasks;

    public Task create(Task task) {
        tasks.add(task);
        return task;
    }

    public List<Task> list() {
        return tasks;
    }

    public Task findById(String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    public Task update(String id, Task task) {
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

    public Task delete(String id) {
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
