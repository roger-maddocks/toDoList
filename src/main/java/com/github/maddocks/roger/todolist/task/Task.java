package com.github.maddocks.roger.todolist.task;

public class Task {

    private String id;
    private boolean complete;
    private int index;
    private String thingToDo;

    public Task() {}

    public Task(String id, boolean complete, int index, String thingToDo) {
        this.id = id;
        this.complete = complete;
        this.index = index;
        this.thingToDo = thingToDo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
