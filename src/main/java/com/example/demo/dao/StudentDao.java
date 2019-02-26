package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.*;
 
@Repository
public interface StudentDao extends CrudRepository<Student,Long> {

	  public boolean existsByStudentid(String studentid);
	
	  public Student findByStudentid(String studentid);
}