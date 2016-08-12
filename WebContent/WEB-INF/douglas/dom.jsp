<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<link rel="stylesheet" href="${css}/douglas.css" />
<div id="container">

<section id="formbox">
			<p>DOM학습장</p>
		
</section>
<section id="databox">
	<p>결과:</p> <span id="result"></span>
</section>
</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/>
<script src="${js}/douglas.js"></script>
<script type="text/javascript">
	douglas.init();
</script>
