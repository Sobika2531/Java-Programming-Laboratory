package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class RetrieveCookie extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		Cookie cookies[]= req.getCookies();
		String name="";
		String regno="";
		String cname="";
		
		for(Cookie i :cookies) {
			if(i.getName().equals("name")) {
				name= i.getValue();
				i.setMaxAge(0);
			}
			if(i.getName().equals("course")) {
				cname= i.getValue();
				i.setMaxAge(0);
			}
			if(i.getName().equals("reg")) {
				regno= i.getValue();
				i.setMaxAge(0);
			}
		}
		res.setContentType("text/html; charset=utf-8");
		PrintWriter pw = res.getWriter();
		pw.print("Retrieving from cookies! <br /> ");
		if(name!="") {
			pw.print("Name: "+name+" <br /> ");
			pw.print("Register Name : "+regno+" <br /> ");
			pw.print("Course Name: "+cname+" <br /> ");
		}
		else
			pw.write("There Are No Cookies!");
	}
}
