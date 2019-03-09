var teaId=123456;
var session =null;
  session= sessionStorage.getItem("user");
			  teaId=session;
//测试给session假
//var session = 123456;
//登陆 
var myDate = new Date(); 
var time = myDate.getFullYear(); //获取当前年份(2位)

function login(){
	var user = $("#user").val(); 
	var pwd = $("#password").val();
	$.ajax("http://localhost:8080/DecisionAid/login.do",// 发送请求的URL字符串。 
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
   			  
		    data:JSON.stringify({teaId:user,teaPwd:pwd}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。 
		   success :function(data){ 
			   
			   sessionStorage.setItem('user', data);
			   
			  session= sessionStorage.getItem("user");
			
			
								   $.ajax("http://localhost:8080/DecisionAid/selectLo.do",// 发送请求的URL字符串。
											
											{
											dataType : "json", // 预期服务器返回的数据类型。
								   			type : "post", //  请求方式 POST或GET
								   				
								   			   // 发送到服务器的数据。
										    data:JSON.stringify({teaId:session}),
										    contentType:"application/json", //  发送信息至服务器时的内容编码类型
											
										
										   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
										   // 请求成功后的回调函数。
										   success :function(data){
										   	
											   console.log("进入success");
											   alert(data);
											   window.location.href="success.html"; 
										   },error:function(){
										   	window.location.href="teacherInfo.html";
										  
										   }
						   // 请求出错时调用的函数
						  
									});
						    
			   
			  
		   },error:function(){
		   	alert("账号密码错误，请重新输入");
		   }
		   // 请求出错时调用的函数
		    
	});
	
}

//基本资料
function ajaxname(){
	//保存Session方法 sessionStorage.setItem('user', data);
				//var teaName=$(".username").val();
				console.log(teaId);

				$("#tea_id").val(teaId);
				if($("#tea_id").val()==null||$("#tea_id").val()==""){
					alert("请先登录");
						window.location.href="teacherInfo2.html";
				}
				var csnf= document.getElementById("csnf").value;
				var csyf= document.getElementById("csyf").value;
				var csrf= document.getElementById("csrf").value;
				
				var teaBirth=csnf+"-"+csyf+"-"+csrf; 
				var rznf = document.getElementById("rznf").value;
				var teaSex=document.getElementById("teaSex").value;
				var teaPhone=document.getElementById("teaPhone").value;
				var teaHobby = document.getElementById("nltc").value;
				var address = $(".address").val();
				console.log(address);
				var teaSpe=document.getElementById("xgtd").value;
				var teaMotto=document.getElementById("zym").value;

				  
				
			$.ajax("http://localhost:8080/DecisionAid/ajaxAddUser.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
			data:JSON.stringify({teaId:teaId,teaBirth:teaBirth,teaSex:$("input[name='gender']:checked").val(),teaPhone:teaPhone,
			teaSpe:teaSpe,teaMotto:teaMotto,teaHobby:teaHobby,teaEntrytime:rznf,teaAddress:address,
			teaBigdepartment:$("#teaCertification").val(),
			}),

		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求 
		   // 请求成功后的回调函数。
		   beforeSend : function(){
             
            },
            complete: function(){
            	
            },

		   success :function(data){
			   console.log("success");   
			
			 
		   },error:function(){
		   	alert("发送失败了,请重新输入！");
		   }
		   // 请求出错时调用的函数
		  
	});
};
//教育经历
function ajaxjiaoyujingli(){
		//获取页面数据
		var teaGra = document.getElementById('teaGra').value	//教职工毕业学校
		var teaTimeOfGra = document.getElementById('teaTimeOfGra').value	//教职工毕业时间
		var teaEdu = document.getElementById('teaEdu').value	//教职工最高学历
		var teaSpecialty = document.getElementById('teaSpecialty').value	//教职工毕业专业
		//教职工是否有教师资格证
		

			$.ajax("http://localhost:8080/DecisionAid/ajaxjiaoyujingli.do",// 发送请求的URL字符串。
			
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   				
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,teaGra:teaGra,teaTimeOfGra:teaTimeOfGra,teaEdu:teaEdu,teaSpecialty:teaSpecialty,teaCertification:$("input[name='qualification_certificate']:checked").val()}),
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");
		
		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}
//教学经验
function jiaoxuejingyan(){ 
	
			var tTartTime = document.getElementById('tTartTime').value	//教学开始时间
			var tsxq = document.getElementById('tsxq').value	//教学开始时间学期
			
			
			var tTeachclass = document.getElementById('ServedAsTheClass').value	//曾任课班级
			var tCourse = document.getElementById('ServedAsTheClassTwo').value	//曾授课程
			var TotalClassTime = document.getElementById('TotalClassTime').value	//教学课时
			var tEvaluate = document.getElementById('TheTeachingEvaluation').value	//教学效果评价
			
			var tarTimes = tTartTime+tsxq;   
			
			console.log(tarTimes); 
			$.ajax("http://localhost:8080/DecisionAid/jiaoxuejingyan.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET   
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,tStartTime:tarTimes,tTeachClass:tTeachclass,tCourse:tCourse,tClass:TotalClassTime,tEvaluate:tEvaluate}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");
			
			 
		   },error:function(){
		   	alert("发送失败了,请重新输入！");
		   }
		   // 请求出错时调用的函数
		  
	});
}

function qiyejingyan(){
	
			var eStratTime = document.getElementById('EntryTime').value	//进入企业时间
			var eEndTime = document.getElementById('TheEndOfTime').value	//结束企业时间
			var eWork = document.getElementById('eWork').value	//企业名称
			var eOperating = document.getElementById('eOperating').value	//曾任职位
			var eJob = document.getElementById('eJob').value	//工作内容
	
			$.ajax("http://localhost:8080/DecisionAid/qiyejingyan.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,eStratTime:eStratTime,eEndTime:eEndTime,eWork:eWork,eOperating:eOperating,eJob:eJob}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");
			
			 
		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}
//曾获荣誉
function cenghuorongyu(){
	
			var hStratTime = document.getElementById('hStratTime').value	//取得荣誉时间
			var hCer = document.getElementById('hCer').value	//取得荣誉时间
			var hOffice = document.getElementById('hOffice').value	//取得荣誉时间
			
			$.ajax("http://localhost:8080/DecisionAid/cenghuorongyu.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,hStratTime:hStratTime,hCer:hCer,hOffice:hOffice}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log(data);
			
			 
		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}
//三年计划时间设置
function jihuatime(){
	$(".jnjh").html(time+"年计划");
	$(".mnjh").html((time+1)+"年计划");
	$(".hnjh").html((time+2)+"年计划");
}
//三年规划

function sannianguihua(){
	
			var tpEdu = document.getElementById('tpEdu').value	//学历
			var tpTechnical = document.getElementById('tpTechnical').value	//职称
			var tpSkill = document.getElementById('tpSkill').value	//技能等级
			var tpAbility = document.getElementById('tpAbility').value	//专业能力
			var tpTeaAbi = document.getElementById('tpTeaAbi').value	//教学能力
			var tpThesis = document.getElementById('tpThesis').value	//论文
			var tpYear = time;
			$.ajax("http://localhost:8080/DecisionAid/sannianguihua.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,tpYear:tpYear,tpEdu:tpEdu,tpTechnical:tpTechnical,tpSkill:tpSkill,tpAbility:tpAbility,tpTeaabi:tpTeaAbi,tpThesis:tpThesis}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");
			
			 
		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}
function sannianguihua1(){
	
	var tpEdu = document.getElementById('tpEdu1').value	//学历
	var tpTechnical = document.getElementById('tpTechnical1').value	//职称
	var tpSkill = document.getElementById('tpSkill1').value	//技能等级
	var tpAbility = document.getElementById('tpAbility1').value	//专业能力
	var tpTeaAbi = document.getElementById('tpTeaAbi1').value	//教学能力
	var tpThesis = document.getElementById('tpThesis1').value	//论文
	var tpYear = time+1;
	$.ajax("http://localhost:8080/DecisionAid/sannianguihua.do",// 发送请求的URL字符串。
	{
	dataType : "json", // 预期服务器返回的数据类型。
		type : "post", //  请求方式 POST或GET
		   // 发送到服务器的数据。
    data:JSON.stringify({teaId:teaId,tpYear:tpYear,tpEdu:tpEdu,tpTechnical:tpTechnical,tpSkill:tpSkill,tpAbility:tpAbility,tpTeaabi:tpTeaAbi,tpThesis:tpThesis}),
    //缺教学经验
    contentType:"application/json", //  发送信息至服务器时的内容编码类型
	
 
   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
   // 请求成功后的回调函数。
   success :function(data){
	   console.log("success");
	
	 
   },error:function(){
   	alert("发送失败了,请重新输入！")
   }
   // 请求出错时调用的函数
  
});
}
function sannianguihua2(){
	
	var tpEdu = document.getElementById('tpEdu2').value	//学历
	var tpTechnical = document.getElementById('tpTechnical2').value	//职称
	var tpSkill = document.getElementById('tpSkill2').value	//技能等级
	var tpAbility = document.getElementById('tpAbility2').value	//专业能力
	var tpTeaAbi = document.getElementById('tpTeaAbi2').value	//教学能力
	var tpThesis = document.getElementById('tpThesis2').value	//论文
	var tpYear = time+2;
	$.ajax("http://localhost:8080/DecisionAid/sannianguihua.do",// 发送请求的URL字符串。
	{
	dataType : "json", // 预期服务器返回的数据类型。
		type : "post", //  请求方式 POST或GET
		   // 发送到服务器的数据。
    data:JSON.stringify({teaId:teaId,tpYear:tpYear,tpEdu:tpEdu,tpTechnical:tpTechnical,tpSkill:tpSkill,tpAbility:tpAbility,tpTeaabi:tpTeaAbi,tpThesis:tpThesis}),
    //缺教学经验
    contentType:"application/json", //  发送信息至服务器时的内容编码类型
	
 
   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
   // 请求成功后的回调函数。
   success :function(data){
	   console.log("success");
	
	 
   },error:function(){
   	alert("发送失败了,请重新输入！")
   }
   // 请求出错时调用的函数
  
});
}
//班主任经验
function banzhurenjingyan(){
	
			var clStartTime = document.getElementById('clStartTime').value	//当班主任开始时间
			var bzrsxq = document.getElementById('bzrsxq').value	//开始学期
			var clEndTime = document.getElementById('clEndTime').value	//结束时间
			var bzrexq = document.getElementById('bzrexq').value	//结束学期
			var clClassName = document.getElementById('clClassName').value	//带班班级
			var clNum = document.getElementById('clNum').value	//带班人数
			var clEvaluate = document.getElementById('clEvaluate').value	//效果评价
			var startTime = clStartTime+bzrsxq;
			var endTime = clEndTime+bzrexq;
			console.log(startTime);
			console.log(endTime);
			
			$.ajax("http://localhost:8080/DecisionAid/banzhurenjingyan.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,clStartTime:startTime,clEndTime:endTime,clClassname:clClassName,clNum:clNum,clEvaluate:clEvaluate}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");


		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}
//就业指导
function jiuyezhidao(){
	
			var gdStartTime = document.getElementById('gdStartTime').value	//就业指导开始时间
			var jysxq = document.getElementById('jysxq').value	//开始学期
			var gdEndTime = document.getElementById('gdEndTime').value	//结束时间
			var jyexq = document.getElementById('jyexq').value	//结束学期
			var gdClass = document.getElementById('gdClass').value	//指导班级
			var gdNum = document.getElementById('gdNum').value	//指导班级人数
			var gdEvaluate = document.getElementById('gdEvaluate').value	//指导效果评价
			var gstartTime = gdStartTime+jysxq;
			var gendTime = gdEndTime+jyexq;
			
			
			$.ajax("http://localhost:8080/DecisionAid/jiuyezhidao.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "post", //  请求方式 POST或GET
   			   // 发送到服务器的数据。
		    data:JSON.stringify({teaId:teaId,gdStartTime:gstartTime,gdEndTime:gendTime,gdClass:gdClass,gdNum:gdNum,gdEvaluate:gdEvaluate}),
		    //缺教学经验
		    contentType:"application/json", //  发送信息至服务器时的内容编码类型
			
		 
		   async: true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log("success");
				 window.location.href="success.html";
		   },error:function(){
		   	alert("发送失败了,请重新输入！")
		   }
		   // 请求出错时调用的函数
		  
	});
}

