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
	<link rel="stylesheet" href="./css/buyItem.css">
	<title>BuyItem画面</title>

</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
		<br>
		<s:if test="errorMessage!=null">
			<s:property value="errorMessage"/>
		</s:if>
		<div>
		<s:form action="BuyItemAction">
			<table>
				<tr>
					<td></td>
					<td><span>商品ID</span></td>
					<td><span>商品名</span></td>
					<td><span>値段</span></td>
					<td><span>在庫数</span></td>
					<td><span>購入個数</span></td>
				</tr>
				<s:iterator value="itemInfoTransactionList">
				<tr>
					<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}" /></td>
					<td><s:property value="id"/></td>
					<s:hidden name="id" value="%{id}"/>
					<td><s:property value="itemName" /></td>
					<s:hidden name="itemName" value="%{itemName}"/>
					<td><s:property value="itemPrice" /><span>円</span></td>
					<s:hidden name="itemPrice" value="%{itemPrice}"/>
					<td><s:property value="itemStock" /></td>
					<s:hidden name="itemStock" value="%{itemStock}"/>
					<td>
						<select name="count">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>
					</td>
				</tr>
				</s:iterator>
			</table>
			<br>
			<span>支払い方法</span><br>
				<input type="radio" name="pay" value="1" checked="checked">現金払い
				<input type="radio" name="pay" value="2">クレジットカード
				<br>
				<s:hidden name="userMasterId" value="%{loginUserId}"/>
				<s:hidden name="loginUserId" value="%{loginUserId}"/>
				<s:submit value="購入"/>
		</s:form>
		<br>
			<div >
			<p>Home画面は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>

			</div>
		</div>
	</div>
	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>