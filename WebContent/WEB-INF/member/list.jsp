<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/global.css" />
<link rel="stylesheet" href="${css}/member.css" />
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<div class="box">

	<h1>목록보기</h1> <br> 
	<table id="member_list">
	  <tr>
	    <th>ID</th>
	    <th>이 름</th>
	    <th>등록일</th>
	    <th>생년월일</th>
	    <th>이메일</th>
	    <th>전화번호</th>
	  </tr>
	  <c:forEach var="member"  items="${list}">
	  <tr>
	    <td>${member.id}</td>
	    <td><a href="${context}/member.do?action=find_by_id&page=find_by_id&keyword=${member.id}">
	    	${member.name}</a></td>
	    <td>${member.regDate}</td>
	    <td>${member.birth}</td>
	    <td>${member.email}</td>
	    <td>${member.phone}</td>
	  </tr>
	 </c:forEach>
	</table>
	<a href="../../index.jsp">
		<img src="../../img/home.jpg" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.jsp">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/> 