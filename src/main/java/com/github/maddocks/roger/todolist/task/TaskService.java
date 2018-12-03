package com.github.maddocks.roger.todolist.task;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

// MVC model view controller

// controller code is business logic
// repository data persistence logic

@Service // MVC controller logic
public class TaskService {


    private List<Task> tasks = new ArrayList<Task>();

    public Task create(Task task) {
        if(findById(task.getId()) == null) {
            tasks.add(task);
        }
        return task;
    }

    public List<Task> list() {
        sortByIndex(tasks, tasks.size() - 1);
        return tasks;
    }

    public void sortByIndex(List<Task> toSort, int n) {
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            if(toSort.get(i).getIndex() > toSort.get(i+1).getIndex()) {
                Task temp = toSort.get(i);
                toSort.set(i, toSort.get(i+1));
                toSort.set(i+1, temp);
            }
            sortByIndex(toSort, n - 1);
        }
        return;
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
