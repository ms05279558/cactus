<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改資訊</title>
</head>
<style>
fieldset{
	border-radius: 20px;
}
legend{
	font-size:30px;
}
body{
	align:center;
}
body, div, td, input {font-size:18px; margin:0px; }
select {height:20px; width:300px; }
.title {font-size: 16px; padding: 10px; width:80%; }
.text {height:20px; width:300px; border:1px solid #AAAAAA; }
.line {margin:2px; }
.leftDiv {width:110px; float:left; height:22px; line-height:22px; font-weight:bold; }
.rightDiv {height:42px; }
.button {
color:#fff;
font-weight:bold;
font-size: 11px;
text-align:center;
padding:.17em 0 .2em .17em;
border-style:solid;
border-width:1px;
border-color:#9cf #159 #159 #9cf;
background:#69c url(images/bg-btn-blue.gif) repeat-x;
}
</style>
<body>
<form action="<c:url value='/Put_CC_member/${username.username}' />" method="POST">
<input type="hidden" name="_method" value="put" />
<div align="center">
<br/>
<fieldset style='width:30%'>
<legend> 修改列表 </legend>
<br/>
<div class='line'>
<div align="left" class='leftDiv'>帳號：</div>
<div align="left" class='rightDiv'>
<input type="text" name="username" class="text" value="${username.username}" disabled="disabled">
</div>
</div>

<div class='line'>
<div align="left" class='leftDiv'>密碼：</div>
<div align="left" class='rightDiv'>
<input type="password" name="password" class="text" value="${username.password}"/>
</div>
</div>

<div class='line'>
<div align="left" class='leftDiv'>姓名：</div>
<div align="left" class='rightDiv'>
<input type="text" name="name" class="text" value="${username.name}"/>
</div>
</div>

<div class='line'>
<div align="left" class='leftDiv'>信箱：</div>
<div align="left" class='rightDiv'>
<input type="text" name="email" class="text" value="${username.email}"/>
</div>
</div>
<!-- <div class='line'> -->
<!-- <div align="left" class='leftDiv'>請再次輸入密碼：</div> -->
<!-- <div align="left" class='rightDiv'> -->
<!-- <input type="password" name="passwordConfirm" class="text" /> -->
<!-- </div> -->
<!-- </div> -->
<div class='line'>
<div align="left" class='leftDiv'>請選擇性別：</div>
<div align="left" class='rightDiv'>
<input type="radio" name="sex" value="男" id="sexMale">
<label for="sexMale">男</label>
<input type="radio" name="sex" value="女" id="sexFemale">
<label for="sexFemale">女</label>
</div>
</div>
<!-- <div class='line'> -->
<!-- <div align="left" class='leftDiv'>請輸入年齡：</div> -->
<!-- <div align="left" class='rightDiv'> -->
<!-- <input type="text" name="age" class="text"> -->
<!-- </div> -->
<!-- </div> -->
<div class='line'>
<div align="left" class='leftDiv'>請輸入生日：</div>
<div align="left" class='rightDiv'>
<input type="text" name="birthday" class="text">
<br/>格式："yyyy/mm/dd"
</div>
</div>
<!-- <div class='line'> -->
<!-- <div align="left" class='leftDiv'>請選擇您的愛好</div> -->
<!-- <div align="left" class='rightDiv'> -->
<!-- <input type="checkbox" name="interesting" value="音樂影視" id="i1"> -->
<!-- <label for="i1">音樂影視</label> -->
<!-- <input type="checkbox" name="interesting" value="外出旅遊" id="i2"> -->
<!-- <label for="i2">外出旅遊</label> -->
<!-- <input type="checkbox" name="interesting" value="社交活動" id="i3"> -->
<!-- <label for="i3">社交活動</label> -->
<!-- </div> -->
<!-- </div> -->
<!-- <div class='line'> -->
<!-- <div align="left" class='leftDiv'>請選擇省市：</div> -->
<!-- <div align="left" class='rightDiv'> -->
<!-- <select name="area"> -->
<!-- <option>---請選擇省份---</option> -->
<!-- <optgroup label="北京市"> -->
<!-- <option value="北京市海淀區">海淀區</option> -->
<!-- <option value="北京市朝陽區">朝陽區</option> -->
<!-- <option value="北京市東城區">東城區</option> -->
<!-- <option value="北京市西城區">西城區</option> -->
<!-- </optgroup> -->
<!-- <optgroup label="山東省"> -->
<!-- <option value="山東省濟南市">濟南市</option> -->
<!-- <option value="山東省青島市">青島市</option> -->
<!-- <option value="山東省濰坊市">濰坊市</option> -->
<!-- </optgroup> -->
<!-- </select> -->
<!-- </div> -->
<!-- </div> -->
<!-- <div class='line'> -->
<!-- <div align="left" class='leftDiv'>自我描述：</div> -->
<!-- <div align="left" class='rightDiv'> -->
<!-- <textarea name="description" rows="4" style="width:300px; ">請填寫其他資料... </textarea> -->
<!-- </div> -->
<!-- </div> -->
<br/>
<div class='line'>

<br/><input type="submit" name="btn" value=" 送出 " class="button"><br/>

</div>
</fieldset>
</div>
</form> 
<%-- 	<form action="<c:url value='/Put_CC_member/${username.username}' />" method="post"> --%>
<!-- 		<input type="hidden" name="_method" value="put" /> -->
<!-- 		<div> -->
<!-- 			<label>帳號</label> <input type="text" name=username -->
<%-- 				value="${username.username}" disabled="disabled"> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<label>密碼</label> <input type="password" name=password -->
<%-- 				value="${username.password}" > --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<label>信箱</label> <input type="text" name=email -->
<%-- 				value="${username.email}"> --%>
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<label>姓名</label> <input type="text" name=name -->
<%-- 				value="${username.name}"> --%>
<!-- 		</div> -->
<!-- 		<button>送出</button> -->
<!-- 	</form> -->
</body>
</html>