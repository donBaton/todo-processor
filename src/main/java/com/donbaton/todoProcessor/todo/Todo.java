package com.donbaton.todoProcessor.todo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Table(name = "todos")
@Entity
@Data
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private boolean isActive;
    private LocalDateTime created_date;
}
