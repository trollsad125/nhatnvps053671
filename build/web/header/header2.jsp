<%-- 
    Document   : header2
    Created on : Oct 13, 2017, 4:00:37 PM
    Author     : Nizis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header id="header" class="alt">
            <div class="logo"><a href="welcome.jsp">Nhật's <span>Mobile</span></a></div>
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
        <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Your Shopping Cart</h2>
                </header>
                 </div>
        </section>
        
    </body>
</html>
