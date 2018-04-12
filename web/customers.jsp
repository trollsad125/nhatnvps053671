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
        
        <title>Customers</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="shortcut icon" href="images/toh.ico" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body>

        <jsp:include page="include/header_admin.jsp"/>
        <section id="One" class="wrapper style3">
            <div class="inner">
                <header class="align-center">
                    <p>Nhat's Mobile</p>
                    <h2>Customers</h2>
                </header>
            </div>
        </section>



        <div class="inner">
            <div class="box" >
                <div class="content" align="center">
                    <header style="text-align: center;">
                        <form  action="ControllerCustomers"method="post" >
                            <label>Thêm Customers       <a href="newCustomers.jsp"><input type="button" name="action" class="button" value="New"/></a></label><br/>
                            <label>Nhập Username<input type="text"  name="txtsearch" value="" style="width: 30%; margin:auto "/></label>
                            <input type="submit" name="action" class="button" value="Search"/><br/>
                            <br/>

                            <table border="1" class="center">
                                <tr>
                                    <td>Username</td>
                                    <td> Password</td>
                                    <td>Họ và tên</td>
                                    
                                    <td>Email</td>
                                    <td>Admin</td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <c:forEach var="rows" items="${listUN}">
                                    <form action="ControllerCustomers">
                                    <tr>
                                        <td>${rows.un}</td>
                                        <td>${rows.pass}</td>
                                        <td>${rows.hoten}</td>
                                        <td>${rows.email}</td>
                                        <td>${rows.admin}</td>

                                        <c:url var="del" value="ControllerCustomers">
                                            <c:param name="action" value="Edit"/>
                                            <c:param name="txtUNA" value="${rows.un}"/>
                                            <c:param name="txtpass" value="${rows.pass}"/>
                                            <c:param name="txthoten" value="${rows.hoten}"/>
                                            <c:param name="txtemail" value="${rows.email}"/>
                                            <c:param name="txtrole" value="${rows.admin}"/>
                                        </c:url>
                                        <td><a href="${del}"  >Edit</a></td>
                                        <td>
                                            <input type="hidden" name="txtUNA" value="${rows.un}"/>
                                            <input type="submit" class="button" name="action" value="Delete"/>
                                        </td>
                                    </tr>
                                    </form>
                                </c:forEach>
                            </table>
                        </form>

                    </header>

                </div>
            </div>
        </div>

        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
