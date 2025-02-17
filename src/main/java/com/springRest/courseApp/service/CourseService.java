package com.springRest.courseApp.service;

import com.springRest.courseApp.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public boolean deleteCourse(long courseId);
}
