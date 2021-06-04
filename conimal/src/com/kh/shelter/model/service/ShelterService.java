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
	
public int selectListCount(String keyword) {
		
		Connection conn = getConnection();
		int listCount = new ShelterDao().selectListCount(conn,keyword);
		
		close(conn);
		return listCount;
		
	}
	
	public ArrayList<Shelter> selectShelterList(String keyword, PageInfo pi){
		
		Connection conn = getConnection();
		ArrayList<Shelter> list = new ShelterDao().selectShelterList(conn,keyword,pi);
		close(conn);
		return list;
	}
	
	public Shelter selectShelter(int memNo) {
		Connection conn = getConnection();
		Shelter n = new ShelterDao().selectShelter(conn, memNo);		
		close(conn);
		return n;
	}
	
	
	
	public int approveShelter(int memNo, String admission) {
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
	
	public int deleteShelter(int memNo) {
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
	

}
