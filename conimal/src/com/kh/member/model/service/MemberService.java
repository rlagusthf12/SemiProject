package com.kh.member.model.service;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;


public class MemberService {
	
	/**
	 * 로그인 요청 서비스
	 * @param memId	사용자가 입력했던 아이디값
	 * @param memPwd	사용자가 입력했던 비밀번호값
	 */
	public Member loginMember(String memId, String memPwd) {
		Connection conn = getConnection();
		Member m = new MemberDao().loginMember(conn, memId, memPwd);
		
		close(conn);
		return m;
	}
	
	/**
	 * 회원가입용 서비스 
	 * @param m		회원가입폼에 작성된 사용자가 입력한 값들이 담겨있는 Member 객체
	 * @return		처리된 행수
	 */
	public int insertSh(Member m) {
		
		Connection conn = getConnection();
		int result = new MemberDao().insertSh(conn, m);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
		
	}
	
	/**
	 * 보호소 마이페이지 정보수정
	 * @param m
	 * @return
	 */
	public Member updateMember(Member m) {
		Connection conn = getConnection();
		int result = new MemberDao().updateMember(conn, m);
		
		Member updateMem = null; // 처음에 null로 초기화
		if(result > 0) {
			commit(conn);
			// 갱신된 회원 객체 다시 조회해오기
			updateMem = new MemberDao().selectMember(conn, m.getMemId());
			
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return updateMem;
	}
	
	public Member updatePwdMember(String memId, String memPwd, String updatePwd) {
		Connection conn = getConnection();
		int result = new MemberDao().updatePwdMember(conn, memId, memPwd, updatePwd);
		
		Member updateMem = null;
		if(result > 0) {
			commit(conn);
			// 갱신된 회원 객체 다시 조회해오기(이미 있는 기능 호출하기)
			updateMem = new MemberDao().selectMember(conn, memId);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return updateMem;
		
	}
	
	public int deleteMember(String memId, String memPwd) {
		Connection conn = getConnection();
		int result = new MemberDao().deleteMember(conn, memId, memPwd);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int idCheck(String checkId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 보호소 회원가입
	 * @param m
	 * @return
	 */
	public int insertShMember(Member m) {
		
		Connection conn = getConnection();
		int result2 = new MemberDao().insertShelter(conn, m);
		
		if(result2 > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result2;
	}
	
	
	
	
	
	
	

}
