package com.springheaven.swagger_demo.service;

import com.springheaven.swagger_demo.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    public List<Course> getAllCourses() {

        return List.of(Course.builder().id(1).courseName("java").build(),
                Course.builder().id(2).courseName("Spring Boot").build(),
                Course.builder().id(3).courseName("MicroService").build());
    }
}
