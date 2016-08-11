function gohome(context){
	location.href=context+"/home.do";
}
function start(context){
	document.getElementById('atag').onclick=gohome(context);
}