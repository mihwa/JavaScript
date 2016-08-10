<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<script src="${js}/douglas.js"></script>
<link rel="stylesheet" href="${css}/douglas.css" />
<div id="container" style='width:100%'>
<h1 style='margin:0 auto:width:250px'>Creator 학습장</h1>	
<section class="formbox">
<p>회원 정보입력</p>
		NAME : <input type="text" id="name" name="name" value="" />
		SSN : <input type="text" id="ssn" name="snn" value="" />
		<button id="bt_spec_show">회원정보 보기</button>
		<button id="bt_make_account">통장개설</button>
</section>

<section class="formbox">
		<p>회원정보</p>
		이름 :<article id="result_name"></article>
		나이 :<article id="result_age"></article>
		성별 :<article id="result_gender"></article>
		계좌번호 :<article id="result_account"></article>
		잔액 :<article id="rest_money"></article>	
</section>

<section>
		<p style='display:inline'>입.출금</p>
		금액 : <input type="text" id="money" name="money" value="" />
			<button id="bt_deposit">입금</button>
			<button id="bt_withdraw">출금</button>
		
</section>

</div>
<jsp:include page="../global/footer.jsp"/>
<jsp:include page="../global/end.jsp"/>
<script>
	window.onload=creator_init();
</script>