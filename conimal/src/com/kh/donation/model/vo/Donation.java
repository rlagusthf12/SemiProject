package com.kh.donation.model.vo;

import java.sql.Date;
import com.kh.attachment.model.vo.Attachment;

public class Donation extends Attachment{
	
	private int doNo;
	private String doTitle;
	private String doContent;
	private Date doWriteDate;
	private String doAdmission;
	private int memNo;
	private String refType;
	private int doCount;
	private String shelterName;
	private String shelterPhone;
	
	
	
	public Donation() {
		
	}


	public Donation(int doNo, String doTitle, String doContent, Date doWriteDate, String doAdmission, int memNo,
			String refType, int doCount, String shelterName, String shelterPhone) {
		super();
		this.doNo = doNo;
		this.doTitle = doTitle;
		this.doContent = doContent;
		this.doWriteDate = doWriteDate;
		this.doAdmission = doAdmission;
		this.memNo = memNo;
		this.refType = refType;
		this.doCount = doCount;
		this.shelterName = shelterName;
		this.shelterPhone = shelterPhone;
	}
	
	
	public Donation(int doNo, String doTitle, String doContent, Date doWriteDate, String doAdmission, int memNo,
			String refType, int doCount, String shelterName, String shelterPhone,int fileNo, 
			int refNo, String originName, String changeName, String filePath,
			Date uploadDate) {
		super();
		this.doNo = doNo;
		this.doTitle = doTitle;
		this.doContent = doContent;
		this.doWriteDate = doWriteDate;
		this.doAdmission = doAdmission;
		this.memNo = memNo;
		this.refType = refType;
		this.doCount = doCount;
		this.shelterName = shelterName;
		this.shelterPhone = shelterPhone;
		super.setFileNo(fileNo);
		super.setRefNo(refNo);
		super.setOriginName(originName);
		super.setChangeName(changeName);
		super.setFilePath(filePath);
		super.setUploadDate(uploadDate);
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

	public Date getDoWriteDate() {
		return doWriteDate;
	}

	public void setDoWriteDate(Date doWriteDate) {
		this.doWriteDate = doWriteDate;
	}

	public String getDoAdmission() {
		return doAdmission;
	}

	public void setDoAdmission(String doAdmission) {
		this.doAdmission = doAdmission;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
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


	@Override
	public String toString() {
		return "Donation [doNo=" + doNo + ", doTitle=" + doTitle + ", doContent=" + doContent + ", doWriteDate="
				+ doWriteDate + ", doAdmission=" + doAdmission + ", memNo=" + memNo + ", refType=" + refType
				+ ", doCount=" + doCount + "]";
	}
	
	
	

}
