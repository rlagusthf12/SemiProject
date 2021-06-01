package com.kh.board.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.adopt.model.vo.Adopt;
import com.kh.animal.model.vo.Animal;
import com.kh.c_post.model.vo.C_Post;
import com.kh.common.model.vo.PageInfo;
import com.kh.donation.model.vo.Donation;
import com.kh.member.model.dao.MemberDao;
import com.kh.volunteer.model.vo.Volunteer;

public class BoardDao {

	private Properties prop = new Properties();
	
	public BoardDao() {
		
		String fileName = MemberDao.class.getResource("/sql/board/board-mapper.xml").getPath();
		
		try {
			prop.loadFromXML(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Adopt> selectAdoptList(Connection conn, PageInfo pi){
		// 여러 행 조회 => ResultSet
		ArrayList<Adopt> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		String sql = prop.getProperty("selectAdoptList");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Adopt(rset.getInt("adopt_no"),
								   rset.getString("mem_id"),
								   rset.getString("adopt_title"),
								   rset.getString("adopt_content"),
								   rset.getDate("adopt_date"),
								   rset.getInt("count"),
								   rset.getString("ref_type")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
		
	}
	
	public ArrayList<Animal> selectAnimalList(Connection conn, PageInfo pi){
		// 여러 행 조회 => ResultSet
		ArrayList<Animal> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		String sql = prop.getProperty("selectAnimalList");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Animal(rset.getInt("an_no"),
								    rset.getString("an_title"),
								    rset.getString("an_place"),
								    rset.getDate("an_date"),
								    rset.getString("an_species"),
								    rset.getString("an_gender"),
								    rset.getDate("an_writedate"),
								    rset.getString("an_content"),
								    rset.getString("mem_id"),
								    rset.getString("ref_type"),
								    rset.getInt("an_count")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
		
	}
	
	
	public ArrayList<C_Post> selectC_PostList(Connection conn, PageInfo pi){
		// 여러 행 조회 => ResultSet
		ArrayList<C_Post> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		String sql = prop.getProperty("selectC_PostList");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new C_Post(rset.getInt("cpost_no"),
								    rset.getString("mem_id"),
								    rset.getString("cuser_name"),
								    rset.getString("cpost_title"),
								    rset.getInt("cpost_count"),
								    rset.getString("cpost_content"),
								    rset.getDate("cpost_date"),
								    rset.getString("ref_type")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	
	public ArrayList<Donation> selectDonationList(Connection conn, PageInfo pi){
		// 여러 행 조회 => ResultSet
		ArrayList<Donation> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		String sql = prop.getProperty("selectDonationList");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Donation(rset.getInt("do_no"),
								      rset.getString("do_title"),
								      rset.getString("do_content"),
								      rset.getDate("do_writedate"),
								      rset.getString("do_admission"),
								      rset.getString("mem_id"),
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
	
	public ArrayList<Volunteer> selectVolunteerList(Connection conn, PageInfo pi){
		// 여러 행 조회 => ResultSet
		ArrayList<Volunteer> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		String sql = prop.getProperty("selectVolunteerList");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Volunteer(rset.getInt("vol_no"),
								    rset.getString("vol_title"),
								    rset.getString("speriod"),
								    rset.getString("vol_content"),
								    rset.getDate("vol_writedate"),
								    rset.getString("mem_id"),
								    rset.getString("ref_type"),
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
