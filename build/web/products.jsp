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
        <title>Products</title>
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
                    <h2>Products</h2>
                </header>
            </div>
        </section>


       
            <div class="inner">
                <div class="box" >
                    <div class="content" align="center">
                        <header style="text-align: center;">
                            <form  action="ControllerProducts" method="post" >
                                <label>Thêm Sản phẩm mới          <a href="newProduct.jsp"><input type="button" name="action" class="button" value="New"/></a></label><br/>
                                <label>Nhập tên sản phẩm<input type="text"  name="txtTenSP" value="" style="width: 30%; margin:auto "/></label>
                                <input type="submit" name="action" class="button" value="Search"/><br/>
                           <br/>
                                           </form>

                            <table border="1" class="center">
                                
                                <tr>
                                    <td>Mã sản phẩm</td>
                                    <td> </td>
                                    <td>Tên sản phẩm</td>
                                    <td>Giá sản phẩm</td>
                                    <td>Sửa</td>
                                    <td>Xóa</td>
                                </tr>
                                <c:forEach var="rows" items="${listSP}">
                                      <form action="ControllerProducts" >
                                    <tr>
                                        <td>${rows.code} </td>
                                        <td><img style="width: 100px; height: 70px;" src="images/${rows.image}"/> </td>
                                        <td>${rows.name}</td>
                                        <td>$${rows.price} </td>
                                        
                                          <c:url var="del" value="ControllerProducts">
                                            <c:param name="action" value="Edit"/>
                                            <c:param name="txtCode" value="${rows.code} "/>
                                            <c:param name="txtName" value="${rows.name}"/>
                                            <c:param name="txtPrice" value="${rows.price}"/>
                                            <c:param name="txtHinh" value="${rows.image}"/>
                                        </c:url>
                                        <td><a href="${del}">Edit</a></td>
                                        
                                        <td>
                                            <input type="hidden" name="txtCode" value="${rows.code}"/>
                                            <input type="submit" class="button" name="action" value="Delete"/>
                                        </td>
                                    </tr>
                                                                    </form>

                                </c:forEach>
                            </table>

                        </header>

                    </div>
                </div>
            </div>
        
  <jsp:include page="include/footer.jsp"/>
</body>
</html>
