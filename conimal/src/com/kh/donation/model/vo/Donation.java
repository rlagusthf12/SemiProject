package com.kh.donation.model.vo;

import java.sql.Date;

public class Donation {
	
	private int doNo;
	private String doTitle;
	private String doContent;
	private Date doWritedate;
	private String doAdmission;
	private String memNo; // 조회시 작성자아이디 / 작성하기시 로그인한 회원번호
	private String refType;
	private int doCount;

	public Donation() {}
	
	
	public Donation(int doNo, String doTitle, Date doWritedate, String memNo, int doCount) {
		super();
		this.doNo = doNo;
		this.doTitle = doTitle;
		this.doWritedate = doWritedate;
		this.memNo = memNo;
		this.doCount = doCount;
	}






	public Donation(int doNo, String doTitle, String doContent, Date doWritedate, String doAdmission, String memNo,
			String refType, int doCount) {
		super();
		this.doNo = doNo;
		this.doTitle = doTitle;
		this.doContent = doContent;
		this.doWritedate = doWritedate;
		this.doAdmission = doAdmission;
		this.memNo = memNo;
		this.refType = refType;
		this.doCount = doCount;
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



	@Override
	public String toString() {
		return "Donation [doNo=" + doNo + ", doTitle=" + doTitle + ", doContent=" + doContent + ", doWritedate="
				+ doWritedate + ", doAdmission=" + doAdmission + ", memNo=" + memNo + ", refType=" + refType
				+ ", doCount=" + doCount + "]";
	}


	
	
	
	
	
}
