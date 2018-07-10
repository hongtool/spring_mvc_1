<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is a success page!!!<br />
	<%-- From request Scope name:${requestScope.name } --%>
	From request Scope name:${requestScope.name }<br />
	From request Scope age by Map:${requestScope.age }<br />
	From request Scope mail by Model:${requestScope.mail }<br />
	From request Scope city by ModelMap:${requestScope.city }<br />
	From session Scope city by ModelMap:${sessionScope.city }<br />
	<a href="result">test result</a><br />
</body>
</html>