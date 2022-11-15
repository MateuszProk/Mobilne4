package com.example.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private  static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;
    public static TaskStorage getInstance() {return taskStorage;}
    private TaskStorage() {
        tasks = new ArrayList<>();
        for(int i = 1; i<=40;i++) {
            Task task = new Task();
            task.setName("Zadanie numer: " + i);
            task.setDone(i % 3 == 0||i%5==0);
            if((i+1)%3==0) {
                task.setCategory(Category.Studia);
            }
            else if(i%3==0){

                task.setCategory(Category.Praca);
            }
            else if((i+2)%5==0){
                task.setCategory(Category.Dom);
            }
            else{
                task.setCategory(Category.Zakupy);
            }
            tasks.add(task);
        }
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public Task getTask(UUID taskID) {
        for(Task task: tasks) {
            if(taskID.equals(task.getId())){
                return task;
            }
        }
        return null;
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
}
