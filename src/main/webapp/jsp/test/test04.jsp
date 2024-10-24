<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사직 연산</title>
</head>
<body>

	<%
		

		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		String operator = request.getParameter("operator");
		
		double result = 0;
		if(operator.equals("+")){
			 result = number1 + number2;
		}else if(operator.equals("-")){
			result = number1 - number2;
		}else if(operator.equals("X")){
			result = number1 * number2;
		}else{
			result = number1 / (double)number2;
		}
		
	%>
		<h3>계산 결과</h3>
		<h2> <%= number1 %><%=operator %> <%= number2 %> = <%= result %></h2>
	
</body>
</html>