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
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<link rel="stylesheet" href="./css/buyItemConfirm.css">
	<title>BuyItemConfirm画面</title>

	<script type="text/javascript">
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<h1>こちらの商品でよろしいでしょうか？</h1>
		<div>
			<s:form id="form" name="form" action="BuyItemCompleteAction">
			<table>
				<tr>
					<td>商品名</td>
					<td>値段</td>
					<td>購入個数</td>
					<td>小計</td>
				</tr>
				<s:iterator value="itemInfoTransactionList">
				<tr>
					<td><s:property value="itemName" /></td>
					<s:hidden name="itemName" valiue="%{itemName}"/>
					<td><s:property value="itemPrice" /><span>円</span></td>
					<s:hidden name="itemPrice" value="%{itemPrice}"/>
					<td><s:property value="totalCount" /><span>個</span></td>
					<s:hidden name="totalCount" value="%{totalCount}"/>
					<td><s:property value="totalPrice" /><span>円</span></td>
					<s:hidden name="totalPrice" value="%{totalPrice}"/>
				</tr>
				<s:hidden name="id" value="%{id}"/>
				<s:hidden name="itemTransactionId" value="%{itemTransactionId}"/>
				<s:hidden name="itemPrice" value="%{itemPrice}"/>
				<s:hidden name="itemStock" value="%{itemStock}"/>
				<s:hidden name="count" value="%{count}"/>
				<s:hidden name="loginUserId" value="%{loginUserId}"/>
				<s:hidden name="userMasterId" value="%{userMasterId}"/>
				</s:iterator>
			</table>
			<br>
			<table>
				<tr>
					<td>支払い方法</td>
					<s:if test="pay==1">
						<td>現金払い</td>
					</s:if>
					<s:if test="pay==2">
						<td>クレジットカード</td>
					</s:if>
					<s:hidden name="pay" value="%{pay}"/>
				</tr>
				<tr>
					<td><input type="button" value="戻る" onclick="submitAction('BuyItemAction')" /></td>
					<td><input type="button" value="完了" onclick="submitAction('BuyItemCompleteAction')" /></td>
				</tr>
			</table>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>