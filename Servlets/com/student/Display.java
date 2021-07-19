package com.student;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Display extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		Connection c = null;
		  try {
		     Class.forName("org.postgresql.Driver");
		     c = DriverManager.getConnection("jdbc:postgresql://localhost:xxxx/java","postgres", "********");
		  } 
		  catch (Exception e) {
			  e.printStackTrace();
			  System.err.println(e.getClass().getName()+": "+e.getMessage());
			  System.exit(0);
		  }
	    System.out.println("Opened database successfully");
	    
	    PrintWriter pw = res.getWriter();
		
		String regno= req.getParameter("reg");
		String name = req.getParameter("name");
		String cname = req.getParameter("cname");
		String bname = req.getParameter("bname");
		String ccode= req.getParameter("ccode");
		String batch= req.getParameter("batch");
		String suff= req.getParameter("suff");
		String review= req.getParameter("review");
		String core= req.getParameter("core");
		
		res.setContentType("text/html; charset=utf-8");
		try {
			String str = "Insert into student(reg,name,course,batch,code,branch,suff,review,core) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement stm = c.prepareStatement(str);
			stm.setString(1, regno);
			stm.setString(2,name);
			stm.setString(3, cname);
			stm.setString(4,batch);
			stm.setString(5, ccode );
			stm.setString(6, bname);
			stm.setString(7, suff);
			stm.setString(8, review);
			stm.setString(9, core);
			stm.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("exception occured");
		}
		pw.println("<h3> Inserted into Database Successfully </h3> ");
		
		pw.println("<div> Name: "+name+" <br /> ");
		pw.println("Register Number: "+regno+" <br/> ");
		pw.println("Course Name: "+cname+" <br/> ");
		pw.println("Branch Name: "+bname+" <br/> ");
		pw.println("Course Code : "+ccode+" <br/> ");
		pw.println("Batch: "+batch+" <br/> ");
		pw.println("Usefulness : "+review+" <br/> ");
		pw.println("Sufficient: "+suff+" <br/> ");
		pw.println("Core: "+core+" <br/ > </div> ");
		
		Cookie nameCookie = new Cookie("name",name);
		res.addCookie(nameCookie);
		Cookie regCookie = new  Cookie("reg",regno);
		res.addCookie(regCookie);
		Cookie courseCookie = new  Cookie("course",cname);
		res.addCookie(courseCookie);
	}
}
