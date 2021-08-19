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
<script type="text/javascript">
function send()
{
    window.alert("信件已寄出");
 
}
</script>
<body>
	<div class="modal-body">
		<form class="login" method="get" action="<c:url value='/sendnewpassword'  />"
			name="myForm">
<i id=fa1 class="far fa-envelope"></i> 
			<h1 class="hh1">找回密碼</h1>
			<div>
				<input type="text" placeholder="輸入註冊信箱" name="email" id="idn" required /> 
                <span class="s2" id="emilsp"></span>
            </div>
			
					
			<div style="color: #FF0000">${e.msg}</div>
			<!-- <div id="div" style="color:#FF0000"></div>-->
			<input id="lg" type="submit" value="送出" onclick="send()"/> 
			
			
			
				
		</form>
			<input id="yaya" type="button" value="一鍵輸入" onclick="fFirst()" />
	</div>

</body>
</html>