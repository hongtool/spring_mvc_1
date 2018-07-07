<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="springmvc/hello?name=tom&age=11">hello world</a>
	
	<br /><br />
	<a href="springmvc/testPathVar/12">testPathvar</a>
	
	<br /><br />
	get userinformation:
	<a href="springmvc/testGet/12">Test GET</a>
	<br />
	新建用户信息：
	<form action="springmvc/testPost" method="post">
		<input type="submit" value="testpost" />
	</form>
	
	<br /><br />
	<form action="springmvc/testDelete/12" method="post">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="DELETE" />
	</form>
	<br /><br />
	<form action="springmvc/testPut/12" method="post">
		<input type="hidden" name="_method" value="PUT" />
		<input type="submit" value="PUT" />
	</form>
	
	<br /><br />
	测试获取请求参数：<br />
	<form action="springmvc/testRequestParam" method="post">
		id: <input type="text" name="id" />
		<br />
		name: <input type="text" name="name" />
		<br />
		city: <input type="text" name="address.city" />
		<br />
		street: <input type="text" name="address.street" />
		<input type="submit" value="SUBMIT" />
	</form>
	
	<br /><br />
	获取请求报头信息：<br />
	<a href="springmvc/testRequestHeader">testRequestHeader</a>
	
	<br /><br />
	获取cookieValue信息：<br />
	<a href="springmvc/testCookieValue">testRequestHeader</a>
	
	<br /><br />
	<a href="springmvc/testServletAPI">testServletAPI</a>
	
	<br /><br />
	<a href="springmvc/testModelAndView">testModelAndView</a>
	
	<br /><br />
	<a href="springmvc/testMap">testMap</a>
	
	<br /><br />
	<a href="springmvc/testModel">testModel</a>
	
	<br /><br />
	<a href="springmvc/testModelMap">testModelMap</a>
	
	<br /><br />
	<form action="springmvc/testModelAttribute" method="post">
		id: <input type="text" name="id" value="1" />
		<br />
		name: <input type="text" name="name" value="Tom" />
		<br />
		<input type="submit" value="UPDATE" />
	</form>
</body>
</html>