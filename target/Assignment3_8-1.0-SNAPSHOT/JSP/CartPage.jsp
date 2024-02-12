<%-- 
    Document   : CartPage
    Created on : Feb 16, 2023, 4:17:03 PM
    Author     : amretasrerengarajan
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Latest compiled JavaScript -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
         <div style=" margin: 30px">
             <div style="text-align: center">
                <h4 style="padding: 20px"><a href="home">Home Page</a><br></h4>
            </div>
            <h2 style="text-align: center">Cart</h2> 
            
            <form method="post" action="Home">
                <div style="margin:20px;">
                    <c:forEach var="mov" items="${sessionScope.cartArray.getItemList()}">
                        <input  type="checkbox" name="checkDel" value="${mov}" />
                        <c:out value="${mov}" /><br>
                    </c:forEach>

                    <c:if test = "${sessionScope.cartArray.cartSize() < 1 || sessionScope.cartArray == null}">
                        <h6 style="color: red"> Please add items</h6>
                    </c:if>
                </div>
                <div style="text-align: center; padding: 10px">
                    <c:if test = "${sessionScope.cartArray.cartSize() > 0}">
                        <input type="submit" value="Delete Item">
                    </c:if>
                </div>
            </form>
            
            <div>
            </div>
        </div>
    </body>
</html>
