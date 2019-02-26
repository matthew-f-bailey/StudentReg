package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;

@Repository
public interface SaveCourseDao extends JpaRepository<Course,Long>{
	
	ArrayList<Course> findByStudentid(String studentid);

}
