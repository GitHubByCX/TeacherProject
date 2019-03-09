package com.decision_aid.bean;

/*
 * 教师基本信息
 */

import java.util.Date;

public class TeacherInfo_old {


	private Integer id;

    private String teaId;

    private String teaPwd;

    private String teaName;

    private String teaSex;

    private Date teaBirth;

    private String teaPhone;

    private String teaEdu;

    private String teaTimeOfGra;
    
    private String teaGra;

    private String teaSpecialty;

    private Date teaEntrytime; 

    private String teaCertification;
 
    private Byte teaCer;
    
    private String teaAddress;
    
    private String teaHobby;
 
    private String teaSpe;

    private String teaCha;

    private String teaMotto;
    
    private String teaBigdepartment;
    
    private String teaTitle;

	public TeacherInfo_old(Integer id, String teaId, String teaPwd, String teaName, String teaSex, Date teaBirth,
			String teaPhone, String teaEdu, String teaTimeOfGra, String teaGra, String teaSpecialty, Date teaEntrytime,
			String teaCertification, Byte teaCer, String teaAddress, String teaHobby, String teaSpe, String teaCha,
			String teaMotto, String teaBigdepartment) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.teaPwd = teaPwd;
		this.teaName = teaName;
		this.teaSex = teaSex;
		this.teaBirth = teaBirth;
		this.teaPhone = teaPhone;
		this.teaEdu = teaEdu;
		this.teaTimeOfGra = teaTimeOfGra;
		this.teaGra = teaGra;
		this.teaSpecialty = teaSpecialty;
		this.teaEntrytime = teaEntrytime;
		this.teaCertification = teaCertification;
		this.teaCer = teaCer;
		this.teaAddress = teaAddress;
		this.teaHobby = teaHobby;
		this.teaSpe = teaSpe;
		this.teaCha = teaCha;
		this.teaMotto = teaMotto;
		this.teaBigdepartment = teaBigdepartment;
	}
	
	public TeacherInfo_old(Integer id, String teaId, String teaPwd, String teaName, String teaSex, Date teaBirth,
			String teaPhone, String teaEdu, String teaTimeOfGra, String teaGra, String teaSpecialty, Date teaEntrytime,
			String teaCertification, Byte teaCer, String teaAddress, String teaHobby, String teaSpe, String teaCha,
			String teaMotto, String teaBigdepartment, String teaTitle) {
		super();
		this.id = id;
		this.teaId = teaId;
		this.teaPwd = teaPwd;
		this.teaName = teaName;
		this.teaSex = teaSex;
		this.teaBirth = teaBirth;
		this.teaPhone = teaPhone;
		this.teaEdu = teaEdu;
		this.teaTimeOfGra = teaTimeOfGra;
		this.teaGra = teaGra;
		this.teaSpecialty = teaSpecialty;
		this.teaEntrytime = teaEntrytime;
		this.teaCertification = teaCertification;
		this.teaCer = teaCer;
		this.teaAddress = teaAddress;
		this.teaHobby = teaHobby;
		this.teaSpe = teaSpe;
		this.teaCha = teaCha;
		this.teaMotto = teaMotto;
		this.teaBigdepartment = teaBigdepartment;
		this.teaTitle = teaTitle;
	}

	public TeacherInfo_old() {
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

	public String getTeaPwd() {
		return teaPwd;
	}

	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaSex() {
		return teaSex;
	}

	public void setTeaSex(String teaSex) {
		this.teaSex = teaSex;
	}

	public Date getTeaBirth() {
		return teaBirth;
	}

	public void setTeaBirth(Date teaBirth) {
		this.teaBirth = teaBirth;
	}

	public String getTeaPhone() {
		return teaPhone;
	}

	public void setTeaPhone(String teaPhone) {
		this.teaPhone = teaPhone;
	}

	public String getTeaEdu() {
		return teaEdu;
	}

	public void setTeaEdu(String teaEdu) {
		this.teaEdu = teaEdu;
	}

	public String getTeaTimeOfGra() {
		return teaTimeOfGra;
	}

	public void setTeaTimeOfGra(String teaTimeOfGra) {
		this.teaTimeOfGra = teaTimeOfGra;
	}

	public String getTeaGra() {
		return teaGra;
	}

	public void setTeaGra(String teaGra) {
		this.teaGra = teaGra;
	}

	public String getTeaSpecialty() {
		return teaSpecialty;
	}

	public void setTeaSpecialty(String teaSpecialty) {
		this.teaSpecialty = teaSpecialty;
	}

	public Date getTeaEntrytime() {
		return teaEntrytime;
	}

	public void setTeaEntrytime(Date teaEntrytime) {
		this.teaEntrytime = teaEntrytime;
	}

	public String getTeaCertification() {
		return teaCertification;
	}

	public void setTeaCertification(String teaCertification) {
		this.teaCertification = teaCertification;
	}

	public Byte getTeaCer() {
		return teaCer;
	}

	public void setTeaCer(Byte teaCer) {
		this.teaCer = teaCer;
	}

	public String getTeaAddress() {
		return teaAddress;
	}

	public void setTeaAddress(String teaAddress) {
		this.teaAddress = teaAddress;
	}

	public String getTeaHobby() {
		return teaHobby;
	}

	public void setTeaHobby(String teaHobby) {
		this.teaHobby = teaHobby;
	}

	public String getTeaSpe() {
		return teaSpe;
	}

	public void setTeaSpe(String teaSpe) {
		this.teaSpe = teaSpe;
	}

	public String getTeaCha() {
		return teaCha;
	}

	public void setTeaCha(String teaCha) {
		this.teaCha = teaCha;
	}

	public String getTeaMotto() {
		return teaMotto;
	}

	public void setTeaMotto(String teaMotto) {
		this.teaMotto = teaMotto;
	}

	public String getTeaBigdepartment() {
		return teaBigdepartment;
	}

	public void setTeaBigdepartment(String teaBigdepartment) {
		this.teaBigdepartment = teaBigdepartment;
	}

	public String getTeaTitle() {
		return teaTitle;
	}

	public void setTeaTitle(String teaTitle) {
		this.teaTitle = teaTitle;
	}

	@Override
	public String toString() {
		return "TeacherInfo [id=" + id + ", teaId=" + teaId + ", teaPwd=" + teaPwd + ", teaName=" + teaName
				+ ", teaSex=" + teaSex + ", teaBirth=" + teaBirth + ", teaPhone=" + teaPhone + ", teaEdu=" + teaEdu
				+ ", teaTimeOfGra=" + teaTimeOfGra + ", teaGra=" + teaGra + ", teaSpecialty=" + teaSpecialty
				+ ", teaEntrytime=" + teaEntrytime + ", teaCertification=" + teaCertification + ", teaCer=" + teaCer
				+ ", teaAddress=" + teaAddress + ", teaHobby=" + teaHobby + ", teaSpe=" + teaSpe + ", teaCha=" + teaCha
				+ ", teaMotto=" + teaMotto + ", teaBigdepartment=" + teaBigdepartment + ", teaTitle=" + teaTitle + "]";
	}

	

	

	

	
}