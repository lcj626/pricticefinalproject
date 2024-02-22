package com.ohgiraffers.todotest2.dto;

public class TodoDTO {

    private Long id;

    private String contents;

    private String status;


    public TodoDTO() {
    }

    public TodoDTO(Long id, String contents, String status) {
        this.id = id;
        this.contents = contents;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
