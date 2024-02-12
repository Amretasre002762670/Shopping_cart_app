<%-- 
    Document   : index
    Created on : Feb 16, 2023, 4:17:31 PM
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
    <body style="margin: 20px;">
        <div style=" width: 100%; text-align: center ">
            <h2>Menu</h2>
            <form method="get" action="Home">
                <nav class="navbar navbar-expand-sm bg-light navbar-light">
                    <div class="container-fluid mx-auto">
                        <ul class="navbar-nav">
                            <li class="nav-item" style=" padding: 10px;">
                                <input type="submit" value="Books" name="choice"/>
                            </li>
                            <li class="nav-item" style=" padding: 10px;">
                                <input type="submit" value="Music" name="choice"/>
                            </li>
                            <li class="nav-item" style=" padding: 10px;">
                                <input type="submit" value="Computer" name="choice"/>
                            </li>
                        </ul>
                    </div>
                </nav>
            </form>
        </div>
        <div style=" width: 100%; margin: 10px;">
            <form method="get" action="Home">
                <c:forEach var="item" items="${sessionScope.visibleArray}">
                    <input type="checkbox" name="check" value="${item}">
                    <c:out value="${item}" /><br>
                </c:forEach>
                <c:if test = "${sessionScope.visibleArray.size() < 1}">
                    <h6 style="color: red"> Please add items</h6>
                </c:if>
                <div style="text-align: center; padding: 20px">
                    <c:if test = "${sessionScope.visibleArray.size() > 0}">
                        <input type="submit" value="Add To Cart">
                    </c:if>
                    <div>
                        <h5 style="text-align: center; padding: 20px;"><a href="cart">View Cart</a></h5><br>
                    </div>
            </form>
        </div>
    </div>
</body>
</html>
