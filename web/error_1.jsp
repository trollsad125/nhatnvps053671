<%-- 
    Document   : error
    Created on : Sep 29, 2017, 1:12:02 AM
    Author     : Nizis
--%>
<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Error</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="subpage">

        <!-- Header -->
        <header id="header">
            <div class="logo"><a href="welcome.jsp">Nhat's <span>Mobile</span></a></div>
<a href="#menu">  Welcome, ${sessionScope.USER}</a>
        </header>

        <!-- One -->
        <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Error</h2>
                    
                </header>
            </div>
                
        </section>
                <nav id="menu">
        <ul class="links">
            <li><a href="welcome.jsp">Home</a></li>
            <li><a href="products.jsp">Products</a></li>
            <li><a href="customers.jsp">Customers</a></li>
            <li><a href="index.jsp">Log out</a></li>
        </ul>
    </nav>
        <!-- Two -->
        <section id="two" class="wrapper style2">
            <div class="inner">
                <div class="box">
                    <div class="content" align="center">
                        <header style="text-align: center;">
                             <b><span style="font-size:25px;"> Trang đang được bảo trì mời các bạn về lại trang chủ </span></b><br/>
                            <image style="height: 300px;width: 300px" src="images/1.gif" /><br/>
                           
                            <footer class="align-center">
                                <a href="welcome.jsp" class="button alt">Trang chủ</a>
                            </footer>
                        </header>
                    
                </div>
            </div>
            </div>
        </section>


     <jsp:include page="include/footer.jsp"/>

    </body>
</html>
