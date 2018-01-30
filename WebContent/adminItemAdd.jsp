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
	<title>商品追加画面</title>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品追加画面</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			<s:form action="AdminItemAddAction">
			<table>
				<tr>
					<td>
						<label>商品名:</label>
					</td>
					<td>
						<s:textfield name="itemName" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>値段:</label>
					</td>
					<td>
						<s:textfield name="itemPrice" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>在庫数:</label>
					</td>
					<td>
						<s:textfield name="itemStock" value="" />
					</td>
				</tr>
				<s:submit value="申請"/>
			</table>
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