package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "availablecourses")
public class CourseRow {

		@Id
		@Column
		private String course;
		
		
		
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "CourseRow [course=" + course + "]";
		}
		
		
		
		
}
