<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	int score = Integer.parseInt(request.getParameter("score"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 출력창</title>
<meta charset="UTF-8">
</head>
<body>
	<h1>
		시험점수
		<%=score%>점
	</h1>

	<%
		if (score >= 90) {
	%>
	<h1>a학점 입니다</h1>
	<%
		} else if (score >= 80 && score < 90) {
	%>
	<h1>b학점 입니다</h1>
	<%
		} else if (score >= 70 && score < 80) {
	%>
	<h1>c학점 입니다</h1>
	<%
		} else if (score >= 60 && score < 70) {
	%>
	<h1>d학점 입니다</h1>
	<%
		} else if (score > 100 && score <= 0) {
	%>
	<h1>점수 범휘가 잘못되었습니다</h1>
	<%
		} else {
	%>
	<h1>f학점 입니다</h1>
	<%
		}
	%>

	<br>
	<a href="scoreTest.html">시험 점수 입력 </a>



</body>
</html>