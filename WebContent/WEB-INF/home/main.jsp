<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp" />
<jsp:include page="../global/header.jsp" />	
<div class="box">
	<h2>서비스를 이용하시려면 회원가입을 하셔야 합니다.</h2>
	<a href="${context}/member.do?page=regist">회원가입 하러 가기</a><br/>
	<a href="${context}/member.do?page=login">로그인 하러 가기</a><br/>
	<a href="#" id="a_admin">관리자모드</a>  
	
</div>
<jsp:include page="../global/footer.jsp" />
<jsp:include page="../global/end.jsp" />
<script src="${js}/admin.js"></script>
<script type="text/javascript">
 admin.init();
 </script>