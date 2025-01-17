package com.springRest.courseApp.controller;


//import org.springframework.stereotype.Controller;
import com.springRest.courseApp.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //by adding this anotation now springboot will understand ki it have cass mycontroller
public class MyController   {

    @GetMapping("/home")
    public String home(){

        return "helooo world";
    }

    //getting all courses
    @GetMapping("/courses")
    public List<Course> getCourses(){

        return;
    }
}
