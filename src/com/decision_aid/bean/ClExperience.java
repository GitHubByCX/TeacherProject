package com.decision_aid.bean;

/*
 * 班主任经验
 */

public class ClExperience {
    private Integer id;

    private String teaId;

    private String clStartTime;

    private String clEndTime;

    private String clClassname;

    private Integer clNum;

    private String clEvaluate;

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

	public String getClStartTime() {
		return clStartTime;
	}

	public void setClStartTime(String clStartTime) {
		this.clStartTime = clStartTime;
	}

	public String getClEndTime() {
		return clEndTime;
	}

	public void setClEndTime(String clEndTime) {
		this.clEndTime = clEndTime;
	}

	public String getClClassname() {
		return clClassname;
	}

	public void setClClassname(String clClassname) {
		this.clClassname = clClassname;
	}

	public Integer getClNum() {
		return clNum;
	}

	public void setClNum(Integer clNum) {
		this.clNum = clNum;
	}

	public String getClEvaluate() {
		return clEvaluate;
	}

	public void setClEvaluate(String clEvaluate) {
		this.clEvaluate = clEvaluate;
	}

	public ClExperience(Integer id, String teaId, String clStartTime, String clEndTime, String clClassname,
			Integer clNum, String clEvaluate) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.clStartTime = clStartTime;
		this.clEndTime = clEndTime;
		this.clClassname = clClassname;
		this.clNum = clNum;
		this.clEvaluate = clEvaluate;
	}

	public ClExperience() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClExperience [id=" + id + ", teaId=" + teaId + ", clStartTime=" + clStartTime + ", clEndTime="
				+ clEndTime + ", clClassname=" + clClassname + ", clNum=" + clNum + ", clEvaluate=" + clEvaluate + "]";
	}

    
}