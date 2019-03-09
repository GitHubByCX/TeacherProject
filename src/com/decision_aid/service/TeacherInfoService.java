package com.decision_aid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decision_aid.bean.AuthorityManagement;
import com.decision_aid.bean.ClExperience;
import com.decision_aid.bean.DivisionManagement;
import com.decision_aid.bean.GdCounsel;
import com.decision_aid.bean.RoleManagement;
import com.decision_aid.bean.TeacherEaccessviolation;
import com.decision_aid.bean.TeacherEnterprise;
import com.decision_aid.bean.TeacherHonor;
import com.decision_aid.bean.TeacherInfo;
import com.decision_aid.bean.TeachingAssessment;
import com.decision_aid.bean.Theplan;
import com.decision_aid.dao.ITeacherInfoDao;

@Service
public class TeacherInfoService {

	@Autowired
	private ITeacherInfoDao ITeacherInfoDao;
	
	//���һ����ְ���Ľ�ְ���ź�Ĭ������
	public int jibenxinxi(TeacherInfo teacherInfo) {
		return ITeacherInfoDao.jibenxinxi(teacherInfo);
	}
	public int insertjiaoyujingli(TeacherInfo teacherInfo) {
		return ITeacherInfoDao.insertjiaoyujingli(teacherInfo);
	}
	public int insertjiaoxuejingyan(TeacherEaccessviolation teacherEaccessviolation) {
		return ITeacherInfoDao.insertjiaoxuejingyan(teacherEaccessviolation);
	}
	public int insertqiyejingyan(TeacherEnterprise teacherEnterprise) {
		return ITeacherInfoDao.insertqiyejingyan(teacherEnterprise);
	}
	public int insertcenghuorongyu(TeacherHonor teacherHonor) {
		return ITeacherInfoDao.insertcenghuorongyu(teacherHonor);
	}
	public int insertsannianguihua(Theplan theplan) {
		return ITeacherInfoDao.insertsannnianguihua(theplan);
	}
	public int insertbanzhuren(ClExperience clExperience) {
		return ITeacherInfoDao.insertbanzhuren(clExperience);
	}
	public int insertjiuyezhidoa(GdCounsel gdCounsel) {
		return ITeacherInfoDao.insertjiuyezhidao(gdCounsel);
	}
	public TeacherInfo tealogin(TeacherInfo teacherInfo) {
		return ITeacherInfoDao.tealogin(teacherInfo);
	}
	public TeacherInfo selectLo(TeacherInfo teacherInfo) {
		return ITeacherInfoDao.selectLo(teacherInfo);
	}
	public int inserTeacher(TeacherInfo teacherInfo) {
		return ITeacherInfoDao.inserTeacher(teacherInfo);
	}
	//ͨ��teaId��ѯ�������е�����(service)
	//ͨ��tea_id����cl_experience(�����ξ����)�е����� 
	public ClExperience selectBanZhuRenByTeaId(int teaId){
		return ITeacherInfoDao.selectBanZhuRenByTeaId(teaId);
	}
	//ͨ��TeaId����division_management(��ʦ������)������
	public DivisionManagement selectDivisionManagementByTeaId(int teaId) {
		return ITeacherInfoDao.selectDivisionManagementByTeaId(teaId);
	}
	//ͨ��teaId����gd_counsel(ʵϰ��ҵָ�������)������
	public GdCounsel selectGdCounselByTeaId(int teaId) {
		return ITeacherInfoDao.selectGdCounselByTeaId(teaId);
	}
	//ͨ��teaId����role_management(��ɫ�����)������
	public RoleManagement selectRoleManagementByTeaId(int teaId) {
		return ITeacherInfoDao.selectRoleManagementByTeaId(teaId);
	}
	//ͨ��teaId����teacher_eaccessviolation(��ѧ�����)������
	public TeacherEaccessviolation selectTeacherEaccessviolationByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherEaccessviolationByTeaId(teaId);
	}
	//ͨ��teaId����teacher_enterprise(��ʦ��ҵ�����)������
	public TeacherEnterprise selectTeacherEnterpriseByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherEnterpriseByTeaId(teaId);
	}
	//ͨ��teaId����teacher_honor(��ʦ������)������
	public TeacherHonor selectTeacherHonorByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherHonorByTeaId(teaId);
	}

	//ͨ��teaId�޸ĸ������е�����(service)
	//ͨ��teaId�޸�authority_management(Ȩ�޹����)�е�����
	public int updateAuthorityManagementByTeaId(AuthorityManagement authorityManagement) {
		return ITeacherInfoDao.updateAuthorityManagementByTeaId(authorityManagement);
	}
	//ͨ��teaId�޸�cl_experience(�����ξ����)�е�����
	public int updateClExperienceByTeaId(ClExperience ClExperience) {
		return ITeacherInfoDao.updateClExperienceByTeaId(ClExperience);
	}
	//ͨ��teaId�޸�division_management(��ʦ������)������
	public int updateDivisionManagementByTeaId(DivisionManagement divisionManagement) {
		return ITeacherInfoDao.updateDivisionManagementByTeaId(divisionManagement);
	}
	//ͨ��teaId�޸�gd_counsel(ʵϰ��ҵָ�������)������
	public int updateGdCounselByTeaId(GdCounsel gdCounsel) {
		return ITeacherInfoDao.updateGdCounselByTeaId(gdCounsel);
	}
	//ͨ��teaId�޸�role_management(��ɫ�����)������
	public int updateRoleManagementByTeaId(RoleManagement roleManagement) {
		return ITeacherInfoDao.updateRoleManagementByTeaId(roleManagement);
	}
	//ͨ��teaId�޸�TeacherEaccessviolation(��ѧ�����)������
	public int updateTeacherEaccessviolationByTeaId(TeacherEaccessviolation teacherEaccessviolation) {
		return ITeacherInfoDao.updateTeacherEaccessviolationByTeaId(teacherEaccessviolation);
	}
	//ͨ��teaId�޸�teacher_enterprise(��ʦ��ҵ�����)������
	public int updateTeacherEnterpriseByTeaId(TeacherEnterprise teacherEnterprise) {
		return ITeacherInfoDao.updateTeacherEnterpriseByTeaId(teacherEnterprise);
	}
	//ͨ��teaId����teacher_honor(��ʦ������)������
	public int updateTeacherHonorByTeaId(TeacherHonor teacherHonor) {
		return ITeacherInfoDao.updateTeacherHonorByTeaId(teacherHonor);
	}
	
	//2019-01-10 ���еı�д
	//������ְʱ�䵽��ǰʱ���Ƿ���ڻ����year,�������������
	public List<TeacherInfo> selectTeacherInfoByEntryTime(int year){
		return ITeacherInfoDao.selectTeacherInfoByEntryTime(year);
	}
	//ͨ��edu(ѧ��)��ѯ��ʦ��Ϣ
	public List<TeacherInfo> selectTeacherInfoByTeaEdu(String edu){
		return ITeacherInfoDao.selectTeacherInfoByTeaEdu(edu);
	}
	
	//2019-01-12 ְ������������
	//ͨ��tpTechnical(ְ��)��ѯ��ʦ��Ϣ
	public List<Theplan> selectTeacherInfoBytpTechnical(String tpTechnical){
		return ITeacherInfoDao.selectTeacherInfoBytpTechnical(tpTechnical);
	}
	//ģ������ͨ���س�������ʦ��Ϣ
	public List<TeacherInfo> selectTeacherTechang(String teaSpe){
		String teaSpes="%"+teaSpe+"%";
		return ITeacherInfoDao.selectTeacherTechang(teaSpes);
	}
	//ͨ����ַ������ʦ��Ϣ
	public List<TeacherInfo> selectTeacherAddress(String address){
		return ITeacherInfoDao.selectTeacherAddress(address);
	}
	//ͨ��ְ��������ʦ��Ϣ
	public List<TeacherInfo> selectTeacherTitle(String Title){
		return ITeacherInfoDao.selectTeacherTitle(Title);
	}
	
	//2019��1��20��15:18:23
	//���ѧ�¶ȿ������(teaching_assessment)�����һ������
	public int insertTeachingAssessment(TeachingAssessment teachingAssessment) {
		return ITeacherInfoDao.insertTeachingAssessment(teachingAssessment);
	}
	//���ѧ�¶ȿ������(teaching_assessment)���޸�һ������
	public int updateTeachingAssessmentById(TeachingAssessment teachingAssessment) {
		return ITeacherInfoDao.updateTeachingAssessmentById(teachingAssessment);
	}
	//ɾ��������Ŀ�е�����ͨ��id
	public int deleteTeachingAssessmentById(int id) {
		return ITeacherInfoDao.deleteTeachingAssessmentById(id);
	}


}
