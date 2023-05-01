package com.donbaton.todoProcessor.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
    public void rewriteTodos(Todo[] todo) {
        todoRepository.deleteAll();
        Arrays.stream(todo).forEach(todoRepository::save);
    }
}
