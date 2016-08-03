package com.watchstreets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView showentry() {
		ModelAndView mv=new ModelAndView("Landing");
			
		System.out.println("success 1st page");
			return mv;
			}

@RequestMapping("/Login")
public ModelAndView showlogin() {
	ModelAndView mv=new ModelAndView("Login");
		
	System.out.println("success 2nd page");
		
		return mv;
		}
@RequestMapping("/Registration")
public ModelAndView showregistration() {
	ModelAndView mv=new ModelAndView("Registration");
		
	System.out.println("success 3rd page");
		
		return mv;
		}



@RequestMapping("/Watches")
public ModelAndView saibaba3() {
	ModelAndView mv=new ModelAndView("Watches");
		
	System.out.println("success 3rd page");
		
		return mv;
		}

}
