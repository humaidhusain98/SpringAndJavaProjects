package com.humaid.aws.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController 
{
	private static final List<Student> STUDENTS = Arrays.asList(
			new Student(1, "Tuba Husain"),
			new Student(2, "Humaid Husain"),
			new Student(3, "Atiba Husain")
			
			);
	
	//PreAuthorize can have hasRole('ROLE_') hasAnyRole('ROLE_') hasAnyAuthorithy('permission') hasAnyAuthority('permission')
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
	public List<Student> getAllStudents()
	{
		System.out.println("GET ALL STUDENTS");
		return STUDENTS;
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('student:write')")
	public void registerNewStudent(@RequestBody Student student) 
	{
		System.out.println("ADD NEW STUDENT");
		System.out.println(student.toString());
		
	}
	
	@DeleteMapping(path="{studentId}")
	@PreAuthorize("hasAuthority('student:write')")
	public void deleteStudent(@PathVariable("studentId") Integer studentId) 
	{
		System.out.println("DELETE STUDENT BY USERID");
		System.out.println(studentId);
	}
	
	@PutMapping(path="{studentId}")
	@PreAuthorize("hasAuthority('student:write')")
	public void updateStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student) 
	{
		System.out.println("EDIT STUDENT");
		System.out.println(String.format("%s %s",studentId,student.toString()));
		
		
	}
	
	
	
}
