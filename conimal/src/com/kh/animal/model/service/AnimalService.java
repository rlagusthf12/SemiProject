package com.kh.animal.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.animal.model.dao.AnimalDao;
import com.kh.animal.model.vo.Animal;
import com.kh.common.model.vo.PageInfo;

public class AnimalService {
	
	public int selectDogCount() {
		
		Connection conn = getConnection();
		
		int listCount = new AnimalDao().selectDogCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	public int selectCatCount() {
		
		Connection conn = getConnection();
		
		int listCount = new AnimalDao().selectCatCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	public ArrayList<Animal> selectDogList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Animal> list = new AnimalDao().selectDogList(conn, pi);
		
		close(conn);
		
		return list;
		
	}
	
	public ArrayList<Animal> selectCatList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Animal> list = new AnimalDao().selectCatList(conn, pi);
		
		close(conn);
		
		return list;
		
	}
	
	public int increaseCount(int animalNo) {
		
		Connection conn = getConnection();
		
		int result = new AnimalDao().increaseCount(conn, animalNo);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
		
	}
	
	public Animal selectAnimal(int animalNo) {
		
		Connection conn = getConnection();
		
		Animal a = new AnimalDao().selectAnimal(conn, animalNo);
		
		close(conn);
		
		return a;
		
	}

}
