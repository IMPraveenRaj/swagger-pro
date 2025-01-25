package com.springheaven.swagger_demo.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Course {
    private int id;
    private String courseName;

}
