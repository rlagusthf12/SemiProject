package com.kh.report.model.service;

import java.sql.Connection;

import com.kh.report.model.dao.ReportDao;
import com.kh.report.model.vo.Report;

import static com.kh.common.JDBCTemplate.*;

public class ReportService {
	
	public int insertReport(Report r) {
		
		Connection conn = getConnection();
		
		int result = new ReportDao().insertReport(conn, r);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result;
		
	}

}
