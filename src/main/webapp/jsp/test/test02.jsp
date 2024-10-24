<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Method - form 태그</title>
</head>
<body>

		<%
			String heightString = request.getParameter("height");
			String weightString = request.getParameter("weight");
	
		
			int height = Integer.parseInt(weightString);
			int weight = Integer.parseInt(heightString);
			
			// BMI =  몸무게 / ((키 / 100.0) * (키 / 100.0));
			double bmi = weight / ((height / 100.0) * (height / 100.0));
					
			String result = null;
			if(bmi < 18.5){
				result = "저제충";
			}else if(bmi < 25){
				result = "정상";
			}else if(bmi < 30){
				result = "과체중";
			}else{
				result = "비만";
			}
		%>
		
		
		<div class = "container">
			<h1>BMI 측정 결과</h1>
			<div>당신은 <%= result %> 입니다</div>
			<div>BMI 수치 :<%= bmi %> </div>
		
		</div>
		
		
</body>
</html>