package com.project.student_management.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.student_management.dto.StudentDto;
import com.project.student_management.entity.Student;
import com.project.student_management.mapper.StudentMapper;
import com.project.student_management.repository.StudentRepository;
import com.project.student_management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		
		List<StudentDto> studentDtos = students.stream().map((student) -> StudentMapper.mapToStudentDto(student)).collect(Collectors.toList());
		
		return studentDtos;
	}
	
}
