package com.decision_aid.bean;

import java.util.Date;

//骨干教师月度考核表
public class BackboneTeacher {
	private int Id;
	private int tId;
	private int bigPoints;
	private int smallPoints;
	private int totalPoints;
	private String author;
	private Date addTime;
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
	public int getBigPoints() {
		return bigPoints;
	}
	public void setBigPoints(int bigPoints) {
		this.bigPoints = bigPoints;
	}
	public int getSmallPoints() {
		return smallPoints;
	}
	public void setSmallPoints(int smallPoints) {
		this.smallPoints = smallPoints;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public BackboneTeacher(int id, int tId, int bigPoints, int smallPoints, int totalPoints, String author,
			Date addTime) {
		super();
		Id = id;
		this.tId = tId;
		this.bigPoints = bigPoints;
		this.smallPoints = smallPoints;
		this.totalPoints = totalPoints;
		this.author = author;
		this.addTime = addTime;
	}
	public BackboneTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BackboneTeacher [Id=" + Id + ", tId=" + tId + ", bigPoints=" + bigPoints + ", smallPoints="
				+ smallPoints + ", totalPoints=" + totalPoints + ", author=" + author + ", addTime=" + addTime + "]";
	}
	
	
}
