package com.watchstreets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.watchstreets.model.Product;
import com.watchstreets.model.User;
import com.watchstreets.service.ProductService;
import com.watchstreets.service.UserService;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView showentry() {
		ModelAndView mv = new ModelAndView("Landing");
		System.out.println("sucess 1stpage");
		return mv;
	}

	@RequestMapping("/Cart")
	public ModelAndView showAdmin() {
		ModelAndView mv = new ModelAndView("Admin");
		System.out.println("sucess adminpage");
		return mv;
	}

	@RequestMapping("/Login")
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("Login");

		System.out.println("success 2nd page");

		return mv;
	}

	@RequestMapping("/Watches")
	public ModelAndView showwatches() {
		ModelAndView mv = new ModelAndView("Watches");

		System.out.println("success 4rd page");

		return mv;
	}

	@RequestMapping("/Product")
	public ModelAndView showproduct() {
		ModelAndView mv = new ModelAndView("Product");

		System.out.println("success 5th page");

		return mv;
	}

	@RequestMapping("/SignUp")
	public ModelAndView showsignup() {
		ModelAndView mv = new ModelAndView("SignUp");

		System.out.println("success 3rd page");

		return mv;
	}

	@Autowired
	UserService userService;
	User user;

	@RequestMapping("/register")
	public ModelAndView Registercontroller(@ModelAttribute User user,

			@RequestParam(value = "Email") String Email, @RequestParam(value = "Firstname") String Firstname,
			@RequestParam(value = "Lastname") String Lastname,

			@RequestParam(value = "Mobile") String Mobile, @RequestParam(value = "Address") String Address,
			@RequestParam(value = "Dateofbirth") String Dateofbirth, @RequestParam(value = "Password") String Password,
			@RequestParam(value = "Username") String Username

	)

	{

		user.setEmail(Email);
		user.setFirstname(Firstname);
		user.setLastname(Lastname);
		user.setMobile(Mobile);
		user.setAddress(Address);
		user.setDateofbirth(Dateofbirth);

		user.setPassword(Password);
		user.setUsername(Username);

		userService.saveOrUpdate(user);

		ModelAndView mv = new ModelAndView("Login");
		System.out.println("Register controller called");
		return mv;

	}

	@RequestMapping("/Add")
	public ModelAndView showAddpjsp() {
		ModelAndView mv = new ModelAndView("Add");
		System.out.println("sucess addproduct");
		return mv;
	}

	@Autowired
	ProductService productService;
	Product product;

	@RequestMapping("/productadd")
	public ModelAndView Productcontroller1(@ModelAttribute("product")Product product,Model model)

			
	{
		

		productService.saveOrUpdate(product);

		ModelAndView mv = new ModelAndView("Add");
		System.out.println("product controller called");
		return mv;

	}

}
