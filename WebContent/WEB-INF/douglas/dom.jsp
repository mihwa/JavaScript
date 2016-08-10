<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<script src="${js}/douglas.js"></script>
<link rel="stylesheet" href="${css}/douglas.css" />
<div id="container">
<section>
	<button id="bom">BOM(Browser Object Model)</button>
	<button id="dom">DOM(Document Object Model)</button>
	<button id="kaup">KAUP</button>
</section>
<section id="formbox">
			<p>DOM학습장</p>
		
</section>
<section id="databox">
	<p>결과:</p> <span id="result"></span>
</section>
</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/>
<script>
window.onload=init();
</script>