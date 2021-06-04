package com.kh.shelter.model.vo;

public class Shelter {
	
	private int memNo;
	private String shName;
	private String shPhone;
	private String shAddress;
	private String shAbout;
	private String admission;
	private String shLocal;
	private String refType;
	

	public Shelter() {}
	
	
	
	public Shelter(String shPhone, String shAddress, String shAbout, String shLocal) {
		super();
		this.shPhone = shPhone;
		this.shAddress = shAddress;
		this.shAbout = shAbout;
		this.shLocal = shLocal;
	}



	public Shelter(String shName, String shPhone, String shAddress, String shAbout
			,String shLocal) {
		super();
		this.shName = shName;
		this.shPhone = shPhone;
		this.shAddress = shAddress;
		this.shAbout = shAbout;
		this.shLocal= shLocal;
		
	}

	public Shelter(int memNo, String shName, String shPhone, String shAddress, String shAbout, String admission,
			String shLocal, String refType) {
		super();
		this.memNo = memNo;
		this.shName = shName;
		this.shPhone = shPhone;
		this.shAddress = shAddress;
		this.shAbout = shAbout;
		this.admission = admission;
		this.shLocal = shLocal;
		this.refType = refType;
	}
	

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
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

	public String getShAbout() {
		return shAbout;
	}

	public void setShAbout(String shAbout) {
		this.shAbout = shAbout;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getShLocal() {
		return shLocal;
	}

	public void setShLocal(String shLocal) {
		this.shLocal = shLocal;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	@Override
	public String toString() {
		return "Shelter [memNo=" + memNo + ", shName=" + shName + ", shPhone=" + shPhone + ", shAddress=" + shAddress
				+ ", shAbout=" + shAbout + ", admission=" + admission + ", shLocal=" + shLocal + ", refType=" + refType
				+ "]";
	}


	
	

	
}
