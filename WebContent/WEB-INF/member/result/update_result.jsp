<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import = "member.MemberServiceImpl" %>
        <%@ page import = "member.MemberService" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
<title>정보수정</title>
<link rel="stylesheet" href="${context}/css/member.css"/>
<style>
span.meta{width: 200px; background-color:yellow; float: left}
#member_detail{border: 1px solid gray; width:90%; height: 400px; margin: 0 auto; border-collapse: collapse;}
	#member_detail tr{border: 1px solid gray; height:10%}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold{font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<div style="text-align: center">
<div class="header">
	<h1>정보수정 페이지</h1>
</div>
	
<a href="${context}/member/member_controller.jsp"><img src="${context}/img/member.png" alt="member" style="width:30px" /></a>
	<a href="${context}/global/main.jsp"><img src="${context}/img/home.jpg" alt="home" style="width:30px" /></a>
	<div class ="footer">
	Copyright � hanbit academy
	</div>
	</div>
</body>
</html>
