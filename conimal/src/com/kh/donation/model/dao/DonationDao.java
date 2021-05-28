package com.kh.donation.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.common.model.vo.PageInfo;
import com.kh.donation.model.vo.Donation;

public class DonationDao {
	
	private Properties prop = new Properties();
	
	public DonationDao() {
		
		try {
			prop.loadFromXML(new FileInputStream(DonationDao.class.getResource("/sql/donation/donation-mapper.xml").getPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public int selectListCount(Connection conn) {
		
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectListCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt("COUNT");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return listCount;
		
	}
	
	public ArrayList<Donation> selectList(Connection conn, PageInfo pi) {
		
		ArrayList<Donation> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Donation(rset.getInt("DO_NO"),
									  rset.getString("DO_TITLE"),
									  rset.getString("MEM_ID"),
									  rset.getInt("DO_COUNT"),
									  rset.getDate("DO_WRITEDATE")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public int increaseCount(Connection conn, int doNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, doNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	public Donation selectDontion(Connection conn, int doNo) {
		
		Donation d = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectDontion");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, doNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				d = new Donation(rset.getString("DO_TITLE"),
								 rset.getString("SH_NAME"),
								 rset.getString("SH_PHONE"),
								 rset.getString("SH_ADDRESS"),
								 rset.getString("DO_CONTENT"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return d;
		
	}

}