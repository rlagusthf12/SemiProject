package com.kh.animal.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.animal.model.dao.AnimalDao;
import com.kh.animal.model.vo.Animal;

public class AnimalService {
	
	public ArrayList<Animal> selectAnimalList(){
		
		Connection conn = getConnection();
		ArrayList<Animal> list = new AnimalDao().selectAnimalList(conn);

		close(conn);
		return list;
	
	}

}
