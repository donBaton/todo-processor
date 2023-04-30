package com.donbaton.todoProcessor.todo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "todos")
@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private LocalDate createDate;
    private boolean isDone;

    public Todo() {
    }

    public Todo(Long id, String description, LocalDate createDate, boolean isDone) {
        this.id = id;
        this.description = description;
        this.createDate = createDate;
        this.isDone = isDone;
    }

    public Todo(String description, LocalDate createDate, boolean isDone) {
        this.description = description;
        this.createDate = createDate;
        this.isDone = isDone;
    }

}
