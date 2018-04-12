<%-- 
    Document   : newProduct
    Created on : Oct 13, 2017, 6:49:10 PM
    Author     : Nizis
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Register</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>
         <header id="header">
            <div class="logo"><a href="index.jsp">Nhat's <span>Mobile</span></a></div>

        </header>



        <!-- One -->
        <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Register</h2>
                </header>
            </div>
        </section>
        <div class="inner">
            <div class="box" >
                <div class="content" align="center">
                    <header style=" width: 400px;">
                        
                        <form action="ControllerCustomers" method="post">
                             
                            <label>Username: <input type="text" name="txtUN" value="" /></label><br/>
                            <label>Password: <input type="password" name="txtPW" value="" /></label><br/>
                            <label>Confirm Password: <input type="password" name="txtPW1" value="" /></label><br/>
                            <label>Họ và tên: <input type="text" name="txtHVT" value="" /></label><br/>
                            <label>Email: <input type="text" name="txtEmail" value=""/></label><br/>
                            <input type="hidden" name="checkadmin" value=""/>
                           <input type="submit" value="Register" name="action"/>
                        </form>
                    </header>
                </div>
            </div>
        </div>
         
        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
