package com.kh.report.model.vo;

import java.sql.Date;

public class Report {
	
	private int reportUnique;	 	 // 신고 고유번호
	private String memberId;		 // 신고자 아이디
	private String refBoardType; 	 // 게시판 타입 이름
	private String refBoardNo;		 // 게시글 번호, 게시글 제목
	private String reportReason;		 // 신고 사유
	private Date reportDate;		 // 신고 날짜
	
	public Report() {}

	public Report(int reportUnique, String memberId, String refBoardType, String refBoardNo, String reportTypeNo,
			Date reportDate) {
		super();
		this.reportUnique = reportUnique;
		this.memberId = memberId;
		this.refBoardType = refBoardType;
		this.refBoardNo = refBoardNo;
		this.reportReason = reportTypeNo;
		this.reportDate = reportDate;
	}

	public int getReportUnique() {
		return reportUnique;
	}

	public void setReportUnique(int reportUnique) {
		this.reportUnique = reportUnique;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRefBoardType() {
		return refBoardType;
	}

	public void setRefBoardType(String refBoardType) {
		this.refBoardType = refBoardType;
	}

	public String getRefBoardNo() {
		return refBoardNo;
	}

	public void setRefBoardNo(String refBoardNo) {
		this.refBoardNo = refBoardNo;
	}

	public String getReportTypeNo() {
		return reportReason;
	}

	public void setReportTypeNo(String reportTypeNo) {
		this.reportReason = reportTypeNo;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@Override
	public String toString() {
		return "Report [reportUnique=" + reportUnique + ", memberId=" + memberId + ", refBoardType=" + refBoardType
				+ ", refBoardNo=" + refBoardNo + ", reportTypeNo=" + reportReason + ", reportDate=" + reportDate + "]";
	}
	
	
	
	
}
