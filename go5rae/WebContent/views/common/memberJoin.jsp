<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
    #joinTitle{
        margin-top: 50px;
        
    }
    #joinForm{
        margin : auto;
        width: 1000px;
        height: 600px;
        margin-top: 30px;
        background: rgb(245, 243, 241);
       
        box-sizing: border-box;
        text-align: center;
    }
    #commonJoin,#petJoin{
        float: left;
        margin: auto;
        padding: 100px;
        background: rgb(183, 191, 199);
        border-radius: 10px;
        width: 300px;
        
        
    }
    #commonJoin{
        margin: 30px;
        text-align: center;
        vertical-align: middle;
        
    }
    #petJoin{
        margin: 30px;
        text-align: center;
        vertical-align: middle;
    }


</style>

</head>
<body>

    <%@ include file="../common/menubar.jsp" %>

    <!--
        <h2 id="joinTitle" align="center">회원가입</h2>
        <br><br><br><br>
    -->

    <div class="joinForm" id="joinForm">
        <br>
        <h2 id="joinTitle" align="center">회원가입</h2>
         <br><br><br><br> 
        <div class="commonJoin" id="commonJoin">
           <a href="">일반 회원</a> 
        </div>
        
        <div class="petJoin" id="petJoin">
            <a href="">보호소</a> 
        </div>
        <br>
        
    </div>
    <br>












    <%@ include file="../common/footerbar.jsp" %>
</body>
</html>