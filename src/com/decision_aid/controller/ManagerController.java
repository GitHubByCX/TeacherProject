package com.decision_aid.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.decision_aid.bean.TeacherInfo;
import com.decision_aid.bean.TeachingAssessment;
import com.decision_aid.bean.Theplan;
import com.decision_aid.service.TeacherInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ManagerController {
	
	@Autowired
	private TeacherInfoService teacherInfoService;

	/*
	 *����ԱManagerPage��ҳ����ת
	 * */
	//��ת���ڲ���ManagerPage��index.htmlҳ��
	@RequestMapping("toManagerIndexPage.do")
	public String toManagerIndexPage() {
		
		//test
		/*TeachingAssessment teachingAssessment = new TeachingAssessment();
		teachingAssessment.setTotalPoints(99);
		teachingAssessment.setAuthor("ben");
		teachingAssessment.settId(1);
		teachingAssessment.setId(1);
		int result = teacherInfoService.updateTeachingAssessmentById(teachingAssessment);
		System.out.println(result);
		if (result == 1) {
			int result2 = teacherInfoService.deleteTeachingAssessmentById(2);
			System.out.println(result2);
		}*/
		
		return "ManagerPage/index";
	}	
	//��ת���ڲ���ManagerPage��user_add.htmlҳ��
	@RequestMapping("toManagerUserAddPage.do")
	public String toManagerAmendUserAddPage() {
		return "ManagerPage/user_add";
	}	
	//��ת���ڲ���ManagerPage��main.htmlҳ��
	@RequestMapping("toManagerMainPage.do")
	public String toManagerMainPage() {
		return "ManagerPage/main";
	}	
	//��ת���ڲ���ManagerPage��amend.htmlҳ��
	@RequestMapping("toManagerAmendPage.do")
	public String toManagerAmendPage() {
		return "ManagerPage/amend";
	}	
	
	/*
	 * ����ԱManagerPage�Ĳ�ѯ
	 * */
	@RequestMapping("updateAmend.do")
	public void updateAmend(HttpServletResponse response) {
		ObjectMapper map = new ObjectMapper();
		response.setContentType("textml;charset=UTF-8");
		try {
			response.getWriter().println(map.writeValueAsString("success"));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//ͨ��year(����ְʱ��)��ѯ��ʦ��Ϣ
	@RequestMapping("updateEntryTime.do")	
	@ResponseBody
	public void updateEntryTime(String year,HttpServletResponse response) throws JsonProcessingException, IOException {
		List<TeacherInfo> resultList = teacherInfoService.selectTeacherInfoByEntryTime(Integer.valueOf(year));
		if (resultList!=null) {
			ObjectMapper map = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map.writeValueAsString(resultList));
		}	
	}
	//ͨ��edu(ѧ��)��ѯ��ʦ��Ϣ
	@RequestMapping("updateTeaEdu.do")	
	@ResponseBody
	public void updateTeaEdu(String edu,HttpServletResponse response) throws JsonProcessingException, IOException {
		//System.out.println("edu:"+edu);
		List<TeacherInfo> resultList = teacherInfoService.selectTeacherInfoByTeaEdu(edu);
		if (resultList!=null) {
			ObjectMapper map = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map.writeValueAsString(resultList));
		}	
	}
	//ͨ��tpTechnical(ְ��)��ѯ��ʦ��Ϣ (������
	@RequestMapping("selectTeacherInfoBytpTechnical.do")	
	@ResponseBody
	public void selectTeacherInfoBytpTechnical(String str,HttpServletResponse response) throws JsonProcessingException, IOException {
		System.out.println("selectTeacherInfoBytpTechnical--str:"+str);
		List<Theplan> resultList = teacherInfoService.selectTeacherInfoBytpTechnical(str);
		for(Theplan temp : resultList) {
			System.out.println(temp.toString());
		}
		if (resultList!=null) {
			ObjectMapper map = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map.writeValueAsString(resultList));
		}
	}
	//techerInfo �е�ְ������
	@RequestMapping("selectTitle.do") 
	@ResponseBody
	public void selectTitle(String str,HttpServletResponse response)throws Exception{
		System.out.println("selectTitle--str:"+str);
		List<TeacherInfo> resultList = teacherInfoService.selectTeacherTitle(str);	
		/*for(TeacherInfo temp : resultList) {
			System.out.println(temp.toString());
		}*/
		if(resultList!=null) {
			ObjectMapper map1 = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map1.writeValueAsString(resultList));
		}
	}
	//ģ�������س�
	@RequestMapping("selecttechang.do") 
	public void selectTeachertechang(@RequestBody Map map,HttpServletResponse response)throws Exception{
		
		System.out.println(map);
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		String teaSpe=null;
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            teaSpe = entry.getValue();
        }
        		System.out.println(teaSpe);

		
		List<TeacherInfo> resultList = teacherInfoService.selectTeacherTechang(teaSpe);
		
		if(resultList!=null && !resultList.isEmpty()) {
			System.out.println(resultList);
			ObjectMapper map1 = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map1.writeValueAsString(resultList));
		}
	}
	//
	@RequestMapping("selectaddress.do") 
	public void selectaddress(@RequestBody Map map,HttpServletResponse response)throws Exception{
		
		System.out.println(map);
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		String address=null;
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            address = entry.getValue();
        }
        System.out.println(address);
		
		List<TeacherInfo> resultList = teacherInfoService.selectTeacherAddress(address);
		
		if(resultList!=null) {
			System.out.println(resultList);
			ObjectMapper map1 = new ObjectMapper();
			response.setContentType("textml;charset=UTF-8");
			response.getWriter().println(map1.writeValueAsString(resultList));
		}
	}
	
}
