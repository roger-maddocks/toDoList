package com.diti.springboot;

import java.util.ArrayList;

public class Task {

    boolean complete = false;
    int index = 0;
    String thingToDo = "";

    Task () {
        boolean complete = false;
        int index = 0;
        String thingToDo = "";

    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getThingToDo() {
        return thingToDo;
    }

    public void setThingToDo(String thingToDo) {
        this.thingToDo = thingToDo;
    }
/////////////////////////////////////////////

/*
    public void markTaskComplete(Task toMark) {
        toMark.
    }

    public void addTask(ArrayList toDoList, int addIndex, Task taskToAdd, boolean complete) {
        //add a new task to the to do list, default to incomplete
        //toDoList.add(task);
        toDoList.add(addIndex, taskToAdd);
        taskToAdd. = false;
        //this.index++;
    }

    public Task editTask(ArrayList toDoList, int addIndex, Task taskToEdit, boolean complete) {
        //return text at index and allow to be edited and/or marked as complete
        toDoList.add(addIndex, taskToEdit);
        task.

    }

    public String removeTask(String toClear) {
        //remove task at index
        toClear = "";
        return toClear;
    }

    public String viewTasks() {
        //display to do list in entirety
        return "Full list of tasks";
    }

*/

}
