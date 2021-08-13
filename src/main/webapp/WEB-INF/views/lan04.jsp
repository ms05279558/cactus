<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Corp Vision - Corporate Category Bootstrap Responsive
	Template | Home : W3layouts</title>

<!-- google fonts -->
<link
	href="//fonts.googleapis.com/css2?family=Jost:wght@300;400;600&display=swap"
	rel="stylesheet">

<!-- Template CSS -->
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
<link rel="stylesheet" href= "<c:url value='/css/css02.css'  />">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
</style>
<link rel="stylesheet" href="<c:url value='/css/style-starter.css'  />">
</head>
<body>
	<header id="site-header" class="fixed-top"
		style="background-image:url(${pageContext.request.contextPath}/images/title.png)">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-dark stroke">
				<h1>
					<a class="navbar-brand"
						href="<c:url value='/homeLoginPage/'/>" id="test3">
						<span class="fa fa-align-right"></span> Cactus<span class="logo">Learning
							Everywhere</span>
					</a>
				</h1>


				<button class="navbar-toggler  collapsed bg-gradient" type="button"
					data-toggle="collapse" data-target="#navbarTogglerDemo02"
					aria-controls="navbarTogglerDemo02" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon fa icon-expand fa-bars"></span> <span
						class="navbar-toggler-icon fa icon-close fa-times"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
					<ul class="navbar-nav mx-lg-auto">

						<li class="nav-item @@about__active"><a class="nav-link"
							href="index.html">Home</a></li>
					</ul>
				</div>

				<!-- 這邊是搜尋 -->
				<!--/search-right-->
				<div class="header-search">
					<div class='control mr-3'>
						<div class='btn-material'>
							<i class='fa fa-search icon-material-search'></i>
						</div>
					</div>
					<!-- full screen form controls -->
					<i class='icon-close fa fa-close material-icons'></i>
					<form action="error.html" method="GET" class='search-input'>
						<input class='input-search' placeholder='Start Typing' type='text'>
					</form>
				</div>

				<a href="login.html"><i class="fa fa-user-circle-o" id="test1"
					style="font-size: 28px; color: #fff; padding: 7px 0px 0px 13px;"
					title="Login 登入"></i></a>

			</nav>

		</div>
	</header>
	<header id="site-header" class="fixed-top" style="margin-top: 60px;">
		<div class="icon-bar">
				<a href="<c:url value='/coding01'  />">軟體編程</a>
			    <a href="<c:url value='/sport02'  />">運動</a>
			    <a href="<c:url value='/music03'  />">音樂</a> 
				<a href="<c:url value='/lan04'  />">語言</a>
				<a href="<c:url value='/free06'  />">攝影</a>
			    <a href="<c:url value='/economy05'  />">金融</a>
		</div>
	</header>
	<div class="box4" style="margin-top: 5%;">
    <table class="tb1">

      
     
      <thead>
        <tr>
          <th><button type="button" class="btn btn-info">中文</button></th>
          <th><button type="button" class="btn btn-info">英文</button></th>
          <th><button type="button" class="btn btn-info">法文</button></th>
          <th><button type="button" class="btn btn-info">西語</button></th>
          <th><button type="button" class="btn btn-info">俄語</button></th>
        </tr>

        <tr>
          <th><button type="button" class="btn btn-info">方言</button></th>
          <th><button type="button" class="btn btn-info">部落</button></th>
          <th><button type="button" class="btn btn-info">手語</button></th>
          <th><button type="button" class="btn btn-info">台語</button></th>
          <th><button type="button" class="btn btn-info">波蘭語</button></th>
        </tr>
      </thead>

      <tbody>
        <tr>
          <td></td>
        </tr>
      </tbody>
    </table>
    <br>
    <!-- <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#demo">貼心提醒</button> -->
  </div>
  <div class="sidenav" style="margin-top: 500px;">
    <!-- <a href="#about">About</a> -->
    <a href="#services" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">Search</a>
    <a href="#clients"  style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">評分</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">主題</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">級別</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">語言</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">價格</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">字幕</a>
    <a href="#contact" style="border-bottom: 2px solid rgb(177, 170, 170); color:rgb(161, 154, 154)">影片時長</a>
    <button class="dropdown-btn" style="border-bottom: 2px solid rgb(177, 170, 170);color:rgb(161, 154, 154)">星數
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-container">
      <a href="#">1</a>
      <a href="#">2</a>
      <a href="#">3</a>
      <a href="#">4</a>
      <a href="#">5</a>
    </div>
    
  </div>
  <div class="box1" style="margin-top: 150px;">

    <div class="box2">
      <img class="img1" src="<c:url value='/images/chinese.png' />"/>
     </div>
    <div class="box3">
      <h2>Quick Survival Chinese Perfect for Travelers to China</h2>
      <p>Practical Chinese Crash Course for Beginners</p>
      <p>>Chin Hwung </p>
      <span><img class="img2" src= "<c:url value='/images/lilstar.png' />" />(353)</span>
      <p>total:72 hours </p>
      <span class="sp01"><button class="btnbuy">加入購物車</button></span>
      <p class="price">NT$1,750 </p>
    </div>

  </div>
  <div class="box1">

    <div class="box2">
   
      <img class="img1" src="<c:url value='/images/english.jpg'  />" />
    </div>
    <div class="box3">
      <h2>基礎英文第一課</h2>
      <p>八大詞性,名詞,there is/ there are句型</p>
      <p>Crystal Wang</p>
      <span><img class="img2" src="<c:url value='/images/lilstar.png/' />"/>(353)</span>
      <p>total:72 hours </p>
      <span class="sp01"><button class="btnbuy">加入購物車</button></span>
      <p class="price">NT$1,150 </p>
    </div>

  </div>
  
  <div class="box1">

    <div class="box2">
      <img class="img1" src="<c:url value='/images/franchis.jpg/' />"/>
    </div>

    <div class="box3">
      <h2>Straight Talk About Franchising</h2>
      <p>What I Learned and You Need to Know - A Comprehensive Guide to Making a Choice and Putting It Into Action</p>
      <p>Adam Wu</p>
      <span><img class="img2" src="<c:url value='/images/lilstar.png/' />"/>(353)</span>
      <p>total:72 hours </p>
      <span class="sp01"><button class="btnbuy">加入購物車</button></span>
      <p class="price">NT$950 </p>
    </div>

  </div>
  <div class="box1">

    <div class="box2">
      <img class="img1" src="<c:url value='/images/spanish.jpg/'/>"/>
    </div>

    <div class="box3">
      <h2>30分鐘西語發音＆自我介紹極簡學習法</h2>
      <p>透過我們的系統性整理，快速掌握西語發音，讓從沒學過西文的你，看到字就能念，還「順便」練會自我介紹！</p>
      <p>Doris Shin</p>
      <span><img class="img2" src="<c:url value='/images/lilstar.png/'/>"/>(353)</span>
      <p>total:72 hours </p>
      <span class="sp01"><button class="btnbuy">加入購物車</button></span>
      <p class="price">NT$1,850 </p>
    </div>

  </div>
  <div class="box1">

    <div class="box2">
      <img class="img1" src="<c:url value='/images/russian.jpg/'/>"/>
    </div>

    <div class="box3">
      <h2>The Complete Russian Language Course </h2>
      <p>Three courses in One: A1, A2 and B1! For beginners and intermediate learners. Start speaking real Russian today!</p>
      <p>Chin Hwung 秦始皇</p>
      <span><img class="img2" src="<c:url value='/images/lilstar.png/'/>"/>(353)</span>
      <p>total:72 hours </p>
      <span class="sp01"><button class="btnbuy">加入購物車</button></span>
      <p class="price">NT$1,300 </p>
    </div>
    
   
  </div>
<!-- 下拉式選單  下層 -->
  
  
  
  
  <script>
    // When the user scrolls down 20px from the top of the document, show the button
    window.onscroll = function () {
      scrollFunction()
    };

    function scrollFunction() {
      if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("movetop").style.display = "block";
      } else {
        document.getElementById("movetop").style.display = "none";
      }
    }

    // When the user clicks on the button, scroll to the top of the document
    function topFunction() {
      document.body.scrollTop = 0;
      document.documentElement.scrollTop = 0;
    }
  </script><c:url value='/images/lilstar.png/'/>
  <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/theme-change.js"></script>

  <!-- libhtbox -->
  <script src="${pageContext.request.contextPath}/js/lightbox-plus-jquery.min.js"></script>
  <!-- libhtbox -->

  <!-- banner slick slider -->
  <script src="${pageContext.request.contextPath}/js/slick.js"></script>
  <script src="${pageContext.request.contextPath}/js/script.js"></script>
  <!-- //banner slick slider -->

  <!-- magnific popup -->
  <script src="${pageContext.request.contextPath}/js/jquery.magnific-popup.min.js"></script>
  <script>


    $(document).ready(function () {
      $('.popup-with-zoom-anim').magnificPopup({
        type: 'inline',

        fixedContentPos: false,
        fixedBgPos: true,

        overflowY: 'auto',

        closeBtnInside: true,
        preloader: false,

        midClick: true,
        removalDelay: 300,
        mainClass: 'my-mfp-zoom-in'
      });

      $('.popup-with-move-anim').magnificPopup({
        type: 'inline',

        fixedContentPos: false,
        fixedBgPos: true,

        overflowY: 'auto',

        closeBtnInside: true,
        preloader: false,

        midClick: true,
        removalDelay: 300,
        mainClass: 'my-mfp-slide-bottom'
      });
    });
  </script>
  <!-- //magnific popup -->

  <!-- script for tesimonials carousel slider -->
  <script src="${pageContext.request.contextPath}/js/owl.carousel.js"></script>

  <script>
    $(document).ready(function () {
      $("#owl-demo1").owlCarousel({
        loop: true,
        margin: 20,
        nav: false,
        responsiveClass: true,
        responsive: {
          0: {
            items: 1,
            nav: false
          },
          768: {
            items: 1,
            nav: false
          },
          1000: {
            items: 1,
            nav: false,
            loop: false
          }
        }
      })
    })
  </script>
  <!-- //script for tesimonials carousel slider -->

  <!-- disable body scroll which navbar is in active -->
  <script>
    $(function () {
      $('.navbar-toggler').click(function () {
        $('body').toggleClass('noscroll');
      })
    });
  </script>
  <!-- disable body scroll which navbar is in active -->

  <!--/MENU-JS-->
  <script>
    // $(window).on("scroll", function () {
    //   var scroll = $(window).scrollTop();

    //   if (scroll >= 80) {
    //     $("#site-header").addClass("nav-fixed");
    //   } else {
    //     $("#site-header").removeClass("nav-fixed");
    //   }
    // });
    

    //Main navigation Active Class Add Remove
    $(".navbar-toggler").on("click", function () {
      $("header").toggleClass("active");
    });
    $(document).on("ready", function () {
      if ($(window).width() > 991) {
        $("header").removeClass("active");
      }
      $(window).on("resize", function () {
        if ($(window).width() > 991) {
          $("header").removeClass("active");
        }
      });
    });



   
    

  </script>





  <!--//MENU-JS-->

  <!-- Search -->
  <script>
    $('.control').click(function () {
      $('body').addClass('search-active');
      $('.input-search').focus();
    });

    $('.icon-close').click(function () {
      $('body').removeClass('search-active');
    });
  </script>
  <!-- //Search -->

  <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>