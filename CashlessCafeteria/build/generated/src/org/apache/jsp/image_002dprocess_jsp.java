package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.xml.internal.bind.CycleRecoverable.Context;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.util.*;

public final class image_002dprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert an Image into MySQL Database</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        String url="jdbc:mysql://localhost:3306/student";
        FileInputStream fis=null;
        String u_foodnm=request.getParameter("foodnm");
        String u_imgloc=request.getParameter("foodnm");
        out.println(u_foodnm);
        out.println(u_imgloc);
        String u_pri=request.getParameter("pri");
        String u_disc=request.getParameter("disc");
        String u_desp=request.getParameter("desp");
        //out.print("First Name :"+fname+"myloc="+myloc);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, "root", "");
            File u_image= new File("C:/Users/princ/Desktop/SE/CashlessCafeteria/web/images/"+u_imgloc+".jpg");
            pstmt = conn.prepareStatement("insert into admin(foodname, image, price, discount, description) " + "values(?,?,?,?,?)");
            pstmt.setString(1, u_foodnm);
            pstmt.setString(3, u_pri);
            pstmt.setString(4, u_disc);
            pstmt.setString(5, u_desp);
            fis=new FileInputStream(u_image);
            pstmt.setBinaryStream(2, (InputStream) fis, (int) (u_image.length()));
            int count = pstmt.executeUpdate();
            if(count>0)
            {

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("\t<div class=\"w3ls-login box box--big\">\n");
      out.write("\t\t<!-- form starts here -->\n");
      out.write("\t\t<form action=\"update.html\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"agile-field-txt\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"agile-field-txt\">\n");
      out.write("\t\t\t\t<div class=\"agile_label\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"agile-right\">\n");
      out.write("\t\t\t\t\t<h1> For Add Item</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <input type=\"submit\" value=\"Add\"><br><br><br><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- script for show password -->\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<!-- //end script -->\n");
      out.write("\t\t\t\t\n");
      out.write("                                \n");
      out.write("\t\t</form>\n");
      out.write("                <form action=\"indexhtml.jsp\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"agile-field-txt\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"agile-field-txt\">\n");
      out.write("\t\t\t\t<div class=\"agile_label\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"agile-right\">\n");
      out.write("\t\t\t\t\t<h1>For Delete Item</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <input type=\"submit\" value=\"Delete\"><br><br><br><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- script for show password -->\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<!-- //end script -->\n");
      out.write("\t\t\t\t\n");
      out.write("                                \n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"copy-wthree\">\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");

                //out.println("insert successfully");
            }
            else
            {
                out.println("not successfully");
            }
        }
        catch(Exception ex)
        {
            out.println(ex);
            ex.printStackTrace();
        }
        finally{
            try{
                    if(rs!=null){
                    rs.close();
                    rs= null;
                }
                if(pstmt !=null)
                {
                    pstmt.close();
                    pstmt=null;
                }
                if(conn!=null)
                {
                    conn.close();
                    conn=null;
                }
            }
            catch(Exception e)
            {
                out.println("10111000");
                out.println(e);
                out.println("999999");
                e.printStackTrace();
            }
        }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
