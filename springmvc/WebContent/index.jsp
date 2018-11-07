<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
 <!-- 
    <form method="post" action="user/save">
       	 用户名：<input type="text" name="LoginId" />
        <br /><br />
        密码：<input type="password" name="Loginpwd"/>
        <br /><br />
        <input type="submit" value="登录" /><br />
        
    </form>
 	<a href="mvc/hello" >hello world</a> -->
 	
 	
 	
 	 <form action="user/save" method="post">
		用户 <input type="text" name="username" /><br /> 
		密码 <input type="text" name="password" /><br /> 
		<input type="submit" value="添加">
	</form>


</body>
</html>