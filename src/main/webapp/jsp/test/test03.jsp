<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.text.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 시간 출력</title>
</head>
<body>
	
	
	<%
		Date date = new Date();
		SimpleDateFormat  formatter = new SimpleDateFormat("");
	
		SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 m월 d일");
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재 시간 H시 m분 s초");
		
		String dateString = dateFormatter.format(date);
		String timeString = timeFormatter.format(date);
	
		// 어떤 정보를 보여줄지 파라미터를 통해 전달 받는다.
		// 시간을 보여줄지, 날짜를 보여줄지
		// what : time - 시간,date - 날짜
		String what = request.getParameter("what");
		
		String result = null;
		if(what.equals("time")){
			result = timeString;
		}else if(what.equals("date")){
			result = dateString;
		}
		
	%>
	
		<div class = "container">
			<div><%= dateString %></div>
		</div>
</body>
</html>