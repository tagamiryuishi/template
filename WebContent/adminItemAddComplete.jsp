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
	<meta charset="utf-8">
	<link rel="stylesheet" href="./css/adminItemAdd.css">
	<title>商品追加完了画面</title>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品追加完了画面</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			<h1>商品の登録が完了しました。</h1>

			<s:form action="AdminItemAddCompleteAction">
				<s:submit value="OK"/>
			</s:form>
			<div>
				<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction" />'>こちら</a>
			</div>
		</div>
	</div>
		<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>