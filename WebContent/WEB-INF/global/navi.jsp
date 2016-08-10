<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="text-align:right;color:white;
width:100%;background-color: #333">${user.name}님 환영합니다</div>
<div id="nav">
	
	<ul>
		<li><a href="${context}/member.do">회원관리</a></li>
		<li><a href="${context}/grade.do">성적관리</a></li>
		<li><a href="${context}/account.do">계좌관리</a></li>
		<li><a href="${context}/global.do?page=school_info">학교소개</a></li>
	</ul>
</div>
