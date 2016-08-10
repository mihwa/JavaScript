<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	div.memberClass{font-size: 20px}
</style>
<div id="" class="memberClass box">
	
	<h1>회원관리</h1>
	<div style="width: 300px;margin: 0 auto;text-align: left;">
	<ol>
		<li><a href="${context}/member.do?action=regist&page=regist">회원가입</a></li>
		<li><a href="${context}/member.do?action=move&page=detail">내정보보기</a></li>
		<li><a href="${context}/member.do?action=move&page=update">내정보수정 </a></li>
		<li><a href="${context}/member.do?action=delete&page=delete">탈퇴 </a></li>
		<li><a href="${context}/member.do?action=login&page=login">로그인</a></li>
		<li><a href="${context}/member.do?action=logout&page=logout">로그아웃 </a></li>
		<li><a href="${context}/member.do?action=list&page=list">리스트 </a></li>
		<li><a href="${context}/member.do?page=find_by">검색</a></li>
		<li><a href="${context}/member.do?action=count&page=count">회원수</a></li>
	</ol>
	</div>
	<a href="${context}/home.do">
		<img src="${img}/home.jpg" alt="home" style="width: 30px"/>
	</a>
</div>


