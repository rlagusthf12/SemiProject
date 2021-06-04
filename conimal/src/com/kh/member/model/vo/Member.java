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
	private String shelterName;
	private String shelterPhone;
	private String shelterAddress;
	private String shelterAbout;
	private String admission;		// 승인여부
	private String shelterLocal;
	private String refType;

	public Member(){
		
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

	public Member(int memNo, String memId, String memPwd, String memName, String email, Date enrollDate,
			String status, int memCode, String shelterName, String shelterPhone, String shelterAddress,
			String shelterAbout, String admission, String shelterLocal, String refType) {
		super();
		this.memNo = memNo;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.enrollDate = enrollDate;
		this.status = status;
		this.memCode = memCode;
		this.shelterName = shelterName;
		this.shelterPhone = shelterPhone;
		this.shelterAddress = shelterAddress;
		this.shelterAbout = shelterAbout;
		this.admission = admission;
		this.shelterLocal = shelterLocal;
		this.refType = refType;
	}
	
	

	public Member(String memId, String memPwd, String memName, String email) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
	}

	
	public Member(int memNo, String memPwd) {
		super();
		this.memNo = memNo;
		this.memPwd = memPwd;
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
public String getShelterName() {
		return shelterName;
	}

	public void setShelterName(String shelterName) {
		this.shelterName = shelterName;
	}

	public String getShelterPhone() {
		return shelterPhone;
	}

	public void setShelterPhone(String shelterPhone) {
		this.shelterPhone = shelterPhone;
	}

	public String getShelterAddress() {
		return shelterAddress;
	}

	public void setShelterAddress(String shelterAddress) {
		this.shelterAddress = shelterAddress;
	}

	public String getShelterAbout() {
		return shelterAbout;
	}

	public void setShelterAbout(String shelterAbout) {
		this.shelterAbout = shelterAbout;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getShelterLocal() {
		return shelterLocal;
	}

	public void setShelterLocal(String shelterLocal) {
		this.shelterLocal = shelterLocal;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	@Override
	public String toString() {
		return "Member [memNo=" + memNo + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
				+ ", email=" + email + ", enrollDate=" + enrollDate + ", status=" + status + ", memCode=" + memCode
				+ "]";
	}
	
	

}
