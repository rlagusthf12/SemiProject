<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kh.customer.model.vo.Customer" %>
<% 
	Customer c = (Customer)request.getAttribute("c");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .outer{
        height: 1000px;
        width: 800px;
        margin: auto;
        margin-top: 50px;
    }

    .customerDetail{
        height: 100%;
        width: 100%;
    }

    .customerDetail button{
        text-align: center;
        margin: auto;
    }
    .answer-area{
        margin: auto;
        width: 80%;
        height: 50%;
        border: black solid 1px;
    }
    
</style>
</head>
<body>
    <%@ include file="../common/menubar.jsp" %>
    
    <div class="outer">
        <a href="<%=contextPath%>/list.cu?currentPage=1" class="btn" style="background-color: rgb(187, 208, 227)">목록</a>
        <div class="customerDetail">

            <table id="customerAnswer" border="1" align="center">
                <tr>
                    <th>작성자 아이디</th>
                    <td width="400px"><%=c.getQueId() %></td>
                </tr>
                <tr>
                    <th>문의 제목</th>
                    <td width="400px">
                    	<%=c.getQueTitle() %>
                    </td>
                </tr>
                <tr>
                    <th>문의 내용</th>
                    <td width="400px">
                    	<%=c.getQueContent() %>
                    </td>
                </tr>
            </table>

            <br>

            <h3 style="margin-left: 150px;">문의 답변 작성</h3>
            	<div class="answer-area" border="1" align="center">
                    <br><br><br>
            		<%if(c.getAnsStatus().equals("N")){ %>
                    	등록된 답변이 없습니다. 
                        <br><br>
                        <a href="<%=contextPath%>/updateForm.an?cno=<%=c.getQueNo()%>" class="btn" style="background-color: rgb(187, 208, 227)">답변등록하기</a>
                    <% }else{ %>
            			<%=c.getAnsContent() %>
            		<% } %>
            		
            	</div>
            
            <br><br>
        
        </div>
    </div>
    <%@ include file="../common/footerbar.jsp" %>
</body>
</html>