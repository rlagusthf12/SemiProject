package com.kh.introduce.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.attachment.model.vo.Attachment;
import com.kh.common.MyFileRenamePolicy;
import com.kh.introduce.model.vo.Introduce;
import com.kh.introduce.model.service.IntroduceService;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class IntroduceUpdateController
 */
@WebServlet("/Update.intro")
public class IntroduceUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IntroduceUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize=10*1024*1024;			
			String savePath = request.getSession().getServletContext().getRealPath("/resources/board_upfiles/");
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			int introNo= Integer.parseInt(multiRequest.getParameter("introNo"));
			String introTitle = multiRequest.getParameter("introTitle");
			String introContent = multiRequest.getParameter("introContent");
			String refType= "INTRO";
			
			Introduce intro= new Introduce();
			intro.setIntroNo(introNo);
			intro.setIntroTitle(introTitle);
			intro.setIntroContent(introContent);
			intro.setRefType(refType);
			
			Attachment at = null;
			
			if(multiRequest.getOriginalFileName("upfile") != null) {
				
				at = new Attachment();
				at.setRefNo(intro.getIntroNo());
				at.setRefType(intro.getRefType());
				at.setOriginName(multiRequest.getOriginalFileName("upfile")); 
				at.setChangeName(multiRequest.getFilesystemName("upfile"));
				at.setFilePath("resources/board_upfiles/");
				
			}
			
			int result = new IntroduceService().updateIntro(intro, at);
			
			if(result > 0) { // ?????? => list.bo?currentPage=1 ????????? => ??????????????????
				
				request.getSession().setAttribute("alertMsg", "?????????????????????.");
				response.sendRedirect(request.getContextPath() + "/Main.intro");
				
			}else { // ?????? => ??????????????? ????????? ?????? ???????????? ?????? ????????? ??????????????? => ???????????????
				
				if(at != null) {
					// ???????????????????????? ?????? ?????? ?????? => delete????????? ??????
					new File(savePath + at.getChangeName()).delete();
				}
				
				request.setAttribute("errorMsg", "????????????");
				request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				
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
