<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.member.model.vo.Member"%>
<% String contextPath = request.getContextPath();
   Member loginUser = (Member)session.getAttribute("loginUser");
   String alertMsg = (String)session.getAttribute("alertMsg");
  int memCode=0;
  if(loginUser != null) { 
		 memCode = loginUser.getMemCode();
			}
%>
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
    .on{
         width: 1200px;
         height: 180px;         
         margin: 0 auto;
         }
    .mainLogo{

        margin-left: 302px;

    }

    .login {           
        float:right; 
        margin-top:40px;
     }
   #loginform>*{
    
    float:left;
    }
    .id_pwd{width: 200px; height: 70px; } .loginbtn{width: 100px;}

    .pwd,.id{
        color: rgb(94, 94, 94);
        border-style: solid; 
        border-color: rgb(204, 204, 204);
        width:100%;
        height:50%;
    }
    .loginbtn>input{        
        font-size: 24px; 
        width: 80%;
        height: 100%;
        color: rgb(255, 255, 255); 
        line-height: 3.2em;        
        background-color: rgb(171, 198, 223); 
        text-align: center;
        border-radius: 4px;        
        border:0px;
    }

    .find{
    text-decoration-line: underline;
    font-style: italic;
    font-size: 16px;
    line-height: 3.2em;      
    }
               
    .navi{
            width: 1200px; height: 55px;
            background-color: rgb(187, 208, 227);            
            margin: 0 auto;         
     }
     #navi1{
            list-style-type:none;
            margin:0;
            padding:0;
            height:100%;
            text-decoration:none;
            
        }
       
        #navi1>li{
            margin-left: 8px;
            float:left;
            width:16%;
            height:100%;
            text-align:center;
        }
        #navi1 a{
            line-height: 2.8em; 
            font-size: 20px; 
            color: rgb(110, 109, 109);
            font-family: HanSans; 
            width: 16.6%;   
            font-weight: bold; 
            cursor:pointer;
            height:100%;
            width:100%;
            display:block;
            text-decoration:none; 
            z-index: 6;
        }
        #navi1 a:hover{color: white;}
        #navi1>li>ul{
            list-style-type:none;
            display:none;           
            margin-top:0px;
            padding:10px;
            background-color: rgb(184, 183, 183); 
            font-family: HanSans;            
            line-height: 2.8em; 
            font-size: 20px;
            position: relative;
            z-index: 6;
        }
        #navi1>li>ul a{font-size:15px;}
        #navi1>li>a:hover+ul{display:block;}
        #navi1>li>ul:hover{display:block;}
     </style>
</head>

<body>

<script>
		var msg = "<%= alertMsg %>"; 
		// var msg = "메세지" / "null"
		
		if(msg != "null"){
			alert(msg);			
			<% session.removeAttribute("alertMsg"); %>
		}
		
</script>

            <div class="on">  

                    <a href="<%=contextPath%>"><image src="resources/images/mainLogo.png" width="558px" height="120px" class="mainLogo"></a>
                        
                        <div class="login" align="center">
                   			<% if(loginUser == null) { %>
                            <form action="<%=contextPath%>/login.me" id="loginform" method="post">                
                           
                                <div class="id_pwd">        
                                    <input type="text" class="id" name="userId" placeholder="아이디" required><br>
                                    <input type="password" class="pwd" name="userPwd" placeholder="비밀번호" required>                    
                                </div>
                         
                                <div class="loginbtn">
                                    <input type="submit" value="login">
                                </div>
                                
                            </form>  
                             <span class="find">ID/PW 찾기 | 회원가입</span>
					         <% }else{ %>
						        <!--로그인성공후-->
						        <div id="user-info">
						            <b><%= loginUser.getUserName() %>님</b>의 방문을 환영합니다. <br><br>
						            <div align="center">
						                <a href="">마이페이지</a>
						                <a href="<%= contextPath %>/logout.me">로그아웃</a>
						            </div>
						        </div>
					        <% } %>
        
                        </div>
                           
                       
            </div>
            <div class="navi">                
                    <ul id="navi1" >
                        <li><a href="<%=contextPath%>/Main.intro">코니멀 소개</a></li>
                        <% if(memCode==1){ %>
                        <li><a href="<%=contextPath%>/Main.sh?currentPage=1">보호소</a></li>
                        <%} else { %>
                          <li><a href="">보호소</a></li>
                          <%} %>
                        <li><a href="">입양문의</a>
                            <ul>
                                <li><a href="">보호중인 동물</a></li>
                                <li><a href="">입양 절차</a></li>
                                <li><a href="">입양 신청</a></li>
                                <li><a href="">입양 후기</a></li>
                            </ul>
                        </li>
                        <li><a href="">입소문의</a>                        
                            <ul>
                                <li><a href="">입소 절차</a></li>
                                <li><a href="">입소 신청</a></li>                      
                            </ul>
                        </li>
                        <li><a href="">후원 &amp; 자원봉사</a>
                        <ul>
                            <li><a href="">자원봉사</a></li>
                             <% if(memCode==1){ %>
                            <li><a href="<%=contextPath%>/Main.do?currentPage=1">후원</a></li>
                             <%} else { %>
                               <li><a href="">후원</a></li>
                               <%} %>
                        </ul>
                      </li>
                        <li><a href="">커뮤니티</a>
                        <ul>
                            <li><a href="">자유 게시판</a></li>
                            <li><a href="<%=contextPath%>/Main.no?currentPage=1">공지사항</a></li>
                            <li><a href="">고객센터</a></li>
                        </ul>
                    </li>
                    </ul>
            </div>            
        
           
</body>
</html>