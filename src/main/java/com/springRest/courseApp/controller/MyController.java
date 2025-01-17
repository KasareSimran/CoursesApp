package com.springRest.courseApp.controller;


//import org.springframework.stereotype.Controller;
import com.springRest.courseApp.model.Course;
import com.springRest.courseApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //by adding this anotation now springboot will understand ki it have cass mycontroller
public class MyController   {

    @Autowired //springbbot will handle evrything ,will create obj.
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){

        return "helooo world";
    }

    //getting all courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }


    //getting course by id
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }


    //adding the new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
