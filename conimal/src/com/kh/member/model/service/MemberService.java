package com.kh.member.model.service;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;


public class MemberService {
	
	//로그인 요청 서비스
	public Member loginMember(String memId, String memPwd) {
		Connection conn =getConnection();
		Member m = new MemberDao().loginMember(conn,memId,memPwd);
		
		close(conn);
		return m;
	}

	
	/**
	 * 회원가입용 서비스 
	 * @param m		회원가입폼에 작성된 사용자가 입력한 값들이 담겨있는 Member 객체
	 * @return		처리된 행수
	 */
	public int insertMember(Member m) {
		
		Connection conn = getConnection();
		int result = new MemberDao().insertMember(conn, m);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public int idCheck(String checkId) {
		Connection conn = getConnection();
		int count = new MemberDao().idCheck(conn, checkId);
		close(conn);
		
		return count;
	}
	
	// ID찾기용 Service구문
	public Member searchMember(String memName, String email) {
		Connection conn =getConnection();
		Member m = new MemberDao().searchMember(conn,memName, email);
		
		close(conn);
		return m;
	}
	
	// PWD찾기용 Service구문
	public Member searchPwdMember(String memName, String email, String memId) {
		Connection conn =getConnection();
		Member m = new MemberDao().searchPwdMember(conn,memName, email, memId);
			
		close(conn);
		return m;
	}
	
	// 비밀번호 변경 서비스
	public int changePwdMember(Member m) {
		
		Connection conn = getConnection();
		int result = new MemberDao().changePwdMember(conn, m);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	

}
