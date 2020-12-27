package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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

String userid=request.getParameter("usr");
session.setAttribute("usr",userid);
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
Statement st= con.createStatement();
ResultSet rs=st.executeQuery("select * from users where userid='"+userid+"' and password='"+password+"'");
try{
    if(rs.next()) {
        if(rs.getString("password").equals("prince123")&&rs.getString("userid").equals("prince"))
        {

      out.write("            \n");
      out.write("            out.println(\"<head>\");\n");
      out.write("            out.println(\"\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\");\n");
      out.write("            out.println(\"\t<meta charset=\"utf-8\">\");\n");
      out.write("            out.println(\"\t<meta name=\"keywords\" content=\"Tool Sign In Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design\">\");\n");
      out.write("            out.println(\"\t<script>\");\n");
      out.write("            out.println(\"\t\taddEventListener(\"load\", function () {\");\n");
      out.write("            out.println(\"\t\t\tsetTimeout(hideURLbar, 0);\");\n");
      out.write("            out.println(\"\t\t}, false);\");\n");
      out.write("            out.println(\"\t\tfunction hideURLbar() {\");\n");
      out.write("            out.println(\"\t\t\twindow.scrollTo(0, 1);\");\n");
      out.write("            out.println(\"\t\t}\");\n");
      out.write("            out.println(\"\t</script>\");\n");
      out.write("            out.println(\"\t<link href=\"css/stylee.css\" rel='stylesheet' type='text/css' />\");\n");
      out.write("            out.println(\"\t<link href=\"//fonts.googleapis.com/css?family=Poiret+One&amp;subset=cyrillic,latin-ext\" rel=\"stylesheet\">\");\n");
      out.write("            out.println(\"</head>\");\n");
      out.write("            out.println(\"<body>\");\n");
      out.write("            out.println(\"\t<h1>Update Data</h1>\");\n");
      out.write("            out.println(\"\t<div class=\"w3ls-login box box--big\">\");\n");
      out.write("            out.println(\"\t\t<form action=\"login.jsp\" method=\"post\">\");\n");
      out.write("            out.println(\"\t\t\t\t<input type=\"submit\" value=\"SIGN IN\"><br>\");\n");
      out.write("            out.println(\"\t\t</form>\");\n");
      out.write("            out.println(\"\t\t<form action=\"login.jsp\" method=\"post\">\");\n");
      out.write("            out.println(\"\t\t\t\t<input type=\"submit\" value=\"SIGN IN\"><br>\");\n");
      out.write("            out.println(\"\t\t</form>\");\n");
      out.write("            out.println(\"\t</div>\");\n");
      out.write("            out.println(\"\t<div class=\"copy-wthree\">\");\n");
      out.write("            out.println(\"\t</div>\");\n");
      out.write("            out.println(\"</body>\");\n");
      out.write("            out.println(\"</html>\");\n");

        }
        else if(rs.getString("password").equals(password)&&rs.getString("userid").equals(userid))
        {
            out.println("Welcome " +userid);
        }
        else{
            out.println("Invalid password or username.");
        }
    }
    else{
        out.println("Null");
    }
}
catch (SQLException e) {
    out.println("Exception\n");
    out.println(e);
    e.printStackTrace();
}

      out.write(' ');
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
