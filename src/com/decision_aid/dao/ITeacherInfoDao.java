package com.decision_aid.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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


@Repository
public class ITeacherInfoDao extends SqlSessionDaoSupport {

	@SuppressWarnings("unused")
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactory;
	
	//������Ϣ-----------------------------------------------------------------------------------------------------------------------------
	public int jibenxinxi(TeacherInfo teacherInfo) {		
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherInfoMapper.insertjiben",teacherInfo);
	}
	////������ʷ-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiaoyujingli(TeacherInfo teacherInfo) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherInfoMapper.insertjiaoyujingli",  teacherInfo);
	}
	////��ѧ����-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiaoxuejingyan(TeacherEaccessviolation teacherEaccessviolation) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherEaccessviolationMapper.inserjiaoxuejingyan", teacherEaccessviolation);
	}
	////��ҵ����-----------------------------------------------------------------------------------------------------------------------------
	public int insertqiyejingyan(TeacherEnterprise teacherEnterprise) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherEnterpriseMapper.inserqiyejingyan", teacherEnterprise);
	}
	////��������-----------------------------------------------------------------------------------------------------------------------------
	public int insertcenghuorongyu(TeacherHonor teacherHonor) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherHonorMapper.cenghuorongyu",teacherHonor);
	}
	////����滮-----------------------------------------------------------------------------------------------------------------------------
	public int insertsannnianguihua(Theplan theplan) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TheplanMapper.sannianguihua", theplan);
	}
	////�����ξ���-----------------------------------------------------------------------------------------------------------------------------
	public int insertbanzhuren(ClExperience clExperience) {
		return this.getSqlSession().insert("com.decision_aid.mapper.ClExperienceMapper.insertbanzhuren", clExperience);
	}
	////��ҵָ��-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiuyezhidao(GdCounsel gdCounsel) {
		return this.getSqlSession().insert("com.decision_aid.mapper.GdCounselMapper.insertjiuyezhidao", gdCounsel);
	}
	//��½
	public TeacherInfo tealogin(TeacherInfo teacherInfo) {
		
		return (TeacherInfo) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherInfoMapper.loginteacher", teacherInfo);
	}
	//��½��ת
	public TeacherInfo selectLo(TeacherInfo teacherInfo) {
		
		return (TeacherInfo) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherInfoMapper.selectLo", teacherInfo);
	}
	//��ʦע��
	public int inserTeacher(TeacherInfo teacherInfo) {
		
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherInfoMapper.inserteacher",teacherInfo);
	}
	//ͨ��teaId��ѯ�������е�����(dao)
	//ͨ��tea_id����cl_experience(�����ξ����)�е����� 
	public ClExperience selectBanZhuRenByTeaId(int teaId){
		return (ClExperience) this.getSqlSession().selectOne("com.decision_aid.mapper.ClExperienceMapper.selectBanZhuRenByTeaId", teaId);
	}
	//ͨ��TeaId����division_management(��ʦ������)������
	public DivisionManagement selectDivisionManagementByTeaId(int teaId) {
		return (DivisionManagement) this.getSqlSession().selectOne("com.decision_aid.mapper.DivisionManagementMapper.selectDivisionManagementByTeaId",teaId);
	}
	//ͨ��teaId����gd_counsel(ʵϰ��ҵָ�������)������
	public GdCounsel selectGdCounselByTeaId(int teaId) {
		return (GdCounsel) this.getSqlSession().selectOne("com.decision_aid.mapper.GdCounselMapper.selectGdCounselByTeaId", teaId);
	}
	//ͨ��teaId����role_management(��ɫ�����)������
	public RoleManagement selectRoleManagementByTeaId(int teaId) {
		return (RoleManagement) this.getSqlSession().selectOne("com.decision_aid.mapper.RoleManagementMapper.selectRoleManagementByTeaId", teaId);
	}
	//ͨ��teaId����teacher_eaccessviolation(��ѧ�����)������
	public TeacherEaccessviolation selectTeacherEaccessviolationByTeaId(int teaId) {
		return (TeacherEaccessviolation) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherEaccessviolationMapper.selectTeacherEaccessviolationByTeaId", teaId);
	}
	//ͨ��teaId����teacher_enterprise(��ʦ��ҵ�����)������
	public TeacherEnterprise selectTeacherEnterpriseByTeaId(int teaId) {
		return (TeacherEnterprise) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherEnterpriseMapper.selectTeacherEnterpriseByTeaId", teaId);
	}
	//ͨ��teaId����teacher_honor(��ʦ������)������
	public TeacherHonor selectTeacherHonorByTeaId(int teaId) {
		return (TeacherHonor) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherHonorMapper.selectTeacherHonorByTeaId", teaId);
	}

	//ͨ��teaId�޸ĸ������е�����(dao)
	//ͨ��teaId�޸�authority_management(Ȩ�޹����)�е�����
	public int updateAuthorityManagementByTeaId(AuthorityManagement authorityManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.AuthorityManagementMapper.updateAuthorityManagementByTeaId", authorityManagement);
	}
	//ͨ��teaId�޸�cl_experience(�����ξ����)�е�����
	public int updateClExperienceByTeaId(ClExperience ClExperience) {
		return this.getSqlSession().update("com.decision_aid.mapper.ClExperienceMapper.updateClExperienceByTeaId", ClExperience);
	}
	//ͨ��teaId�޸�division_management(��ʦ������)������
	public int updateDivisionManagementByTeaId(DivisionManagement divisionManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.DivisionManagementMapper.updateDivisionManagementByTeaId", divisionManagement);
	}
	//ͨ��teaId�޸�gd_counsel(ʵϰ��ҵָ�������)������
	public int updateGdCounselByTeaId(GdCounsel gdCounsel) {
		return this.getSqlSession().update("com.decision_aid.mapper.GdCounselMapper.updateGdCounselByTeaId", gdCounsel);
	}
	//ͨ��teaId�޸�role_management(��ɫ�����)������
	public int updateRoleManagementByTeaId(RoleManagement roleManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.RoleManagementMapper.updateRoleManagementByTeaId", roleManagement);
	}
	//ͨ��teaId�޸�TeacherEaccessviolation(��ѧ�����)������
	public int updateTeacherEaccessviolationByTeaId(TeacherEaccessviolation teacherEaccessviolation) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherEaccessviolationMapper.updateTeacherEaccessviolationByTeaId", teacherEaccessviolation);
	}
	//ͨ��teaId�޸�teacher_enterprise(��ʦ��ҵ�����)������
	public int updateTeacherEnterpriseByTeaId(TeacherEnterprise teacherEnterprise) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherEnterpriseMapper.updateTeacherEnterpriseByTeaId", teacherEnterprise);
	}
	//ͨ��teaId����teacher_honor(��ʦ������)������
	public int updateTeacherHonorByTeaId(TeacherHonor teacherHonor) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherHonorMapper.updateTeacherHonorByTeaId", teacherHonor);
	}
	
	//2019-01-10 ���еı�д
	//������ְʱ�䵽��ǰʱ���Ƿ���ڻ����year,�������������
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherInfoByEntryTime(int year){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByEntryTime", year);
	}
	//ͨ��edu(ѧ��)��ѯ��ʦ��Ϣ
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherInfoByTeaEdu(String edu){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByTeaEdu", edu);
	}
	
	//2019-01-12 ְ������������
	//ͨ��tpTechnical(ְ��)��ѯ��ʦ��Ϣ
	@SuppressWarnings("unchecked")
	public List<Theplan> selectTeacherInfoBytpTechnical(String str){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TheplanMapper.selectTeacherInfoBytpTechnical", str);
	}
	//2019��1��15��12:31:17
	//ģ��������ʦ�س�
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherTechang(String teaSpe){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selecttechang", teaSpe);
	}
	//2019��1��15��16:48:26
	//������ʦ��ַ
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherAddress(String address){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectAddress", address);	
	}
	
	//2019��1��19��13:49:52
	//ͨ��ְ��������teainfo
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherTitle(String teaTitle){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByteaTitle", teaTitle);		
	}
	
	//2019��1��20��15:18:23
	//���ѧ�¶ȿ������(teaching_assessment)�����һ������
	public int insertTeachingAssessment(TeachingAssessment teachingAssessment) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeachingAssessmentMapper.insertTeachingAssessment", teachingAssessment);
	}
	//���ѧ�¶ȿ������(teaching_assessment)���޸�һ������
	public int updateTeachingAssessmentById(TeachingAssessment teachingAssessment) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeachingAssessmentMapper.updateTeachingAssessmentById", teachingAssessment);
	}
	//ɾ��������Ŀ�е�����ͨ��id
	public int deleteTeachingAssessmentById(int id) {
		return this.getSqlSession().delete("com.decision_aid.mapper.TeachingAssessmentMapper.deleteTeachingAssessmentById", id);
	}

}
