package com.kh.donation.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.donation.model.dao.DonationDao;
import com.kh.donation.model.vo.Donation;

public class DonationService {
	
	public int selectListCount() {
		
		Connection conn = getConnection();
		
		int listCount = new DonationDao().selectListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Donation> selectList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Donation> list = new DonationDao().selectList(conn, pi);
		
		close(conn);
		
		return list;
		
	}
	
	public int increaseCount(int doNo) {
		
		Connection conn = getConnection();
		
		int result = new DonationDao().increaseCount(conn, doNo);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
		
	}
	
	public Donation selectDontion(int doNo) {
		
		Connection conn = getConnection();
		
		Donation d = new DonationDao().selectDontion(conn, doNo);
		
		close(conn);
		
		return d;
		
	}
	
	public int selectListCountByKeyword(String keyword) {
		
		Connection conn = getConnection();
		
		int listCount = new DonationDao().selectListCountByKeyword(conn, keyword);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Donation> selectByKeyword(PageInfo pi, String keyword) {
		
		Connection conn = getConnection();
		
		ArrayList<Donation> list = new DonationDao().selectByKeyword(conn, pi, keyword);
		
		close(conn);
		
		return list;
		
	}

}
