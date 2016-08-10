var global = {
		context :'',
		setContext :function(param){
			this.context = param;
		},
		init :function(param){
			this.setContext(param);
			var bt=document.querySelector('#bt_js_go');// JS는 변수타입이  only var이다
				bt.onclick=this.move();
		},
		move : function(){
			location.href=this.context+"/douglas.do";
		
		}
	};
var test ={
		init : function(){
			alert('====')
		}
};



