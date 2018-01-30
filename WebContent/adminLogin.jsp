<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html;charset=utf-8"/>
<meta http-equiv="Content-Style-Type"  content="text/css" />
<meta http-equiv="Content-Script-Type" content="javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keyword" content="" />
<meta charset="utf-8">
<link rel="stylesheet" href="./css/login.css">
<title>管理者ログイン画面</title>
</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>管理者ログイン画面</p>
</div>
<div>
<s:if test="errorMessage!=null">
<h3><s:property value="errorMessage"/></h3>
  <br>
</s:if>
<h3>管理者ログインをお願いします。</h3>
<s:form action="AdminLoginAction">
ユーザーID:<s:textfield name="loginUserId" label="ユーザーID"/><br>
パスワード:<s:password name="loginPassword" label="パスワード"/><br>
<s:submit value="ログイン" />
</s:form>
<p>前画面に戻る場合は<a href="./login.jsp">こちら</a></p>
<br/>
<div>
</div>
</div>
</div>
<div id="footer">
<div id="pr">
</div>
</div>

</body>
</head>
</html>