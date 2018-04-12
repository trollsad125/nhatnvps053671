package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;
import model.Products;
import controller.ControllerCartBean;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title>Trang chủ</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/toh.ico\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header id=\"header\" class=\"alt\">\n");
      out.write("        <div class=\"logo\"><a href=\"index.jsp\">Nhật's <span>Mobile</span></a></div>\n");
      out.write("        \n");
      out.write("        <a href=\"login.jsp\">Sign in</a>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("    <!-- Banner -->\n");
      out.write("    <section class=\"banner full\">\n");
      out.write("        <article>\n");
      out.write("            <img src=\"images/slide01.jpg\" alt=\"\" />\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header>\n");
      out.write("                    <p>A new Product of Apple</p>\n");
      out.write("                    <h2>IPhone X</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <img src=\"images/slide02.jpg\" alt=\"\" />\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header>\n");
      out.write("                    <p>Outstanding configuration of Xiaomi</p>\n");
      out.write("                    <h2>Redmi Note 3</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <img src=\"images/slide03.jpg\"  alt=\"\" />\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header>\n");
      out.write("                    <p>Master of Selfie from OPPO</p>\n");
      out.write("                    <h2>Oppo F3</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("        <article>\n");
      out.write("            <img src=\"images/slide04.jpg\"  alt=\"\" />\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header>\n");
      out.write("                    <p>New \"son\" of Samsung</p>\n");
      out.write("                    <h2>Galaxy J7 Pro</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </article>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!-- One -->\n");
      out.write("    <section id=\"one\" class=\"wrapper style2\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("            <div class=\"grid-style\">\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <img src=\"images/tin1.jpg\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <header class=\"align-center\">\n");
      out.write("                                <p>Tin tức về công nghệ</p>\n");
      out.write("                                <h2>Thời của những smartphone ‘siêu cấp’</h2>\n");
      out.write("                            </header>\n");
      out.write("                            <p> Samsung khởi động với Galaxy Note 8. LG tham gia cuộc chơi với V30.\n");
      out.write("                                Apple tất nhiên không đứng ngoài, thậm chí đưa cuộc chạy đua lên tầm cao mới với iPhone X. \n");
      out.write("                                Những smartphone này đều có giá xấp xỉ 1.000 USD.\n");
      out.write("                                Google Pixel 2 XL cũng có giá 850 USD.            \n");
      out.write("                                Chào mừng đến với thời của những smartphone “siêu cấp”.</p>\n");
      out.write("                            <footer class=\"align-center\">\n");
      out.write("                                <a href=\"error_1_1.jsp\" class=\"button alt\">Read More</a>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"image fit\">\n");
      out.write("                            <img src=\"images/tin2.jpg\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <header class=\"align-center\">\n");
      out.write("                                <p>Tin tức về công nghệ</p>\n");
      out.write("                                <h2>Ảnh thực tế bộ đôi 'sát thủ iPhone' từ Google</h2>\n");
      out.write("                            </header>\n");
      out.write("                            <p> Trong nhiều năm, thiết kế của điện thoại di động trở nên giống nhau đến nhàm chán. \n");
      out.write("                                Sự xuất hiện của Pixel mang đến nét khác biệt.\n");
      out.write("                                Nó không đẹp một cách hoàn hảo như iPhone hay điện thoại Galaxy mà tập trung vào tính thực dụng.\n");
      out.write("                                Google vừa cho ra mắt thế hệ thứ 2 của sản phẩm này, mang tên Pixel 2 và Pixel 2 XL.</p>\n");
      out.write("                            <footer class=\"align-center\">\n");
      out.write("                                <a href=\"error_1_1.jsp\" class=\"button alt\">Read More</a>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Two -->\n");
      out.write("    <section id=\"two\" class=\"wrapper style3\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("            <header class=\"align-center\">\n");
      out.write("                <p>Những sản phẩm chỉ có thể là độc nhất của Nhật's mobile</p>\n");
      out.write("                <h2>Professional</h2>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Three -->\n");
      out.write("    <section id=\"three\" class=\"wrapper style2\">\n");
      out.write("        <div class=\"inner\">\n");
      out.write("            <header class=\"align-center\">\n");
      out.write("                <p class=\"special\">Products</p>\n");
      out.write("                <p class=\"special\">Lưu ý: Đăng nhập vào để Add To Cart</p>\n");
      out.write("                <h2>Products of Nhật's Mobile</h2>\n");
      out.write("            </header>\n");
      out.write("            </div>\n");
      out.write("    </section>\n");
      out.write("            <table>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Code</td>\n");
      out.write("            <td> </td> \n");
      out.write("            <td>Name</td>\n");
      out.write("            <td>Price</td>\n");
      out.write("            <td> </td>\n");
      out.write("            <td> </td>\n");
      out.write("        </tr>\n");
      out.write("         ");

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

        
      out.write("\n");
      out.write("            </table>\n");
      out.write("   \n");
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
