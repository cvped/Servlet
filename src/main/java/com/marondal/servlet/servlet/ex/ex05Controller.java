package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class ex05Controller extends HttpServlet {
	
	// 보완적으로 위험한 데이터를 파라미터로 전달 받을떄
	// url 로 표현하기 힘든 큰 데이터나 파일을 파라미터로 전달 받을떄
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		// 이름과 생년월일을 전달 받고,
		// 이름과 나이를 html로 구성
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age =  2024 - year + 1;
		
		out.println(""
				+ "<html>\n"
				+ 		"<head><title>정보</title></head>\n"
				+		"<body>\n");
		out.println("     <h3>이름 : " + name + "<h3>생년월일 : " + birthday);
		
		out.println(""
				+ "     </body>\n"
				+ "</html>\n"
				
				);
		
	}

}
