package com.example.controllercheck;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.DB.Store_data;
@Controller
public class Control_check {
   Control_check()
   {
	   System.out.println("yeah am checking..!!");
   }
	 @Autowired
		Store_data data;
	    
	    @RequestMapping("index")
	    public String showInfo()
	    {
	    	System.out.println("wheather it is calling");
	    	return "index";
	    }
		@RequestMapping("adduser")
		public String getDetails(@RequestParam long number,
				@RequestParam String name,HttpSession session)
		{
		session.setAttribute("name",name);
		session.setAttribute("number",number);
		System.out.println(name);
		System.out.println(number);
		//data.save()
		     return "index";
		}
}
