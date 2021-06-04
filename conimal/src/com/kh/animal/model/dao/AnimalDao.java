package com.kh.animal.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.animal.model.vo.Animal;
import static com.kh.common.JDBCTemplate.*;

public class AnimalDao {
	
	private Properties prop = new Properties();
	
	public AnimalDao() {
		
		try {
			prop.loadFromXML(new FileInputStream( AnimalDao.class.getResource("/sql/animal/animal-mapper.xml").getPath() ));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Animal> selectAnimalList(Connection conn){
		// select문 => ResultSet객체 (여러행)
		ArrayList<Animal> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAnimalList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Animal(rset.getInt("an_no"),
						            rset.getString("an_title"),
						            rset.getString("an_place"),
						            rset.getString("an_date"),
						            rset.getString("an_species"),
						            rset.getDate("an_writedate"),
						            rset.getString("an_content")));
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
