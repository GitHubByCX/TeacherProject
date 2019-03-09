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
	
	//基本信息-----------------------------------------------------------------------------------------------------------------------------
	public int jibenxinxi(TeacherInfo teacherInfo) {		
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherInfoMapper.insertjiben",teacherInfo);
	}
	////教育历史-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiaoyujingli(TeacherInfo teacherInfo) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherInfoMapper.insertjiaoyujingli",  teacherInfo);
	}
	////教学经验-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiaoxuejingyan(TeacherEaccessviolation teacherEaccessviolation) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherEaccessviolationMapper.inserjiaoxuejingyan", teacherEaccessviolation);
	}
	////企业经验-----------------------------------------------------------------------------------------------------------------------------
	public int insertqiyejingyan(TeacherEnterprise teacherEnterprise) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherEnterpriseMapper.inserqiyejingyan", teacherEnterprise);
	}
	////曾获荣誉-----------------------------------------------------------------------------------------------------------------------------
	public int insertcenghuorongyu(TeacherHonor teacherHonor) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherHonorMapper.cenghuorongyu",teacherHonor);
	}
	////三年规划-----------------------------------------------------------------------------------------------------------------------------
	public int insertsannnianguihua(Theplan theplan) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TheplanMapper.sannianguihua", theplan);
	}
	////班主任经验-----------------------------------------------------------------------------------------------------------------------------
	public int insertbanzhuren(ClExperience clExperience) {
		return this.getSqlSession().insert("com.decision_aid.mapper.ClExperienceMapper.insertbanzhuren", clExperience);
	}
	////就业指导-----------------------------------------------------------------------------------------------------------------------------
	public int insertjiuyezhidao(GdCounsel gdCounsel) {
		return this.getSqlSession().insert("com.decision_aid.mapper.GdCounselMapper.insertjiuyezhidao", gdCounsel);
	}
	//登陆
	public TeacherInfo tealogin(TeacherInfo teacherInfo) {
		
		return (TeacherInfo) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherInfoMapper.loginteacher", teacherInfo);
	}
	//登陆跳转
	public TeacherInfo selectLo(TeacherInfo teacherInfo) {
		
		return (TeacherInfo) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherInfoMapper.selectLo", teacherInfo);
	}
	//教师注册
	public int inserTeacher(TeacherInfo teacherInfo) {
		
		return this.getSqlSession().insert("com.decision_aid.mapper.TeacherInfoMapper.inserteacher",teacherInfo);
	}
	//通过teaId查询各个表中的数据(dao)
	//通过tea_id搜索cl_experience(班主任经验表)中的数据 
	public ClExperience selectBanZhuRenByTeaId(int teaId){
		return (ClExperience) this.getSqlSession().selectOne("com.decision_aid.mapper.ClExperienceMapper.selectBanZhuRenByTeaId", teaId);
	}
	//通过TeaId搜索division_management(教师所属表)的数据
	public DivisionManagement selectDivisionManagementByTeaId(int teaId) {
		return (DivisionManagement) this.getSqlSession().selectOne("com.decision_aid.mapper.DivisionManagementMapper.selectDivisionManagementByTeaId",teaId);
	}
	//通过teaId搜索gd_counsel(实习就业指导经验表)的数据
	public GdCounsel selectGdCounselByTeaId(int teaId) {
		return (GdCounsel) this.getSqlSession().selectOne("com.decision_aid.mapper.GdCounselMapper.selectGdCounselByTeaId", teaId);
	}
	//通过teaId搜索role_management(角色管理表)的数据
	public RoleManagement selectRoleManagementByTeaId(int teaId) {
		return (RoleManagement) this.getSqlSession().selectOne("com.decision_aid.mapper.RoleManagementMapper.selectRoleManagementByTeaId", teaId);
	}
	//通过teaId搜索teacher_eaccessviolation(教学经验表)的数据
	public TeacherEaccessviolation selectTeacherEaccessviolationByTeaId(int teaId) {
		return (TeacherEaccessviolation) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherEaccessviolationMapper.selectTeacherEaccessviolationByTeaId", teaId);
	}
	//通过teaId搜索teacher_enterprise(老师企业经验表)的数据
	public TeacherEnterprise selectTeacherEnterpriseByTeaId(int teaId) {
		return (TeacherEnterprise) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherEnterpriseMapper.selectTeacherEnterpriseByTeaId", teaId);
	}
	//通过teaId搜索teacher_honor(教师荣誉表)的数据
	public TeacherHonor selectTeacherHonorByTeaId(int teaId) {
		return (TeacherHonor) this.getSqlSession().selectOne("com.decision_aid.mapper.TeacherHonorMapper.selectTeacherHonorByTeaId", teaId);
	}

	//通过teaId修改各个表中的数据(dao)
	//通过teaId修改authority_management(权限管理表)中的数据
	public int updateAuthorityManagementByTeaId(AuthorityManagement authorityManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.AuthorityManagementMapper.updateAuthorityManagementByTeaId", authorityManagement);
	}
	//通过teaId修改cl_experience(班主任经验表)中的数据
	public int updateClExperienceByTeaId(ClExperience ClExperience) {
		return this.getSqlSession().update("com.decision_aid.mapper.ClExperienceMapper.updateClExperienceByTeaId", ClExperience);
	}
	//通过teaId修改division_management(教师所属表)的数据
	public int updateDivisionManagementByTeaId(DivisionManagement divisionManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.DivisionManagementMapper.updateDivisionManagementByTeaId", divisionManagement);
	}
	//通过teaId修改gd_counsel(实习就业指导经验表)的数据
	public int updateGdCounselByTeaId(GdCounsel gdCounsel) {
		return this.getSqlSession().update("com.decision_aid.mapper.GdCounselMapper.updateGdCounselByTeaId", gdCounsel);
	}
	//通过teaId修改role_management(角色管理表)的数据
	public int updateRoleManagementByTeaId(RoleManagement roleManagement) {
		return this.getSqlSession().update("com.decision_aid.mapper.RoleManagementMapper.updateRoleManagementByTeaId", roleManagement);
	}
	//通过teaId修改TeacherEaccessviolation(教学经验表)的数据
	public int updateTeacherEaccessviolationByTeaId(TeacherEaccessviolation teacherEaccessviolation) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherEaccessviolationMapper.updateTeacherEaccessviolationByTeaId", teacherEaccessviolation);
	}
	//通过teaId修改teacher_enterprise(老师企业经验表)的数据
	public int updateTeacherEnterpriseByTeaId(TeacherEnterprise teacherEnterprise) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherEnterpriseMapper.updateTeacherEnterpriseByTeaId", teacherEnterprise);
	}
	//通过teaId搜索teacher_honor(教师荣誉表)的数据
	public int updateTeacherHonorByTeaId(TeacherHonor teacherHonor) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeacherHonorMapper.updateTeacherHonorByTeaId", teacherHonor);
	}
	
	//2019-01-10 进行的编写
	//计算入职时间到当前时间是否大于或等于year,并返回相关数据
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherInfoByEntryTime(int year){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByEntryTime", year);
	}
	//通过edu(学历)查询教师信息
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherInfoByTeaEdu(String edu){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByTeaEdu", edu);
	}
	
	//2019-01-12 职称排名”功能
	//通过tpTechnical(职称)查询教师信息
	@SuppressWarnings("unchecked")
	public List<Theplan> selectTeacherInfoBytpTechnical(String str){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TheplanMapper.selectTeacherInfoBytpTechnical", str);
	}
	//2019年1月15日12:31:17
	//模糊搜索教师特长
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherTechang(String teaSpe){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selecttechang", teaSpe);
	}
	//2019年1月15日16:48:26
	//搜索教师地址
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherAddress(String address){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectAddress", address);	
	}
	
	//2019年1月19日13:49:52
	//通过职称来搜索teainfo
	@SuppressWarnings("unchecked")
	public List<TeacherInfo> selectTeacherTitle(String teaTitle){
		return this.getSqlSession().selectList("com.decision_aid.mapper.TeacherInfoMapper.selectTeacherInfoByteaTitle", teaTitle);		
	}
	
	//2019年1月20日15:18:23
	//向教学月度考核项表(teaching_assessment)中添加一条数据
	public int insertTeachingAssessment(TeachingAssessment teachingAssessment) {
		return this.getSqlSession().insert("com.decision_aid.mapper.TeachingAssessmentMapper.insertTeachingAssessment", teachingAssessment);
	}
	//向教学月度考核项表(teaching_assessment)中修改一条数据
	public int updateTeachingAssessmentById(TeachingAssessment teachingAssessment) {
		return this.getSqlSession().update("com.decision_aid.mapper.TeachingAssessmentMapper.updateTeachingAssessmentById", teachingAssessment);
	}
	//删除考核项目中的数据通过id
	public int deleteTeachingAssessmentById(int id) {
		return this.getSqlSession().delete("com.decision_aid.mapper.TeachingAssessmentMapper.deleteTeachingAssessmentById", id);
	}

}
