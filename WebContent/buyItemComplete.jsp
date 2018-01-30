<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<link rel="stylesheet" href="./css/buyItemComplete.css">
	<title>BuyItemComplete画面</title>

</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemComplete</p>
		</div>
		<div>
			<p>購入手続きが完了致しました。</p>
			<div>
				<a href='<s:url action="MyPageAction"><s:param name="userMasterId" value="%{userMasterId}"/><s:param name="loginUserId" value="%{loginUserId}"/></s:url>'>
				マイページ
				</a>
				<span>から購入履歴の確認が可能です。</span>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction" ><s:param name="userMasterId" value="%{userMasterId}"/><s:param name="loginUserId" value="%{loginUserId}"/></s:url>'>
				こちら
				</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>

