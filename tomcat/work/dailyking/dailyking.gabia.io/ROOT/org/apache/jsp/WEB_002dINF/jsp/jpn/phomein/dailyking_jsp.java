/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2019-04-11 02:18:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.jpn.phomein;

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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(17);
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1551882067000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/tlds/function.tld", Long.valueOf(1551597161000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/jsp/jpn/include/jpnheader.jsp", Long.valueOf(1554084466000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/spring-modules-validation-0.9.jar!/META-INF/spring-commons-validator.tld", Long.valueOf(1204779052000L));
    _jspx_dependants.put("/WEB-INF/jsp/jpn/include/head.jspf", Long.valueOf(1554084466000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/declare.jspf", Long.valueOf(1554084461000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-modules-validation-0.9.jar", Long.valueOf(1551882069000L));
    _jspx_dependants.put("/WEB-INF/jsp/jpn/include/jpnfooter.jsp", Long.valueOf(1554382693000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/jsp/jpn/include/jpnMenuHead.jsp", Long.valueOf(1554084466000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("jar:file:/www/dailyking_gabia_io/www/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
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
      out.write("<title>포메인</title>\n");
      out.write("\r\n");
      out.write("<meta name=\"Description\" content=\"쌀국수는 포메인! 한국식 베트남 쌀국수 전문점. 쌀국수, 월남쌈 등 메뉴 소개, 가맹점 개설 안내.\">\r\n");
      out.write("<meta name=\"Author\" content=\"만든이\">\r\n");
      out.write("<meta name=\"Keywords\" content=\"키워드\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta property=\"og:title\" content=\"포메인\">\r\n");
      out.write("<meta property=\"og:type\" content=\"website\">\r\n");
      out.write("<meta property=\"og:url\" content=\"http://www.phomein.com\">\r\n");
      out.write("<meta property=\"og:image\" content=\"http://www.phomein.com/common/images/logo.gif\">\r\n");
      out.write("<meta property=\"og:description\" content=\"쌀국수는 포메인! 한국식 베트남 쌀국수 전문점. 쌀국수, 월남쌈 등 메뉴 소개, 가맹점 개설 안내.\">\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("var uAgent = navigator.userAgent.toLowerCase();\r\n");
      out.write("//아래는 모바일 장치들의 모바일 페이지 접속을위한 스크립트\r\n");
      out.write("var mobilePhones = new Array('iphone', 'ipod', 'ipad', 'android', 'blackberry', 'windows ce','nokia', 'webos', 'opera mini', 'sonyericsson', 'opera mobi', 'iemobile');\r\n");
      out.write("for (var i = 0; i < mobilePhones.length; i++){\r\n");
      out.write("\tif (uAgent.indexOf(mobilePhones[i]) != -1){\r\n");
      out.write("\t\tlocation.href=\"/mjpn/main/main.do\";\r\n");
      out.write("\t}\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"canonical\" href=\"http://www.phomein.com/m/\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/jpn/images/common/favicon.ico?v=1\">\r\n");
      out.write("<link rel=\"icon\" href=\"/jpn/images/common/favicon.png?v=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/jpn/common/css/style.css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/jpn/common/css/swiper.min.css\"> <!-- 20190308 추가 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/jpn/common/css/jquery.fullpage.css\">\r\n");
      out.write("<script src=\"/jpn/common/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"/jpn/common/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script src=\"/jpn/common/js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script src=\"/jpn/common/js/slick.js\"></script>\r\n");
      out.write("<!--[if lte IE 9]>\r\n");
      out.write("\t<script src=\"../common/js/placeholders.min.js\"></script>\r\n");
      out.write("\t<script src=\"../common/js/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- skip-link -->\n");
      out.write("<a href=\"#dBody\" id=\"skip-link\">본문 바로가기</a>\n");
      out.write("<!-- //skip-link -->\n");
      out.write("\n");
      out.write("<!-- wrap -->\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\n");
      out.write("\t<!-- dHead -->\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<header id=\"dHead\">\n");
      out.write("\t\t<!-- header_wrap -->\n");
      out.write("\t\t<div class=\"header-wrap\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<h1><a href=\"/jpn/main/main.do\">PHOMEIN</a></h1>\n");
      out.write("\t\t\t\t<nav id=\"gnb\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/jpn/phomein/dailyking.do\">PHOMEIN</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/dailyking.do\">DAILYKING</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/about.do\">ブランドご紹介</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/jpn/menu/menu_list.do\">メニュー</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/menu/menu_list.do\">メニュー</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/jpn/store/store_list.do\">全店舗一覧</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/jpn/community/sns/community_list.do\">コミュニティ</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/community/cs_terms.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/jpn/community/cs_info.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/jpn/franchisee/interior.do\">加盟店</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/franchisee/interior.do\">インテリア</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/franchisee/terms.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/jpn/franchisee/info.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t\t<div class=\"btn-franchisee\">\n");
      out.write("\t\t\t\t\t<a href=\"/jpn/menu/menu_list.do\">メニュー表示</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- btn-country -->\n");
      out.write("\t\t\t<div class=\"btn-country\">\n");
      out.write("\t\t\t\t<a href=\"javascript:;\">country</a>\n");
      out.write("\t\t\t\t<div class=\"list\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/brand/main/main.do\" target=\"_blank\">BRAND</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/company/main/main.do\" target=\"_blank\">FRANCHISEE</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/eng/main/main.do\" target=\"_blank\">ENG</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- //btn-country -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- btn-system -->\n");
      out.write("\t\t\t<!--<div class=\"btn-system\">\n");
      out.write("\t\t\t\t<a href=\"#\">포메인 시스템</a>\n");
      out.write("\t\t\t</div>-->\n");
      out.write("\t\t\t<!-- //btn-system -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\tvar url = $(location).attr(\"pathname\");\n");
      out.write("\t\t$(\"#gnb ul li ul li a\").each(function(index) {\n");
      out.write("\t\t\tvar $this = $(this);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif($this.attr(\"href\") == url){ // dailyking.do\n");
      out.write("\t\t\t\tif($this.parent(\"li\").css(\"display\") == \"none\") {\n");
      out.write("\t\t\t\t\tvar $text = $this.text();\n");
      out.write("\t\t\t\t\t$this.parent(\"li\").parent(\"ul\").find(\"li a\").each(function(index) {\n");
      out.write("\t\t\t\t\t\tif($text == $(this).text()) {\n");
      out.write("\t\t\t\t\t\t\t$(this).parent(\"li\").attr(\"class\", \"actived\");\n");
      out.write("\t\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$this.parent(\"li\").attr(\"class\", \"actived\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t<!--// dHead -->\n");
      out.write("\n");
      out.write("\t<!-- dBody -->\n");
      out.write("\t<!--\n");
      out.write("\t\t00. main\t\t\t\t\t:\t메인\n");
      out.write("\t\t01. phomein\t\t\t\t\t:\tphomein\n");
      out.write("\t\t02. menu\t\t\t\t\t:\tmenu\n");
      out.write("\t\t03. store\t\t\t\t\t:\tstore\n");
      out.write("\t\t04. community\t\t\t\t:\tcommunity\n");
      out.write("\t\t05. franchisee\t\t\t\t:\tfranchisee\n");
      out.write("\t-->\n");
      out.write("\n");
      out.write("\t<section id=\"dBody\" class=\"phomein\">\n");
      out.write("\t\t<!-- page-title -->\n");
      out.write("\t\t<div class=\"page-title\">\n");
      out.write("\t\t\t<div class=\"visual\" style=\"background-image:url('../images/content/sub_visual_01.jpg');\"></div>\n");
      out.write("\t\t\t<h2 class=\"h2-type\">DAILYKING</h2>\n");
      out.write("<!-- \t\t\t<span class=\"txt\">따뜻한 세상을 희망하는 포메인의 나눔은 계속 됩니다.<br>포메인이 전하는 따뜻한 온기</span> -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //page-title -->\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<!-- location-menu -->\n");
      out.write("\t\t<div class=\"location-menu\">\n");
      out.write("\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t<a href=\"/jpn/main/main.do\" class=\"btn-home\"></a>\n");
      out.write("\t\t\t\t<!-- nav -->\n");
      out.write("\t\t\t\t<div class=\"nav\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth01\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\"></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"PHOMEIN\"><a href=\"/jpn/phomein/dailyking.do\">PHOMEIN</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"メニュー\"><a href=\"/jpn/menu/menu_list.do\">メニュー</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"全店舗一覧\"><a href=\"/jpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"コミュニティ\"><a href=\"/jpn/community/sns/community_list.do\">コミュニティ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"加盟店\"><a href=\"/jpn/franchisee/interior.do\">加盟店</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth02\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\">PHOMEIN</a>\n");
      out.write("\t\t\t\t\t\t\t<dd style=\"display:none;\">PHOMEIN</dd>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/dailyking.do\">DAILYKING</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/about.do\">ブランドご紹介</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/phomein/phoever.do\">CSR</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth02\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\">メニュー</a>\n");
      out.write("\t\t\t\t\t\t\t<dd style=\"display:none;\">メニュー</dd>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/menu/menu_list.do\">メニュー</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth02\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\">全店舗一覧</a>\n");
      out.write("\t\t\t\t\t\t\t<dd style=\"display:none;\">全店舗一覧</dd>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/store/store_list.do\">全店舗一覧</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth02\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\">コミュニティ</a>\n");
      out.write("\t\t\t\t\t\t\t<dd style=\"display:none;\">コミュニティ</dd>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/community/sns/community_list.do\">SNS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/community/cs_terms.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/jpn/community/cs_info.do\">顧客問い合わせ</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"depth02\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"nav-title\">加盟店</a>\n");
      out.write("\t\t\t\t\t\t\t<dd style=\"display:none;\">加盟店</dd>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav-list\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/franchisee/interior.do\">インテリア</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/jpn/franchisee/terms.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"display:none;\"><a href=\"/jpn/franchisee/info.do\">加盟相談申請</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- //nav -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //location-menu -->\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\tvar url = $(location).attr(\"pathname\");\n");
      out.write("\t\t$(\".depth02 ul li a\").each(function(index) {\n");
      out.write("\t\t\tif($(this).attr(\"href\") == url){\n");
      out.write("\t\t\t\t$(this).parent(\"li\").attr(\"class\", \"actived\"); // depth02 active\n");
      out.write("\t\t\t\t$(this).closest(\".depth02\").show(); // depth02 show\n");
      out.write("\t\t\t\tif($(this).text() == 'メニュー') {\n");
      out.write("\t\t\t\t\t$(this).closest(\".depth02\").hide(); // depth02 show\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar aId = $(this).closest(\".depth02\").children('a').text();\n");
      out.write("\t\t\t\t$(\"#\"+aId).attr(\"class\", \"actived\"); // depth01 active\n");
      out.write("\t\t\t\t$(\".depth01\").children('a').text(aId); // depth01 text\n");
      out.write("\t\t\t\t$(this).closest(\".depth02\").children('a').text($(this).text()); // depth02 text\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- contents -->\n");
      out.write("\t\t<div id=\"contents\" class=\"content\">\n");
      out.write("\t\t\t<!-- brand-info -->\n");
      out.write("\t\t\t<div class=\"dailyking-info\">\n");
      out.write("\t\t\t\t<div class=\"page-logo\">\n");
      out.write("\t\t\t\t\t<p class=\"img\"><img src=\"../images/common/dailyking_logo.png\" alt=\"dailyking logo\" class=\"load-fadein\"/></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"inner02\">\n");
      out.write("\t\t\t\t\t<div class=\"page-box\">\n");
      out.write("\t\t\t\t\t\t<p class=\"txt01 load-fadein\">\n");
      out.write("<!-- \t\t\t\t\t\t\t良い材料、良い寄付<br> -->\n");
      out.write("\t\t\t\t\t\t\t人が生きていくために最も必要な三つの中の一つ、食。<br>\n");
      out.write("\t\t\t\t\t\t\t最も必要なだけに一番重要だという考えから始めました。\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"txt02 load-fadein\">\n");
      out.write("\t\t\t\t\t\t\t忙しい生活の中で食事の大切さを見逃している現代人たちに<br>\n");
      out.write("\t\t\t\t\t\t\t安全で健康なテーブルをお約束いたします。\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"keyword\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"load-fadein\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"img\"><img src=\"../images/content/img_keyword_01.jpg\" alt=\"\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"txt\"><span>多彩な味</span><strong>気分や好みに合わせて選ぶ楽しみがあります。</strong></p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"load-fadein\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"img\"><img src=\"../images/content/img_keyword_02.jpg\" alt=\"\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"txt\"><span>楽しみ</span><strong>老若男女を問わず、誰でも気軽にお楽しみいただけます。</strong></p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"load-fadein\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"img\"><img src=\"../images/content/img_keyword_03.jpg\" alt=\"\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"txt\"><span>新しさ</span><strong>新しさについて常に研究し、果敢に挑戦します。</strong></p>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- //brand-info -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //contents -->\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\t<!--// dBody -->\n");
      out.write("\n");
      out.write("\t<!-- dFoot -->\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<footer id=\"dFoot\">\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<!-- footer-menu -->\n");
      out.write("\t\t\t<div class=\"footer-menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"/brand/main/main.do\" target=\"_blank\">BRAND</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"em\"><a href=\"/company/main/main.do\" target=\"_blank\">FRANCHISEE</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/eng/main/main.do\" target=\"_blank\">ENG</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- <ul class=\"list2\">\n");
      out.write("\t\t\t\t\t<li class=\"\"><a href=\"#\">가맹문의</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"\"><a href=\"#\">가맹점 상담신청</a></li>\n");
      out.write("\t\t\t\t</ul> -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- ..footer-menu -->\n");
      out.write("\t\t\t<!-- family-site -->\n");
      out.write("\t\t\t<!-- <div class=\"family-site\">\n");
      out.write("\t\t\t\t<a href=\"#\">Family Site</a>\n");
      out.write("\t\t\t\t<div class=\"list\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">사이트 1</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">사이트 2</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">사이트 3</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> -->\n");
      out.write("\t\t\t<!-- //family-site -->\n");
      out.write("\t\t\t<!-- corp-info -->\n");
      out.write("\t\t\t<div class=\"corp-info\">\n");
      out.write("\t\t\t\t<p class=\"info\"><span>DAILYKING</span>ADDRESS : 216, Hwangsaeul-ro, Bundang-gu, Seongnam-si, Gyeonggi-do, Republic of Korea</p>\n");
      out.write("\t\t\t\t<p class=\"info\"><span>TEL : 1899-2422</span>BUSINESS LICENSE NUMBER : 129-86-03729</p>\n");
      out.write("\t\t\t\t<p class=\"corp\">ⓒ 2019 DALYKING INC. ALL RIGHTS RESERVED.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- corp-info -->\n");
      out.write("\t\t\t<!-- sns -->\n");
      out.write("\t\t\t<div class=\"sns\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"ico-f\"><a href=\"https://www.facebook.com/phomein\" target=\"_blank\"><span>페이스북</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"ico-i\"><a href=\"https://www.instagram.com/phomeinkr/\" target=\"_blank\"><span>인스타그램</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"ico-b\"><a href=\"https://blog.naver.com/dk_phomein\" target=\"_blank\"><span>블로그</span></a></li>\n");
      out.write("<!-- \t\t\t\t\t<li class=\"ico-p\"><a href=\"#\"><span>선물하기</span></a></li> -->\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- //sns -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
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
      out.write("\t<!--// dFoot -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- //wrap -->\n");
      out.write("\n");
      out.write("<script src=\"../common/js/front_ui.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
