package com.kh.report.model.vo;

import java.sql.Date;

public class Report {
	
	private int reportUnique; // 신고글 번호
	private int memNo; // 신고자 회원번호
	private String refType; //신고 게시글 유형
	private int refNo; // 신고 게시글 번호
	private int reportNo; // 신고 유형 번호
	private Date reportDate; // 신고 날짜
	
	public Report() {}

	public Report(int reportUnique, int memNo, String refType, int refNo, int reportNo, Date reportDate) {
		super();
		this.reportUnique = reportUnique;
		this.memNo = memNo;
		this.refType = refType;
		this.refNo = refNo;
		this.reportNo = reportNo;
		this.reportDate = reportDate;
	}

	public int getReportUnique() {
		return reportUnique;
	}

	public void setReportUnique(int reportUnique) {
		this.reportUnique = reportUnique;
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

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@Override
	public String toString() {
		return "Report [reportUnique=" + reportUnique + ", memNo=" + memNo + ", refType=" + refType + ", refNo=" + refNo
				+ ", reportNo=" + reportNo + ", reportDate=" + reportDate + "]";
	}
	
	
	
}
