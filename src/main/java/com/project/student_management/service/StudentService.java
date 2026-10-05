package com.project.student_management.service;

import java.util.List;

import com.project.student_management.dto.StudentDto;

public interface StudentService {
	List<StudentDto> getAllStudents();
	
	void createStudent(StudentDto student);
}
