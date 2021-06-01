<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page 
	import="java.util.ArrayList, com.kh.common.model.vo.PageInfo,
			com.kh.adopt.model.vo.Adopt, com.kh.animal.model.vo.Animal,
			com.kh.c_post.model.vo.C_Post, com.kh.donation.model.vo.Donation,
			com.kh.volunteer.model.vo.Volunteer"
%>
<%
	ArrayList<Adopt> adoptList = (ArrayList<Adopt>)request.getAttribute("adoptList");
	ArrayList<Animal> animalList = (ArrayList<Animal>)request.getAttribute("animalList");
	ArrayList<C_Post> c_PostList = (ArrayList<C_Post>)request.getAttribute("c_PostList");
	ArrayList<Donation> doList = (ArrayList<Donation>)request.getAttribute("doList");
	ArrayList<Volunteer> voList = (ArrayList<Volunteer>)request.getAttribute("voList");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
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
		width: 1000px;
		height: 1200px;
        
	}
    .outer>h2{
        text-align: left;
    }
    table{
    	width: 700px;
    }
    .pagination{
    	display: block;
    	text-align: center;
    }
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	<div class="outer" align="center">
		<br>
        <h2>게시판 글 조회</h2>
        
	    <div class="container">
	        <!-- Nav tabs -->
	        <ul class="nav nav-tabs" role="tablist">
	          <li class="nav-item">
	            <a class="nav-link active" data-toggle="tab" href="#home">전체</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-toggle="tab" href="#menu1">보호중인 아이들</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-toggle="tab" href="#menu2">입양 후기</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-toggle="tab" href="#menu3">후원</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-toggle="tab" href="#menu4">자원봉사</a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-toggle="tab" href="#menu5">자유게시판</a>
	          </li>
	        </ul>
	      
	        <!-- Tab panes -->
	        <div class="tab-content">
	        
	          <div id="home" class="container tab-pane active"><br>
	            <h3>전체</h3>
	            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	
		            </tbody>
	        	</table>
	          </div>
	          
	          <div id="menu1" class="container tab-pane fade"><br>
	            <h3>보호중인 아이들</h3>
	            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	<%if(animalList.isEmpty()){ %>
		            		<tr>
		            			<td colspan="6">등록된 글이 없습니다.</td>
		            		</tr>
		            	<%} else { %>
		            		<% for(Animal an : animalList){ %>
					            <tr>
					                <td><%=an.getAnimalNo() %></td>
					                <td>보호중인 아이들</td>
					                <td><%=an.getTitle() %></td>
					                <td><%=an.getWriter() %></td>
					                <td><%=an.getWrtiteDate() %></td>
					                <td><%=an.getCount() %></td>
					            </tr>
				            <% } %>
				        <% } %>
		            </tbody>
	        	</table>
	          </div>
	          
	          <div id="menu2" class="container tab-pane fade"><br>
	            <h3>입양 후기</h3>
	            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	<%if(adoptList.isEmpty()){ %>
		            		<tr>
		            			<td colspan="6">등록된 글이 없습니다.</td>
		            		</tr>
		            	<%} else { %>
		            		<% for(Adopt ad : adoptList){ %>
					            <tr>
					                <td><%=ad.getAdoptNo() %></td>
					                <td>입양 후기</td>
					                <td><%=ad.getAdoptTitle() %></td>
					                <td><%=ad.getAdoptWriter() %></td>
					                <td><%=ad.getAdoptDate() %></td>
					                <td><%=ad.getCount() %></td>
					            </tr>
				            <% } %>
				        <% } %>
		            </tbody>
	        	</table>
	        	
	        	<div id="menu3" class="container tab-pane fade"><br>
		            <h3>후원</h3>
		            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	<%if(doList.isEmpty()){ %>
		            		<tr>
		            			<td colspan="6">등록된 글이 없습니다.</td>
		            		</tr>
		            	<%} else { %>
		            		<% for(Donation don : doList){ %>
					            <tr>
					                <td><%=don.getDoNo() %></td>
					                <td>후원</td>
					                <td><%=don.getDoTitle()%></td>
					                <td><%=don.getDoWriter() %></td>
					                <td><%=don.getDoWriteDate() %></td>
					                <td><%=don.getDoCount() %></td>
					            </tr>
				            <% } %>
				        <% } %>
		            </tbody>
	        	</table>
	            </div>
		          
	            <div id="menu4" class="container tab-pane fade"><br>
		            <h3>자원봉사</h3>
		            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	<%if(voList.isEmpty()){ %>
		            		<tr>
		            			<td colspan="6">등록된 글이 없습니다.</td>
		            		</tr>
		            	<%} else { %>
		            		<% for(Volunteer vo : voList){ %>
					            <tr>
					                <td><%=vo.getVolNo() %></td>
					                <td>자원봉사</td>
					                <td><%=vo.getVolTitle() %></td>
					                <td><%=vo.getVolWriter() %></td>
					                <td><%=vo.getVolWriteDate() %></td>
					                <td><%=vo.getVolCount() %></td>
					            </tr>
				            <% } %>
				        <% } %>
		            </tbody>
	        	</table>
	            </div>
		          
		        <div id="menu5" class="container tab-pane fade"><br>
		            <h3>자유게시판</h3>
		            <table border="1">
		            <thead>
			            <tr>
			                <th>No</th>
			                <th>게시판 이름</th>
			                <th>제목</th>
			                <th>작성자</th>
			                <th>작성날짜</th>
			                <th>조회수</th>
			            </tr>
		            </thead>
		            <tbody>
		            	<%if(c_PostList.isEmpty()){ %>
		            		<tr>
		            			<td colspan="6">등록된 글이 없습니다.</td>
		            		</tr>
		            	<%} else { %>
		            		<% for(C_Post cp : c_PostList){ %>
					            <tr>
					                <td><%=cp.getCpostNo()%></td>
					                <td>자유게시판</td>
					                <td><%=cp.getCpostTitle() %></td>
					                <td><%=cp.getCuserId() %></td>
					                <td><%=cp.getCpostDate() %></td>
					                <td><%=cp.getCpostCount()%></td>
					            </tr>
				            <% } %>
				        <% } %>
		            </tbody>
	        	</table>
	            </div>
	        	
	        	<!-- 
					페이징바--------------------------------------------------------------------------------------- 
				-->
				<br>
				<div align="center" class="paging-area">
				  <ul class="pagination" align="center">
				  	<% if(currentPage != 1){ %>
				    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.bo?currentPage=<%=currentPage-1%>">Previous</a></li>
				    <% }else{ %>
				    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.bo?currentPage=<%=currentPage%>">Previous</a></li>
				    <% } %>
				    
				    <% for(int p=startPage; p<=endPage; p++){ %>
				    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.bo?currentPage=<%= p %>"><%= p %></a></li>
				    <% } %>
				    
				    <% if(currentPage != maxPage){ %>
				    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.bo?currentPage=<%=currentPage+1%>">Next</a></li>
				    <% }else{ %>
				    	<li class="page-item"><a class="page-link" href="<%=contextPath%>/list.bo?currentPage=<%=currentPage%>">Next</a></li>
				    <% } %>
				  </ul>
				</div>
	          </div>
	          
	          
	          
	        </div>
	      </div>
	
    
        
        	
        <br>



        
        
        <br>
    </div>
    <%@ include file="../common/footerbar.jsp" %>
</body>
</html>