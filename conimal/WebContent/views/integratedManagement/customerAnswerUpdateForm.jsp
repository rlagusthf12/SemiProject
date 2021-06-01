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
    .answer-area textarea{
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
			<input type="hidden" name="cno" value="<%=c.getQueNo()%>">
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
                    <form action="<%=contextPath%>/update.an" method="post">
                        <input type="hidden" name="cno" value="<%=c.getQueNo()%>">
                        <textarea name="ansContent" cols="30" rows="10" style="resize: none;"></textarea>
                        
                        <br><br>
                        
			            <div class=button-area align="center">
			                <button type="reset" class="btn" style="background-color: lightgray">취소</button>
			                <button type="submit" class="btn" style="background-color: rgb(187, 208, 227)">등록</button>
			            </div>
                    </form>
                    
            	</div>
            
            
        
        </div>
    </div>
    <%@ include file="../common/footerbar.jsp" %>
</body>
</html>