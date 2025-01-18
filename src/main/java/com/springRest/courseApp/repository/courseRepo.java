package com.springRest.courseApp.repository;

import com.springRest.courseApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepo extends JpaRepository<Course,Long> {
}
