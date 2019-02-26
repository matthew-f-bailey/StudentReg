package com.example.demo.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Course;
import com.example.demo.model.CourseRow;
import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;

@Controller
@SessionAttributes(value = {"studentid", "pin"})
public class StudentController {

	@Autowired
	StudentService ss;
	
	@Autowired
	CourseService cs;
	
			//*************** SHOW COURSES PROCESS *********************//
	//When "Show Available Courses" is Clicked
	 @RequestMapping("/showCourses")
		public ModelAndView showCourses(HttpSession session) {
		 	ModelAndView mav = new ModelAndView("courseReg","course", new Course());
		 	ArrayList<CourseRow> list = cs.getAllCourses();
		 	mav.addObject("studentid", session.getAttribute("studentid"));
		 	mav.addObject("courseList", list);
		 	mav.addObject("listLength", list.size());
		 	return mav;
		}
	 
	 		//*************** COURSE REGISTRATION PROCESS *********************//
	 		//A lot of logic here.. Move out if have time
	 @RequestMapping(value = "/regProcess", method = RequestMethod.POST)
		public ModelAndView processReg(@ModelAttribute("course") Course course, HttpSession session) {
		 	ModelAndView mav = new ModelAndView("enrolledCourses");
		 	course.setStudentid((String) session.getAttribute("studentid"));
		 	mav.addObject("course", course.getCoursename());
		 	mav.addObject("studentid", course.getStudentid());
		 	
		 	//Save Condition1 : 4 courses or less
		 	ArrayList<Course> list = cs.getStudentCourses(course.getStudentid());
		 	System.out.println("List Size: "+list.size());
		 	
		 	//Save Condition2 : Already registered for course
		 	boolean available = true;
		 	for (int i=0; i<list.size(); i++) {
		 		if(course.getCoursename().toString().equals(list.get(i).getCoursename())) {
		 			available = false;	
		 		}
		 	};
		 	
		 	
		 	//Applying Conditions to save Course
		 	if(list.size()<=3 && available) { 		//Student has room and not already registered
		 		//add currently selected course
		 		//to db-fetched list to display
		 		list.add(0, course);
		 		mav.addObject("studentCourseList", list);
		 		cs.saveCourse(course);
		 		System.out.println("CourseSAVED!!!");
		 		
		 	}else if(list.size()<=3 && !available){ //Student has room but is already registered
		 		mav.addObject("studentCourseList", list);
		 		mav.addObject("courseError", "Course Not Added: You are currently enrolled in "+course.getCoursename()+".");
		 	}else{									//Student has no room
		 		mav.addObject("studentCourseList", list);
		 		mav.addObject("courseError", "Course Not Added: You are currently enrolled in max number of courses");
		 	}
		 	//System.out.println(session.getAttribute("studentid").toString());
		 	//Getting All of Students Courses for Enrolled Page
		 	return mav;
		}
	 

			 
	 
	 		//*************** LOGIN PROCESS *********************//
		 @RequestMapping("/loginProcess")
			public ModelAndView loginProcess(@ModelAttribute("student") Student student, HttpSession session) {		 	
			 	
			 	//Validate User Against DB
			 	boolean validated = ss.validateStudent(student);
			 	
			 	if(validated) {
			 		//fowarding to Success Page
			 		ModelAndView mav = new ModelAndView("signupSuccess");
				 	mav.addObject("studentid", student.getStudentid());
				 	mav.addObject("pin", student.getPin());
				 	System.out.println(student.getStudentid() + student.getPin());
				 	return mav;
			 	}else {
			 		ModelAndView mav = new ModelAndView("login");
			 		mav.addObject("message", "Username and password incorrect");
			 		return mav;
			 	}
			}
	 
		 
		 	//*************** LOGOUT PROCESS *********************//
	 @RequestMapping("/logout")
		public ModelAndView logout(HttpSession session) {
		 	session.invalidate();
		 	ModelAndView mav = new ModelAndView("index");
		 	return mav;
		}
	 
	 
}
