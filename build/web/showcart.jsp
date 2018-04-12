<%-- 
    Document   : products
    Created on : Sep 29, 2017, 1:15:16 AM
    Author     : Nizis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Shopping Cart</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>
        <jsp:include page="include/header2.jsp"/>
           



        <div class="inner">
            <div class="box" >
                <div class="content" align="center">
                    <header style="text-align: center;">
                        <c:set var="shop" value="${sessionScope.SHOP}"/>
                        
                        <c:if test="${not empty shop}">
                            <table border="1">
                                <thead>
                                    <tr>
                                        <td>No.</td>
                                        <td>Code</td>
                                        <td>Name</td>
                                        <td>Price</td>
                                        <td>Quantity</td>
                                        <td>Action</td>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                <form action="ControllerCartBean" method="post">
                                    <c:set var="count" value="0"/>
                                     <c:set var="sum" value ="0"/>
                                    <c:forEach var="rows" items="${shop}">
                                        <c:set var="count" value="${count+1}"/>
                                       
                                        <c:set var="sum" value = "${rows.value.quantity*rows.value.sanpham.price+sum}"/>
                                        <tr align="center">
                                            <td>${count}</td>
                                             <td>${rows.value.sanpham.code}</td>
                                            <td>${rows.value.sanpham.name}</td>
                                            <td>$${rows.value.sanpham.price}</td> 
                                            <td><input style="width: 70px; text-align: center"  type = "text" name="sl" value ="${rows.value.quantity}"/></td>
                                            <td><input type="checkbox" name="rmv" value="${rows.value.sanpham.code}"/></td>
                                            <input type = "hidden" name="codes" value ="${rows.value.sanpham.code}"/>
                                        </tr>
                                        
                                    </c:forEach>
                                    <tr>
                                        <c:url var="add" value="ControllerCartBean">
                                            <c:param name="action" value="AddMore"/>
                                        </c:url>
                                        
                                        <td colspan="2"><a href="${add}"  style="text-decoration: none;  color: black; ">Add more</a></td>
                                        
                                        <td><input type="submit" value="Remove" name="action"/></td>
                                        <td>$${sum}</td>
                                        <td><input type="submit" value="Update" name="action"/></td>
                                        <td><input type="submit" name="ck" value="Check out"/></td>
                                       
                                       
                                    </tr>
                                </form>
                                </tbody>
                            </table>
                        </c:if>

                    </header> 
                </div>
            </div>
        </div>

        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
