package Test;

import com.decision_aid.bean.TeachingAssessment;
import com.decision_aid.service.TeacherInfoService;

public class Test02_TeachingAssessment {

	public static void main(String[] args) {
		
		TeacherInfoService TeacherInfoService = new TeacherInfoService();
		
		TeachingAssessment teachingAssessment = new TeachingAssessment();
		teachingAssessment.setBigPoints("教学工作");
		teachingAssessment.setSmallPoints("教学负责");
		teachingAssessment.setTotalPoints(100);
		int result = TeacherInfoService.insertTeachingAssessment(teachingAssessment);
		System.out.println(result);
	}
	
}
