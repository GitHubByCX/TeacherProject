package com.decision_aid.bean;

public class testListJxl {
	private String id ;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public testListJxl(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public testListJxl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "testListJxl [id=" + id + ", name=" + name + "]";
	}
	
}
