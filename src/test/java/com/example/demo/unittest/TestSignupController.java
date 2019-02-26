package com.example.demo.unittest;
/**
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import com.example.demo.controller.SignupController;
import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


public class TestSignupController {
	
	private MockMvc mockMvc;

    @Mock
    private StudentService service;

    @InjectMocks
    private SignupController controller;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(controller)
                .build();
    }
    
    
    @Test
    public void testSignupProcess() throws Exception {
    	/**Student student = new Student("MB200", 1274, "Matthew", "Bailey", new Date());
    	
    	SignupController c= new SignupController();
         ModelAndView mav= c.signupProcess(student, null, null);
         Assert.assertEquals("signupSuccess", mav.getViewName());
    	 
    	
    	
       String studentid = "MB101";
       ModelAndView mav = new ModelAndView("signup");
       mav.addObject(studentid, "MB101");
       assertEquals( "signup", mav.getViewName());
        
         
       
       
   
    	}
    	  **/
    
