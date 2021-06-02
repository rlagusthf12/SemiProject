<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		width: 1200px;
		margin: auto;
	}
	.search-area{
		float:right;
		margin-right: 65px;
		}
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
	<h2 align="center">보호소 소개</h2>
	
	<!-- <div class="search-area">
		<form action="" method="post" id="area2">
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
		<select name="area" id="area1">
			<option value="seoul">서울</option>
			<option value="gyeonggi">경기</option>
			<option value="busan">부산</option>
		</select>
	</div> -->
	<div class="search-area">
		<table>
			<tr>
				<td>
					<select name="area" id="area1">
						<option value="seoul">서울</option>
						<option value="gyeonggi">경기</option>
						<option value="busan">부산</option>
					</select>
				</td>
				<td>
					<input type="text" name="keyword">
				</td>
				<td>
					<input type="submit" value="검색">
				</td>
			</tr>
		</table>
	</div>

	<br clear="both">
	
	<div class="content-area">
		<table align="center">
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
			</tr>
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
			</tr>
			<tr>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
				<td class="pic-area">사진</td>
			</tr>
			<tr>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
				<td>보호소이름</td>
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

	<div align="right" style="width:1100px;">
		<button type="submit" onclick="animalPage();">글쓰기</button>
	</div>
	
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