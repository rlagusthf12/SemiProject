package com.kh.introduce.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.attachment.model.vo.Attachment;
import com.kh.introduce.model.service.IntroduceService;
import com.kh.introduce.model.vo.Introduce;

/**
 * Servlet implementation class IntroduceMainController
 */
@WebServlet("/Main.intro")
public class IntroduceMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IntroduceMainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int introNo = 1;
		String refType ="INTRO";
		Introduce intro = new IntroduceService().selectIntro(introNo);			
		Attachment at = new IntroduceService().selectAttachment(introNo,refType);
		
		
		if(intro!=null &&at!=null) {
		request.setAttribute("intro", intro);
		request.setAttribute("at", at);
		request.getRequestDispatcher("views/introduce/introduce.jsp").forward(request,response);
		} else { 
			
						
			request.setAttribute("errorMsg", "에러발생");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
			
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
