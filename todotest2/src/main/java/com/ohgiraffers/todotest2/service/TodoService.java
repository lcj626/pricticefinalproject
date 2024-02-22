package com.ohgiraffers.todotest2.service;

import com.ohgiraffers.todotest2.dto.TodoDTO;
import com.ohgiraffers.todotest2.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoMapper todoMapper;

    @Autowired
    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public List<TodoDTO> readAll(){
        return todoMapper.searchtodo();
    }

    public void addTodo(TodoDTO todo){
        todoMapper.inserttodo(todo);
    }
}
