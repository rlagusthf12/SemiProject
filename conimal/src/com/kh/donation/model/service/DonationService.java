package com.kh.donation.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.donation.model.dao.DonationDao;
import com.kh.donation.model.vo.Donation;
import com.kh.shelter.model.dao.ShelterDao;

public class DonationService {
	
	public int selectListCount(String keyword) {
		
		Connection conn = getConnection();
		int listCount = new DonationDao().selectListCount(conn,keyword);
		
		close(conn);
		return listCount;
		
	}
	
	public ArrayList<Donation> selectDonationList(String keyword, PageInfo pi){
		
		Connection conn = getConnection();
		ArrayList<Donation> list = new DonationDao().selectDonationList(conn,keyword,pi);
		close(conn);
		return list;
	}
	
	public Donation selectDonation(int doNo) {
		Connection conn = getConnection();
		Donation n = new DonationDao().selectDonation(conn, doNo);		
		close(conn);
		return n;
	}
	
	public int approveDonation(int doNo, String admission) {
		Connection conn = getConnection();
		int result = new DonationDao().approveDonation(conn, doNo, admission);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
		
	
	public int deleteDonation(int doNo) {
		Connection conn = getConnection();
		int result = new DonationDao().deleteDonation(conn, doNo);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

}
