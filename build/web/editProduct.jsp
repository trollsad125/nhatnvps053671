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
        <title>Edit Products</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body >
       <jsp:include page="include/header_admin.jsp"/>
         <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Edit Product</h2>
                </header>
            </div>
        </section>
        <section id="two" class="wrapper style2">
            <div class="inner">
                <div class="box">
                    <div class="content" align="center">
                        <header style="text-align: center;width: 400px;">
            <h1>Edit Products</h1>
            <form action="ControllerProducts">
                Code : ${SP.code}<input type="hidden" name="txtCode" value="${SP.code}"/><br>
                Name : <input type="text" name="txtName" value="${SP.name}"/><br>
                Price : <input type="text" name="txtPrice" value="${SP.price}"/><br>
                Image <input type="file" name="txtHinh" value="${SP.image}"/>
                <input type="submit" name="action" value="Update"/>
            </form>
                   </header>
                    
                </div>
            </div>
            </div>
        </section>
                <jsp:include page="include/footer.jsp"/>
    </body>
</html>
