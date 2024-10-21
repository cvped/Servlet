package com.marondal.servlet.servlet.ex;

public class ex01Controller {

  	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("hello world!!");
	}

}
