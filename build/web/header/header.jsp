<%-- 
    Document   : header
    Created on : Oct 13, 2017, 3:57:38 PM
    Author     : Nizis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <header id="header" class="alt">
        <div class="logo"><a href="welcome.jsp">Nhật's <span>Mobile</span></a></div>
         <a href="showcart.jsp" ><img src="images/spc.png" style="width:18px; height: 18px;" />Shopping cart</a>
        <a href="#menu">  Welcome, ${sessionScope.USER}</a>
    </header>
    <nav id="menu">
        <ul class="links">
            <li><a href="welcome.jsp">Home</a></li>
            <li><a href="products.jsp">Products</a></li>
            <li><a href="customers.jsp">Customers</a></li>
            <li><a href="index.jsp">Log out</a></li>
        </ul>
    </nav>
    </body>
</html>
