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
        <title>New Products</title>
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
                    <h2>New Products</h2>
                </header>
            </div>
        </section>
        <div class="inner">
                <div class="box" >
                    <div class="content" align="center">
                        <header style=" width: 400px;">
                                        <h1>New Product</h1>
                     <form method="post">
                          <label>Code: <input type="text" name="txtCode" value="" /></label><br/>
                         <label>Name: <input type="text" name="txtName" value=""/></label><br/>
                         <label>Price: <input type="text" name="txtPrice" value=""/></label><br/>
                         <label>Image:<input type="file" name="txtHinh" value=""/></label>
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
        <c:if test="${not empty param.txtCode}">
            <sql:update dataSource="${con}">
                Insert into Products(code , name,price,image) values(?,?,?,?)
                <sql:param value="${param.txtCode}"/>
                <sql:param value="${param.txtName}"/>
                <sql:param value="${param.txtPrice}"/>
                <sql:param value="${param.txtHinh}"/>
            </sql:update>
        </c:if>
        <sql:query dataSource="${con}" var="rs">
            select * from Products
        </sql:query>
            <table border="1">
                <tr align="center">
                    <td>Code</td><td></td><td>Name</td><td>Price</td>
                </tr>
                <c:set var="count" value="0"/>
                <c:forEach var="dong" items="${rs.rows}">
                    <tr align="center">
                        
                        
                        <td>${dong.code}</td>
                        <td><img src="images/${dong.image}" style="width: 100px; height: 70px"></td>
                        <td>${dong.name}</td>
                        <td>$${dong.price}</td>
                        
                    </tr>
                </c:forEach>
            </table>
                        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
