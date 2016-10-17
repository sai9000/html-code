package com.connects.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.connects.dao.UsersDao;
import com.connects.model.Message;
import com.connects.model.OutputMessage;
import com.connects.model.Users;

@Controller
public class HomeController {
	
	@ModelAttribute
	public Object returnuser(){
	return new Users();
			
		
	}
	
	
	
	@RequestMapping("/")
	public ModelAndView showentry() {
		ModelAndView mv = new ModelAndView("welcome");
		System.out.println("sucess 1stpage");
		return mv;
	}
	@RequestMapping("/welcome")
	public ModelAndView showentry1() {
		ModelAndView mv = new ModelAndView("welcome");
		System.out.println("sucess 1stpage");
		return mv;
	}
	
	
	@RequestMapping("/login")
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("login");
		System.out.println("sucess login page");
		return mv;
	}
	@RequestMapping("/logout")
	public ModelAndView showlogout() {
		ModelAndView mv = new ModelAndView("login");
		System.out.println("sucess login page");
		return mv;
	}
	
	

			
	@Autowired
	UsersDao user;
	

	
	@RequestMapping("/SignUp")
	public ModelAndView showsignup() {
		ModelAndView mv = new ModelAndView("signup");
		System.out.println("sucess signup page");
		return mv;
	}
	
	
	/*@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@Valid @ModelAttribute("user") Users users,BindingResult bindingResult,HttpServletRequest request)
    {	
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("signup");
		}
		System.out.println("in register controller");
	//	user.setRole(username);
		users.setRole("ROLE_USER");
		users.setIsAdmin(false);
		
		@SuppressWarnings("unused")
		String filename;
		@SuppressWarnings("unused")
		byte[] bytes;
		System.out.println(users.getUsername());

		
		
		MultipartFile image = users.getImage();
		Path path;
		ModelAndView mv=new ModelAndView("Add");
		path = Paths.get("D:/collobration2/connect/src/main/webapp/resources/images/" + users.getUsername() + ".jpg");
		
		mv.addObject("pimg", path);
		
		System.out.println("Path = " + path);
		System.out.println("File name = " + users.getImage().getOriginalFilename());
		
		if (image != null && !image.isEmpty()) {
			try {
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");
			}
		}
		
user.saveOrUpdate(users);
		
		System.out.println("success");
		ModelAndView mv1 = new ModelAndView("login");
		return mv1;
	}

*/



	 @RequestMapping("/register")
		public String createUser(@ModelAttribute("user") Users users,@RequestParam("image") MultipartFile file,Model model,HttpServletRequest request)throws IOException
		{
		 	String filename;
		 	byte[]bytes;
		 	
		 			 users.setRole("ROLE_USER");
		 			
		 			 users.setAuthority("ROLE_USER");
		 			 users.setEnabled(true);
		 			 users.setIsAdmin(false);
		 			user.saveOrUpdate(users);
		 			
		 			
		 			System.out.println("image");
		 			MultipartFile image=users.getImage();
		 			Path path;
		 			path=Paths.get("D://collobration2/connect/src/main/webapp/resources/images//"+users.getUserid()+".jpg");
		 			//String path = request.getSession().getServletContext().getRealPath("/resources/images/" + user.getUser_id() + ".jpg");
		            System.out.println("Path = " + path);
		            System.out.println("File name = " + users.getImage().getOriginalFilename());
		           /* File f = new File(path);
		            BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
		            bs.write(bytes);
		            bs.close();
		            System.out.println("Picture uploaded");
		        } catch (Exception ex) {
		            System.out.println(ex.getMessage());
		        }*/
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
			return "login";
		}

	 @RequestMapping(value = "/login_session_attributes")
		public String login_session_attributes(HttpSession session,ModelMap model) {
			String name = SecurityContextHolder.getContext().getAuthentication().getName();
			System.out.println("1");
			
			//User user = userService.getUserByName(name);
			
			System.out.println("2");
			
			//session.setAttribute("userId", user.getId());
			System.out.println("3");
			
		session.setAttribute("username",name);
			
		session.setAttribute("LoggedIn", "true");

			@SuppressWarnings("unchecked")
			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
			.getAuthentication().getAuthorities();
			
			String role="ROLE_USER";
			for (GrantedAuthority authority : authorities) 
			{
			  
			     if (authority.getAuthority().equals(role)) 
			     {
			    	 
			    	// session.setAttribute("name", user.getFirstname());
			    	 
			    	 /*session.setAttribute("UserLoggedIn", "true");*/
			    	/* session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));*/
			    	System.out.println("success user login");
			    	return "index";
			     
			     }
			     
			    
			    
			    		 else 
			     {
			    	 //session.setAttribute("Administrator", "true");
			    	 //model.addAttribute("product",  new Product());
			    	 //model.addAttribute("ProductPageClicked", "true");
			    	// model.addAttribute("supplierList",supplierservice.list());
			    	 //model.addAttribute("categoryList",categoryservice.list());
				 }
			}
			return "index";
	 }
		
			
			@RequestMapping("/chatpage")
			public String ChatPag()
			{
				
				return "chatpage";
			}
			 @MessageMapping("/chat")
			  @SendTo("/topic/message")
			  public OutputMessage sendMessage(Message message) {
			    return new OutputMessage(message, new Date());
			  }

	





}

	

	
	

