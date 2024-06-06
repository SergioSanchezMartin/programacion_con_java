/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-23 18:08:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modules.ConexionDB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("  <head>\n");
      out.write("    <title>VIDEOTECA</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <style>\n");
      out.write("      p { text-align: justify ; }\n");
      out.write("    </style>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\" />\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <h1>Videoteca</h1>\n");
      out.write("\n");
      out.write("    <menu>\n");
      out.write("      <a href=\"nueva.jsp\">Añadir película</a>\n");
      out.write("    </menu>\n");
      out.write("    \n");
      out.write("    <table class=\"table\">\n");
      out.write("      <thead class=\"table-dark\">\n");
      out.write("        <tr>\n");
      out.write("          <th>título</th>\n");
      out.write("          <th>director</th>\n");
      out.write("          <th>año</th>\n");
      out.write("          <th></th>\n");
      out.write("          <th></th>\n");
      out.write("          <th></th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("        ");

          Connection conexion = ConexionDB.getConexion("videoteca");
          Statement consulta = conexion.createStatement();

          //lanzamos la consulta
          String sql = "SELECT * FROM pelicula ORDER BY anio DESC ;";
          ResultSet resultado = consulta.executeQuery(sql);

          while(resultado.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td> ");
      out.print( resultado.getString("titulo") );
      out.write(" </td>\n");
      out.write("          <td> ");
      out.print( resultado.getString("director") );
      out.write(" </td>\n");
      out.write("          <td> ");
      out.print( resultado.getString("anio").substring(0,4) );
      out.write(" </td>\n");
      out.write("          <td><a href=\"info.jsp?id=");
      out.print( resultado.getString("idPel") );
      out.write("\">info</a></td>\n");
      out.write("          <td><a href=\"editar.jsp?id=");
      out.print( resultado.getString("idPel") );
      out.write("\">editar</a></td>\n");
      out.write("          <td><a href=\"borrar.jsp?id=");
      out.print( resultado.getString("idPel") );
      out.write("\">borrar</a></td>\n");
      out.write("        </tr>\n");
      out.write("          \n");
      out.write("        ");
  
          } //fin del while

          //Cerramos conexion con BBDD
          conexion.close();
         
      out.write("\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}