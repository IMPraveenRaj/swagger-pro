package com.springheaven.swagger_demo.controller;

import com.springheaven.swagger_demo.model.Course;
import com.springheaven.swagger_demo.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping(value = "/courses")
    public List<Course> getAllCourses(){
        List<Course> allCourses= courseService.getAllCourses();
        return allCourses;
    }
}
