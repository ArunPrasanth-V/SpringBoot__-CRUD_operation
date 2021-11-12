package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.DB.Store_data;

@Controller
public class Controller_view {
	 Controller_view()
	 {
		 System.out.println("yeah am checking..!!");
	 }
	 @RequestMapping("index")
	 public String check()
	 {
		 
		 return ("index"); 
	 }
   
}
