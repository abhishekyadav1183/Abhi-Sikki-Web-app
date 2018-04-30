package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DB;
import com.mongodb.MongoClient;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 
//String uname=request.getParameter("username");    
//String email=request.getParameter("email");    
//String pass=request.getParameter("password");    
//MongoClient mc=new MongoClient("localhost");
//DB db=mc.getDB("ABHI");
//DBCollection table=db.getCollection("Login");
//
//if(uname!=null && email!=null && pass!=null){
//BasicDBObject bo=new BasicDBObject();
//bo.put("USERNAME", uname);
//bo.put("EMAIL", email);
//bo.put("PASSWORD", pass);
//table.insert(bo);
// }
//
// DBObject d;
//
//    DBCursor c=table.find();
//   while(c.hasNext()){
// d=c.next();
//
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"angular/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-latest.js\"></script>          \n");
      out.write("        \n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("    .container{\n");
      out.write("        \n");
      out.write("        margin-top:10%;\n");
      out.write("    }\n");
      out.write(".panel-login {\n");
      out.write("   border: none;\n");
      out.write("  -webkit-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);\n");
      out.write("  -moz-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);\n");
      out.write("  box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write(".panel-login>.panel-heading .tabs{\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-login>.panel-heading {\n");
      out.write("  color: #848c9d;\n");
      out.write("  background-color: #e8e9ec;\n");
      out.write("  border-color: #fff;\n");
      out.write("  text-align:center;\n");
      out.write("  border-bottom-left-radius: 5px;\n");
      out.write("  border-bottom-right-radius: 5px;\n");
      out.write("  border-top-left-radius: 0px;\n");
      out.write("  border-top-right-radius: 0px;\n");
      out.write("  border-bottom: 0px;\n");
      out.write("  padding: 0px 15px;\n");
      out.write("}\n");
      out.write(".panel-login>.panel-heading .login {\n");
      out.write("  padding: 20px 30px;\n");
      out.write("  border-bottom-leftt-radius: 5px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".panel-login>.panel-heading .register {\n");
      out.write("  padding: 20px 30px;\n");
      out.write("  background: #2d3b55;\n");
      out.write("  border-bottom-right-radius: 5px;\n");
      out.write("color:white;\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".panel-login>.panel-heading a{\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #666;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 16px;\n");
      out.write("  -webkit-transition: all 0.1s linear;\n");
      out.write("  -moz-transition: all 0.1s linear;\n");
      out.write("  transition: all 0.1s linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#checkbox1{\n");
      out.write("margin-left:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-login input:hover,\n");
      out.write(".panel-login input:focus {\n");
      out.write("  outline:none;\n");
      out.write("  -webkit-box-shadow: none;\n");
      out.write("  -moz-box-shadow: none;\n");
      out.write("  box-shadow: none;\n");
      out.write("  border-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn-login {\n");
      out.write("  background-color: #E8E9EC;\n");
      out.write("  outline: none;\n");
      out.write("  color: #2D3B55;\n");
      out.write("  font-size: 14px;\n");
      out.write("  height: auto;\n");
      out.write("  font-weight: normal;\n");
      out.write("  padding: 14px 0;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 0px;\n");
      out.write("  box-shadow: none;\n");
      out.write("}\n");
      out.write(".btn-login:hover,\n");
      out.write(".btn-login:focus {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #2D3B55;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-register {\n");
      out.write("  background-color: #E8E9EC;\n");
      out.write("  outline: none;\n");
      out.write("  color: #2D3B55;\n");
      out.write("  font-size: 14px;\n");
      out.write("  height: auto;\n");
      out.write("  font-weight: normal;\n");
      out.write("  padding: 14px 0;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 0px;\n");
      out.write("  box-shadow: none;\n");
      out.write("}\n");
      out.write(".btn-register:hover,\n");
      out.write(".btn-register:focus {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: #2D3B55;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body ng-app=\"\">\n");
      out.write("<div class=\"container\">\n");
      out.write("   <div class=\"row\">\n");
      out.write("    <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("      <div class=\"panel panel-login\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              <form id=\"login-form\" action=\"login1\" method=\"post\" >\n");
      out.write("                  \n");
      out.write("                  <h2>LOGIN</h2>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" name=\"email\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Enter your Email\" value=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                  </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("                              <span style=\"color:red\" id=\"content\"></span>\n");
      out.write("                  <div class=\"col-xs-6 form-group pull-left checkbox\">\n");
      out.write("                    <input id=\"checkbox1\" type=\"checkbox\" name=\"remember\">\n");
      out.write("                    <label for=\"checkbox1\">Remember Me</label>   \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-6 form-group pull-right\">     \n");
      out.write("                        <input type=\"submit\" name=\"login-submit\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn btn-login\" value=\"Log In\">\n");
      out.write("                  </div>\n");
      out.write("              </form>\n");
      out.write("              <form id=\"register-form\" action=\"AddClient\" method=\"post\" role=\"form\" style=\"display: none;\">\n");
      out.write("                <h2>REGISTER</h2>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"username\" ng-model=\"p0\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" name=\"email\" ng-model=\"p01\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email Address\" value=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" ng-model=\"p1\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" ng-model=\"p2\" name=\"confirm-password\" id=\"confirm-password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Confirm Password\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                        <input type=\"submit\" ng-disabled=\"p0==null||p01==null||p1==null||p2==null ||p1!=p2\" name=\"register-submit\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn btn-register\" value=\"Register Now\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-6 tabs\">\n");
      out.write("              <a href=\"#\" class=\"active\" id=\"login-form-link\"><div class=\"login\">LOGIN</div></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 tabs\">\n");
      out.write("              <a href=\"#\" id=\"register-form-link\"><div class=\"register\">REGISTER</div></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    $(function() {\n");
      out.write("\n");
      out.write("    $('#login-form-link').click(function(e) {\n");
      out.write("\t\t$(\"#login-form\").delay(100).fadeIn(\"slow\");\n");
      out.write(" \t\t$(\"#register-form\").fadeOut(100);\n");
      out.write("\t\t$('#register-form-link').removeClass('active');\n");
      out.write("\t\t$(this).addClass('active');\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t});\n");
      out.write("\t$('#register-form-link').click(function(e) {\n");
      out.write("\t\t$(\"#register-form\").delay(100).fadeIn(\"slow\");\n");
      out.write(" \t\t$(\"#login-form\").fadeOut(100);\n");
      out.write("\t\t$('#login-form-link').removeClass('active');\n");
      out.write("\t\t$(this).addClass('active');\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("   var form = $('#login-form');\n");
      out.write(" form.submit(function () {\n");
      out.write("\n");
      out.write(" $.ajax({\n");
      out.write(" type: form.attr('method'),\n");
      out.write(" url: form.attr('action'),\n");
      out.write(" data: form.serialize(),\n");
      out.write(" success: function (data) {\n");
      out.write(" var result=data;\n");
      out.write(" \n");
      out.write("     if(result.indexOf(\"user\")> -1)  { \n");
      out.write("        \n");
      out.write("       location.href=\"nav.jsp\"; \n");
      out.write("        }\n");
      out.write("       else if(result.indexOf(\"admin\")>-1){\n");
      out.write("        location.href=\"AddProduct.jsp\";  \n");
      out.write("        }\n");
      out.write("     else{\n");
      out.write("         $('#content').html(\"invalid username or password\");\n");
      out.write("        }\n");
      out.write("       }\n");
      out.write(" });\n");
      out.write(" return false;\n");
      out.write(" }); \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  </script>\n");
      out.write("   \n");
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
