package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {
 
	@RequestMapping("/")
	public ModelAndView saibaba() {
		ModelAndView mv=new ModelAndView("Entry");
			mv.addObject("mssg", "success");
		System.out.println("success 1st page");
			
			
			return mv;
			}
	


	@RequestMapping("/Login")
public ModelAndView saibaba1() {
	ModelAndView mv=new ModelAndView("Login");
		mv.addObject("mssg", "success");
	System.out.println("success 2nd page");
		
		return mv;
		}



	@RequestMapping("/Saibaba")
	public ModelAndView saibaba2() {
		ModelAndView mv=new ModelAndView("Categories");
			mv.addObject("mssg", "failure");
		System.out.println("success 3rd page ");
			
			return mv;
			}





}	
