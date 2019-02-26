package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.*;

@Service
public class StudentService {

	
	@Autowired
	StudentDao sd;
	
	public boolean saveStudent(Student student) {
		//Creating Unique Student ID Number
		char fInitial = student.getFirstname().charAt(0);
		char lInitial = student.getLastname().charAt(0);
		//Appends number after initials and checks against db
		for(int i=101; i<999; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(fInitial);
			sb.append(lInitial);
			sb.append(i);
			String id = sb.toString();
			//Will return true if username exists in db already
			boolean checkIdExists = sd.existsByStudentid(id);
			if(!checkIdExists) {
				student.setId(id);
				break;
			}
		}
		sd.save(student);
		return true;
		}
		
	public boolean validateStudent(Student student) {
		Student dbStudent = sd.findByStudentid(student.getStudentid());
		
		if(dbStudent.getPin()==student.getPin() && dbStudent.getStudentid().equals(student.getStudentid())) {
			System.out.println("Student Found In Database!");
			return true;
		}else {
			System.out.println("Student Not Found In Database...");
			return false;
		}
	}
	
	}

	

