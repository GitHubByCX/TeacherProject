package com.decision_aid.bean;

/*
 * 教学经验
 */

public class TeacherEaccessviolation {
    private Integer id;

    private String teaId;

    private String tStartTime;

    private String tEndTime;

    private String tTeachClass;

    private String tCourse;

    private Integer tClass;
    private String tEvaluate;
	public TeacherEaccessviolation(Integer id, String teaId, String tStartTime, String tEndTime, String tTeachClass,
			String tCourse, Integer tClass, String tEvaluate) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.tStartTime = tStartTime;
		this.tEndTime = tEndTime;
		this.tTeachClass = tTeachClass;
		this.tCourse = tCourse;
		this.tClass = tClass;
		this.tEvaluate = tEvaluate;
	}
	public TeacherEaccessviolation() {
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
	public String gettStartTime() {
		return tStartTime;
	}
	public void settStartTime(String tStartTime) {
		this.tStartTime = tStartTime;
	}
	public String gettEndTime() {
		return tEndTime;
	}
	public void settEndTime(String tEndTime) {
		this.tEndTime = tEndTime;
	}
	public String gettTeachClass() {
		return tTeachClass;
	}
	public void settTeachClass(String tTeachClass) {
		this.tTeachClass = tTeachClass;
	}
	public String gettCourse() {
		return tCourse;
	}
	public void settCourse(String tCourse) {
		this.tCourse = tCourse;
	}
	public Integer gettClass() {
		return tClass;
	}
	public void settClass(Integer tClass) {
		this.tClass = tClass;
	}
	public String gettEvaluate() {
		return tEvaluate;
	}
	public void settEvaluate(String tEvaluate) {
		this.tEvaluate = tEvaluate;
	}
	@Override
	public String toString() {
		return "TeacherEaccessviolation [id=" + id + ", teaId=" + teaId + ", tStartTime=" + tStartTime + ", tEndTime="
				+ tEndTime + ", tTeachClass=" + tTeachClass + ", tCourse=" + tCourse + ", tClass=" + tClass
				+ ", tEvaluate=" + tEvaluate + "]";
	}
	
    
   
}