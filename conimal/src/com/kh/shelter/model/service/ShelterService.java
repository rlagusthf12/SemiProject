package com.kh.shelter.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.shelter.model.dao.ShelterDao;
import com.kh.shelter.model.vo.Shelter;

public class ShelterService {
	
	public int selectListCount() {
		
		Connection conn = getConnection();
		
		int listCount = new ShelterDao().selectListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Shelter> selectList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Shelter> list = new ShelterDao().selectList(conn, pi);
		
		close(conn);
		
		return list;
		
	}
	
	public Shelter selectShelter(int shelterNo) {
		
		Connection conn = getConnection();
		
		Shelter s = new ShelterDao().selectShelter(conn, shelterNo);
		
		close(conn);
		
		return s;
		
	}
	
	public int selectListCountByKeyword(String keyword) {
		
		Connection conn = getConnection();
		
		int listCount = new ShelterDao().selectListCountByKeyword(conn, keyword);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Shelter> selectListByKeyword(PageInfo pi, String keyword) {
		
		Connection conn = getConnection();
		
		ArrayList<Shelter> list = new ShelterDao().selectListByKeyword(conn, pi, keyword);
		
		close(conn);
		
		return list;
		
	}

}