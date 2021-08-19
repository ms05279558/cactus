<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"/>
<link rel='stylesheet' href="<c:url value='/css/forgotpassword.css'  />" />
</head>
<body>
<div class="modal-body">
		<form class="login" method="post" action="<c:url value='/resetpassword2'/>"
		
			name="myForm">
<i id=fa3 class="fas fa-lock"></i>    
<i id=fa4 class="fas fa-lock"></i>   
			<h1 class="hh1">重新設定密碼</h1>
			<div>
				<input type="password" placeholder="輸入新密碼(限8-20 碼英文數字符號)" name="password" id="idn" required />                 
            </div>
            <div>
				<input type="password" placeholder="重新輸入密碼"  id="idn" required />              
            </div>
			
					
			<div style="color: #FF0000">${e.msg}</div>
			<!-- <div id="div" style="color:#FF0000"></div>-->
			<input id="lg" type="submit" value="送出" onclick="send()"/> 
			
			
			
				
		</form>
			<input id="yaya" type="button" value="一鍵輸入" onclick="fFirst()" />
	</div>

</body>
</html>