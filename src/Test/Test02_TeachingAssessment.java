package Test;

import com.decision_aid.bean.TeachingAssessment;
import com.decision_aid.service.TeacherInfoService;

public class Test02_TeachingAssessment {

	public static void main(String[] args) {
		
		TeacherInfoService TeacherInfoService = new TeacherInfoService();
		
		TeachingAssessment teachingAssessment = new TeachingAssessment();
		teachingAssessment.setBigPoints("��ѧ����");
		teachingAssessment.setSmallPoints("��ѧ����");
		teachingAssessment.setTotalPoints(100);
		int result = TeacherInfoService.insertTeachingAssessment(teachingAssessment);
		System.out.println(result);
	}
	
}
