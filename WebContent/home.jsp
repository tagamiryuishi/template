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
	<link rel="stylesheet" href="./css/home.css">
	<title>Home画面</title>
</head>


<body>
<header>
<div class="logo">〜L-Style〜</div>
<div class="botan"><ul>
<li> <s:form action="LoginAction"><s:submit value="ログイン画面" /></s:form></li>
</ul></div>
</header>

<div id="main">
<div class="book">
<a href='<s:url action="BuyItemAction?category=book" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'>Book<img src="./image/book1.jpg" width="240" height="230" style="border-radius:450px;"></a>

</div>
<div class="shoes">
<a href='<s:url action="BuyItemAction?category=shoes" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'>Shoes<img src="./image/shoes1.jpg"width="220" height="220" style="border-radius:450px;"></a>
</div>
<div class="tops">
<a href='<s:url action="BuyItemAction?category=tops" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'>Tops<img src="./image/Tops.jpg" width="310" height="310" style="border-radius:450px;"></a>
</div>
<div class="product">
<a href='<s:url action="BuyItemAction?category=all" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'>ProductList<img src="./image/product.jpg" width="360" height="330" style="border-radius:450px;"></a>
</div>
</div>
<div class="picup"><h1>Pickup!</h1></div>
<div class="picupstyle"></div><br>
<div class="image1"><a href='<s:url action="BuyItemAction?category=shoes" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'><h2>ランニングシューズ</h2><img src="./image/ranning.jpg" width="160" height="160" style="border-radius:450px;"></a></div>
<div class="image2"><a href='<s:url action="BuyItemAction?category=tops" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'><h2>ボーダーTシャツ</h2><img src="./image/shirt.border.jpg" width="160" height="160" style="border-radius:450px;"></a></div>
<div class="image3"><a href='<s:url action="BuyItemAction?category=book" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'><h2>大学受験（初級）</h2><img src="./image/university.syokyu.png" width="160" height="160" style="border-radius:450px;"></a></div>
<div class="image4"><a href='<s:url action="BuyItemAction?category=shoes" ><s:param name="userMasterId" value="%{loginUserId}"/></s:url>'><h2>体育館シューズ</h2><img src="./image/taiikukan.jpg" width="160" height="160" style="border-radius:450px;"></a></div>

<div class="footer"></div>

</body>
</html>