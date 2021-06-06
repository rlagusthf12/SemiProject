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
        .body{
            width:800px;
            margin:auto;
            margin-top:50px;
        }
        table{margin:auto;}
        table th, table td{height:40px;}
        table th{width:150px; text-align:left;}
        table td{width:500px;}
      
        table input{line-height:25px;}
        #title, #name, #phone{width:350px;}
        #place{width:250px;}


        .enroll>button{
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
		String shName = loginUser.getShName(); 
		String memId = loginUser.getMemId();
		//String shPhone = loginUser.getShPhone();
		String email = (loginUser.getEmail() == null) ? "" : loginUser.getEmail();
		//String shAbout = loginUser.getShAbout();
	%>

    <div class="body">
        <h2 align="center">보호중인 동물 등록하기</h2>
        <br>
        <form action="" id="animal-form" method="post">
            <h3 align="center">등록 정보 입력</h3>
            <hr>
            <table>
                <tr>
                    <th>제목 </th>
                        <td><input type="text" id="title" placeholder="제목을 입력해주세요." required> </td>
                </tr>
                <tr>
                    <th>보호소명</th>
                        <td><input type="text" id="memName" required></td>
                </tr>
                <tr>
                    <th>연락처</th>
                        <td><input type="phone" id="phone" placeholder="연락처를 입력하세요."></td>
                </tr>
                <tr>
                    <th>발견한 장소</th>
                        <td>
                            <select id="city_select" title="시/도별 선택 리스트">
                                <option value="1">서울</option>
                                <option value="2">경기도</option>
                                <option value="3">강원도</option>
                                <option value="4">충청도</option>
                                <option value="5">전라도</option>
                                <option value="6">경상도</option>
                                <option value="7">제주</option>
                            </select>
                            <input type="text" id="place" placeholder="내용을 입력하세요.">
                        </td>
                </tr>
                <tr>
                    <th>보호중인 동물</th>
                        <td>
                            <input type="radio" name="animal" id="dog"> <label for="dog">강아지</label>
                            <input type="radio" name="animal" id="cat"> <label for="cat">고양이</label>
                            <input type="radio" name="animal" id="etc"> <label for="etc">그 외 반려동물</label>
                        </td>
                </tr>
                <tr>
                    <th>성별</th>
                        <td>
                            <input type="radio" name="gender" id="male"> <label for="male">수컷</label>
                            <input type="radio" name="gender" id="female"> <label for="female">암컷</label>
                            <input type="radio" name="gender" id="unkown"> <label for="unkown">모르겠음</label>
                        </td> 
                </tr>
                <tr>
                    <th>상세설명</th>
                        <td><textarea name="" id="" cols="50" rows="10" placeholder="내용을 입력하세요."></textarea></td>
                </tr>
                <tr>
                    <th>사진첨부</th>
                        <td>
                            <input type="file">
                        </td>
                </tr>


            </table>
            <br><br>
            <div class="enroll" align="center">
                <button>등록하기</button>
            </div>

        </form>
    </div>

    <br><br>

    <%@ include file="../common/footerbar.jsp" %>


</body>
</html>