package com.kh.shelter.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.community.notice.model.dao.NoticeDao;
import com.kh.shelter.model.dao.ShelterDao;
import com.kh.shelter.model.vo.Shelter;

public class ShelterService {
	
public int selectListCount1(String keyword) {
		
		Connection conn = getConnection();
		int listCount = new ShelterDao().selectListCount1(conn,keyword);
		
		close(conn);
		return listCount;
		
	}
public int selectListCount() {
		
		Connection conn = getConnection();
		
		int listCount = new ShelterDao().selectListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Shelter> selectShelterList(String keyword, PageInfo pi){
		
		Connection conn = getConnection();
		ArrayList<Shelter> list = new ShelterDao().selectShelterList(conn,keyword,pi);
		close(conn);
		return list;
	}
public ArrayList<Shelter> selectList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Shelter> list = new ShelterDao().selectList(conn, pi);
		
		close(conn);
		
		return list;
		
	}
	
	public Shelter selectShelter1(String memNo) {
		Connection conn = getConnection();
		Shelter n = new ShelterDao().selectShelter1(conn, memNo);		
		close(conn);
		return n;
	}
public Shelter selectShelter(int shelterNo) {
		
		Connection conn = getConnection();
		
		Shelter s = new ShelterDao().selectShelter(conn, shelterNo);
		
		close(conn);
		
		return s;
		
	}
	
	
	
	public int approveShelter(String memNo, String admission) {
		Connection conn = getConnection();
		int result = new ShelterDao().approveShelter(conn, memNo, admission);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int deleteShelter(String memNo) {
		Connection conn = getConnection();
		int result = new ShelterDao().deleteShelter(conn, memNo);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
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
