<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .outer>h2{
        text-align: left;
    }
</style>
</head>
<body>
	
    <div class="outer" align="center">
        <br><br>
        <h2>회원조회</h2>
        <table border="1">
            <tr>
                <th>No</th>
                <th>회원정보</th>
                <th>아이디</th>
                <th>이름</th>
                <th>이메일</th>
                <th>가입일</th>
                <th>정보수정</th>
                <th>탈퇴</th>
                
            </tr>

            <tr>
                <td>1</td>
                <td>보호소</td>
                <td>mungcenter12</td>
                <td>멍멍보호소</td>
                <td>mung@naver.com</td>
                <td>2021-05-21</td>
                <td><a href="정보수정알림창">정보수정</a></td>
                <td><a href="회원탈퇴경고창">회원탈퇴</a></td>
            </tr>

            <tr>
                <td>2</td>
                <td>user01</td>
                <td>user01</td>
                <td>홍길동</td>
                <td>conimal@gmail.com</td>
                <td>2021-01-15</td>
                <td><a href="정보수정알림창">정보수정</a></td>
                <td><a href="회원탈퇴경고창">회원탈퇴</a></td>
            </tr>

        </table>
        <br>

        <button>&lt;</button>
        <button>1</button>
        <button>2</button>
        <button>3</button>
        <button>4</button>
        <button>5</button>
        <button>6</button>
        <button>7</button>
        <button>8</button>
        <button>9</button>
        <button>10</button>
        <button>&gt;</button>
        <br>


    </div>

</body>
</html>