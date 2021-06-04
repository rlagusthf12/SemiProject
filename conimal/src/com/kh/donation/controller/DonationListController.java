package com.kh.donation.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.donation.model.service.DonationService;
import com.kh.donation.model.vo.Donation;

/**
 * Servlet implementation class DonationListController
 */
@WebServlet("/list.do")
public class DonationListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonationListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 후원 전체 리스트 조회 한 후 조회결과 담아서 응답페이지로 포워딩
		ArrayList<Donation> list = new DonationService().selectDonationList();
				
		//System.out.println(list); 잘되는지 먼저 확인
				
		// 응답페이지 : 후원 리스트 페이지 (donateListView.jsp)
		request.setAttribute("list", list);
		request.getRequestDispatcher("views/donation/donateListView.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
