<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
  window.onload=function(){
	  var t123 = document.getElementById("t123");
	  var exhibitorright = document.getElementById("exhibitorright");
	  t123.onclick = function() {
			var xhr = new XMLHttpRequest();			
			  xhr.onreadystatechange = function() {
					if (xhr.readyState == 4 && xhr.status == 200) {	
						exhibitorright.innerHTML = abc(CactusBeanString);					
					}					
					xhr.open("GET", "<c:url value='/teacher' />", true);			              
					xhr.send();	
			  }
			}
	  
	  function abc(CactusBeanString){
		  var segment ="";
		  var CactusBean = JSON.parse(CactusBeanString);
		  segment = "<h3>"+CactusBean.username+"</h3>";
		  return segment;
	  }
  }
  </script>
<body>
<button id ='t123'>成為教師</button>
 <div id='exhibitorright'>			
 </div>
</body>
</html>