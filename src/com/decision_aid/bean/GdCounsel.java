package com.decision_aid.bean;

/*
 * 实习就业指导经验
 */

public class GdCounsel {
    private Integer id;

    private String teaId;

    private String gdStartTime;

    private String gdEndTime;

    private String gdClass;

    private Integer gdNum;

    private String gdEvaluate;
    

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


	public String gdStartTime() {
		return gdStartTime;
	}


	public void setGdStartTime(String gdStartTime) {
		this.gdStartTime = gdStartTime;
	}


	public String getGdEndTime() {
		return gdEndTime;
	}


	public void setGdEndTime(String gdEndTime) {
		this.gdEndTime = gdEndTime;
	}


	public String getGdClass() {
		return gdClass;
	}


	public void setGdClass(String gdClass) {
		this.gdClass = gdClass;
	}


	public Integer getGdNum() {
		return gdNum;
	}


	public void setGdNum(Integer gdNum) {
		this.gdNum = gdNum;
	}


	public String getGdEvaluate() {
		return gdEvaluate;
	}


	public void setGdEvaluate(String gdEvaluate) {
		this.gdEvaluate = gdEvaluate;
	}


	public GdCounsel() {
		super();
	}


	public GdCounsel(Integer id, String teaId, String gdStartTime, String gdEndTime, String gdClass, Integer gdNum,
			String gdEvaluate) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.gdStartTime = gdStartTime;
		this.gdEndTime = gdEndTime;
		this.gdClass = gdClass;
		this.gdNum = gdNum;
		this.gdEvaluate = gdEvaluate;
	}


	@Override
	public String toString() {
		return "GdCounsel [id=" + id + ", teaId=" + teaId + ", gdStartTime=" + gdStartTime + ", gdEndTime=" + gdEndTime
				+ ", gdClass=" + gdClass + ", gdNum=" + gdNum + ", gdEvaluate=" + gdEvaluate + "]";
	}

  
}