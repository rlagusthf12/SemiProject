<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    .id_pwd{width: 65%; height: 70px; } .loginbtn{width: 35%;}
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
            <div class="on">  

                    <image src="resources/images/mainLogo.png" width="558px" height="120px" class="mainLogo">
                        
                        <div class="login" align="center">
                   
                            <form action="" id="loginform">                
                           
                                <div class="id_pwd">        
                                    <input type="text" class="id" value="아이디"><br>
                                    <input type="password" class="pwd" value="비밀번호" >                    
                                </div>
                         
                                <div class="loginbtn">
                                    <input type="submit" value="login">
                                </div>
                            </form>      
                            <span class="find">ID/PW 찾기 | 회원가입</span>
                        </div>   
                       
            </div>
            <div class="navi">                
                    <ul id="navi1" >
                        <li><a href="">코니멀 소개</a></li>
                        <li><a href="">보호소</a></li>
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
                            <li><a href="">후원</a></li>
                        </ul>
                      </li>
                        <li><a href="">커뮤니티</a>
                        <ul>
                            <li><a href="">자유 게시판</a></li>
                            <li><a href="">공지사항</a></li>
                            <li><a href="">고객센터</a></li>
                        </ul>
                    </li>
                    </ul>
            </div>            	




</body>
</html>