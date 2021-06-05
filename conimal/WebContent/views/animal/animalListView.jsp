<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.kh.animal.model.vo.Animal"%>
<%
	ArrayList<Animal> list = (ArrayList<Animal>)request.getAttribute("list");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	table{
		border-spacing: 10px;
	}
	.pic-area{
		width: 250px;
		height: 150px;
		border: 1px solid black;
	}
	table tr td{
		text-align: center;
	}
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<br><br>

	<h2 align="center">보호중인 아이들</h2>

	<br>
	
	<div class="type-area" align="center">
		<button type="button" class="btn btn-secondary btn-lg">강아지</button>
		<button type="button" class="btn btn-secondary btn-lg">고양이</button>
	</div>

	<br>
	
	<div class="content-area">
		<table align="center">
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
			</tr>
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
			</tr>
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
				<td>글제목</td>
			</tr>
		</table>
	</div>

	<br><br>
	
	<div align="center" class="paging-area">
		<button>1</button>
		<button>2</button>
		<button>3</button>
		<button>4</button>
	</div>
	
	<!-- 현재 로그인한 사용자일 경우 -->
	<% if(loginUser != null && loginUser.getMemCode() == 2){ %>
		<div align="right" style="width:1100px;">
			<a href="<%=contextPath %>/animalForm.ao" class="btn btn-secondary">글쓰기</a>
		</div>
	<% } %>
		<script>
				function animalPage(){
					//location.href = "<%=contextPath%>/views/animal/animalWriteForm.jsp";
					// 웹 애플리케이션의 디렉토리 구조가 url에 노출되면 보안에 위험
					
					// 단순한 정적인 페이지 요청이라고 해도 반드시 servlet거쳐갈것 => url에 서블릿 매핑값만 노출됨
					location.href = "<%=contextPath%>/anWriteForm.me";
				}
		</script>	
	
	<br><br>
	
	<%@ include file="../common/footerbar.jsp" %>

</body>
</html>