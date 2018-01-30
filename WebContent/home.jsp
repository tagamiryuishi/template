<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>Home画面</title>
	<style type="text/css">
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}



		/* ========TEMPLATE LAYOUT======== */


		header {position:absolute;
		   top:0px;
		   left:0px;
		   width:100%;
		   height: 50px;
		   background-color:black;
		}

		.logo{flort:left;
		widht:200px;
		font-size:28px;
		color:white;
		padding-left:20px;
		line-height:50px;
		font-family:Georgia;
		}

		header ul{
		float:right;
		line-height:0px;
		}
	    header ul li{

	    margin-top:-30px;
	    float:left;
	    list-style:none;
	    padding-right:20px;
	    color:white;
	    font-size:18px;
	    }





		#main {clear:both;
		 width: 100%;
  height: 350px;
  text-align: center;
  padding-top: 100px;
  background: url(http://webcreatorbox.com/sample/images/sunset.jpg) no-repeat;
  background-size: cover;
        }
		.book{
		position:absolute;
		top:40px;
		left:80px;
		width:230px;
        height:auto;
        margin:10px;
        text-align:center;
        font-family:Georgia;
		font-size:35px;

	-webkit-animation-name:book;
	-webkit-animation-duration:2s;
	-webkit-animation-iteration-count:infinite;
	/*-webkit-animation-direction:alternate;*/
	-webkit-animation-timing-function:ease;

	-moz-animation-name:book;
	-moz-animation-duration:2s;
	-moz-animation-iteration-count:infinite;
	/*-moz-animation-direction:alternate;*/
	-moz-animation-timing-function:ease;
}

@-webkit-keyframes book {
	0% {-webkit-transform:translate(0, 0);}
	50% {-webkit-transform:translate(0, -10px);}
	100% {-webkit-transform:translate(0, 0);}
}
@-moz-keyframes book {
	0% {-moz-transform:translate(0, 0);}
	50% {-moz-transform:translate(0, -10px);}
	100% {-moz-transform:translate(0, 0);}
}
		.shoes{
		font-family:Georgia;
		position:absolute;
		top:175px;
		left:280px;
		width:250px;
		height:auto;
		font-size:30px;

	-webkit-animation-name:shoes;
	-webkit-animation-duration:2s;
	-webkit-animation-iteration-count:infinite;
	/*-webkit-animation-direction:alternate;*/
	-webkit-animation-timing-function:ease;

	-moz-animation-name:shoes;
	-moz-animation-duration:2s;
	-moz-animation-iteration-count:infinite;
	/*-moz-animation-direction:alternate;*/
	-moz-animation-timing-function:ease;
}

@-webkit-keyframes shoes{
	0% {-webkit-transform:translate(0, 0);}
	50% {-webkit-transform:translate(0, -10px);}
	100% {-webkit-transform:translate(0, 0);}
}
@-moz-keyframes shoes {
	0% {-moz-transform:translate(0, 0);}
	50% {-moz-transform:translate(0, -10px);}
	100% {-moz-transform:translate(0, 0);}
		}
		.tops{
		font-family:Georgia;
		position:absolute;
		top:55px;
		right:140px;
		width:320px;
		height:auto;
		font-size:30px;

		-webkit-animation-name:shoes;
	-webkit-animation-duration:2s;
	-webkit-animation-iteration-count:infinite;
	/*-webkit-animation-direction:alternate;*/
	-webkit-animation-timing-function:ease;

	-moz-animation-name:shoes;
	-moz-animation-duration:2s;
	-moz-animation-iteration-count:infinite;
	/*-moz-animation-direction:alternate;*/
	-moz-animation-timing-function:ease;
}

@-webkit-keyframes shoes{
	0% {-webkit-transform:translate(0, 0);}
	50% {-webkit-transform:translate(0, -10px);}
	100% {-webkit-transform:translate(0, 0);}
}
@-moz-keyframes shoes {
	0% {-moz-transform:translate(0, 0);}
	50% {-moz-transform:translate(0, -10px);}
	100% {-moz-transform:translate(0, 0);}
}

       .product{
       font-family:Georgia;
		position:absolute;
		top:55px;
		left:550px;
		width:350px;
		height:auto;
		font-size:30px;
       }

       .picup{
       font-size:15px;
       line-height:10px;
       position:absolute;
       top:445px;
       left:30px;
       color:red;
       }

      .picupstyle{
      height:45px;
      width:100%;
      background-color:#444444;
      }
</style>
</head>





<body>
<header>
<div class="logo">〜Life Style〜</div>
<ul>
<li> <s:form action="LoginAction"><s:submit value="ログイン画面" /></s:form></li>

</ul>
</header>

<div id="main">
<div class="book">
<a href='<s:url action="HomeAction" />'>Book<img src="./image/book1.jpg" width="240" height="230" style="border-radius:450px;"></a>

</div>
<div class="shoes">
<a href='<s:url action="HomeAction" />'>Shoes<img src="./image/shoes1.jpg"width="220" height="220" style="border-radius:450px;"></a>
</div>
<div class="tops">
<a href='<s:url action="HomeAction" />'>Tops<img src="./image/Tops.jpg" width="310" height="310" style="border-radius:450px;"></a>
</div>
<div class="product">
<a href='<s:url action="BuyItemAction" />'>ProductList<img src="./image/product.jpg" width="360" height="330" style="border-radius:450px;"></a>
</div>
</div>
<div class="picup"><h1>Picup!</h1></div>

<div class="picupstyle">sss</div>
</body>
</html>