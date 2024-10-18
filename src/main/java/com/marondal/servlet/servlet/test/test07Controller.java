package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class test07Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");

		
		out.println(""
				+ "<html>"
				+ "<head><title>주문 결과</title></head>\n"
				+ "<body>\n");
		
		// 서울시로 포함되어 있지 않으면
		if(!address.contains("서울시")){
			out.println("		<h3>배닯 불가 지역입니다</h3>");
		}else if(card.equals("신한카드")) {
			out.println("		<h3>결제 불가 카드입니다</h3>");
		}else {
			out.println(" 	<h4>" + address + "배달 준비중입니다."
					+ "<h4>" + card + "궁민카드 입니다.");
		}
		
		out.println(""
				+ address + "<h3>영동로 배달 준비중<h3>"
				+ "<hr>"
				+ "<h4>결제금액<h4>" + price +"원"
				);
		out.println(""
				+ "</body>\n"
				+ "</html>\n"
				);
		
	
		
				
	}

}
