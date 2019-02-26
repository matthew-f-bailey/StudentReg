package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {

		@Id
		@Column
		private String studentid;
		
		@Column
		@NotNull
		private int pin;
		
		@Column
		@NotNull
	    @Size(min = 5, max = 25, message = "{student.firstname.size}")
		private String firstname;
		
		@Column
		@Size(min = 5, max = 25, message = "{student.name.size}")
		private String lastname;
		
		@Column
		private Date dob;
		

		//@OneToMany(mappedBy="student")
		//private Set<Course> courses;
		
		
		public Student() {
			super();
		}

		public String getFirstname() {
			return firstname;
		}
		
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		
		public void setId(String studentid) {
			this.studentid = studentid;
		}
		public String getStudentid() {
			return studentid;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public void setStudentid(String studentid) {
			this.studentid = studentid;
		}



		public Student(String studentid, int pin, String firstname, String lastname, java.util.Date date) {
			// TODO Auto-generated constructor stub
		}
		
		

		
		
		
}
