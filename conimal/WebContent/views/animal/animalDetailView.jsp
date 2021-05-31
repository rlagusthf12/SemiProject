<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.kh.animal.model.vo.Animal"%>
<%
	Animal a = (Animal)request.getAttribute("a");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.content{
		width: 1200px;
		margin: auto;
	}
	.pic-area img{
		border: 1px solid black;
		width: 700px;
		height: 300px;
	}
	table{
		margin-left: 250px;
	}
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<div class="content">
	
		<br><br>
		
		<h2 align="center">보호중인 아이들 상세보기</h2>
	
		<br>
	
		<div class="pic-area" align="center">
			<img src="" alt="">
		</div>
	
		<br>
	
		<table border="1">
			<tr>
				<th>보호소명</th>
				<td><%=a.getShName() %></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><%=a.getAnGender() %></td>
			</tr>
			<tr>
				<th>발견날짜</th>
				<td><%=a.getAnDate() %></td>
			</tr>
	        <tr>
				<th>발견장소</th>
				<td><%=a.getAnPlace() %></td>
			</tr>
			<tr>
				<th>소개글</th>
				<td><p style="width:620px; height:200px;"><%=a.getAnContent() %></p></td>
			</tr>
		</table>
		
		<br>
	
		<div align="center">
			<%if(loginUser != null){ %>
				<button type="button" class="btn btn-primary" onclick="history.back();">목록으로</button>
				<button type="button" class="btn btn-primary" onclick="bookmark();">즐겨찾기</button>
			<%} else { %>
				<button type="button" class="btn btn-primary" onclick="history.back();">목록으로</button>
			<%} %>
		</div>
		
		<script>
			function bookmark() {
				$.ajax({
					url:"bookmark.an",
					data:{
						mno:<%=loginUser.getMemNo()%>,
						ano:<%=a.getAnNo()%>
					},
					type:"post",
					success:function(result){
						if(result > 0) {
							alert("즐겨찾기에 추가되었습니다");
						}
					},error:function(){
						alert("즐겨찾기 실패");
					}
				});
			}
		</script>
	
		<br><br>
	
	</div>

	<%@ include file="../common/footerbar.jsp" %>
	
</body>
</html>