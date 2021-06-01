package com.kh.board.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.adopt.model.vo.Adopt;
import com.kh.animal.model.vo.Animal;
import com.kh.board.model.dao.BoardDao;
import com.kh.c_post.model.vo.C_Post;
import com.kh.common.model.vo.PageInfo;
import com.kh.donation.model.vo.Donation;
import com.kh.volunteer.model.vo.Volunteer;

public class BoardService {

	public ArrayList<Adopt> selectAdoptList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Adopt> list = new BoardDao().selectAdoptList(conn, pi);
		close(conn);
		return list;
	}
	
	public ArrayList<Animal> selectAnimalList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Animal> list = new BoardDao().selectAnimalList(conn, pi);
		close(conn);
		return list;
	}
	
	public ArrayList<C_Post> selectC_PostList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<C_Post> list = new BoardDao().selectC_PostList(conn, pi);
		close(conn);
		return list;
	}
	
	public ArrayList<Donation> selectDonationList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Donation> list = new BoardDao().selectDonationList(conn, pi);
		close(conn);
		return list;
	}
	
	public ArrayList<Volunteer> selectVolunteerList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Volunteer> list = new BoardDao().selectVolunteerList(conn, pi);
		close(conn);
		return list;
	}
	
}
