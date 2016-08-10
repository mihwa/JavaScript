<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/global.css" />
<link rel="stylesheet" href="${css}/member.css" />
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<div class="box">
	<h1>회원수</h1> <br />
	<span style="font-size: 50px;color: red">${count} 명</span> 
	
	<a href="../../index.jsp">
		<img src="../../img/home.jpg" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/> 


	