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
	
	//添加一个教职工的教职工号和默认密码
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
	//通过teaId查询各个表中的数据(service)
	//通过tea_id搜索cl_experience(班主任经验表)中的数据 
	public ClExperience selectBanZhuRenByTeaId(int teaId){
		return ITeacherInfoDao.selectBanZhuRenByTeaId(teaId);
	}
	//通过TeaId搜索division_management(教师所属表)的数据
	public DivisionManagement selectDivisionManagementByTeaId(int teaId) {
		return ITeacherInfoDao.selectDivisionManagementByTeaId(teaId);
	}
	//通过teaId搜索gd_counsel(实习就业指导经验表)的数据
	public GdCounsel selectGdCounselByTeaId(int teaId) {
		return ITeacherInfoDao.selectGdCounselByTeaId(teaId);
	}
	//通过teaId搜索role_management(角色管理表)的数据
	public RoleManagement selectRoleManagementByTeaId(int teaId) {
		return ITeacherInfoDao.selectRoleManagementByTeaId(teaId);
	}
	//通过teaId搜索teacher_eaccessviolation(教学经验表)的数据
	public TeacherEaccessviolation selectTeacherEaccessviolationByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherEaccessviolationByTeaId(teaId);
	}
	//通过teaId搜索teacher_enterprise(老师企业经验表)的数据
	public TeacherEnterprise selectTeacherEnterpriseByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherEnterpriseByTeaId(teaId);
	}
	//通过teaId搜索teacher_honor(教师荣誉表)的数据
	public TeacherHonor selectTeacherHonorByTeaId(int teaId) {
		return ITeacherInfoDao.selectTeacherHonorByTeaId(teaId);
	}

	//通过teaId修改各个表中的数据(service)
	//通过teaId修改authority_management(权限管理表)中的数据
	public int updateAuthorityManagementByTeaId(AuthorityManagement authorityManagement) {
		return ITeacherInfoDao.updateAuthorityManagementByTeaId(authorityManagement);
	}
	//通过teaId修改cl_experience(班主任经验表)中的数据
	public int updateClExperienceByTeaId(ClExperience ClExperience) {
		return ITeacherInfoDao.updateClExperienceByTeaId(ClExperience);
	}
	//通过teaId修改division_management(教师所属表)的数据
	public int updateDivisionManagementByTeaId(DivisionManagement divisionManagement) {
		return ITeacherInfoDao.updateDivisionManagementByTeaId(divisionManagement);
	}
	//通过teaId修改gd_counsel(实习就业指导经验表)的数据
	public int updateGdCounselByTeaId(GdCounsel gdCounsel) {
		return ITeacherInfoDao.updateGdCounselByTeaId(gdCounsel);
	}
	//通过teaId修改role_management(角色管理表)的数据
	public int updateRoleManagementByTeaId(RoleManagement roleManagement) {
		return ITeacherInfoDao.updateRoleManagementByTeaId(roleManagement);
	}
	//通过teaId修改TeacherEaccessviolation(教学经验表)的数据
	public int updateTeacherEaccessviolationByTeaId(TeacherEaccessviolation teacherEaccessviolation) {
		return ITeacherInfoDao.updateTeacherEaccessviolationByTeaId(teacherEaccessviolation);
	}
	//通过teaId修改teacher_enterprise(老师企业经验表)的数据
	public int updateTeacherEnterpriseByTeaId(TeacherEnterprise teacherEnterprise) {
		return ITeacherInfoDao.updateTeacherEnterpriseByTeaId(teacherEnterprise);
	}
	//通过teaId搜索teacher_honor(教师荣誉表)的数据
	public int updateTeacherHonorByTeaId(TeacherHonor teacherHonor) {
		return ITeacherInfoDao.updateTeacherHonorByTeaId(teacherHonor);
	}
	
	//2019-01-10 进行的编写
	//计算入职时间到当前时间是否大于或等于year,并返回相关数据
	public List<TeacherInfo> selectTeacherInfoByEntryTime(int year){
		return ITeacherInfoDao.selectTeacherInfoByEntryTime(year);
	}
	//通过edu(学历)查询教师信息
	public List<TeacherInfo> selectTeacherInfoByTeaEdu(String edu){
		return ITeacherInfoDao.selectTeacherInfoByTeaEdu(edu);
	}
	
	//2019-01-12 职称排名”功能
	//通过tpTechnical(职称)查询教师信息
	public List<Theplan> selectTeacherInfoBytpTechnical(String tpTechnical){
		return ITeacherInfoDao.selectTeacherInfoBytpTechnical(tpTechnical);
	}
	//模糊搜索通过特长搜索教师信息
	public List<TeacherInfo> selectTeacherTechang(String teaSpe){
		String teaSpes="%"+teaSpe+"%";
		return ITeacherInfoDao.selectTeacherTechang(teaSpes);
	}
	//通过地址搜索教师信息
	public List<TeacherInfo> selectTeacherAddress(String address){
		return ITeacherInfoDao.selectTeacherAddress(address);
	}
	//通过职称搜索教师信息
	public List<TeacherInfo> selectTeacherTitle(String Title){
		return ITeacherInfoDao.selectTeacherTitle(Title);
	}
	
	//2019年1月20日15:18:23
	//向教学月度考核项表(teaching_assessment)中添加一条数据
	public int insertTeachingAssessment(TeachingAssessment teachingAssessment) {
		return ITeacherInfoDao.insertTeachingAssessment(teachingAssessment);
	}
	//向教学月度考核项表(teaching_assessment)中修改一条数据
	public int updateTeachingAssessmentById(TeachingAssessment teachingAssessment) {
		return ITeacherInfoDao.updateTeachingAssessmentById(teachingAssessment);
	}
	//删除考核项目中的数据通过id
	public int deleteTeachingAssessmentById(int id) {
		return ITeacherInfoDao.deleteTeachingAssessmentById(id);
	}


}
