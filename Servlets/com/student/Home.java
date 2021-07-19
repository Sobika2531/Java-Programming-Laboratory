package com.student;

import javax.servlet.http.*;
import java.io.*;

public class Home extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter pw = res.getWriter();
		pw.write("Hello!!!");
	}
}
