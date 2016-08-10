<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css}/global.css" />
<link rel="stylesheet" href="${css}/member.css" />
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
	<div class="box">
	<h1>ID 검색</h1>
	<form action="${context}/member.do" method="get">
		<input type="text" name="keyword" placeholder="검색할 ID"/>
		<input type="hidden" name="action" value="find_by_id" />
		<input type="hidden" name="page" value="find_by_id" />
		<input type="submit" value="ID검색" />
		<input type="reset" value="취소" />
	</form>
	<h1>이름 검색</h1>
	<form action="${context}/member.do" method="get">
		<input type="text" name="keyword" placeholder="검색할 이름"/>
		<input type="hidden" name="action" value="find_by_name" />
		<input type="hidden" name="page" value="list" />
		<input type="submit" value="이름검색" />
		<input type="reset" value="취소" />
	</form>
	
	
	<iframe src="image.html" class="ifrm"></iframe> <br />
	<a href="../../index.html">
		<img src="../../img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="../member_controller.html">
		<img src="../../img/member.jpg" alt="member" style="width: 30px"/>
	</a>
	</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/> 
