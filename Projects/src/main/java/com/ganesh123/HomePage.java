package com.ganesh123;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		String name=null,tage=null;
		pw=res.getWriter();
		name=req.getParameter("name");
		tage=req.getParameter("age");
		pw.println( "name is "+name);
		pw.println("age is "+tage);
		pw.close();
	}
}
