package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	
	private int memNo;
	private String memId;
	private String memPwd;
	private String memName;
	private String email;
	private Date enrollDate;
	private String status;
	private int memCode;
	
	public Member() {}
	
	

	public Member(String memId, String memPwd, String memName) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
	}



	public Member(String memId, String memPwd, String memName, String email) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
	}



	public Member(int memNo, String memId, String memPwd, String memName, String email, Date enrollDate, String status,
			int memCode) {
		super();
		this.memNo = memNo;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.enrollDate = enrollDate;
		this.status = status;
		this.memCode = memCode;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMemCode() {
		return memCode;
	}

	public void setMemCode(int memCode) {
		this.memCode = memCode;
	}

	@Override
	public String toString() {
		return "Member [memNo=" + memNo + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
				+ ", email=" + email + ", enrollDate=" + enrollDate + ", status=" + status + ", memCode=" + memCode
				+ "]";
	}

	

}
