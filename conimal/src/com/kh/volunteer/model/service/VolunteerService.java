package com.kh.volunteer.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.volunteer.model.dao.VolunteerDao;
import com.kh.volunteer.model.vo.Volunteer;

public class VolunteerService {
	
	public ArrayList<Volunteer> selectVolunteerList(){
		
		Connection conn = getConnection();
		ArrayList<Volunteer> list = new VolunteerDao().selectVolunteerList(conn);
		
		close(conn);
		return list;
		
	}

}
