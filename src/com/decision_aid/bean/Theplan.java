package com.decision_aid.bean;

/*
 * 近三年规划
 */

public class Theplan {
    private Integer id;

    private String teaId;

    private String tpEdu;

    private String tpYear;
    
    private String tpTechnical;

    private String tpSkill;

    private String tpAbility;

    private String tpTeaabi;

    private String tpThesis;
    
    private TeacherInfo teacherInfo;

	public Theplan(Integer id, String teaId, String tpEdu, String tpYear, String tpTechnical, String tpSkill,
			String tpAbility, String tpTeaabi, String tpThesis) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.tpEdu = tpEdu;
		this.tpYear = tpYear;
		this.tpTechnical = tpTechnical;
		this.tpSkill = tpSkill;
		this.tpAbility = tpAbility;
		this.tpTeaabi = tpTeaabi;
		this.tpThesis = tpThesis;
	}

	public Theplan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeaId() {
		return teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	public String getTpEdu() {
		return tpEdu;
	}

	public void setTpEdu(String tpEdu) {
		this.tpEdu = tpEdu;
	}

	public String getTpYear() {
		return tpYear;
	}

	public void setTpYear(String tpYear) {
		this.tpYear = tpYear;
	}

	public String getTpTechnical() {
		return tpTechnical;
	}

	public void setTpTechnical(String tpTechnical) {
		this.tpTechnical = tpTechnical;
	}

	public String getTpSkill() {
		return tpSkill;
	}

	public void setTpSkill(String tpSkill) {
		this.tpSkill = tpSkill;
	}

	public String getTpAbility() {
		return tpAbility;
	}

	public void setTpAbility(String tpAbility) {
		this.tpAbility = tpAbility;
	}

	public String getTpTeaabi() {
		return tpTeaabi;
	}

	public void setTpTeaabi(String tpTeaabi) {
		this.tpTeaabi = tpTeaabi;
	}

	public String getTpThesis() {
		return tpThesis;
	}

	public void setTpThesis(String tpThesis) {
		this.tpThesis = tpThesis;
	}

	public TeacherInfo getTeacherInfo() {
		return teacherInfo;
	}

	public void setTeacherInfo(TeacherInfo teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	@Override
	public String toString() {
		return "Theplan [id=" + id + ", teaId=" + teaId + ", tpEdu=" + tpEdu + ", tpYear=" + tpYear + ", tpTechnical="
				+ tpTechnical + ", tpSkill=" + tpSkill + ", tpAbility=" + tpAbility + ", tpTeaabi=" + tpTeaabi
				+ ", tpThesis=" + tpThesis + ", teacherInfo=" + teacherInfo + "]";
	}

	
	

    
}