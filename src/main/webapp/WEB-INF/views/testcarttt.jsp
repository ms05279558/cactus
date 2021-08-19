<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="<c:url value='/css/style-starter.css'  />">
<link rel="stylesheet" href="<c:url value='/css/css02.css'  />">
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="get" enctype="multipart/form-data"
		class="form001">
		<fieldset class="field001">
			<legend class="lg001">
				SHOPPING LIST
			</legend>
			<div class="box1">

				<div class="box2">
					<img class="img11" src="<c:url value='/images/python03.jpg' />" />
				</div>
				<div class="box3">
					<h2>PYTHON - 輕鬆學會寫程式</h2>
					<p>用最輕鬆、最直覺、最好理解的方式、學會寫程式的核心基礎</p>
					<p>Brain</p>
					<span><img class="img22"
						src="<c:url value='/images/lilstar.png' />" />(353)</span>
					<p>total:72 hours</p>
					<p class="price">NT$1,400</p>
				</div>

			</div>
			<div class="box1">

				<div class="box2">

					<img class="img11" src="<c:url value='/images/java03.png'  />" />
				</div>
				<div class="box3">
					<h2>Java 核心基礎知識</h2>
					<p>這是一套既全面覆蓋了java基礎知識，又簡單易學的java課程</p>
					<p>Howard Yen</p>
					<span><img class="img22"
						src="<c:url value='/images/lilstar.png/' />" />(353)</span>
					<p>total:72 hours</p>
				
					<p class="price">NT$1,200</p>
				</div>

			</div>

			<div class="subbb">
				<input type="submit" value="送出" class="ttt"> <input
					type="reset" value="清除" class="ttt">
			</div>

		</fieldset>
	</form>
</body>
</html>