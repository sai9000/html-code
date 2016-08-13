package com.watchstreets.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
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
	
	@RequestMapping("/new user signup")
	public ModelAndView showsignup1() {
		ModelAndView mv = new ModelAndView("Loginsignup");
		System.out.println("sucess login to signup");
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
	
	@Autowired
	ProductService productService;
	Product product;
	
	//@RequestMapping(value="/Add",method = RequestMethod.GET)
	//public ModelAndView showAddpjsp(Model model) {
		
		//model.addAttribute("product",new Product());
		
		//ModelAndView mv = new ModelAndView("Add");
		//System.out.println("sucess addproduct");
		//return mv;
	
	
	
		@RequestMapping(value = "/Add", method = RequestMethod.GET)
		public String listProducts(Model model) {
			System.out.println("addpage mapping successfully");
			model.addAttribute("product", new Product());

       return "Add";
	
	
}
	
	
	
	
	
	
	
	//}

	

	//@RequestMapping(value="/productadd",method = RequestMethod.POST)
	//public ModelAndView Productcontroller1(@ModelAttribute("product")Product product,Model model,BindingResult result)

			
	//{
		

		//productService.saveOrUpdate(product);

		//ModelAndView mv = new ModelAndView("Add");
		//System.out.println("product controller called");
		//return mv;

	//}

//// For add and update product both
	
		@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	
		public String addProduct(@ModelAttribute("product") Product product,Model model,BindingResult result,
		@RequestParam("image") MultipartFile file,
		HttpServletRequest request)throws IOException

		
		{
			//String filename;
		 	//byte[]bytes;

			
			productService.saveOrUpdate(product);
	System.out.println("product controller called");
	MultipartFile image=product.getImage();
	Path path;
	path=Paths.get("D:/workspace/WatchStreet/src/main/webapp/resources/images//"+product.getId()+".jpg");
	
	System.out.println("Path = " + path);
    System.out.println("File name = " + product.getImage().getOriginalFilename());
    if(image!=null && !image.isEmpty())
    {
    	try
    	{
    	   image.transferTo(new File(path.toString()));
    	   System.out.println("Image Saved in:"+path.toString());
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		System.out.println("Image not saved");
    	}
    }

return "Add";
}

		String setName;
		List<Product> plist;
		@RequestMapping("/GsonCon")
		public @ResponseBody String getValues()throws Exception
		{
			String result = "";
				plist = productService.list();
				Gson gson = new Gson();			  
				result = gson.toJson(plist);			
				return result;








}
}
