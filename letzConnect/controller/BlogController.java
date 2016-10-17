package com.connects.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.connects.dao.BlogDao;
import com.connects.dao.UsersDao;
import com.connects.model.Blogs;
import com.google.gson.Gson;
@Controller
public class BlogController {


	@Autowired
	UsersDao ud;
	
	@Autowired
	BlogDao bd;

	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/newblog") // from user / admin success login page
	public ModelAndView displayBlogPage(){
		System.out.print("\nBlogController - displayBlogPage()");
		ModelAndView mv = new ModelAndView("myblog");
	//	session.setAttribute("uname",);
		return mv;
	}
	
/*	@RequestMapping("/addBlogRecordRequest") // from add blog page
	public String addBlogDataRequest(@RequestParam(value="blogtitle")String title,@RequestParam(value="blogcontent")String content,@ModelAttribute("user") User user,Principal p){
		System.out.print("\nBlogController - addBlogDataRequest()");
		
		Blog blog = new Blog();
		blog.setBlogTitle(title);
		blog.setBlogContent(content);
		p.getName();

		Date dt = new Date();
		//String date = dt.getYear()+"-"+dt.getMonth()+"-"+dt.getDate();	
		System.out.println(dt);
		blog.setBlogCreationDate(dt);
		blog.setBlogStatus("valid");
		
	
	
		
		bd = new BlogDAOImpl(sessionFactory);
		bd.createBlog(blog);
		
	//	ModelAndView mv = new ModelAndView("blogPage");
	//	mv.addObject("uname", CommonData.loginUserName);
		return "blogPage";
	}*/
	
	@ModelAttribute("blog")
	public Blogs returnObject()
	{
		return new Blogs();
	}
	
	@RequestMapping("/bpost")
	public String createBlog(@ModelAttribute("blog") Blogs blogs,Model model,Principal p)throws IOException
	{
		
		//User us= new User();
		//blogs.setBlogCreatedUser(p.getName());
		
		blogs.setBlogCreatedUser("sai");
		blogs.setBlogStatus("valid");
		blogs.setBlogCreationDate(new java.util.Date());
		bd.createBlog(blogs);
		return "myblog";
	}
	
	@RequestMapping("/getBlogData")
	public @ResponseBody String getValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blogs> listdev = bd.getBlogList();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
	@RequestMapping("/getBlogDataInd")
	public @ResponseBody String getfullValues() {			
		String devs="";
		System.out.println("gson all blogs...");
		List <Blogs> listdev = bd.getBlogList();
		Gson gson = new Gson();
		devs=gson.toJson(listdev);	
		return devs;
	}	
	
	

}
