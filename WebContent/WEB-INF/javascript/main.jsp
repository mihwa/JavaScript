<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<script src="${js}/douglas.js">

</script>
<section id="formbox">
	<form name="form">
		<p>카우푸 지수구하기</p>
		<p>이름</p> 	<input type="text" name ="name" id="name" />
		<p>키</p> <input type="text" name ="height" id="height"/>
		<p>몸무게</p> <input type="text" name ="weight" id="weight"/>
		 <input type="button" value ="결과보기" id="bt"/>
	</form>
</section>
<section>
	<p>결과:</p> <span id="result"></span>
</section>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/>