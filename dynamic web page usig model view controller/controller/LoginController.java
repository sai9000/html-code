package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Modelcls;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginController() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("txtlogin");
		String pass1=request.getParameter("txtpass");
		Modelcls m1=new Modelcls(uname,pass1);
		int x=m1.checkData(); 
		if(x==0)
		{
	RequestDispatcher rd= request.getRequestDispatcher("Watches.html");
	
	rd.forward(request, response);
	
	}
		else{
			RequestDispatcher rd= request.getRequestDispatcher("Entry.html");
		
			rd.forward(request, response);
		}
	
	
	
	}
}
