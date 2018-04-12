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
        <title>Shopping cart</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>

        <jsp:include page="include/header2.jsp"/>
        <section id="two" class="wrapper style2">
            <div class="inner">
                <div class="box">
                    <div class="content" align="center">
                        <header style="text-align: center;">
                            <b style="font-size: 25px;">Giỏ hàng trống trơn! Nhanh tay nào bạn ơi</b><br/>
                            <img style="width:300px; height:300px"src="images/2.gif"/><br/>
                            <a href="welcome.jsp">Trở về trang chủ</a>

                        </header>

                    </div>
                </div>
            </div>
        </section>


        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
