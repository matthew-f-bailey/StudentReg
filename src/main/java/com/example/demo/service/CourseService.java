package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.dao.SaveCourseDao;
import com.example.demo.model.Course;
import com.example.demo.model.CourseRow;

@Service
public class CourseService {

	@Autowired
	CourseDao cd;
	
	@Autowired
	SaveCourseDao scd;
	
	//ArrayList to add details later
	public ArrayList<CourseRow> getAllCourses(){
		ArrayList<CourseRow> list = (ArrayList<CourseRow>) cd.findAll();
		return list;
	}
	
	//ArrayList to add details later
		public ArrayList<Course> getStudentCourses(String studentid){
			ArrayList<Course> list = (ArrayList<Course>) scd.findByStudentid(studentid);
			return list;
		}
	
	public boolean saveCourse(Course course) {
		System.out.println("saving course");
		scd.save(course);
		return true;
	}

}
