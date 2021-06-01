package com.kh.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.model.vo.PageInfo;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class memberListController
 */
@WebServlet("/list.me")
public class MemberListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 *	관리자가 회원을 조회하는 창
	 *  @author 선영 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ----------------------------------------- *페이징처리 --------------------------------------
		int listCount;		// 총 회원 수
		int currentPage;	// 현재 페이지
		int pageLimit;		// 페이징바의 최대 개수
		int boardLimit;		// 한 페이지에 보여질 회원 최대 개수
		
		int maxPage;		// 가장 마지막 페이지 (총 페이지 수)
		int startPage;		// 페이징바의 시작 수
		int endPage;		// 페이징바의 끝 수
		
		listCount = new MemberService().selectListCount();
		currentPage = Integer.parseInt(request.getParameter("currentPage"));
		pageLimit = 10;
		boardLimit = 15;
		
		maxPage = (int)Math.ceil((double)listCount / boardLimit);
		
		startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
		endPage = startPage + pageLimit - 1;
		
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		// ------------------------------------------------------------------------------------
		
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
		ArrayList<Member> list = new MemberService().selectMemberList(pi);
		
		request.setAttribute("pi", pi);
		request.setAttribute("list", list);
		
		
		if(list != null) { // 성공
			request.getRequestDispatcher("views/integratedManagement/memberListView.jsp").forward(request, response);
		}else { // 실패 => list에 null이 담겼을 경우
			//request.setAttribute("alertMsg", "조회된 회원이 없습니다.");
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
