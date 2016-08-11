<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberBean" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="${css}/member.css" />
</head>
<body>
<div class="box">
<%
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	application.log("넘어온ID"+id);
	application.log("넘어온PW"+pw);
	if(id==null || pw==null){
		%>
		<h2>로그인 실패!!</h2>
		<a href="../service/login.jsp">다시 시도하기</a>
	
		<%
	}else{
		member.setId(id);
		member.setPw(pw);
	
	}
%>
</div>	
</body>
</html>
