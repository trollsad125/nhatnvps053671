<%-- 
    Document   : index
    Created on : Oct 1, 2017, 4:17:46 PM
    Author     : Nizis
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Products"%>
<%@page import="controller.ControllerCartBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Trang chủ</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="shortcut icon" href="images/toh.ico" />
    <link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
    <header id="header" class="alt">
        <div class="logo"><a href="index.jsp">Nhật's <span>Mobile</span></a></div>
        
        <a href="login.jsp">Sign in</a>
        
    </header>
    <!-- Banner -->
    <section class="banner full">
        <article>
            <img src="images/slide01.jpg" alt="" />
            <div class="inner">
                <header>
                    <p>A new Product of Apple</p>
                    <h2>IPhone X</h2>
                </header>
            </div>
        </article>
        <article>
            <img src="images/slide02.jpg" alt="" />
            <div class="inner">
                <header>
                    <p>Outstanding configuration of Xiaomi</p>
                    <h2>Redmi Note 3</h2>
                </header>
            </div>
        </article>
        <article>
            <img src="images/slide03.jpg"  alt="" />
            <div class="inner">
                <header>
                    <p>Master of Selfie from OPPO</p>
                    <h2>Oppo F3</h2>
                </header>
            </div>
        </article>
        <article>
            <img src="images/slide04.jpg"  alt="" />
            <div class="inner">
                <header>
                    <p>New "son" of Samsung</p>
                    <h2>Galaxy J7 Pro</h2>
                </header>
            </div>
        </article>

    </section>
    <!-- One -->
    <section id="one" class="wrapper style2">
        <div class="inner">
            <div class="grid-style">

                <div>
                    <div class="box">
                        <div class="image fit">
                            <img src="images/tin1.jpg" alt="" />
                        </div>
                        <div class="content">
                            <header class="align-center">
                                <p>Tin tức về công nghệ</p>
                                <h2>Thời của những smartphone ‘siêu cấp’</h2>
                            </header>
                            <p> Samsung khởi động với Galaxy Note 8. LG tham gia cuộc chơi với V30.
                                Apple tất nhiên không đứng ngoài, thậm chí đưa cuộc chạy đua lên tầm cao mới với iPhone X. 
                                Những smartphone này đều có giá xấp xỉ 1.000 USD.
                                Google Pixel 2 XL cũng có giá 850 USD.            
                                Chào mừng đến với thời của những smartphone “siêu cấp”.</p>
                            <footer class="align-center">
                                <a href="error_1_1.jsp" class="button alt">Read More</a>
                            </footer>
                        </div>
                    </div>
                </div>

                <div>
                    <div class="box">
                        <div class="image fit">
                            <img src="images/tin2.jpg" alt="" />
                        </div>
                        <div class="content">
                            <header class="align-center">
                                <p>Tin tức về công nghệ</p>
                                <h2>Ảnh thực tế bộ đôi 'sát thủ iPhone' từ Google</h2>
                            </header>
                            <p> Trong nhiều năm, thiết kế của điện thoại di động trở nên giống nhau đến nhàm chán. 
                                Sự xuất hiện của Pixel mang đến nét khác biệt.
                                Nó không đẹp một cách hoàn hảo như iPhone hay điện thoại Galaxy mà tập trung vào tính thực dụng.
                                Google vừa cho ra mắt thế hệ thứ 2 của sản phẩm này, mang tên Pixel 2 và Pixel 2 XL.</p>
                            <footer class="align-center">
                                <a href="error_1_1.jsp" class="button alt">Read More</a>
                            </footer>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </section>

    <!-- Two -->
    <section id="two" class="wrapper style3">
        <div class="inner">
            <header class="align-center">
                <p>Những sản phẩm chỉ có thể là độc nhất của Nhật's mobile</p>
                <h2>Professional</h2>
            </header>
        </div>
    </section>

    <!-- Three -->
    <section id="three" class="wrapper style2">
        <div class="inner">
            <header class="align-center">
                <p class="special">Products</p>
                <p class="special">Lưu ý: Đăng nhập vào để Add To Cart</p>
                <h2>Products of Nhật's Mobile</h2>
            </header>
            </div>
    </section>
            <table>
        <tr align="center">
            <td>Code</td>
            <td> </td> 
            <td>Name</td>
            <td>Price</td>
            <td> </td>
            <td> </td>
        </tr>
         <%
            Products list = new Products();
            List<Product> listt = list.showProduct("");
            for (Product sp : listt) {
                out.print("<form action=\"ControllerCartBean\" method='post'>");
                out.print("<tr align='center'><td>" + sp.getCode() + "</td>"
                        + "<td><img style='width:100px; height:70px;' src='images/" + sp.getImage() + "'/></td>"
                        + "<td>" + sp.getName() + "</td>"
                        + "<td>$" +sp.getPrice() + "</td>"
                        + "<td><input  disabled type=\"submit\"value=\"Add to Cart\" name=\"action\" class='button'/></td>"
                        + "<td><input type=\"submit\"value=\"Product Details \" name=\"action\" class='button'/></td>"
                        + "<input type=\"hidden\" name=\"txtCode\" value='" + sp.getCode() + "'/>"
                        + "<input type=\"hidden\" name=\"txtHinh\" value='" + sp.getImage() + "'/>"
                        + "<input type=\"hidden\" name=\"txtName\" value='" + sp.getName() + "'/>"
                        + "<input type=\"hidden\" name=\"txtPrice\" value='" + sp.getPrice() + "'/></tr>"
                );
                out.print("</form>");
            }

        %>
            </table>
   

   <jsp:include page="include/footer.jsp"/>
</body>
</html>
