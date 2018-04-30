package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>home page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Open+Sans+Condensed:300|Oswald\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\">  \n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js\"></script>\n");
      out.write("<style>\n");
      out.write(".grid figure {\n");
      out.write("\tposition: relative;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tbackground:#2d2e30;\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure.effect-julia img {\n");
      out.write("        height: 350px;\n");
      out.write("        -webkit-transition: opacity 1s, -webkit-transform 1s;\n");
      out.write("\ttransition: opacity 1s, transform 1s;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("figure.effect-julia:hover img {\n");
      out.write("\topacity: 0.4;\n");
      out.write("\t-webkit-transform: scale3d(1.1,1.1,1);\n");
      out.write("\ttransform: scale3d(1.1,1.1,1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grid figure figcaption {\n");
      out.write("    margin-top:300px;\n");
      out.write("        -webkit-backface-visibility: hidden;\n");
      out.write("\tbackface-visibility: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grid figure figcaption{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure.effect-julia .btn-group {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\t-webkit-transition: opacity 0.35s, -webkit-transform 0.35s;\n");
      out.write("\ttransform: translate3d(0,300px,0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure.effect-julia:hover .btn-group {\n");
      out.write("        -webkit-transform: translate3d(0,0,0);\n");
      out.write("        transform: translate3d(0,0,0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row\" ng-controller=\"oneCtrl\"ng-app=\"app\">\n");
      out.write("  \n");
      out.write("      <div  class=\"col-xs-2 col-md-4 col-sm-3\" ng-init=\"count=true\" ng-repeat=\"i in product|limitTo:30\" >\n");
      out.write("      <div >\n");
      out.write("        <a  href=\"#\" class=\"btn\" target=\"_self\">\n");
      out.write("          <div class=\"grid\">\n");
      out.write("\t<figure class=\"effect-julia\">\n");
      out.write("            <img img src=\"data:image/png;base64,{{i.p_photo}}\" alt=\"Nature\"  width=\"100%\">\n");
      out.write("          <figcaption>\n");
      out.write("            <div  class=\"btn-group\">\n");
      out.write("                <button bt1 type=\"button\" class=\"btn \" style=\"width:100px;background-color:#c4c4c4;color:#ffffff\">Buy Now</button>\n");
      out.write("                <button bt2 type=\"button\" class=\"btn \"  style=\"width:100px;background-color:#74797c;color:#ffffff\">Add to cart</button>\n");
      out.write("            </div>\n");
      out.write("          </figcaption>\n");
      out.write("        </figure>\n");
      out.write("              </div>\n");
      out.write("          <div class=\"caption\">\n");
      out.write("          <p pt style=\"margin-top:10px;width:5%;font-weight:bold; color:#60656d;font-size:20px; font-family: 'Open Sans Condensed', sans-serif;\" tooltip data-toggle=\"tooltip\"  data-placement=\"top\" title=\"{{i.p_description}}\">{{ i.p_name | limitTo: 30 }}{{i.p_name.length > 30 ? '...' : ''}}</p>\n");
      out.write("          </div> \n");
      out.write("\t\t  </a>\n");
      out.write("          <div  style=\"color:#07d1ff;font-weight:600;margin-left:5% ;font-size:18px;text-align:left;font-family: 'Roboto', sans-serif\">{{i.p_price|currency:\"₹ \":0}}</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    <br><br>\n");
      out.write("<script>\n");
      out.write("        var app=angular.module(\"app\",[]);\n");
      out.write("        app.controller(\"oneCtrl\",function($scope,$http){\n");
      out.write("               var url=\"showphotu\";\n");
      out.write("               $http.get(url).then(function(data){\n");
      out.write("                   $scope.product=data.data;\n");
      out.write("               });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        app.directive('tooltip', function(){\n");
      out.write("        return {\n");
      out.write("        restrict: 'A',\n");
      out.write("        link: function(scope, element, attrs){\n");
      out.write("            $(element).hover(function(){\n");
      out.write("                // on mouseenter\n");
      out.write("                $(element).tooltip('show');\n");
      out.write("            }, function(){\n");
      out.write("                // on mouseleave\n");
      out.write("                $(element).tooltip('hide');\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("});\n");
      out.write(" \n");
      out.write("        app.directive('pt', function(){\n");
      out.write("        return {\n");
      out.write("        restrict: 'A',\n");
      out.write("        link: function(scope, element, attrs){\n");
      out.write("            $(element).hover(function(){\n");
      out.write("                // on mouseenter\n");
      out.write("                $(element).css('color',\"#07d1ff\");\n");
      out.write("            }, function(){\n");
      out.write("                // on mouseleave\n");
      out.write("                $(element).css('color',\"#60656d\");\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("});\n");
      out.write(" \n");
      out.write(" \n");
      out.write("        app.directive('bt1', function(){\n");
      out.write("        return {\n");
      out.write("        restrict: 'A',\n");
      out.write("        link: function(scope, element, attrs){\n");
      out.write("            $(element).hover(function(){\n");
      out.write("                // on mouseenter\n");
      out.write("                $(element).css('background',\"#18ccb4\");\n");
      out.write("            }, function(){\n");
      out.write("                // on mouseleave\n");
      out.write("                $(element).css('background',\"#c4c4c4\");\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("});\n");
      out.write("   app.directive('bt2', function(){\n");
      out.write("    return {\n");
      out.write("        restrict: 'A',\n");
      out.write("        link: function(scope, element, attrs){\n");
      out.write("            $(element).hover(function(){\n");
      out.write("                // on mouseenter\n");
      out.write("                $(element).css('background',\"#014c42\");\n");
      out.write("            }, function(){\n");
      out.write("                // on mouseleave\n");
      out.write("                $(element).css('background',\"#74797c\");\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("});\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" app.directive('img', function(){\n");
      out.write("    return {\n");
      out.write("        restrict: 'A',\n");
      out.write("        link: function(scope, element, attrs){\n");
      out.write("            $(element).hover(function(){\n");
      out.write("                // on mouseenter\n");
      out.write("                $(element).css({'transform': 'scale('+ $(element).attr('data-scale') +')'});\n");
      out.write("\n");
      out.write("            }, function(){\n");
      out.write("                // on mouseleave\n");
      out.write("                $(element).animate({width: \"250px\"}, 'slow');\n");
      out.write("\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("           \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
