package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "courses")
public class Course {

		@Column
		@Id
		private long id;
		
		@Column(name="studentid",unique=true)
		private String studentid;
		
		@Column(name="coursename")
		private String coursename;
	
		//@ManyToOne
	  //  @JoinColumn
	 //   private Student student;
	
		public String getStudentid() {
			return studentid;
		}
		
		public void setStudentid(String studentid) {
			this.studentid = studentid;
		}
		public String getCoursename() {
			return coursename;
		}
		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Course [id=" + id + ", studentid=" + studentid + ", coursename=" + coursename + "]";
		}
		
		/**
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "student_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Student student;
		**/
		
		
		
		
		
		
		
		
		
}
