<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.body{
		width: 700px;
        height: 500px;
        margin: 0 auto;
        margin-top:30px;
	}
	.wrap{box-sizing:border-box;}
	.left, .right{
		height:100%;
		float:left;
		padding:10px;
    }
	.left{width:50%;}
	.right{width:50%;}
	#userMem, #shMem{
		border-radius:25%;
		text-align:center;
		line-height:270px;
		font-size: 19px;
		font-weight:bold;
		font-family: HanSans;
		width:250px;
		height:300px;
		color: #333;
		cursor: pointer;
		background-color: rgb(224, 224, 224);
	}
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>

	<div class="body">  
		
		<div class="wrap">
			<br>
			<h1 align="center">회원 가입</h1>
	    	<br>
			<div class="left">
				<button type="button" id="userMem">일반회원</button> 
			</div>
			<div class="right">
				<button type="button" onclick="shEnrollPage();" id="shMem">보호소</button>
			</div>
			
			<script>
				function shEnrollPage(){
					//location.href = "<%=contextPath%>/views/shelter/shelterEnrollForm.jsp";
					// 웹 애플리케이션의 디렉토리 구조가 url에 노출되면 보안에 위험
					
					// 단순한 정적인 페이지 요청이라고 해도 반드시 servlet거쳐갈것 => url에 서블릿 매핑값만 노출됨
					location.href = "<%=contextPath%>/shEnrollForm.me";
				}
			</script>
			
		</div>

	</div>	
	
	 <%@ include file="../common/footerbar.jsp" %>
</body>
</html>