package com.kh.community.cPost.model.service;

import static com.kh.common.JDBCTemplate.*;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.community.cPost.model.dao.cPostDao;
import com.kh.community.cPost.model.vo.Attachment;
import com.kh.community.cPost.model.vo.Cpost;
import com.kh.community.cPost.model.vo.Reply;

public class cPostService {

	public int selectListCount() {
		Connection conn = getConnection();
		int listCount = new cPostDao().selectListCount(conn);
		
		close(conn);
		return listCount;
	}
	
	
	public ArrayList<Cpost> selectList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Cpost> list = new cPostDao().selectList(conn,pi);
		close(conn);
		return list;
	}
	
	
	public int increaseCount(int cPostNo) {
		Connection conn = getConnection();
		int result = new cPostDao().increaseCount(conn, cPostNo);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public Cpost selectCpost(int cPostNo) {
		Connection conn = getConnection();
		Cpost c = new cPostDao().selectCpost(conn,cPostNo);
		close(conn);
		return c;
	}
	
	public ArrayList<Attachment> selectAttachmentList(int cPostNo) {
		Connection conn = getConnection();
		ArrayList<Attachment> list = new cPostDao().selectAttachmentList(conn, cPostNo);
		
		close(conn);
		return list;
		
	}

	public int insertCpost(Cpost c, ArrayList<Attachment> list) {
		Connection conn = getConnection();
		// CPOST테이블 먼저 처리해줘야함
		int result1 = new cPostDao().insertCpost(conn,c);
		//list에 담긴 attachment만큼 
		int result2 = new cPostDao().insertAttachmentList(conn,list);
		
		// 성공적일 경우에만 commit 아니면 rollback
		if(result1 > 0 && result2>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result1*result2;
	}
	
	public ArrayList<Reply> selectReplyList(int cPostNo){
		Connection conn = getConnection();
		ArrayList<Reply> list = new cPostDao().selectReplyList(conn,cPostNo);
		close(conn);
		return list;
		
	}
	
	
	public int insertReply(Reply r) {
		Connection conn = getConnection();
		int result = new cPostDao().insertReply(conn,r);
		if(result>0) {
			commit(conn);
			
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

}
