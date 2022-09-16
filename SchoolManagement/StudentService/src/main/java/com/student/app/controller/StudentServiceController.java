package com.student.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSResourceResolver;

import com.student.app.entity.Student;

@RestController
public class StudentServiceController {
	
	private static Map<String, List<Student>> schooldb = new HashMap<String, List<Student>>();
	
	static {
		schooldb = new HashMap<String, List<Student>>();
		
		List<Student> lst = new ArrayList<Student>();
		Student student1 = new Student("Nishant", "class9");
		Student student2 = new Student("Bharathi", "class8");
		lst.add(student1);
		lst.add(student2);
		
		schooldb.put("School1", lst);
		
		List<Student> lst2 = new ArrayList<Student>();
		Student student3 = new Student("Vijay", "class9");
		Student student4 = new Student("Megha", "class8");
		lst2.add(student3);
		lst2.add(student4);
		schooldb.put("School2", lst2);
		
	}
	
	@RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
	public List<Student> getStudents(@PathVariable String schoolname){
		
		System.out.println("Getting School name"+schoolname);
		List<Student> studentsForSchool = schooldb.get(schoolname);
		
		if(studentsForSchool == null) {
			studentsForSchool = new ArrayList<Student>();
			Student student = new Student("404 not found", "N/A");
			studentsForSchool.add(student);
		}
		return studentsForSchool;
		
	}

}
