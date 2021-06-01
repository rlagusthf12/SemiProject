<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.kh.report.model.vo.Report, com.kh.common.model.vo.PageInfo" %>
<%
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	ArrayList<Report> list = (ArrayList<Report>)request.getAttribute("list");
	
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		margin-top:50px;
		margin:auto;
		width: 900px;
		height: 1200px;
	}
    .outer>h2{
        text-align: left;
    }
    table{
    	width: 700px;
    }
    .paging-area{
    	text-align: center;
    	margin: auto;
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<%@ include file="../common/adminPageNavibar.jsp" %>
	
    <div class="outer" align="center">
    
        <br>
        <div data-text-content="true" style="font-size: 16px; font-weight: bold; color: rgb(127, 127, 127);" class="" spellcheck="false">통합 관리&gt; 신고 조회</div>
        <div data-text-content="true" style="font-weight: bold; font-size: 32px; color: rgb(127, 127, 127);" class="" spellcheck="false">신고 조회</div>
        <br>
        
        <div class=table-responsive-sm>
	        <table border="1" class="list-area table table-bordered" align="center">
	        	<% if(list.isEmpty()){ %>
		            <tr>
		                <td colspan="6">조회할 데이터가 없습니다.</td>
		            </tr>
	            <% }else{ %>
		            <thead class="thead-light text-center">
		            	<tr>
			                <th>No</th>
			                <th>신고자 아이디</th>
			                <th>게시글 제목</th>
			                <th>게시판 이름</th>
			                <th>신고 사유</th>
			                <th>신고 날짜</th>
		            	</tr>
		            </thead>
		            <tbdoy class="text-center">
		            	<% for(Report r : list){ %>
				            <tr>
				                <td><%=r.getReportUnique() %></td>
				                <td><%=r.getMemberId() %></td>
				                <td><%=r.getRefBoardNo() %></td>
				                <td>
				                	<% if(r.getRefBoardType().equals("POST")){ %>
				                		자유게시판
				                	<% }else if(r.getRefBoardType().equals("ANIMAL")){ %>
				                		보호중인 동물들
				                	<% }else if(r.getRefBoardType().equals("ADOPT")){ %>
				                		입양 후기
				                	<% }else if(r.getRefBoardType().equals("DONATION")){ %>
				                		후원
				                	<% }else if(r.getRefBoardType().equals("SHELTER")){ %>
				                		보호소 소개
				                	<% }else if(r.getRefBoardType().equals("VOLUNTEER")){ %>
				                		자원봉사
				                	<% } else {%>
				                	
				                	<% } %>
				                </td>
				                <td><%=r.getReportTypeNo() %></td>
				                <td><%=r.getReportDate() %></td>
				            </tr>
				        <% } %>
				    </tbdoy>
				<% } %>
	        </table>
        </div>
        <br>

		<script>
			// 해당 게시글 바로가기 수정해야함
			$(function(){
				$(".list-area>tbody>tr").click(function(){
					location.href = "<%=contextPath%>/detail" + $(this).children().eq(0).text();
				})
			})
		</script>

        <!-- 
			페이징바--------------------------------------------------------------------------------------- 
		-->
		<div align="center" class="paging-area text-center">
			
			  <ul class="pagination justify-content-center" align="center">
			  	<% if(currentPage != 1){ %>
			    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%=currentPage-1%>">Previous</a></li>
			    <% }else{ %>
			    	<li class="page-item disabled""><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%=currentPage%>">Previous</a></li>
			    <% } %>
			    
			    <% for(int p=startPage; p<=endPage; p++){ %>
			    	<%if(currentPage == p){ %>
			    		<li class="page-item active"><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%= p %>"><%= p %></a></li>
			    	<% }else{ %>
			    		<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%= p %>"><%= p %></a></li>
			    	<% } %>
			    <% } %>
			    
			    <% if(currentPage != maxPage){ %>
			    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%=currentPage+1%>">Next</a></li>
			    <% }else{ %>
			    	<li class="page-item disabled""><a class="page-link" href="<%=contextPath%>/list.re?currentPage=<%=currentPage%>">Next</a></li>
			    <% } %>
			  </ul>
			
			
		</div>
        
        <br>
    </div>
    <%@ include file="../common/footerbar.jsp" %>
</body>
</html>