<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
       /* body 마이페이지 사이드바*/
       div{box-sizing:border-box;}
        .body{
            width:100%;
            /*height:800px;*/
            margin:auto;
            margin-top:10px;
        }
        .body>div{
            height:100%;
            float:left;
            }
        #left{width:25%;}
        #right{width:75%;}

        #mypage{
            font-weight: bold; 
            font-size: 32px; 
            color: rgb(127, 127, 127);
            text-align:center;
            padding:30px;
        }

        #sidebar{
            list-style-type:none; 
            margin:0;
            padding:0;
            height:100%;
        }
        #sidebar>li{
            background-color:lightgray;
           /* background-color: rgb(190, 190, 190);*/
            font-weight:bold;
            font-size:24px;
            text-align:center;
            line-height:75px;
        }
        #sidebar>li:hover{
            background-color:gray;
            cursor:pointer;
        }

        /* 사이드1 */
        .wrap{
            width:700px;
            height:800px;
            margin:auto;
            margin-top:50px;
        }
        table{margin:auto;}
        table th, table td{height:40px;}
        table th{width:150px; text-align:left;}
        table td{width:450px;}
      
        table input{
            width:300px;
            line-height:25px;
        }

        table p{font-size:13px;}

        button{
            font-size: 16px; 
            color: rgb(255, 255, 255); 
            text-align: center; 
            line-height: 2.5em; 
            border-radius: 4px; 
            background-color: rgb(127, 127, 127);
            border:0px;
            margin-right: 62px;
        }
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<%
		String memName = loginUser.getMemName(); 
		String memId = loginUser.getMemId();
		
		
	%>

    <div class="body">

        <div id="left">
            <div id="mypage">마이페이지</div>
        
            <ul id="sidebar">
                <li id="side1">정보수정</li>
                <li id="side2">작성 게시글</li>
                <li id="side3">회원 탈퇴</li>
            </ul>
        </div>

        <div id="right">


            <div class="wrap">
                <form action="" id="side1-form" method="post">
                    <h2 align="center">정보수정</h2>
                    <br>
                    <table>
                        <tr>
                            <th>보호소명</th>
                                <td><input type="text" id="shName" placeholder="이름을 입력해주세요." required readonly value="<%=memName%>"></td>
                        </tr>
                        <tr>
                            <th>아이디</th>
                                <td><input type="text" id="memId" placeholder="아이디를 입력하세요." required readonly value="<%=memId%>"></td>
                        </tr>
                        <tr>
                            <th>비밀번호</th>
                                <td><button>변경하기</button></td>
                        </tr>
                        <tr>
                            <th>연락처</th>
                                <td><input type="text" name="shPhone" placeholder="(-) 포함하여 연락처를 입력하세요." value="xxxx-xxxx"></td>
                        </tr>
                        <tr>
                            <th>주소</th>
                                <td>
                                    <select id="city_select" title="시/도별 선택 리스트">
                                        <option value="">전국</option>
                                        <option value="1">서울특별시</option>
                                        <option value="11">부산광역시</option>
                                        <option value="9">대구광역시</option>
                                        <option value="2">인천광역시</option>
                                        <option value="15">광주광역시</option>
                                        <option value="7">대전광역시</option>
                                        <option value="12">울산광역시</option>
                                        <option value="3">경기도</option>
                                        <option value="4">강원도</option>
                                        <option value="5">충청북도</option>
                                        <option value="6">충청남도</option>
                                        <option value="13">전라북도</option>
                                        <option value="14">전라남도</option>
                                        <option value="10">경상북도</option>
                                        <option value="8">경상남도</option>
                                        <option value="16">제주도</option>
                                        <option value="17">세종특별자치시</option>
                                    </select>
                                    <input type="text" name="shAddress" placeholder="주소를 입력하세요." value="xx시 xx구 xxxxxxx">
                                </td>
                        </tr>
                        <tr>
                            <th>소개글</th>
                                <td><textarea name="shAbout" cols="50" rows="10" placeholder="내용을 입력하세요. 보호소소개란에 글이 게시됩니다.">xxxxxxx</textarea></td>
                        </tr>
                        <tr>
                            <th>필수서류</th>
                                <td>
                                    <input type="file"><br><br>
                                    <input type="file"><br><br>
                                    <input type="file">
                                </td>
                        </tr>
                        <tr>
                            <th colspan="2"> 
                                <p>
                                    ※ 사업자 등록증 사본 1부 / 대표자 명의 통장 사본 1부 / 법인 인감증명서 1부<br>
                                    ※ 최근 3개월 이내 발급하신 서류를 깨끗하게 스캔해서 준비해주세요.
                                </p>
                            </th>
                        </tr>
                    </table>
            
                    <br><br>
                        
                    <div class="modify" align="center">
                        <button type="submit">수정하기</button>
                    </div>
            
                </form>
            </div>

        </div>

    </div>
	
	

</body>
</html>