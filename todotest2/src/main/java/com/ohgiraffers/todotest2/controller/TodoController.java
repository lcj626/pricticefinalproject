package com.ohgiraffers.todotest2.controller;

import com.ohgiraffers.todotest2.dto.TodoDTO;
import com.ohgiraffers.todotest2.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<TodoDTO>> getAllTodos() {
        List<TodoDTO> todoList = todoService.readAll();
        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/todo")
    public String todo(Model model) {
        List<TodoDTO> todoDtoList = this.todoService.readAll();
        model.addAttribute("todoList", todoDtoList);
        return "todo";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/todo";
    }

    @PostMapping("/todo")
    public void addTodo(@RequestBody TodoDTO todo){
        todoService.addTodo(todo);
    }
}
