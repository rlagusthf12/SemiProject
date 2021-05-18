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
    .commonJoin{
        margin: auto;
        width: 1000px;
        height: 600px;
        background: rgb(240, 240, 239);
    }
    #commonJoinForm{
        margin: auto;
        width: 800px;
       
    }
    #commonJoinForm>button{
        margin: auto;
        display: table;

    }
    #submitB{
        margin: auto;
        text-align: center;
        vertical-align: middle;
        }
    #commonJoinFormT{
        margin: auto;
        width: 800px;
        height: 300px;
    }
    #commonJoinFormT>tr>th{
        margin:auto;
        width: 50px;
    }
    #commonJoinFormT input{
        width: 100%;
        height: 80%;
        border-radius:3px;
        border: 1px lightgray;

    }

</style>
<script></script>
</head>
<body>
 <%@ include file="../common/menubar.jsp" %>


    <div class="outer">
        <h4 style="text-align:center;">회원가입</h4>
        <br>
        <div class="commonJoin">
           
            <br><br>
            <h5 style="text-align:center;">회원 정보 입력</h5>
            <hr style="background: lightgray; border: 0; height: 2px;">
            <br>

            <form id="commonJoinForm">
                <table id="commonJoinFormT">
                    <tr>
                        <th><label id="nameC">이름</label></th>
                        <td colspan="2">
                            <input type="text" for="nameC" class="userName" id="userName" placeholder="이름을 입력해주세요." required>
                        </td>
                    </tr>

                    <tr>
                        <th><label id="idC">아이디</label></th>
                        <td><input type="text" for="idC"  class="userId" id="userId" placeholder="아이디를 입력하세요." required></td>
                        <td><button class="btn btn-dark">중복확인</button></td>
                    </tr>

                    <tr>
                        <th><label id="pwdC">비밀번호</label></th>
                        <td colspan="2"><input type="password" for="pwdC" id="userPwd" class="userPwd" placeholder="비밀번호를 입력하세요." required></td>
                    </tr>

                    <tr>
                        <th><label id="pwdC2">비밀번호 확인</label></th>
                        <td colspan="2"><input type="password" for="pwdC2" id="userPwd" class="userPwd" placeholder="비밀번호를 다시 한 번 입력하세요." required>
                    </tr>

                    <tr>
                        <th><label id="emailC">이메일</label></th>
                        <td><input type="text" id="email" for="emailC" class="email" placeholder="이메일주소를 입력하세요."></td>
                        <td>
                            <div class="dropdown">
                                <button type="button" style=""  class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
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

                <button id="btn" class="submitB btn btn-secondary" >회원가입</button>

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