<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<link rel="stylesheet"href="./css/buyItem.css">

<script type="text/javascript">
    function goGoAdminItemAddAction(){
        document.getElementById('form').action="GoAdminItemAddAction";
    }

    function goAdminItemUpdateAction(){
        document.getElementById('form').action="AdminItemUpdateAction";
    }

    function goAdminItemDeleteAction(){
        document.getElementById('form').action="AdminItemDeleteAction";
    }
</script>

<title>管理者画面</title>
</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
	<p>管理者ホーム画面</p>
</div>
<br>
<s:if test="errorMessage!=null">
	<s:property value="errorMessage"/>
	</s:if>
	<div>
	<s:form action="BuyItemAction" id="form" name="form" >
		<table>
			<tr>
					<td></td>
					<td><span>商品ID</span></td>
					<td><span>商品名</span></td>
					<td><span>値段</span></td>
					<td><span>在庫数</span></td>

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

					</td>
				</tr>
				</s:iterator>
			</table>
			<br>
				<s:submit value="追加" onclick="goGoAdminItemAddAction();" />
		</s:form>
		<br>
			<div>
				<p>前画面に戻る場合は<a href='<s:url action="LoginAction" />'>こちら</a></p>

			</div>
		</div>
	</div>
	<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>

