/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2020-01-13 00:04:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.mjpn.phomein;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phoseason_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(18);
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1551882067000L));
    _jspx_dependants.put("/WEB-INF/tlds/function.tld", Long.valueOf(1551597161000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/jsp/mjpn/include/jpngnb.jsp", Long.valueOf(1578756133000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/jsp/mjpn/include/jpnheader.jsp", Long.valueOf(1558589659000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-modules-validation-0.9.jar!/META-INF/spring-commons-validator.tld", Long.valueOf(1204779052000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/declare.jspf", Long.valueOf(1558589614000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-modules-validation-0.9.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/jsp/mjpn/include/jpnlnb.jsp", Long.valueOf(1578756134000L));
    _jspx_dependants.put("jar:file:/www/phomein_com/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/jsp/mjpn/include/head.jspf", Long.valueOf(1558589659000L));
    _jspx_dependants.put("/WEB-INF/jsp/mjpn/include/jpnfooter.jsp", Long.valueOf(1558589659000L));
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/font.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/common.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/layout.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/content.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/jquery.fullpage.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/mjpn/common/css/main.css\">\r\n");
      out.write("<script src=\"/mjpn/common/js/jquery-1.12.4.min.js\"></script>\r\n");
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
      out.write("\t\t\t<a href=\"/mjpn/main/main.do\"><span class=\"blind\">PHOMEIN</span></a>\n");
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
      out.write("\t\t\t\t\t<li><a href=\"/meng/main/main.do\" target=\"_self\">ENG</a></li>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/dailyking.do\">㈱デイリーキング</a></li><!-- 현재 뎁스 표시 : class=\"on\" -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/about.do\">ブランドご紹介</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 20190426 메뉴 추가 s -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/ceo.do\">CEO</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/greenfood.do\">現代グリーンフード</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/phoseason.do\">フォーシーズン</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- //20190426 메뉴 추가 e -->\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">メニュー</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"ea1 gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/menu/menu_list.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/meng/menu/red_menu_list.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">全店舗一覧</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"ea1 gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">コミュニティ</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/community/cs_terms.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/community/cs_info.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#none\">加盟店</a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"gnbs\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/franchisee/interior.do\">インテリア</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/mjpn/franchisee/terms.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/franchisee/info.do\">加盟相談申請</a></li>\n");
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
      out.write("\t\t\t<h3>フォーシーズン</h3>\n");
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
      out.write("\t\t\t\t<li id=\"PHOMEIN\"><a href=\"/mjpn/phomein/dailyking.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li id=\"メニュー\"><a href=\"/mjpn/menu/menu_list.do\">メニュー</a></li>\n");
      out.write("\t\t\t\t<li id=\"全店舗一覧\"><a href=\"/mjpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t\t<li id=\"コミュニティ\"><a href=\"/mjpn/community/sns/community_list.do\">コミュニティ</a></li>\n");
      out.write("\t\t\t\t<li id=\"加盟店\"><a href=\"/mjpn/franchisee/interior.do\">加盟店</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">PHOMEIN</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">PHOMEIN</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/dailyking.do\">㈱デイリーキング</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/about.do\">ブランドご紹介</a></li>\n");
      out.write("\t\t\t\t<!-- 20190426 메뉴 추가 s -->\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/ceo.do\">CEO</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/greenfood.do\">現代グリーンフード</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/phoseason.do\">フォーシーズン</a></li>\n");
      out.write("\t\t\t\t<!-- //20190426 메뉴 추가 e -->\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">メニュー</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">メニュー</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/menu/menu_list.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/menu/red_menu_list.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/menu/menu_view.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/menu/red_menu_view.do\">PHOMEIN RED</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">全店舗一覧</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">全店舗一覧</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">コミュニティ</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">コミュニティ</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/community/cs_terms.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/community/cs_info.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"dep dep2\" style=\"display:none;\">\n");
      out.write("\t\t\t<a href=\"#none\">加盟店</a>\n");
      out.write("\t\t\t<dd style=\"display:none;\">加盟店</dd>\n");
      out.write("\t\t\t<ul class=\"dep_list\">\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/franchisee/interior.do\">インテリア</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/mjpn/franchisee/terms.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t<li style=\"display:none;\"><a href=\"/mjpn/franchisee/info.do\">加盟相談申請</a></li>\n");
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
      out.write("\t\t<div id=\"content\" class=\"rnd\">\n");
      out.write(" \t\t\t<div class=\"phoseason\">\n");
      out.write("\t\t\t\t<div class=\"tit_area\">\n");
      out.write("\t\t\t\t\t<h4>フォーシーズン </h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"intro\">\n");
      out.write("\t\t\t\t\t<strong>フォーシーズン </strong>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t2015年フォーメインで設立したベトナム現地ライスヌードル製造工場で、 ベトナムのMekong delta地域で収獲される清くて透明な新米で作ったライスヌードル麺と、 9種の上級天然香辛料を使った肉水用ハーブバッグ(Herb-Bags)を生産しています。\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t海外ライスヌードル麺の工産品に依存してきた国内ライスヌードル市場で、ライスヌードルブランドが自体の技術開発でライスヌードル麺を生産したことはフォーメインが唯一です。フォーシーズンの設立によるフォーメインの差別化は、国内だけではなく世界ライスヌードル市場の新しい基準になります。\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"cont\">\n");
      out.write("\t\t\t\t\t<strong>米一粒からライスヌードル一丁まで</strong>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tポメインでは古米と澱粉または小麦粉を混合して作った既存のライスヌードル麺とは全く違ったフォーメイン新米ライスヌードル麺の透明な色回りと炊き上げたままの新米ご飯の香が感じられます。また、深くて濃い天然香辛料の香と味は、食材料が重要になった現代社会に強力な競争力になります。\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<strong>1年4季節、新米</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tライスヌードル乾麺の生産に相応しい気候と環境であるベトナム、特に3模作が可能なMekong delta地域より1年始終新鮮な米が供給されます。フォーメインライスヌードル麺は、古米ではない新米のみを使ってライスヌードル乾麺を作ります。\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<strong>とても清い、精製水</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tフォーメインライスヌードル麺の製造過程で新米ほど重要な水もフォーシーズンの精製技術を通じ残留医薬品と環境ホルモンなど70種余りに汚染物質を除去したきれいな水(精製水)を使います。\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<strong>独自技術、機械乾燥</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t老後化された他のライスヌードル工場とは違い、フォーメインが独自で開発した機械乾燥技術で衛生的な乾燥が行われます。この過程で白く透明な色回りは生かしながらも新米ご飯の香りをそっくり盛り出します。\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<strong>麺の完成、低温熟成</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t不要な化学添加物を使わないために低温で熟成過程を通します。適当な粘りと柔らかさ、麺の弾力性を2倍も引き上げてくれるフォーメインの技術が集約されています。\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<strong>名品肉水、ハーブバッグ</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t9種の上級天然香辛料を使った肉水用ハーブバッグ(Herb-Bags)は、持続的な品質改善の再整備を実施します。フォーメイン最上の肉水味と質を維持する秘訣です。\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
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
      out.write(" \t\t\t<li><a href=\"/meng/main/main.do\" target=\"_blank\">ENG</a></li>\n");
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
