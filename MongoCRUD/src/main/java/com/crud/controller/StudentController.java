package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.repo.IStudentRepository;

@RestController
public class StudentController {
	
	@Autowired 
	IStudentRepository iStudentRepository;
	
	@PostMapping("/addstudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		Student studentSaved = iStudentRepository.save(student);
		return ResponseEntity.ok(studentSaved);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudents(){
		return iStudentRepository.findAll();
		
	}
	
	@PutMapping("/updatestudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
		Student studentToBeupdated = iStudentRepository.findById(id).get();
		studentToBeupdated.setId(student.getId());
		studentToBeupdated.setName(student.getName());
		studentToBeupdated.setCity(student.getCity());
		studentToBeupdated.setCollege(student.getCollege());
		return ResponseEntity.ok(studentToBeupdated);	
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		iStudentRepository.deleteById(id);
		
	}
	
	@DeleteMapping("/deleteAllStudents")
	public void deleteAllStudents() {
		iStudentRepository.deleteAll();
		
	}

}
