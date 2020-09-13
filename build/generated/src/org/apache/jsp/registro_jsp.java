package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registro</title>    \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"elements/img/ballon.png\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0\">\n");
      out.write("        <link href=\"elements/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <header class=\"header\" >\n");
      out.write("            <div class=\"logo\" >\n");
      out.write("                <h1>Panederia el Globito</h1>\n");
      out.write("                <img src=\"elements/img/ballon.png\">      \n");
      out.write("            </div>\n");
      out.write("            <nav class=\"menu\" >\n");
      out.write("                <a href=\"index.html\">Principal</a>\n");
      out.write("                <a href=\"meetus.html\">Nosotros</a>\n");
      out.write("                <a href=\"Productos.html\">Productos</a>\n");
      out.write("                <a href=\"Contacto.html\">Contacto</a>\n");
      out.write("                <a href=\"log_in.html\"><img src=\"elements/img/User.png\" width=\"30\" title=\"Iniciar Sesión\"></a>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("            <br>\n");
      out.write("            <section id=\"form2\">\n");
      out.write("                <br>\n");
      out.write("                <article><center>\n");
      out.write("                        <h2>Formulario de Registro</h2>\n");
      out.write("                        <br>\n");
      out.write("                        <form method=\"post\" name=\"formulario\" action=\"registrarse\">\n");
      out.write("                            <label>Nombre: <br></label> <input type=\"text\" name=\"nombre\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <label>Apellido paterno:<br> </label><input type=\"text\" name=\"appt\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <label>Nombre de usuario:<br> </label><input type=\"text\" name=\"usu\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <label>Contraseña<br></label><input type=\"password\" name=\"pass\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"number\" name=\"priv\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"submit\" value=\"Registrame\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            ¿Ya tienes cuenta? inicia sesión da click <a href=\"log_in.jsp\">aquí</a>\n");
      out.write("                            </form></center></article>\n");
      out.write("                <br>\n");
      out.write("            </section>\n");
      out.write("            <br>\n");
      out.write("             <footer class=\"footer\" >\n");
      out.write("            <p>Desarrollado un batiziano más</p>\n");
      out.write("        </footer>\n");
      out.write("        </div>\n");
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
