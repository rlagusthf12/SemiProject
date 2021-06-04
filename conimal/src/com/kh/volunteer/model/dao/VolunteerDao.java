package com.kh.volunteer.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.volunteer.model.vo.Volunteer;

import static com.kh.common.JDBCTemplate.*;

public class VolunteerDao {
	
	private  Properties prop = new Properties();
	
	public VolunteerDao() {
		
		try {
			prop.loadFromXML(new FileInputStream( VolunteerDao.class.getResource("/sql/volunteer/volunteer-mapper.xml").getPath() ));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Volunteer> selectVolunteerList(Connection conn){
		
		ArrayList<Volunteer> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectVolunteerList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Volunteer(rset.getInt("vol_no"),
						               rset.getString("vol_title"),
						               rset.getDate("vol_writedate"),
						               rset.getString("mem_no"),
						               rset.getInt("vol_count")));
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
