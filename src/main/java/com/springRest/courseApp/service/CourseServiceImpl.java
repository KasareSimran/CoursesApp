package com.springRest.courseApp.service;

import com.springRest.courseApp.repository.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //spring framework will identityfy this is service and provide implementation which is going on service layer
public class CourseServiceImpl implements CourseService{

//    List<Course> list;
//    public CourseServiceImpl(){
//            list=new ArrayList<>();
//            list.add(new Course(123,"java course","you will learn basics java"));
//            list.add(new Course(124,"spring course","you will learn basics of spring"));
//    }
//    @Override
//    public List<Course> getCourses() {
//        return list;
//    }
//
//    @Override
//    public Course getCourse(long courseId) {
//
//        Course c=null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
//        return c;
//    }
//
//    @Override
//    public Course addCourse(Course course) {
//
//        list.add(course);
//        return course;
//    }
//
//    @Override
//    public Course updateCourse(Course course) {
//
//        for (Course e : list) {
//            if (e.getId() == course.getId()) {
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//
//                break;
//            }
//        }
//
//        return course;
//    }
//
//    @Override
//    public boolean deleteCourse(long courseId) {
//
//        return list.removeIf(course -> course.getId()==courseId);
//    }


    @Autowired
    private courseRepo repo;


}
