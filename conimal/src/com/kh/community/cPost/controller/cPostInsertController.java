package com.kh.community.cPost.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.common.MyFileRenamePolicy;
import com.kh.community.cPost.model.service.cPostService;
import com.kh.community.cPost.model.vo.Attachment;
import com.kh.community.cPost.model.vo.Cpost;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class cPostInsertController
 */
@WebServlet("/insert.cp")
public class cPostInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cPostInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
//		String memNo = request.getParameter("memNo");
//		String memName = request.getParameter("memName");
//		String cPostTitle = request.getParameter("cPostTitle");
//		String content = request.getParameter("content");
		
		if(ServletFileUpload.isMultipartContent(request)) {
			
			int maxSize = 10 * 1024 * 1024;
			
			
			String savePath = request.getSession().getServletContext().getRealPath("/resources/board_upfiles/");
			
			// 2. 전달된 파일명 수정 작업 후 서버에 업로드
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
		
			// 3. DB에 전달할 값 뽑기
			// Board에 insert할 데이터 뽑기
			Cpost c = new Cpost();
			c.setcUserId(multiRequest.getParameter("memNo"));
			c.setcUserName(multiRequest.getParameter("memName"));
			c.setcPostTitle(multiRequest.getParameter("cPostTitle"));
			c.setcPostContent(multiRequest.getParameter("content"));
//			c.setcUserId(memNo);
//			c.setcUserName(memName);
//			c.setcPostTitle(cPostTitle);
//			c.setcPostContent(content);
			
			// Attachment에 여러번 insert할 데이터 뽑기
			// 단, 여러개의 첨부파일이 있을거기 때문에 Attachment들을 ArrayList에 담기
			ArrayList<Attachment> list = new ArrayList<>();
			
			for(int i=1; i<=1; i++) {
				String key = "file" + i;
				
				if(multiRequest.getOriginalFileName(key) != null) { // 원본명이 있으며는
					// 첨부파일이 존재하는 경우
					// Attachment 생성 + 원본명, 수정명, 폴더경로, 파일레벨 담아서 => list에 쌓기
					Attachment at = new Attachment();
					at.setOriginName(multiRequest.getOriginalFileName(key));
					at.setChangeName(multiRequest.getFilesystemName(key));
					at.setFilePath("resources/board_upfiles/");
					if(i==1) { // 대표이미지일 경우
						at.setFileLevel(1);
					}else { // 상세이미지일 경우
						at.setFileLevel(2);
					}
					list.add(at);
					
				}
			}
			
			for(Attachment a : list) {
				System.out.println(a);
			}
			
		
			
			int result = new cPostService().insertCpost(c, list);
			
			if(result > 0) { // 성공 => list.th 재요청 => 사진게시판 리스트 페이지 
				request.getSession().setAttribute("alertMsg","글 등록에 성공했습니다:)");
				response.sendRedirect("list.cp?currentPage=1");
				
				
			}else { // 실패 => 에러페이지
				request.setAttribute("errorMsg", "게시글 등록에 실패했습니다. 다시 시도해주세요!");
				RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp");
				view.forward(request, response);
			}
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
