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
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public int selectListCount(Connection conn, String keyword) {
		
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectListCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%"+keyword+"%");
			pstmt.setString(2,"%"+keyword+"%");
			pstmt.setString(3,"%"+keyword+"%");
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt("count");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return listCount;		
		
	}
	
	public ArrayList<Donation> selectDonationList(Connection conn,String keyword,PageInfo pi){
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Donation> list = new ArrayList<>();
		String sql = prop.getProperty("selectDonationList");
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+keyword+"%");
			pstmt.setString(2,"%"+keyword+"%");
			pstmt.setString(3,"%"+keyword+"%");
			
			int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setInt(4, startRow);
			pstmt.setInt(5, endRow);
			
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Donation(rset.getInt("do_no"),
									rset.getString("do_title"),
									rset.getString("do_content"),
									rset.getDate("do_writedate"),
									rset.getString("do_admission"),
									rset.getInt("mem_no"),
									rset.getString("ref_type"),
									rset.getInt("do_count"),
									rset.getString("sh_name"),
									rset.getString("sh_phone"),
									rset.getInt("file_no"),
									rset.getInt("ref_no"),
									rset.getString("origin_name"),
									rset.getString("change_name"),
									rset.getString("file_path"),
									rset.getDate("upload_date")									
									));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public Donation selectDonation(Connection conn, int donationNo) {
		
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		Donation dona =null;
		String sql = prop.getProperty("selectDonation");
		
		try {
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, donationNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				dona=new Donation(rset.getInt("do_no"),
						rset.getString("do_title"),
						rset.getString("do_content"),
						rset.getDate("do_writedate"),
						rset.getString("do_admission"),
						rset.getInt("mem_no"),
						rset.getString("ref_type"),
						rset.getInt("do_count"),
						rset.getString("sh_name"),
						rset.getString("sh_phone"),
						rset.getInt("file_no"),
						rset.getInt("ref_no"),
						rset.getString("origin_name"),
						rset.getString("change_name"),
						rset.getString("file_path"),
						rset.getDate("upload_date")		);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return dona;
		
		
	}
	
	
	
public int approveDonation(Connection conn, int doNo, String admission) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("approveDonation");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admission);
			pstmt.setInt(2, doNo);
			
			
			result = pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}	

	
	public int deleteDonation(Connection conn, int doNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("deleteDonation");
		
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

}
