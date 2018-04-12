<%-- 
    Document   : login
    Created on : Sep 29, 2017, 1:12:55 AM
    Author     : Nizis
--%>
<%@page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Sign in</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="subpage">

        <!-- Header -->
        <header id="header">
            <div class="logo"><a href="index.jsp">Nhat's <span>Mobile</span></a></div>

        </header>



        <!-- One -->
        <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Sign in</h2>
                </header>
            </div>
        </section>

        <!-- Two -->
        <section id="two" class="wrapper style2">
            <div class="inner">
                <div class="box">
                    <div class="content" align="center">
                        <header style="text-align: center;width: 400px;">
                            <form action="ControllerCustomers" method="post">
                                <input type="text" name="txtUser" placeholder="Enter your Username" value="" class="name" /><br/>
                                <input type="password"  placeholder="Enter your Password" name="txtPass" value="" class="pw"/><br/>
                                <a href="register.jsp" >Wanna join us? Click here</a><br/><br/>
                                <input type="submit" name="action" class="button" value="Log in"/>
                                
                            </form>
                        </header>
                    
                </div>
            </div>
            </div>
        </section>



      <jsp:include page="include/footer.jsp"/>
    </body>
</html>
