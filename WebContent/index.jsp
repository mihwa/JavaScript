<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
		<a href="#" id="atag">홈으로</a>
</body>
<script src="resources/js/application.js"></script>
<script type="text/javascript">
 	application.init("${context}");//앞에...window.onload 이 생략된것이다
	application.go_home();
 	</script>
</html>
	
