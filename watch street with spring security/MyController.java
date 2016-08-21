package com.watchstreets.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.watchstreets.model.Category;
import com.watchstreets.model.Product;
import com.watchstreets.model.Supplier;
import com.watchstreets.model.User;
import com.watchstreets.service.CategoryService;
import com.watchstreets.service.ProductService;
import com.watchstreets.service.SupplierService;
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
		ModelAndView mv = new ModelAndView("cart");
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

	

	// ------------------------------------------------------------------------//

	

	// ---------------product--------------//
	@Autowired
	private ProductService productService;

	@RequestMapping("/Add")
	public ModelAndView displayHomePage(@ModelAttribute("product") Product product) {
		System.out.print("\nMyController - displayHomePage as landpage()");
		System.out.println(product.getName());
		ModelAndView mv = new ModelAndView("Add");
		return mv;
	}

	@RequestMapping(value = "/productupdation", method = RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product") Product product, HttpServletRequest request) {
		System.out.println("in product controller11");

		@SuppressWarnings("unused")
		String filename;
		@SuppressWarnings("unused")
		byte[] bytes;
		System.out.println(product.getDescription());

		// --------notepadcopy-------------//

		System.out.println("image uploaded");

		/////////// notepad/////////////

		System.out.println("product controller called");
		MultipartFile image = product.getImage();
		Path path;
		path = Paths.get("D:/workspace/WatchStreet/src/main/webapp/resources/images/" + product.getName() + ".jpg");

		System.out.println("Path = " + path);
		System.out.println("File name = " + product.getImage().getOriginalFilename());
		if (image != null && !image.isEmpty()) {
			try {
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");
			}
		}

		productService.saveOrUpdate(product);

		return "Add";

		}


	
	
	
	
	
	
	
	
	
	
	/////////////// ---------------//////////////////////////
	
	
	@RequestMapping("/viewproduct")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException {
		List<Product> list = productService.list();
		System.out.println("product list=" + list);
		ObjectMapper om = new ObjectMapper();

		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("viewproduct", "listofitem", listjson);

	}

	
	String setName;
	List<Product> productlist;

	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() throws Exception {
		String result = "";
		productlist = productService.list();
		Gson gson = new Gson();
		result = gson.toJson(productlist);
		return result;
	}
	
	
	

	

	@RequestMapping("delete")
	public String removeProduct(@RequestParam int id) throws Exception {
		System.out.println("In delete");
		System.out.println(id);

		try {
			productService.delete(id);
			// model.addAttribute("message", "Successfully Added");
		} catch (Exception e) {
			// model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "redirect:Add";
	}

	////////////// -------------ADD-CATEGORY---------------------//////////////
	@RequestMapping("/add-category")
	public ModelAndView showcategory() {
		ModelAndView mv = new ModelAndView("addcategory");

		System.out.println("success category update  page");

		return mv;
	}

	@Autowired

	CategoryService categoryservice;

	Category category;

	@RequestMapping("/updatecategory")

	public ModelAndView Categorycontroller(@ModelAttribute Category category,

			@RequestParam(value = "Category-description") String description,
			@RequestParam(value = "Category-name") String name)

	{

		category.setName(name);
		category.setDescription(description);

		categoryservice.saveOrUpdate(category);

		ModelAndView mv = new ModelAndView("addcategory");
		System.out.println("category update successfully");
		return mv;

	}

	////////////////// -----------ADD-CATEGORY--------/////////////////

	////////////////////// --------ADD-SUPPLIERS-------/////////////////

	@RequestMapping("/add-supplier")
	public ModelAndView showsupplier() {
		ModelAndView mv = new ModelAndView("addsupplier");

		System.out.println("success supplier update  page");

		return mv;

	}

	@Autowired

	SupplierService supplierservice;

	Category supplier;

	@RequestMapping("/updatesupplier")

	public ModelAndView Suppliercontroller(@ModelAttribute Supplier supplier,

			@RequestParam(value = "supplier-name") String name,
			@RequestParam(value = "supplier-description") String description,
			@RequestParam(value = "supplier-address") String address,
			@RequestParam(value = "supplier-phone") String phonenumber,
			@RequestParam(value = "supplier-email") String email

	)

	{

		supplier.setName(name);
		supplier.setAddress(address);
		supplier.setEmail(email);
		supplier.setPhonenumber(phonenumber);
		supplier.setDescription(description);

		supplierservice.saveOrUpdate(supplier);

		ModelAndView mv = new ModelAndView("addsupplier");

		System.out.println("supplier update successfully");

		return mv;

	}
///////////////////////////////////user/////////////////
	
	@Autowired
	UserService userService;
	User user;

	
	@RequestMapping("/signup")
	public ModelAndView displayReg(@ModelAttribute("user") User user) {
		ModelAndView r1 = new ModelAndView("SignUp");
		System.out.println("reg page is from logicontroller");
		return r1;
	}


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(@Valid@ModelAttribute("user") User user,BindingResult bindingResult) {

		if(bindingResult.hasErrors())
		{
			return new ModelAndView("SignUp");
		}
		System.out.println("in register controller");
		
		System.out.println("in signup controller called successfully");
		userService.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}




	
@RequestMapping("/UserCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of usercheck");
		return new ModelAndView("Watches");
	}
	@RequestMapping("/AdminCheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of admincheck");
		return new ModelAndView("Admin");
	}
	@RequestMapping("/logout")
	public ModelAndView logout(Principal principal,HttpSession session){
		session.invalidate();
		return new ModelAndView("logout");
	}





}