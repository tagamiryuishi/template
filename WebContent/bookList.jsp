<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/productlist.css">
<title>商品一覧画面</title>
</head>

<body text="#232323" link="##404040" vlink="#404040" alink="#404040">


   <div id="main">
   <div class="pageback">
   <a href='<s:url action="GoHomeAction"/>'>HOME画面</a> &nbsp;>&nbsp; <a>商品一覧</a>
      </div>

      <h2 class="title">商品一覧</h2>
      <s:form action="ProductListConfirmAction">
	<table>
	<tr>
	  <th>商品名</th>
	  <th>商品詳細</th>
	  <th>金額</th>
	  <th>画像</th>
	  <th>チェック</th>
	</tr>
      <s:iterator value="productListDTOList">
    <tr>
      	<td><s:property value="productName"/></td>
      	<td><s:property value="productDescription"/></td>
      	<td><s:property value="totalPrice"/></td>
      	<td><img src='<s:property value="imageFilePath"/>' class="resize"/></td>
      	<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}" /></td>
	  <s:hidden name="id" value="%{id}"/>
      <s:hidden name="productName" value="%{productName}"/>
      <s:hidden name="productDescription" value="%{productDescription}"/>
      <s:hidden name="totalPrice" value="%{totalPrice}"/>
      <s:hidden name="imageFilePath" value="%{imageFilePath}"/>

      </s:iterator>
      </table>
      <s:submit value="購入"/>
      </s:form>

</div>
</body>
</html>