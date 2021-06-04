package com.kh.donation.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.donation.model.vo.Donation;
import static com.kh.common.JDBCTemplate.*;

public class DonationDao {
	
	private  Properties prop = new Properties();
	
	public DonationDao() {
		
		try {
			prop.loadFromXML(new FileInputStream(  DonationDao.class.getResource("/sql/donation/donation-mapper.xml").getPath() ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Donation> selectDonationList(Connection conn){
		
		ArrayList<Donation> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectDonationList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Donation(rset.getInt("do_no"),
			                          rset.getString("do_title"),
			                          rset.getDate("do_writedate"),
			                          rset.getString("mem_no"),
			                          rset.getInt("do_count")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public ArrayList<Donation> selectPostList(Connection conn){
		
		ArrayList<Donation> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectPostList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Donation(rset.getInt("do_no"),
                        rset.getString("do_title"),
                        rset.getString("do_content"),
                        rset.getDate("do_writedate"),
                        rset.getString("do_admission"),
                        rset.getString("mem_no"),
                        rset.getString("ref_type"),
                        rset.getInt("do_count")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	

}
