//var application = (function(){})();//IIFE패턴

var application = (function(){	
	var init = function(param){
		sessionStorage.setItem('context',param);
	};
	var getContextPath = function(){
		return sessionStorage.getItem('context');
	};
	var to_douglas=function(){
		location.href=getContextPath()+"/douglas.do";
	};
	var go_home = function() {
		location.href=getContextPath()+"/home.do";
	};
	return{
		init:init,
		getContextPath:getContextPath,
		to_douglas:to_douglas,
		go_home :go_home
		
	}
	})();
	
	

		/*var init :function(param){
			this.context = param;
		},
		init :function(param){
			this.setContext(param);
			document.querySelector('#bt_js_go')// JS는 변수타입이  only var이다
			onclick=this.move();
		},
		move : function(){
			location.href=this.context+"/douglas.do";
		
		}
	};*/


