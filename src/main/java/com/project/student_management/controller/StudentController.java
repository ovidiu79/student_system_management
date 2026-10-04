package com.project.student_management.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.student_management.dto.StudentDto;
import com.project.student_management.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		List<StudentDto> students = studentService.getAllStudents();
		
		model.addAttribute("students", students);
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String newStudent(Model model) {
		StudentDto studentDto = new StudentDto();
		
		model.addAttribute("student", studentDto);
		
		return "create_student";
	}
}
