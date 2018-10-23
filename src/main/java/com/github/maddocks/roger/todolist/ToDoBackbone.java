package com.github.maddocks.roger.todolist;

import com.github.maddocks.roger.todolist.task.Task;

import java.util.ArrayList;

public class ToDoBackbone {

    public static void main(String[] args) {
        ArrayList<Task> toDoList = new ArrayList<>();
        String newTask = "";
        String taskTextEdit = "";
        int index = 0;
        boolean taskComplete = false;

        //managed by GUI but tested here to see if successful
        //TaskA
        Task userTask = new Task();
        userTask.setIndex(index);
        newTask = "First thing to do";
        //prepare line to set "newTask" to be any user entered task
        userTask.setThingToDo(newTask);
        toDoList.add(userTask);
        index++;

        //TaskB
        Task secondTask = new Task();
        newTask = "Second thing to do";
        secondTask.setThingToDo(newTask);
        secondTask.setComplete(taskComplete);
        toDoList.add(secondTask);
        index++;

        //TaskC
        Task thirdTask = new Task();
        newTask = "This is my last thing to complete";
        secondTask.setThingToDo(newTask);
        taskComplete = false;
        secondTask.setComplete(taskComplete);
        toDoList.add(thirdTask);
        index++;

        //use GUI to select index of task to edit with either taskTextEdit or taskComplete, enter into this logic
        toDoList.get(index).setThingToDo(taskTextEdit);
        //taskComplete = true because user is finished
        toDoList.get(index).setComplete(taskComplete);


        for (Task eachTask : toDoList) {
            System.out.println(eachTask.getThingToDo());
            System.out.println("Task is complete? " + eachTask.isComplete());
        }
    }
}

