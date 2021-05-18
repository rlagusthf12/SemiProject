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
    .outer{
        margin: auto;
        margin-top: 50px;
        margin-bottom: 50px;
    }
    .outer2{
        margin: auto;
        text-align: center;
        vertical-align: middle;
    }
    .outer2>input{
        margin: 10px;
    }
    .searchIdPwd{
        margin: auto;
        background: rgb(240, 240, 239);
        width: 1000px;
        height: 450px;


    }
    #searchFrom {
        margin: auto;
        display: flex;
        
    }
    #searchFormT{
        margin: auto;
        width: 500px;
        height: 130px;
    }
    #searchForm>button{
        margin: auto;
        display: table;

    }
    #searchFormT>tr>th{
        text-align: center;
    }
    #searchFormT input{
        width: 100%;
    }
    .btn{
        margin: auto; 
        
     }
     .submitB{
        display: block;
        width: 100px;
        height: 30px;
     }
     
</style>
<script></script>
</head>
<body>
 <%@ include file="../common/menubar.jsp" %>


    <div class="outer">
        <h4 style="text-align:center;">ID / PWD 찾기</h4>
        <br>
        <div class="searchIdPwd">
           
            <br><br>
            <h5 style="text-align:center;">회원 정보 찾기</h5>
            <hr style="background: lightgray; border: 0; height: 2px;">
            <br>

            <form id="searchForm">
                <div class="outer2">
                    <input type="checkbox" id="searchId" class="search" > 
                    아이디(ID)찾기
                    <input type="checkbox" id="searchPwd" class="search">
                    비밀번호(PWD)찾기
                </div>
                <br>
                <!--
                    ID찾기 버튼 클릭 시 나올 div
                    <table id="searchFormT" >
                        <tr>
                            <th>이름</th>
                            <td colspan="2">
                                <input type="text"class="userName" id="userName" placeholder="이름을 입력해주세요." required>
                            </td>
                        </tr>

            
                        <tr>
                            <th>이메일</th>
                            <td><input type="text" id="email" class="email" placeholder="이메일주소를 입력하세요."></td>
                            <td>
                                <div class="dropdown">
                                    <button type="button"  class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
                                    @naver.com
                                    </button>
                                    <div class="dropdown-menu">
                                    <a class="dropdown-item" href="#">@hanmail.net</a>
                                    <a class="dropdown-item" href="#">@daum.net</a>
                                    <a class="dropdown-item" href="#">@gmail.com</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        
                    </table>
                    <br><br>

                    <button id="btn" class="submitB" style="background:lightgray; border: 20px; border-radius: 3px;" >ID찾기</button>
                -->
                
            <!-- PWD찾기 버튼 클릭 시 나올 div>-->





            </form>


        </div>
    </div>

    <!--회원가입 실패시 뜨는 창임-->
    
        <script>
            $(function(){
                $("#btn").click(function(){
                    $(this).alert("회원가입에 실패했습니다. 다시 시도해주세요.");
                });


            })
        </script>









 <%@ include file="../common/footerbar.jsp" %>
</body>
</html>