package com.kh.shelter.model.dao;



import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.kh.common.JDBCTemplate.*;
import com.kh.shelter.model.vo.Shelter;

public class ShelterDao {
	
	private Properties prop = new Properties();
	
	public ShelterDao() {
		
		String fileName = ShelterDao.class.getResource("/sql/shelter/shelter-mapper.xml").getPath();
		
		try {
			prop.loadFromXML(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public int insertShelter(Connection conn, Shelter sh) {
		
		int result1 = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertShelter");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sh.getMemNo());
			pstmt.setString(2, sh.getShName());
			pstmt.setString(3, sh.getShPhone());
			pstmt.setString(4, sh.getShAddress());
			pstmt.setString(5, sh.getShAbout());
			pstmt.setString(6, sh.getShLocal());
			
			result1 = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result1;
		
	}



}
