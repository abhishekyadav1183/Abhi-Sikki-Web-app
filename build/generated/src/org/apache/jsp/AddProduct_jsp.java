package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>product Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"angular/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jquery/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            #amg{float: left;}\n");
      out.write("            #second{\n");
      out.write("               \n");
      out.write("            padding:0 20px 10px 20px;\n");
      out.write("               margin-top:4.3%; \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:#777\"  ng-app=\"mymod\" >\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("<div class=\"container-fluid\" >\n");
      out.write("<div class=\"navbar-header\"><a class=\"navbar-brand active\" href=\"#\">Admin</a></div>\n");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav\" >\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Add Product</a></li>\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\">Add Category</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal2\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Enter Category Details</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form id=\"categor\" action=\"AddCates\" mehtod=\"post\" >\n");
      out.write("                <p id=\"done\" class=\"btn btn-block\" style=\"background:#254747;color:#ffffff\"></p>\n");
      out.write("                \n");
      out.write("            <br><input type=\"text\" class=\"form-control\" placeholder=\"Enter Category Id\" name=\"catid\">\n");
      out.write("        <br><input type=\"text\" class=\"form-control\" placeholder=\"Enter Category Name\" name=\"catname\">\n");
      out.write("        <span id=\"exist\" style=\"color:#ff0000\"></span>\n");
      out.write("        <br><input type=\"submit\" class=\"btn btn-block btn-lg btn-primary\" value=\"submit\">\n");
      out.write("        </form> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        <div id=\"second\" class=\"container thumbnail\" ng-controller=\"myctl\" > \n");
      out.write("       \n");
      out.write("            <h2 class=\"col-md-12\">products</h2>\n");
      out.write("       <table class=\"table table-bordered table-hover\" >\n");
      out.write("           <thead> <tr>\n");
      out.write("                <th class=\"col-md-2\">P-Image</th>\n");
      out.write("                <th>P-Image-Name</th>\n");
      out.write("                <th>P-ID</th>\n");
      out.write("                <th>P-Name</th>\n");
      out.write("                <th>P-Price</th>\n");
      out.write("                <th>P-Date</th>\n");
      out.write("                <th>P-Supplier</th>\n");
      out.write("                <th>P-Description</th>\n");
      out.write("                <th>CatID</th>\n");
      out.write("                <th colspan=\"2\" class=\"col-md-1\">Action</th>\n");
      out.write("               </tr></thead>\n");
      out.write("            <tr ng-repeat=\"x in person\">\n");
      out.write("                <td><img src=\"data:image/png;base64,{{x.p_photo}}\" width=\"20%\"></td>\n");
      out.write("                <td>{{x.p_imagename}}</td>\n");
      out.write("                <td>{{x.p_id}}</td>\n");
      out.write("                <td>{{x.p_name}}</td>\n");
      out.write("                <td>{{x.p_price|currency:'$'}}</td>\n");
      out.write("                <td>{{x.p_date}}</td>\n");
      out.write("                <td>{{x.p_supplier}}</td>\n");
      out.write("                <td>{{x.p_description}}</td>\n");
      out.write("                <td>{{x.catid}}</td>\n");
      out.write("               <td><a class=\"btn btn-danger btn-sm\" href=\"deletep?action=delete&p_id={{x.p_id}}\"><span class=\"glyphicon glyphicon-trash\">Delete</span></a></td>\n");
      out.write("            <td><a class=\"btn btn-success btn-sm\" href=\"deletep?action=update&p_id={{x.p_id}}\"><span class=\"glyphicon glyphicon-pencil\">Update</span></a></td>\n");
      out.write("           \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container thumbnail\" ng-controller=\"myctl2\">\n");
      out.write("  \n");
      out.write("                    <div  class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Enter Product Details</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("             <form action=\"AddProduct\" mehtod=\"post\">\n");
      out.write("        <div class=\"form-inline\">\n");
      out.write("            <input class=\"btn btn-default col-md-5\" type=\"file\" name=\"pimage\" accept=\"image/gif,image/png,image/jpg\" value=\"upload image\" >\n");
      out.write("        <input class=\"form-control\" type=\"text\" name=\"product\" placeholder=\"Enter Image name\" id=\"amg\">\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><input type=\"text\" class=\"form-control\" placeholder=\"Enter product Name\" name=\"product\">\n");
      out.write("        <br><input type=\"text\" class=\"form-control\" placeholder=\"Enter product Price in Rupees\" name=\"product\">\n");
      out.write("        \n");
      out.write("        <br><label>Select Category Name</label><select class=\"form-control\" name=\"product\">\n");
      out.write("            <option ng-repeat=\"y in cate\">{{y.cat_name}}</option>\n");
      out.write("        </select>\n");
      out.write("      \n");
      out.write("        <br><input type=\"text\" class=\"form-control\" placeholder=\"Enter supplier\" name=\"product\">\n");
      out.write("        <br><textarea rows=\"3\"  class=\"form-control\" placeholder=\"Enter product description\" name=\"product\"></textarea>\n");
      out.write("        <br><input type=\"submit\" class=\"btn btn-block btn-lg btn-info\" name value=\"submit\">\n");
      out.write("        </form>  \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h2 class=\"col-md-12\">Categories</h2>\n");
      out.write("       \n");
      out.write("            <table  class=\"table table-bordered table-hover\">\n");
      out.write("           <thead> <tr>\n");
      out.write("                <th>Cate-ID</th>\n");
      out.write("                <th>Cate-Name</th>\n");
      out.write("                <th>Cate-Date</th>\n");
      out.write("                <th colspan=\"2\" class=\"col-md-1\">Action</th>\n");
      out.write("               </tr></thead>\n");
      out.write("            <tr ng-repeat=\"x in cate\">\n");
      out.write("                <td>{{x.cat_id}}</td>\n");
      out.write("                <td>{{x.cat_name}}</td>\n");
      out.write("                <td>{{x.cat_date}}</td>\n");
      out.write("                 <td><a class=\"btn btn-danger btn-sm\" href=\"deletec?action=delete&p_id={{x.cat_id}}\"><span class=\"glyphicon glyphicon-trash\">Delete</span></a></td>\n");
      out.write("            <td><a class=\"btn btn-success btn-sm\" href=\"deletec?action=update&p_id={{x.cat_id}}\"><span class=\"glyphicon glyphicon-pencil\">Update</span></a></td>\n");
      out.write("           \n");
      out.write("            </tr>\n");
      out.write("       \n");
      out.write("       </table>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <h2>{{cate}}</h2>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!--        <script>\n");
      out.write("   var app=angular.module(\"mymod\",[]);\n");
      out.write("    app.controller('myctl', function($scope){\n");
      out.write("       $scope.res=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("; \n");
      out.write("    });     \n");
      out.write("    \n");
      out.write("     </script> -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("         var app=angular.module(\"mymod\",[]);\n");
      out.write("            app.controller(\"myctl\",function($scope,$http){\n");
      out.write("               var url=\"showphotu\";\n");
      out.write("               $http.get(url).then(function(data){\n");
      out.write("                   $scope.person=data.data;\n");
      out.write("               });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            app.controller(\"myctl2\",function($scope,$http){\n");
      out.write("               var url=\"showcate\";\n");
      out.write("               $http.get(url).then(function(data){\n");
      out.write("                   $scope.cate=data.data;\n");
      out.write("               });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#done\").hide();\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var form = $('#categor');\n");
      out.write(" form.submit(function () {\n");
      out.write("\n");
      out.write(" $.ajax({\n");
      out.write(" type: form.attr('method'),\n");
      out.write(" url: form.attr('action'),\n");
      out.write(" data: form.serialize(),\n");
      out.write(" success: function (data) {\n");
      out.write(" var result=data; \n");
      out.write("\n");
      out.write("   \n");
      out.write("if(result.indexOf(\"exist\")> -1){\n");
      out.write(" $(\"#exist\").html(\"Category already Exist\");   \n");
      out.write("}\n");
      out.write("if(result.indexOf(\"done\")> -1){\n");
      out.write("        $(\"#done\").show();\n");
      out.write("            $(\"#done\").html(\"Data inserted\");\n");
      out.write("    \n");
      out.write("}\n");
      out.write(" }\n");
      out.write(" });\n");
      out.write(" return false;\n");
      out.write(" });\n");
      out.write(" \n");
      out.write("    </script>    \n");
      out.write(" \n");
      out.write("    \n");
      out.write("    <!--    <script>\n");
      out.write("// var form = $('#shu');\n");
      out.write("// form.submit(function () {\n");
      out.write("//\n");
      out.write("// $.ajax({\n");
      out.write("// type: form.attr('method'),\n");
      out.write("// url: form.attr('action'),\n");
      out.write("// data: form.serialize(),\n");
      out.write("// success: function (data) {\n");
      out.write("// var result=data; \n");
      out.write("//\n");
      out.write("//$('#bk').html(result);\n");
      out.write("// \n");
      out.write("//     var tr;\n");
      out.write("//        for (var i = 0; i < result.length; i++) {\n");
      out.write("//            tr = $('<tr/>');\n");
      out.write("//            \n");
      out.write("//            tr.append(\"<td>\" + result[i].p_photo + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_imagename + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_price + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_date + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_supplier + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_description + \"</td>\");\n");
      out.write("//            tr.append(\"<td>\" + result[i].p_catid + \"</td>\");\n");
      out.write("//           \n");
      out.write("//            $('table').append(tr);\n");
      out.write("//    }     \n");
      out.write("// }\n");
      out.write("// });\n");
      out.write("// return false;\n");
      out.write("// }); \n");
      out.write("\n");
      out.write("\n");
      out.write("       </script>-->\n");
      out.write("        </body>\n");
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
