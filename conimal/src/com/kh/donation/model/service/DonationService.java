package com.kh.donation.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.donation.model.dao.DonationDao;
import com.kh.donation.model.vo.Donation;

public class DonationService {
	
	public ArrayList<Donation> selectDonationList(){
		
		Connection conn = getConnection();
		ArrayList<Donation> list = new DonationDao().selectDonationList(conn);
		
		close(conn);
		return list;
		
	}
	
	public ArrayList<Donation> selectPostList(){
		
		Connection conn = getConnection();
		ArrayList<Donation> list = new DonationDao().selectPostList(conn);
		
		close(conn);
		return list;
	}

}
