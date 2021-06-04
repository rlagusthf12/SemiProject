package com.kh.volunteer.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.volunteer.model.service.VolunteerService;
import com.kh.volunteer.model.vo.Volunteer;

/**
 * Servlet implementation class VolunteerListController
 */
@WebServlet("/list.vo")
public class VolunteerListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VolunteerListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 자원봉사 전체 리스트 조회 한 후 조회결과 담아서 응답페이지로 포워딩
		ArrayList<Volunteer> list = new VolunteerService().selectVolunteerList();
				
		//System.out.println(list); 잘되는지 먼저 확인
				
		// 응답페이지 : 자원봉사 리스트 페이지 (volunteerListView.jsp)
		request.setAttribute("list", list);
		request.getRequestDispatcher("views/volunteer/volunteerListView.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
