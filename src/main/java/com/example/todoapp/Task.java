package com.example.todoapp;

import static com.example.todoapp.Category.Dom;

import androidx.annotation.NonNull;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Enum category;
    public void setCategory(Enum category) {
        this.category = category;
    }
    public Enum getCategory() {
        return category;
    }
    public Task() {
        category = Dom;
        id = UUID.randomUUID();
        date = new Date();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
    public boolean getDone() {
        if(done) {
            return true;
        }
        return false;
    }
}
