package com.kh.volunteer.model.vo;

import java.sql.Date;

public class Volunteer {
	
	private int volNo;
	private String volTitle;
	private String spreiod;
	private String volContent;
	private Date volWritedate;
	private String memNO; // 조회시 작성자아이디 / 작성하기시 로그인한 회원번호
	private String refType;
	private int volCount;
	
	public Volunteer() {}
	

	public Volunteer(int volNo, String volTitle, Date volWritedate, String memNO, int volCount) {
		super();
		this.volNo = volNo;
		this.volTitle = volTitle;
		this.volWritedate = volWritedate;
		this.memNO = memNO;
		this.volCount = volCount;
	}






	public Volunteer(int volNo, String volTitle, String spreiod, String volContent, Date volWritedate, String memNO,
			String refType, int volCount) {
		super();
		this.volNo = volNo;
		this.volTitle = volTitle;
		this.spreiod = spreiod;
		this.volContent = volContent;
		this.volWritedate = volWritedate;
		this.memNO = memNO;
		this.refType = refType;
		this.volCount = volCount;
	}



	public int getVolNo() {
		return volNo;
	}



	public void setVolNo(int volNo) {
		this.volNo = volNo;
	}



	public String getVolTitle() {
		return volTitle;
	}



	public void setVolTitle(String volTitle) {
		this.volTitle = volTitle;
	}



	public String getSpreiod() {
		return spreiod;
	}



	public void setSpreiod(String spreiod) {
		this.spreiod = spreiod;
	}



	public String getVolContent() {
		return volContent;
	}



	public void setVolContent(String volContent) {
		this.volContent = volContent;
	}



	public Date getVolWritedate() {
		return volWritedate;
	}



	public void setVolWritedate(Date volWritedate) {
		this.volWritedate = volWritedate;
	}



	public String getMemNO() {
		return memNO;
	}



	public void setMemNO(String memNO) {
		this.memNO = memNO;
	}



	public String getRefType() {
		return refType;
	}



	public void setRefType(String refType) {
		this.refType = refType;
	}



	public int getVolCount() {
		return volCount;
	}



	public void setVolCount(int volCount) {
		this.volCount = volCount;
	}



	@Override
	public String toString() {
		return "Volunteer [volNo=" + volNo + ", volTitle=" + volTitle + ", spreiod=" + spreiod + ", volContent="
				+ volContent + ", volWritedate=" + volWritedate + ", memNO=" + memNO + ", refType=" + refType
				+ ", volCount=" + volCount + "]";
	}



	
	
	

}
