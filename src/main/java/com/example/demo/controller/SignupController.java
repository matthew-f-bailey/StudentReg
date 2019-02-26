package com.example.demo.controller;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class SignupController {
	
	@Autowired
	private StudentService ss;
	
				/**Model is populated from jsp and StudentService is called to **
				***perform logic and call DAO layer*****************************/
    @RequestMapping("/signupProcess")
    public ModelAndView signupProcess(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, HttpSession session) {
      
    	if (bindingResult.hasErrors()) {
    		ModelAndView mav = new ModelAndView("signup");
    		mav.addObject("sizeError", "Field must be 5 to 25 characters");
    		mav.addObject("dateError", "Invalid Date of Birth");
    		mav.addObject("pinError", "Field must be 5 to 25 characters");
    		return mav;
        }else {
        	ModelAndView mav = new ModelAndView("signupSuccess");
        	mav.addObject("studentName", student.getFirstname());
	        mav.addObject("pin", student.getPin());
	        //Call Service Layer and Persist Student Info
	        ss.saveStudent(student);
	        mav.addObject("studentid", student.getStudentid());
	      
	       session.setAttribute("studentid", student.getStudentid());
	       session.setAttribute("pin", student.getPin());
	       mav.addObject("sessionId", session.getId());
	       return mav;
        }
    } 
}