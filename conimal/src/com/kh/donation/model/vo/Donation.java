package com.kh.donation.model.vo;

import java.sql.Date;

public class Donation {
	
	private int doNo; // 후원 글번호
	private String doTitle; // 후원 글제목
	private String doContent; // 상세설명
	private Date doWritedate; // 작성일
	private String doAdmission; // 승인여부
	private String memNo; // 작성시 회원번호 / 조회시 회원아이디
	private String refType; // 게시글 유형
	private int doCount; // 조회수
	
	private String shName; // 보호소 이름
	private String shPhone; // 보호소 연락처
	private String shAddress; // 보호소 주소
	
	public Donation() {}
	
	// 리스트: 글번호, 제목, 작성자, 조회수, 작성일
	public Donation(int doNo, String doTitle, String memNo, int doCount, Date doWritedate) {
		super();
		this.doNo = doNo;
		this.doTitle = doTitle;
		this.memNo = memNo;
		this.doCount = doCount;
		this.doWritedate = doWritedate;
	}
	
	
	// 상세보기: 제목, 보호소명, 연락처, 주소, 내용
	public Donation(String doTitle, String shName, String shPhone, String shAddress, String doContent) {
		super();
		this.doTitle = doTitle;
		this.shName = shName;
		this.shPhone = shPhone;
		this.shAddress = shAddress;
		this.doContent = doContent;
	}
	

	public int getDoNo() {
		return doNo;
	}

	public void setDoNo(int doNo) {
		this.doNo = doNo;
	}

	public String getDoTitle() {
		return doTitle;
	}

	public void setDoTitle(String doTitle) {
		this.doTitle = doTitle;
	}

	public String getDoContent() {
		return doContent;
	}

	public void setDoContent(String doContent) {
		this.doContent = doContent;
	}

	public Date getDoWritedate() {
		return doWritedate;
	}

	public void setDoWritedate(Date doWritedate) {
		this.doWritedate = doWritedate;
	}

	public String getDoAdmission() {
		return doAdmission;
	}

	public void setDoAdmission(String doAdmission) {
		this.doAdmission = doAdmission;
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

	public int getDoCount() {
		return doCount;
	}

	public void setDoCount(int doCount) {
		this.doCount = doCount;
	}

	public String getShName() {
		return shName;
	}

	public void setShName(String shName) {
		this.shName = shName;
	}

	public String getShPhone() {
		return shPhone;
	}

	public void setShPhone(String shPhone) {
		this.shPhone = shPhone;
	}

	public String getShAddress() {
		return shAddress;
	}

	public void setShAddress(String shAddress) {
		this.shAddress = shAddress;
	}

	@Override
	public String toString() {
		return "Donation [doNo=" + doNo + ", doTitle=" + doTitle + ", doContent=" + doContent + ", doWritedate="
				+ doWritedate + ", doAdmission=" + doAdmission + ", memNo=" + memNo + ", refType=" + refType
				+ ", doCount=" + doCount + ", shName=" + shName + ", shPhone=" + shPhone + ", shAddress=" + shAddress
				+ "]";
	}
	
	
	
	

}