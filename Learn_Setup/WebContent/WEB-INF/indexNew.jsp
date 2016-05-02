<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="simpleForm" method="post"
		action="/Learn_Setup/servlets/simple.do">
		<div>What do you want to do?</div>
		<input type="radio" name="action" value="videos" />watch some videos<br>
		<input type="radio" name="action" value="movies" />watch some movies<br>
		<input type="radio" name="action" value="songs" />listen to music<br>
		<input type="submit" name="chooser" value="Go!" />
	</form>
</body>
</html>