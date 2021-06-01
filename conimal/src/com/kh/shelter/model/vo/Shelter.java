package com.kh.shelter.model.vo;

import java.sql.Date;

public class Shelter {
	
	private int memNo;
	private String shelterName;
	private String shelterPhone;
	private String shelterAddress;
	private String shelterAbout;
	private String shelterAdmission;
	private String shelterLocal;
	private String refType;
	private Date enrollDate;
	
		
	
	
	public Shelter() {
		super();
	}

	public Shelter(int memNo, String shelterName, String shelterPhone, String shelterAddress, String shelterAbout,
			String shelterAdmission, String shelterLocal, String refType, Date enrollDate) {
		super();
		this.memNo = memNo;
		this.shelterName = shelterName;
		this.shelterPhone = shelterPhone;
		this.shelterAddress = shelterAddress;
		this.shelterAbout = shelterAbout;
		this.shelterAdmission = shelterAdmission;
		this.shelterLocal = shelterLocal;
		this.refType = refType;
		this.enrollDate= enrollDate;
	}

	public int getMemNo() {
		return memNo;
	}
	
	public void setMemNo(int memNo) {
		this.memNo = memNo;
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
	public String getShelterAdmission() {
		return shelterAdmission;
	}
	public void setShelterAdmission(String shelterAdmission) {
		this.shelterAdmission = shelterAdmission;
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
	
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	@Override
	public String toString() {
		return "Shelter [memNo=" + memNo + ", shelterName=" + shelterName + ", shelterPhone=" + shelterPhone
				+ ", shelterAddress=" + shelterAddress + ", shelterAbout=" + shelterAbout + ", shelterAdmission="
				+ shelterAdmission + ", shelterLocal=" + shelterLocal + ", refType=" + refType +", enrollDate"+enrollDate+ "]";
	}
	
	
	

}
