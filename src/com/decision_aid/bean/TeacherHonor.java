package com.decision_aid.bean;

/*
 * ΩÃ ¶»Ÿ”˛
 */

public class TeacherHonor {
    private Integer id;

    private String teaId;

    private String hStratTime;

    private String hEndTime;

    private String hCer;

    private String hOffice;

	public TeacherHonor(Integer id, String teaId, String hStratTime, String hEndTime, String hCer, String hOffice) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.hStratTime = hStratTime;
		this.hEndTime = hEndTime;
		this.hCer = hCer;
		this.hOffice = hOffice;
	}

	public TeacherHonor() {
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

	public String gethStratTime() {
		return hStratTime;
	}

	public void sethStratTime(String hStratTime) {
		this.hStratTime = hStratTime;
	}

	public String gethEndTime() {
		return hEndTime;
	}

	public void sethEndTime(String hEndTime) {
		this.hEndTime = hEndTime;
	}

	public String gethCer() {
		return hCer;
	}

	public void sethCer(String hCer) {
		this.hCer = hCer;
	}

	public String gethOffice() {
		return hOffice;
	}

	public void sethOffice(String hOffice) {
		this.hOffice = hOffice;
	}

	@Override
	public String toString() {
		return "TeacherHonor [id=" + id + ", teaId=" + teaId + ", hStratTime=" + hStratTime + ", hEndTime=" + hEndTime
				+ ", hCer=" + hCer + ", hOffice=" + hOffice + "]";
	}

   
}