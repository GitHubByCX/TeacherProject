package com.decision_aid.bean;

import java.util.Date;

//ÔÂ¶È¿¼ºË±í
public class MonthlyCheck {
	private int Id;
	private int tId;
	private Date checkTime;
	private int selfRating;
	private int scRating;
	private int dhRating;
	private String checkType;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public int getSelfRating() {
		return selfRating;
	}
	public void setSelfRating(int selfRating) {
		this.selfRating = selfRating;
	}
	public int getScRating() {
		return scRating;
	}
	public void setScRating(int scRating) {
		this.scRating = scRating;
	}
	public int getDhRating() {
		return dhRating;
	}
	public void setDhRating(int dhRating) {
		this.dhRating = dhRating;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public MonthlyCheck(int id, int tId, Date checkTime, int selfRating, int scRating, int dhRating,
			String checkType) {
		super();
		Id = id;
		this.tId = tId;
		this.checkTime = checkTime;
		this.selfRating = selfRating;
		this.scRating = scRating;
		this.dhRating = dhRating;
		this.checkType = checkType;
	}
	public MonthlyCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MonthlyCheck [Id=" + Id + ", tId=" + tId + ", checkTime=" + checkTime + ", selfRating=" + selfRating
				+ ", scRating=" + scRating + ", dhRating=" + dhRating + ", checkType=" + checkType + "]";
	}
	
}
