package com.decision_aid.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.decision_aid.bean.ClExperience;
import com.decision_aid.bean.GdCounsel;
import com.decision_aid.bean.TeacherEaccessviolation;
import com.decision_aid.bean.TeacherEnterprise;
import com.decision_aid.bean.TeacherHonor;
import com.decision_aid.bean.TeacherInfo;
import com.decision_aid.bean.Theplan;
import com.decision_aid.bean.testListJxl;
import com.decision_aid.service.TeacherInfoService;
import com.fasterxml.jackson.databind.ObjectMapper;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

@Controller
public class FillInBasicInformationController {

	@Autowired
	private TeacherInfoService teacherInfoService;//教职工基本信息方法集
	
	//添加一个教师的教职工号和密码

	@RequestMapping("ajaxAddUser.do")
	public void ajaxAddUser(@RequestBody TeacherInfo teacherInfo,HttpServletResponse response)throws Exception{
		System.out.println(teacherInfo);
		int result = teacherInfoService.jibenxinxi(teacherInfo);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
		 
	}
	@RequestMapping("ajaxjiaoyujingli.do")
	public void ajaxjiaoyujingli(@RequestBody TeacherInfo teacherInfo,HttpServletResponse response)throws Exception{
		System.out.println(teacherInfo);
		int result = teacherInfoService.insertjiaoyujingli(teacherInfo); 
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result); 
		if(result>0) { 
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}  
	}
	@RequestMapping("jiaoxuejingyan.do")
	public void jiaoxuejingyan(@RequestBody TeacherEaccessviolation teacherEaccessviolation,HttpServletResponse response)throws Exception{
		System.out.println(teacherEaccessviolation);
		int result = teacherInfoService.insertjiaoxuejingyan(teacherEaccessviolation);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
	}
	@RequestMapping("qiyejingyan.do")
	public void qiyejingyan(@RequestBody TeacherEnterprise teacherEnterprise,HttpServletResponse response)throws Exception{
		System.out.println(teacherEnterprise);
		int result = teacherInfoService.insertqiyejingyan(teacherEnterprise);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
	}
	@RequestMapping("cenghuorongyu.do")
	public void qiyejingyan(@RequestBody TeacherHonor teacherHonor,HttpServletResponse response)throws Exception{
		System.out.println(teacherHonor);
		int result = teacherInfoService.insertcenghuorongyu(teacherHonor);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
	}
	@RequestMapping("sannianguihua.do")
	public void sannianguihua(@RequestBody Theplan theplan,HttpServletResponse response)throws Exception{
		System.out.println(theplan);
		int result = teacherInfoService.insertsannianguihua(theplan);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
	}
	
	@RequestMapping("banzhurenjingyan.do")
	public void sannianguihua(@RequestBody ClExperience clExperience,HttpServletResponse response)throws Exception{
		System.out.println(clExperience);
		int result = teacherInfoService.insertbanzhuren(clExperience);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
	}
	
	@RequestMapping("jiuyezhidao.do")
	public void sannianguihua(@RequestBody GdCounsel gdCounsel,HttpServletResponse response)throws Exception{
		System.out.println(gdCounsel);
		int result = teacherInfoService.insertjiuyezhidoa(gdCounsel);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		System.out.println(result);
		if(result>0) {
			
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			response.getWriter().println(map.writeValueAsString("error"));
		}
		
	}

	@RequestMapping("login.do")
	public void loginuser(@RequestBody TeacherInfo teacherInfo,HttpServletResponse response)throws Exception{
		System.out.println(teacherInfo);
		TeacherInfo teacherInfo1 = teacherInfoService.tealogin(teacherInfo);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		
		System.out.println(teacherInfo1);
		if(teacherInfo1!=null) {
			
			response.getWriter().println(map.writeValueAsString(teacherInfo1.getTeaId()));
		}else {
			
		}
		
	}
	@RequestMapping("selectLo.do")
	public void selectLo(@RequestBody TeacherInfo teacherInfo,HttpServletResponse response)throws Exception{
		System.out.println(teacherInfo);
		TeacherInfo teacherInfo1 = teacherInfoService.selectLo(teacherInfo);
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");  
		 
		System.out.println(teacherInfo1);
		if(teacherInfo1.getTeaTimeofgra()!=null) {
			System.out.println(teacherInfo1.getTeaEdu());
			response.getWriter().println(map.writeValueAsString("success"));
		}else {
			System.out.println("需要填写资料"); 
		}
		
	}
	@RequestMapping("selectgerenziliao.do")
	public void selectgerenziliao(@RequestBody TeacherInfo teacherInfo,HttpServletResponse response)throws Exception{
		System.out.println(teacherInfo);
		TeacherInfo teacherInfo1 = teacherInfoService.selectLo(teacherInfo);
		if(teacherInfo1!=null) {
			ObjectMapper map = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");  
				response.getWriter().println(map.writeValueAsString(teacherInfo1));
		}else {
			System.out.println("失败");
		}
		
		
		
		
	}
	@RequestMapping("file.do")
	public String fileUpliad(@RequestParam(value="file") MultipartFile file) {
			System.out.println("你好");
			int result = 0;
		 try{
			 	
	           FileInputStream fis = (FileInputStream) file.getInputStream();
	           
	            jxl.Workbook rwb = Workbook.getWorkbook(fis);   
	            
	            Sheet[] sheet = rwb.getSheets();   
	            for (int i = 0; i < 1; i++) {   
	                Sheet rs = rwb.getSheet(i);   
	                
	                for (int j = 2; j < rs.getRows(); j++) {   
	                   Cell[] cells = rs.getRow(j);   
	                   //获取第J列第一行
	                   Cell id = rs.getCell(1,j); 
	                   	//利用contents转换成string
	                   String jxlid = id.getContents();
	                 //获取第J列第5行
	                   Cell pwd = rs.getCell(5,j);
	                   String jxlpwd= pwd.getContents();
	                   testListJxl tlj = new testListJxl();
	                   Cell name = rs.getCell(4,j);
	                   String username= name.getContents();	           
	                   Cell xibie = rs.getCell(3,j);
	                   String xibie1= name.getContents();
	                   System.out.println(xibie1);
	                   TeacherInfo teacherInfo = new TeacherInfo (); 
	                   teacherInfo.setTeaId(jxlid);
	                   teacherInfo.setTeaName(username);
	                   teacherInfo.setTeaPwd(jxlpwd);
	                   TeacherInfo teacherInfo1 = teacherInfoService.selectLo(teacherInfo);
	                   if(teacherInfo1==null) {
	                	   teacherInfoService.inserTeacher(teacherInfo);
	                   }else {
	                	   System.out.println("该账号已存在");
	                   }
	                   
	                   
	                  
	                    
	                }   
	            }   
	            fis.close();   
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }

		System.out.println("nihao");
		return "ManagerPage/user_add";
	}

}

