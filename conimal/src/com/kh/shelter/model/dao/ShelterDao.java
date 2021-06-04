package com.kh.shelter.model.dao;

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
import com.kh.shelter.model.vo.Shelter;

public class ShelterDao {
	
private Properties prop = new Properties();
	
	public ShelterDao() {
		try {
			prop.loadFromXML(new FileInputStream(ShelterDao.class.getResource("/sql/shelter/shelter-mapper.xml").getPath()));
			
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
	
	public ArrayList<Shelter> selectShelterList(Connection conn,String keyword,PageInfo pi){
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Shelter> list = new ArrayList<>();
		String sql = prop.getProperty("selectShelterList");
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+keyword+"%");
			pstmt.setString(2,"%"+keyword+"%");
			
			int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
			int endRow = startRow + pi.getBoardLimit() - 1;
			
			pstmt.setInt(3, startRow);
			pstmt.setInt(4, endRow);
			
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Shelter(rset.getInt("mem_no"),
									 rset.getString("sh_name"),
									 rset.getString("sh_phone"),
									 rset.getString("sh_address"),
									 rset.getString("sh_about"),
									 rset.getString("admission"),
									 rset.getString("sh_local"),
									 rset.getString("ref_type"),
									 rset.getDate("enroll_date")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public Shelter selectShelter(Connection conn, int memNo) {
		
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		Shelter sh =null;
		String sql = prop.getProperty("selectShelter");
		
		try {
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, memNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				sh=new Shelter(rset.getInt("mem_no"),
						 rset.getString("sh_name"),
						 rset.getString("sh_phone"),
						 rset.getString("sh_address"),
						 rset.getString("sh_about"),
						 rset.getString("admission"),
						 rset.getString("sh_local"),
						 rset.getString("ref_type"),
						 rset.getDate("enroll_date"));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return sh;
		
		
	}
	
	
	public int approveShelter(Connection conn, int memNo, String admission) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("approveShelter");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admission);
			pstmt.setInt(2, memNo);
			
			
			result = pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
public int deleteShelter(Connection conn, int memNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("deleteShelter");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	

}
