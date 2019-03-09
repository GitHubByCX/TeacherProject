package com.decision_aid.bean;

/*
 * 老师企业经验
 */

public class TeacherEnterprise {

	private Integer id;

    private String teaId;

    private String eStratTime;

    private String eEndTime;

    private String eWork;

    private String eOperating;

    private String eJob;

	public TeacherEnterprise(Integer id, String teaId, String eStratTime, String eEndTime, String eWork,
			String eOperating, String eJob) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.eStratTime = eStratTime;
		this.eEndTime = eEndTime;
		this.eWork = eWork;
		this.eOperating = eOperating;
		this.eJob = eJob;
	}

	public TeacherEnterprise() {
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

	public String geteStratTime() {
		return eStratTime;
	}

	public void seteStratTime(String eStratTime) {
		this.eStratTime = eStratTime;
	}

	public String geteEndTime() {
		return eEndTime;
	}

	public void seteEndTime(String eEndTime) {
		this.eEndTime = eEndTime;
	}

	public String geteWork() {
		return eWork;
	}

	public void seteWork(String eWork) {
		this.eWork = eWork;
	}

	public String geteOperating() {
		return eOperating;
	}

	public void seteOperating(String eOperating) {
		this.eOperating = eOperating;
	}

	public String geteJob() {
		return eJob;
	}

	public void seteJob(String eJob) {
		this.eJob = eJob;
	}

	@Override
	public String toString() {
		return "TeacherEnterprise [id=" + id + ", teaId=" + teaId + ", eStratTime=" + eStratTime + ", eEndTime="
				+ eEndTime + ", eWork=" + eWork + ", eOperating=" + eOperating + ", eJob=" + eJob + "]";
	}

   
}