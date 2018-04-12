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
        <title>New Customer</title>
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
                    <h2>New Customers</h2>
                </header>
            </div>
        </section>
        <div class="inner">
            <div class="box" >
                <div class="content" align="center">
                    <header style=" width: 400px;">
                        <h1>Customers</h1>
                        
                        <form method="post">
                            <label>Username: <input type="text" name="txtUN" value="" /></label><br/>
                            <label>Password: <input type="text" name="txtPW" value="" /></label><br/>
                            <label>Họ và tên: <input type="text" name="txtHVT" value="" /></label><br/>
                            <label>Email: <input type="text" name="txtEmail" value=""/></label><br/>
                            <label>Role<input type="checkbox" name="txtadmin" value=""></label>
                           
                            <input type="submit" value="Insert" name="action"/>
                        </form>
                    </header>
                </div>
            </div>
        </div>
        <sql:setDataSource driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
                           url="jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367"
                           user="sa" password="123"
                           var="con"/>
        <c:if test="${not empty param.txtUN}">
            
            <sql:update dataSource="${con}">
                Insert into Customers (username , password, Hoten ,Email,Role) values(?,?,?,?,?)
                <sql:param value="${param.txtUN}"/>
                <sql:param value="${param.txtPW}"/>
                <sql:param value="${param.txtHVT}"/>
                <sql:param value="${param.txtEmail}"/>
                <sql:param value="${param.txtadmin}"/>
            </sql:update>
        </c:if>
        <sql:query dataSource="${con}" var="rs">
            select * from Customers
        </sql:query>
        <table border="1">
            <tr align="center">
                <td>Username</td><td>Password</td><td>Họ và tên</td><td>Email</td><td>Role</td>
            </tr>
            <c:set var="count" value="0"/>
            <c:forEach var="dong" items="${rs.rows}">
                <tr align="center">


                    <td>${dong.username}</td>
                    <td>${dong.password}</td>
                    <td>${dong.Hoten}</td>
                  
                    <td>${dong.Email}</td>
                    <td>${dong.role}</td>

                </tr>
            </c:forEach>
        </table>
        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
