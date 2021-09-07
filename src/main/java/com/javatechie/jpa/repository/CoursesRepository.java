package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {
}
