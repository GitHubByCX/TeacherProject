// JavaScript source code
$(document).ready(function(){
	updateEntryTime(1);
	updateTeaEdu('博士');
	$(".Technical>li>a").eq(0).click();
});

function UpdateAmend(){
	$.ajax(getRootPath()+"/updateAmend.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "POST", //  请求方式 POST或GET
		   async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log(data);
		   },
			error : function() {
				console.log("eroor.");
			}
	});
}

//setInterval("UpdateIntegral()",10000);


//更新入职时间
function updateEntryTime(year){
	$.ajax(getRootPath()+"/updateEntryTime.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "POST", //  请求方式 POST或GET
   			dataType : 'json', //  发送信息至服务器时的内容编码类型
		   // 发送到服务器的数据。
   			data:{
   				'year':year
   			},
		   async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   $(".laobaiyun").empty();
			   for(var i = 0;i<data.length;i++){
				   $(".laobaiyun").append("<tr class='active'><td>"+data[i].teaName+"</td><td>"+data[i].teaPhone+"</td><td>"+getMyDate(data[i].teaEntrytime)+"</td><td>"+data[i].teaAddress+"</td></tr>");
			   }			   
		   },
			error : function() {
				console.log("eroor:updateEntryTime.do获取数据失败");
			}
	});
}

//更新学历排名
function updateTeaEdu(edu){
	//console.log("edu:"+edu);
	$.ajax(getRootPath()+"/updateTeaEdu.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "POST", //  请求方式 POST或GET
   			dataType : 'json', //  发送信息至服务器时的内容编码类型
		   // 发送到服务器的数据。
   			data:{
   				'edu':edu+""
   			},
		   async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   $(".teaEdu").empty();
			   for(var i = 0;i<data.length;i++){
				   $(".teaEdu").append("<tr class='active'><td>"+data[i].teaName+"</td><td>"+data[i].teaPhone+"</td><td>"+data[i].teaEdu+"</td><td>"+data[i].teaAddress+"</td></tr>");
			   }			   
		   },
			error : function() {
				console.log("eroor:updateTeaEdu.do获取数据失败");
			}
	});
}

//职称排名
$(".Technical>li>a").click(function (){
	var str = $(this).text();
	console.log("str:"+str);
	$.ajax(getRootPath()+"/selectTitle.do",// 发送请求的URL字符串。
			{
			dataType : "json", // 预期服务器返回的数据类型。
   			type : "POST", //  请求方式 POST或GET
   			dataType : 'json', //  发送信息至服务器时的内容编码类型
		   // 发送到服务器的数据。
   			data:{
   				'str':str
   			},
		   async:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求
		   // 请求成功后的回调函数。
		   success :function(data){
			   console.log(data);
			   $(".TeaTechnical").empty();
			   for(var i = 0;i<data.length;i++){
				   $(".TeaTechnical").append("<tr class='active'><td>"+data[i].teaName+"</td><td>"+data[i].teaPhone+"</td><td>"+data[i].teaTitle+"</td><td>"+data[i].teaAddress+"</td></tr>");
			   }			   
		   },
			error : function() {
				console.log("eroor:selectTeacherInfoBytpTechnical.do获取数据失败");
			}
	});
});