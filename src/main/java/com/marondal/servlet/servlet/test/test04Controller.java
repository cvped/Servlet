/*
 * package com.marondal.servlet.servlet.test;
 * 
 * import java.io.IOException; import java.io.PrintWriter;
 * 
 * import javax.servlet.annotation.WebServlet; import
 * javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest;
 * import javax.servlet.http.HttpServletResponse;
 * 
 * 
 * @WebServlet("/servlet/test04") public class test04 extends HttpServlet {
 * 
 * @Override public void doGet(HttpServletRequest request,HttpServletResponse
 * response) throws IOException {
 * 
 * response.setCharacterEncoding("utf-8"); response.setContentType("text/html");
 * 
 * PrintWriter out = response.getWriter();
 * 
 * our.println("" + "<html>" + "<head><title>리스트<title></head>" + "<body>" +
 * "<ul>\n");
 * 
 * for(int i = 0; i < 30; i++) { out.print("                <li>" + i +
 * "번쨰 리스트</li>"); }
 * 
 * out.println("    </ul>\n" + "</body>" + "</html");
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 */