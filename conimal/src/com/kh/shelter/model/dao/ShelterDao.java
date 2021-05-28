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
	
	public ArrayList<Shelter> selectList(Connection conn, PageInfo pi) {
		
		ArrayList<Shelter> list = new ArrayList<>();
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
				list.add(new Shelter(rset.getString("MEM_NO"),
									 rset.getString("SH_NAME")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
		
	}
	
	public Shelter selectShelter(Connection conn, int shelterNo) {
		
		Shelter s = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectShelter");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shelterNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				s = new Shelter(rset.getString("SH_NAME"),
								rset.getString("SH_ADDRESS"),
								rset.getString("SH_PHONE"),
								rset.getString("SH_ABOUT"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return s;
		
	}

}
