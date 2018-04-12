package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Edit Products</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/toh.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <div class=\"logo\"><a href=\"welcome.jsp\">Nhat's <span>Mobile</span></a></div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("         <section id=\"One\" class=\"wrapper style3\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header class=\"align-center\">\n");
      out.write("                    <p>Nhat's Mobile</p>\n");
      out.write("                    <h2>Edit Product</h2>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <section id=\"two\" class=\"wrapper style2\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\" align=\"center\">\n");
      out.write("                        <header style=\"text-align: center;width: 400px;\">\n");
      out.write("            <h1>Edit Products</h1>\n");
      out.write("            <form action=\"ControllerProducts\">\n");
      out.write("                Code : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<input type=\"hidden\" name=\"txtCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br>\n");
      out.write("                Name : <input type=\"text\" name=\"txtName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br>\n");
      out.write("                Price : <input type=\"text\" name=\"txtPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><br>\n");
      out.write("                Image <input type=\"file\" name=\"txtHinh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Update\"/>\n");
      out.write("            </form>\n");
      out.write("                   </header>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
