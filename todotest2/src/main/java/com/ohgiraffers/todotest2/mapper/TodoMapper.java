package com.ohgiraffers.todotest2.mapper;

import com.ohgiraffers.todotest2.dto.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {

    List<TodoDTO> searchtodo();

    void inserttodo(TodoDTO todoDTO);
}
