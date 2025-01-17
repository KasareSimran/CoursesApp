package com.springRest.courseApp.service;

import com.springRest.courseApp.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //spring framework will identityfy this is service and provide implementation which is going on service layer
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    public CourseServiceImpl(){
            list=new ArrayList<>();
            list.add(new Course(123,"java course","you will learn basics java"));
            list.add(new Course(124,"spring course","you will learn basics of spring"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }
}
