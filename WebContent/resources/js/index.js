function gohome(context){
		location.href = context+"/home.do";
	}
function start(context){
		document.querySelector('atag')
		.onclick=gohome(context);
	}
