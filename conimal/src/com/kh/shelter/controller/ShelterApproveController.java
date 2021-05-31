package com.kh.shelter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.shelter.model.service.ShelterService;
import com.kh.shelter.model.vo.Shelter;

/**
 * Servlet implementation class ShelterApproveController
 */
@WebServlet("/Approve.sh")
public class ShelterApproveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShelterApproveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		int memNo = Integer.parseInt(request.getParameter("memNo"));
		String admission = request.getParameter("admission");
		
		int result = new ShelterService().approveShelter(memNo,admission);		
		if(result>0) {
			request.getSession().setAttribute("alertMsg", "승인되었습니다.");
			response.sendRedirect(request.getContextPath() + "/Main.sh?currentPage=1");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
