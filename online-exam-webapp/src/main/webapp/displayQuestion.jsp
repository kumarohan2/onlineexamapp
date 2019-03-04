<%@page import="com.lti.entity.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.lti.entity.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Exam app</title>
</head>
<body>
<form method="get" action ="CalculateScoreServlet" >
	<%
		Question q = (Question) session.getAttribute("currentQuestion");
	%>

	<%=q.getQuestion()%>
	<br />

	<%
		int optionNo = 0;
		List<Option> options = q.getOptions();
		for (Option option : options) {
	%>

	<input type="radio" name="op" value="<%=optionNo++%>" />
	<%=option.getOption()%>
	<br />
	<%
		}
	%>
	<button type="submit">Continue</button> 
	</form>
</body>
</html>