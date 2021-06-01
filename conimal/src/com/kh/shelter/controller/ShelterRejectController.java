package com.kh.shelter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.shelter.model.service.ShelterService;

/**
 * Servlet implementation class ShelterRejectController
 */
@WebServlet("/Reject.sh")
public class ShelterRejectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShelterRejectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int memNo = Integer.parseInt(request.getParameter("memNo"));
		
		int result = new ShelterService().deleteShelter(memNo);
	
		if(result > 0) { 
		
			request.getSession().setAttribute("alertMsg", "거절 되었습니다.");
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
