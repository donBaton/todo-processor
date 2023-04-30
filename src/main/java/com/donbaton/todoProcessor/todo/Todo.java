package com.donbaton.todoProcessor.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table(name = "todos")
@Entity
public class Todo {
    @Id
    Long id;
    String title;
    String description;
    LocalDate createDate;
    boolean isDone;

    public Todo() {
    }

    public Todo(Long id, String title, String description, LocalDate createDate, boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.isDone = isDone;
    }

    public Todo(String title, String description, LocalDate createDate, boolean isDone) {
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", isDone=" + isDone +
                '}';
    }
}
