/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2020-01-12 10:09:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.meng.phomein;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dailyking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(18);
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1551882067000L));
    _jspx_dependants.put("/WEB-INF/jsp/meng/include/enggnb.jsp", Long.valueOf(1578756109000L));
    _jspx_dependants.put("/WEB-INF/tlds/function.tld", Long.valueOf(1551597161000L));
    _jspx_dependants.put("/WEB-INF/jsp/meng/include/engfooter.jsp", Long.valueOf(1558589655000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/jsp/meng/include/head.jspf", Long.valueOf(1558589656000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/jsp/meng/include/engheader.jsp", Long.valueOf(1558589656000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-modules-validation-0.9.jar!/META-INF/spring-commons-validator.tld", Long.valueOf(1204779052000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/declare.jspf", Long.valueOf(1558589614000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-modules-validation-0.9.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/jsp/meng/include/englnb.jsp", Long.valueOf(1578756110000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

        pageContext.setAttribute("crlf", "\r\n");
        pageContext.setAttribute("lf", "\n");
        pageContext.setAttribute("cr", "\r");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\n");
      out.write("<meta name=\"keywords\" content=\"\">\n");
      out.write("<title>포메인</title>\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/font.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/common.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/layout.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/content.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/jquery.fullpage.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/meng/common/css/main.css\">\r\n");
      out.write("<script src=\"/meng/common/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"../common/js/placeholders.min.js\"></script>\r\n");
      out.write("\t<script src=\"../common/js/html5shiv.js\"></script>\r\n");
      out.write("<![endif]-->");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- wrap -->\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\t<!-- skip nav -->\n");
      out.write("\t<div id=\"skip_nav\">\n");
      out.write("        <a href=\"#content\">본문 바로가기</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- //skip nav -->\n");
      out.write("\t<!-- header -->\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<header id=\"header\">\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\t<a href=\"/meng/main/main.do\"><span class=\"blind\">PHOMEIN</span></a>\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div class=\"allmenu\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn_allmenu\"><span class=\"blind\">All Menu</span></button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- //header -->\n");
      out.write("\n");
      out.write("\t<!-- gnb -->\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<div id=\"gnb\">\n");
      out.write("\t\t<div class=\"gnb_head\">\n");
      out.write("\t\t\t<div class=\"lang\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"/mbrand/main/main.do\" target=\"_self\">BRAND</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/mcompany/main/main.do\" target=\"_self\">FRANCHISE</a></li>\n");
      out.write("<!-- \t\t\t\t\t<li class=\"on\"><a href=\"/meng/main/main.do\">ENG</a></li> -->\n");
      out.write("\t\t\t\t\t<li><a href=\"/mjpn/main/main.do\" target=\"_self\">JPN</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"gnb_container\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<nav class=\"gnb_menu\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"on\"><!-- 현재 뎁스 표시 : class=\"on\" -->\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">Phomein</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/dailyking.do\">DAILYKING</a></li><!-- 현재 뎁스 표시 : class=\"on\" -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/about.do\">About Phomein</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 20190426 메뉴 추가 s -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/ceo.do\">CEO</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/greenfood.do\">Relief Phomein</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/phoseason.do\">PHO SEASON</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- //20190426 메뉴 추가 e -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">MENU</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"ea1 gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/menu/menu_list.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/menu/red_menu_list.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">STORE</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"ea1 gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/store/store_list.do\">STORE</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">COMMUNITY</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/community/cs_terms.do\">CS Center</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/community/cs_info.do\">CS Center</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">FRANCHISE</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/franchisee/interior.do\">INTERIOR</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/franchisee/terms.do\">Counseling Request</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/franchisee/info.do\">Counseling Request</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<button type=\"button\" class=\"btn_close\">\n");
      out.write("\t\t\t<span class=\"blind\">Close</span>\n");
      out.write("\t\t</button>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\tvar url = $(location).attr(\"pathname\");\n");
      out.write("\t\t$('.gnb_menu ul li').removeClass(\"on\"); // depth01 all active remove\n");
      out.write("\t\t$('.gnbs li').removeClass(\"on\"); // depth02 all active remove\n");
      out.write("\n");
      out.write("\t\t$('.gnbs li a').each(function(index) {\n");
      out.write("\t\t\tif($(this).attr(\"href\") == url){\n");
      out.write("\t\t\t\tvar $text = $(this).text();\n");
      out.write("\t\t\t\t$(this).closest('.gnbs').find(\"li a\").each(function(){\n");
      out.write("\t\t\t\t\tif($text== $(this).text()) {\n");
      out.write("\t\t\t\t\t\t$(this).parent(\"li\").attr(\"class\", \"on\"); // depth02 active\n");
      out.write("\t\t\t\t\t\t$(this).closest('.gnbs').parent(\"li\").attr(\"class\", \"on\"); // depth01 active\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<!-- //gnb -->\n");
      out.write("\t<!-- container -->\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<!-- sub visual -->\n");
      out.write("\t\t<div class=\"sub_visual sv1\">\n");
      out.write("\t\t\t<h3>DAILYKING</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- 상단비쥬얼 영역\n");
      out.write("\t\t\tPHOMEIN   : class=\"sub_visual sv1\"\n");
      out.write("\t\t\tMENU\t  : class=\"sub_visual sv2\"\n");
      out.write("\t\t\tSTORE \t  : class=\"sub_visual sv3\"\n");
      out.write("\t\t\tCOMMUNITY : class=\"sub_visual sv4\"\n");
      out.write("\t\t\tFRANCHISE : class=\"sub_visual sv5\"\n");
      out.write("\t\t-->\n");
      out.write("\t\t<!-- //sub visual -->\n");
      out.write("\t\t<!-- lnb -->\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t<div class=\"lnb\">\n");
      out.write("\t\t<div class=\"dep dep1\">\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"nav-title\"></a>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li id=\"PHOMEIN\"><a href=\"/meng/phomein/dailyking.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li id=\"MENU\"><a href=\"/meng/menu/menu_list.do\">MENU</a></li>\n");
      out.write("\t\t\t\t<li id=\"STORE\"><a href=\"/meng/store/store_list.do\">STORE</a></li>\n");
      out.write("\t\t\t\t<li id=\"COMMUNITY\"><a href=\"/meng/community/sns/community_list.do\">COMMUNITY</a></li>\n");
      out.write("\t\t\t\t<li id=\"FRANCHISE\"><a href=\"/meng/franchisee/interior.do\">FRANCHISE</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">PHOMEIN</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">PHOMEIN</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/dailyking.do\">DAILYKING</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/about.do\">About Phomein</a></li>\n");
      out.write("\t\t\t\t<!-- 20190426 메뉴 추가 s -->\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/ceo.do\">CEO</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/greenfood.do\">Relief Phomein</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/phoseason.do\">PHO SEASON</a></li>\n");
      out.write("\t\t\t\t<!-- //20190426 메뉴 추가 e -->\n");
      out.write("\t\t\t\t<li><a href=\"/meng/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">MENU</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">MENU</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/meng/menu/menu_list.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/menu/red_menu_list.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/menu/menu_view.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/menu/red_menu_view.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">STORE</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">STORE</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/meng/store/store_list.do\">STORE</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">COMMUNITY</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">COMMUNITY</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/meng/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/community/cs_terms.do\">CS Center</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/community/cs_info.do\">CS Center</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">FRANCHISE</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">FRANCHISE</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/meng/franchisee/interior.do\">INTERIOR</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/meng/franchisee/terms.do\">Counseling Request</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/meng/franchisee/info.do\">Counseling Request</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\tvar url = $(location).attr(\"pathname\");\n");
      out.write("\t\t$(\".dep2 ul li a\").each(function(index) {\n");
      out.write("\t\t\tif($(this).attr(\"href\") == url){\n");
      out.write("\t\t\t\t$(this).parent(\"li\").attr(\"class\", \"actived\"); // depth02 active\n");
      out.write("\t\t\t\t$(this).closest(\".dep2\").show(); // depth02 show\n");
      out.write("\t\t\t\tvar aId = $(this).closest(\".dep2\").children('a').text();\n");
      out.write("\t\t\t\t$(\"#\"+aId).attr(\"class\", \"actived\"); // depth01 active\n");
      out.write("\t\t\t\t$(\".dep1\").children('a').text(aId); // depth01 text\n");
      out.write("\t\t\t\t$(this).closest(\".dep2\").children('a').text($(this).text()); // depth02 text\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t\t<!-- //lnb -->\n");
      out.write("\t\t<!-- content -->\n");
      out.write("\t\t<div id=\"content\" class=\"phomein\">\n");
      out.write("\t\t\t<div class=\"dailyking\">\n");
      out.write("\t\t\t\t<div class=\"tit_area\">\n");
      out.write("\t\t\t\t\t<h4><span class=\"blind\">DAILYKING INC.</span></h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"intro\">\n");
      out.write("\t\t\t\t\t<p class=\"txt1\">\n");
      out.write("\t\t\t\t\t\tFounded in 2006, DAILYKING INC. is an incorporated enterprise which settled the rice noodle\n");
      out.write("\t\t\t\t\t\tfranchise brand 'Phomein’ in Korea and popularized the dining culture of Vietnamese cuisine.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\">\n");
      out.write("\t\t\t\t\t\tUnder the motto of 'Safe Food Ingredients and Honest Food', DAILYKING INC. has signed\n");
      out.write("\t\t\t\t\t\ta business agreement with 'Hyundai Green Food', supplying safe and fresh food ingredients to each franchise stores.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\">\n");
      out.write("\t\t\t\t\t\tAlso DAILYKING INC. has established ‘PHO SEASON’ which is a rice noodle manufacturing factory in Vietnam in 2015. DAILYKING INC., the inventor of PHO SEASON, has invested 2,000,000 USD for a new machine and technology to produce ‘Fresh Rice Noodles’. In consideration of continuous improvement, we succeeded in producing rice noodles made of clear and transparent fresh rice harvested in Mekong Delta, Vietnam. And we also produce herb-bags for meat broth using 9 kinds of high quality natural spices.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\" style=\"color:#333;\">\n");
      out.write("\t\t\t\t\t\tSuccessful development of Fresh Rice Noodle is the fulfillment of customer promises as well as brand power.<br>\n");
      out.write("\t\t\t\t\t\t- Does not contain unnecessary chemical additives other than fresh rice and water.<br>\n");
      out.write("\t\t\t\t\t\t- Does not have the particular odor of imported rice noodles mixed with old rice, starch, and flour.<br>\n");
      out.write("\t\t\t\t\t\t- Provides the fragrance of freshly cooked new rice, clear and transparent color, and chewy food texture.\n");
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\">\n");
      out.write("\t\t\t\t\t\tThe domestic rice noodle market relies on imported rice noodles mixed with old rice, starch, and flour. However, the concept shift of making rice noodles only with fresh rice and purified water may have seemed reckless to some people or as an unnecessary path of suffering.<br>\n");
      out.write("\t\t\t\t\t\tIt seems impossible to change what is already there, until you decide to take the first step.\n");
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\">\n");
      out.write("\t\t\t\t\t\tFor DAILYKING INC., however, the establishment of ‘PHO SEASON’ and the production of ‘Fresh Rice Noodle’ were part of a heartfelt journey towards customers to provide ‘safe and honest food‘ as a leader in the rice noodle market.\n");
      out.write("\t\t\t\t\t\tYou can find Phomein’s ‘Fresh Rice Noodle’, the result of years of challenge, only at Phomein.\n");
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p class=\"txt2\">\n");
      out.write("\t\t\t\t\t\tWe will lead changes at the center of the rice noodle market without losing the essence of principle\n");
      out.write("\t\t\t\t\t\tand honesty so that changes and challenges starting from Phomein.\n");
      out.write("\t\t\t\t\t\tWe will become a new standard not only in Korea but also in the global rice noodle market.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<div class=\"con\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>味</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t<em>Diverse tastes</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <p>Pleasure of various selections<br>depending on mood and preference</p> -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>樂</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t<em>Pleasure</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <p>It could be enjoyed by everyone regardless<br>of sex or age without burdens</p> -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>新</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t<em>Newness</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <p>It always researches and challenges for<br>the newness with no fear</p> -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write(" \t\t</div>\n");
      out.write("\t\t<!-- //content -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //container -->\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<footer id=\"footer\">\n");
      out.write("\t\t<!-- <div class=\"family-site\">\n");
      out.write("\t\t\t<a href=\"#\">FAMILY SITE</a>\n");
      out.write("\t\t\t<div class=\"list\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">사이트 1</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">사이트 2</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">사이트 3</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div> -->\n");
      out.write("\t\t<ul class=\"foot_menu\">\n");
      out.write("\t\t\t<li><a href=\"/mbrand/main/main.do\" target=\"_blank\">BRAND</a></li>\n");
      out.write("\t\t\t<li><a href=\"/mcompany/main/main.do\" target=\"_blank\">FRANCHISEE</a></li>\n");
      out.write(" \t\t\t<li><a href=\"/mjpn/main/main.do\" target=\"_blank\">JPN</a></li>\n");
      out.write("<!-- \t\t\t<li><a href=\"/mjpn/main/main.do\" target=\"_blank\"><span class=\"sys\">JPN</span></a></li> -->\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<p class=\"copyright\">\n");
      out.write("\t\t\tTEL : 1899-2422 (NUMBER 1) <br>\n");
      out.write("\t\t\tDIRECT : 031-780-1500 | E-mail : help@phomein.com<br>\n");
      out.write("\t\t\tCOPYRIGHT© DAILYKING INC. ALL RIGHT RESERVED.\n");
      out.write("\t\t</p>\n");
      out.write(" \t</footer>\n");
      out.write("\n");
      out.write("<!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-135650389-1\"></script>\n");
      out.write("<script>\n");
      out.write("  window.dataLayer = window.dataLayer || [];\n");
      out.write("  function gtag(){dataLayer.push(arguments);}\n");
      out.write("  gtag('js', new Date());\n");
      out.write("\n");
      out.write("  gtag('config', 'UA-135650389-1');\n");
      out.write("</script>");
      out.write("\n");
      out.write("\t<!-- //footer -->\n");
      out.write("</div>\n");
      out.write("<!-- //wrap -->\n");
      out.write("\n");
      out.write("<script src=\"../common/js/jquery-1.12.4.min.js\"></script>\n");
      out.write("<script src=\"../common/js/swiper.min.js\"></script>\n");
      out.write("<script src=\"../common/js/common.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/include/declare.jspf(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("domain");
      // /WEB-INF/jsp/include/declare.jspf(12,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /WEB-INF/jsp/include/declare.jspf(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("requrl");
      // /WEB-INF/jsp/include/declare.jspf(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.requestURI}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }
}
