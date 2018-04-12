package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Sign in</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"subpage\">\n");
      out.write("\n");
      out.write("        <!-- Header -->\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <div class=\"logo\"><a href=\"index.jsp\">Nhat's <span>Mobile</span></a></div>\n");
      out.write("<a href=\"#menu\">  Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- One -->\n");
      out.write("        <section id=\"One\" class=\"wrapper style3\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <header class=\"align-center\">\n");
      out.write("                    <p>Nhat's Mobile</p>\n");
      out.write("                    <h2>Error</h2>\n");
      out.write("                    \n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </section>\n");
      out.write("                <nav id=\"menu\">\n");
      out.write("        <ul class=\"links\">\n");
      out.write("            <li><a href=\"welcome.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"products.jsp\">Products</a></li>\n");
      out.write("            <li><a href=\"customers.jsp\">Customers</a></li>\n");
      out.write("            <li><a href=\"index.jsp\">Log out</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("        <!-- Two -->\n");
      out.write("        <section id=\"two\" class=\"wrapper style2\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"content\" align=\"center\">\n");
      out.write("                        <header style=\"text-align: center;width: 400px;\">\n");
      out.write("                            <image style=\"height: 300px;width: 300px\" src=\"images/1.gif\" /><br/>\n");
      out.write("                            <b><span> Trang đang được bảo trì mời các bạn về lại trang chủ </span></b><br/>\n");
      out.write("                            <footer class=\"align-center\">\n");
      out.write("                                <a href=\"error_1.jsp\" class=\"button alt\">Trang chủ</a>\n");
      out.write("                            </footer>\n");
      out.write("                        </header>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
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
