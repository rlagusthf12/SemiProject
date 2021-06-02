package com.kh.shelter.model.service;


import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;
import com.kh.shelter.model.dao.ShelterDao;
import com.kh.shelter.model.vo.Shelter;

public class ShelterService {
	
	/**서정연
	 * 보호소 회원가입용 서비스
	 * @param sh
	 * @return
	 */
	public int insertShelter(Shelter sh) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result1 = new ShelterDao().insertShelter(conn, sh);
		
		if(result1 > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result1;
		
	}

}
