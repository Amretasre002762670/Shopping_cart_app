<%-- 
    Document   : LoginPage.jsp
    Created on : Feb 16, 2023, 4:17:41 PM
    Author     : amretasrerengarajan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 style="text-align: center">Login Page</h2>
        <form method="POST" action="Login" style="text-align: center; margin: 20px;">
            <p>User name: <input type="text" name="username" size="20"/></p>
            <p>Password: <input type="password" size="20" name="password"/></p>
            <p>  <input type="submit" value="Login"/></p>
        </form>
    </body>
</html>
