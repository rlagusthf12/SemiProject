package com.kh.shelter.model.service;


import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;
import com.kh.shelter.model.dao.ShelterDao;
import com.kh.shelter.model.vo.Shelter;

public class ShelterService {
	
	/**서정연
	 * 보호소 회원가입용 서비스
	 * @param sh
	 * @return
	 */
	public int insertShelter(Member m, Shelter sh) {
		
		Connection conn = getConnection();
		int result1 = new MemberDao().insertSh(conn, m);
		int result2 = new ShelterDao().insertShelter(conn, sh);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result1 * result2;
		
	}
	
	public Shelter updateShelter(Shelter sh) {
		Connection conn = getConnection();
		int result = new ShelterDao().updateShelter(conn, sh);
		
		Shelter updateSh = null;
		if(result > 0) {
			commit(conn);
		
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return updateSh;
		
	}

}
