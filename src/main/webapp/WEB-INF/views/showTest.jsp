<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
    <link rel='stylesheet' href='${pageContext.request.contextPath}/css/style-starter.css' />              

  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <style type="text/css">
    .container {
      margin-right: auto;
      margin-left: auto;
      padding-right: 15px;
      padding-left: 15px;
      width: 100%;
      max-width: 800px;
    }

    .dimg1 {
      text-align: center;
      height: 200px;
      width: 200px;
      font-size: 180px;
      color: #5B5B5B;
      margin-left: 75px;
      margin-top: 75px;
      /*background-color: bisque;*/
    }

    .cl123 {
      margin-top: 100px;
      text-align: center;
      margin-left: 75px;
      list-style-type: none;
      /*background-color: coral;*/
    }

    .dli1 {
      /*background-color: aqua;*/

      width: 280px;
      height: 800px;
    }

    .h22 {
      margin-top: 85px;
      font-family:"微軟正黑體";
        margin-top: 85px;
      margin-left: 15px;
      font-size: 20px;

    }

    .h44 {
      text-align: left;
      text-decoration: underline;
      margin-bottom: 50px;
      font-family: "微軟正黑體";
    }

    #exhibitor114 {
      margin: 0 auto;
      width: auto;
      height: 100%;
      float: inherit;
    }

    #exhibitorleft {
      float: left;
      width: 20%;
      height: 100%;
      color: beige;
      /*background:#eeeeee*/
    }

    #exhibitorright {
      float: left;
      width: 80%;
      height: 100%;
      color: azure;
      padding-left: 300px;
    }
  </style>
</head>

<body>
  <!--header-->
  <header id="site-header" class="fixed-top" style="background-image:url(assets/images/title.png)">
    <link rel="stylesheet" href="assets/css/style-starter.css">
    <div class="container">
      <nav class="navbar navbar-expand-lg navbar-dark stroke">
        <h1>
          <a class="navbar-brand" href="index.html" id="test3">
            <span class="fa fa-align-right"></span> Cactus<span class="logo">Learning Everywhere</span></a>
        </h1>

        <!-- if logo is image enable this   
            <a class="navbar-brand" href="#index.html">
                <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
            </a> -->
        <button class="navbar-toggler  collapsed bg-gradient" type="button" data-toggle="collapse"
          data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false"
          aria-label="Toggle navigation">
          <span class="navbar-toggler-icon fa icon-expand fa-bars"></span>
          <span class="navbar-toggler-icon fa icon-close fa-times"></span>
          </span>
        </button>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
          <ul class="navbar-nav mx-lg-auto">
            <li class="nav-item active">
              <a class="nav-link" id="test2" href="index.html">Home <span class="sr-only">(current)</span></a>
            </li>
            <!-- <li class="nav-item @@about__active">
                <a class="nav-link" href="about.html">About</a>
              </li>
              <li class="nav-item @@services__active">
                <a class="nav-link" href="services.html">Services</a>
              </li>
              <li class="nav-item @@contact__active">
                <a class="nav-link" href="contact.html">Contact</a>
              </li>            -->
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
        <!--//search-right-->


        <!-- toggle switch for light and dark theme -->

        <!-- 這邊是日夜間模式
            <div class="mobile-position">
              <nav class="navigation">
                <div class="theme-switch-wrapper">
                  <label class="theme-switch" for="checkbox">
                    <input type="checkbox" id="checkbox">
                    <div class="mode-container py-1">
                      <i class="gg-sun"></i>
                      <i class="gg-moon"></i>
                    </div>
                  </label>
                </div>
              </nav>
            </div>             -->
        <a href="login.html"><i class="fa fa-user-circle-o" id="test1"
            style="font-size: 28px; color:#fff; padding:7px 0px 0px 13px;" title="Login 登入"></i></a>


        <!-- //toggle switch for light and dark theme -->
      </nav>

    </div>
  </header>

  <!--/header-->

  <section class="w3l-gallery py-5" id="gallery" style="margin-top: 5%;">
    <div class="container py-lg-5 py-md-4 py-2" style="width: 40%; height: 40%;">
      <div class="title-content text-center mb-5">



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
        </script>
        <!-- /move top -->
  </section>
  <!-- //copyright -->
  </footer>
  <!-- //footer -->
  <!-- Template JavaScript -->
  <script src="assets/js/jquery-3.3.1.min.js"></script>
  <script src="assets/js/theme-change.js"></script>

  <!-- libhtbox -->
  <script src="assets/js/lightbox-plus-jquery.min.js"></script>
  <!-- libhtbox -->

  <!-- banner slick slider -->
  <script src="assets/js/slick.js"></script>
  <script src="assets/js/script.js"></script>
  <!-- //banner slick slider -->

  <!-- magnific popup -->
  <script src="assets/js/jquery.magnific-popup.min.js"></script>
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
  <script src="assets/js/owl.carousel.js"></script>

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
  <div class="container">
    <div>
      <div class="dimg1">
        <label class=><i class="fa fa-user-circle-o"></i></label>
      </div>
      <div id="exhibitor114">
        <div id="exhibitorleft">
          <div class="dli1">

            <li class="cl123">
              <h2 class="h22">個人資料</h2>
              <h2 class="h22">購買紀錄</h2>
              <h2 class="h22">評分紀錄</h2>
              <a href="profile.html">
                <h2 class="h22">修改個人資料</h2>
              </a>
              <h2 class="h22">登出</h2>
            </li>
          </div>
        </div>
        <div id="exhibitorright">
          <li>
            <h4 class="h44">姓名 :</h4>
            <h4 class="h44">性別:</h4>
            <h4 class="h44">生日:</h4>
            <h4 class="h44">連絡電話:</h4>
            <h4 class="h44">Email:</h4>

          </li>
        </div>
      </div>
    </div>

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
      $(window).on("scroll", function () {
        var scroll = $(window).scrollTop();

        if (scroll >= 80) {
          $("#site-header").addClass("nav-fixed");
        } else {
          $("#site-header").removeClass("nav-fixed");
        }
      });


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



      // test
      // $(window).on("scroll", function () {
      //   var scroll = $(window).scrollTop();

      //   if (scroll >= 80) {
      //     $("#test1").css("color", "green");
      //   }
      // });

      // $(window).on("scroll", function () {
      //   var scroll = $(window).scrollTop();

      //   if (scroll <= 80) {
      //     $("#test1").css("color", "#fff");
      //   }
      // });

      $(window).on("scroll", function () {
        var scroll = $(window).scrollTop();

        if (scroll >= 80) {
          $("#test2").css("color", "#fff");
        }
      });

      $(window).on("scroll", function () {
        var scroll = $(window).scrollTop();

        if (scroll >= 80) {
          $("#test3").css("color", "#fff");
        }
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

    <script src="assets/js/bootstrap.min.js"></script>


</body>

</html>