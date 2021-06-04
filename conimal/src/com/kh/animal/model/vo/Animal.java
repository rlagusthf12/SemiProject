package com.kh.animal.model.vo;

import java.sql.Date;

public class Animal {
	
	private int anNo;
	private String anTitle;
	private String anPlace;
	private String anDate;
	private String anSpecies;
	private String anGender;
	private Date anWritedate;
	private String anContent;
	private String memNo; // 조회시 작성자아이디 / 작성하기시 로그인한회원번호
	private String refType;
	private int anCount;
	
	public Animal() {}
	
	

	public Animal(int anNo, String anTitle, String anPlace, String anDate, String anSpecies, Date anWritedate,
			String anContent) {
		super();
		this.anNo = anNo;
		this.anTitle = anTitle;
		this.anPlace = anPlace;
		this.anDate = anDate;
		this.anSpecies = anSpecies;
		this.anWritedate = anWritedate;
		this.anContent = anContent;
	}



	public Animal(int anNo, String anTitle, String anPlace, String anDate, String anSpecies, String anGender,
			Date anWritedate, String anContent, String memNo, String refType, int anCount) {
		super();
		this.anNo = anNo;
		this.anTitle = anTitle;
		this.anPlace = anPlace;
		this.anDate = anDate;
		this.anSpecies = anSpecies;
		this.anGender = anGender;
		this.anWritedate = anWritedate;
		this.anContent = anContent;
		this.memNo = memNo;
		this.refType = refType;
		this.anCount = anCount;
	}

	public int getAnNo() {
		return anNo;
	}

	public void setAnNo(int anNo) {
		this.anNo = anNo;
	}

	public String getAnTitle() {
		return anTitle;
	}

	public void setAnTitle(String anTitle) {
		this.anTitle = anTitle;
	}

	public String getAnPlace() {
		return anPlace;
	}

	public void setAnPlace(String anPlace) {
		this.anPlace = anPlace;
	}

	public String getAnDate() {
		return anDate;
	}

	public void setAnDate(String anDate) {
		this.anDate = anDate;
	}

	public String getAnSpecies() {
		return anSpecies;
	}

	public void setAnSpecies(String anSpecies) {
		this.anSpecies = anSpecies;
	}

	public String getAnGender() {
		return anGender;
	}

	public void setAnGender(String anGender) {
		this.anGender = anGender;
	}

	public Date getAnWritedate() {
		return anWritedate;
	}

	public void setAnWritedate(Date anWritedate) {
		this.anWritedate = anWritedate;
	}

	public String getAnContent() {
		return anContent;
	}

	public void setAnContent(String anContent) {
		this.anContent = anContent;
	}

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public int getAnCount() {
		return anCount;
	}

	public void setAnCount(int anCount) {
		this.anCount = anCount;
	}

	@Override
	public String toString() {
		return "Animal [anNo=" + anNo + ", anTitle=" + anTitle + ", anPlace=" + anPlace + ", anDate=" + anDate
				+ ", anSpecies=" + anSpecies + ", anGender=" + anGender + ", anWritedate=" + anWritedate
				+ ", anContent=" + anContent + ", memNo=" + memNo + ", refType=" + refType + ", anCount=" + anCount
				+ "]";
	}
	
	

}
