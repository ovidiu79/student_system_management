package com.project.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.student_management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
