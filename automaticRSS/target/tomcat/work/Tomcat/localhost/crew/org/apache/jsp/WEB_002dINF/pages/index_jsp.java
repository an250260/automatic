/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-25 03:54:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ja\" lang=\"ja\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<title>配信メール管理 | CREW 管理</title>\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/library.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- pagebody start -->\n");
      out.write("<div class=\"pagebody\">\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template/header.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- contents start -->\n");
      out.write("\t<div class=\"contents wrapper clearfix\">\n");
      out.write("\t\t<div class=\"crumb\"><a href=\"http://crew.navy/manage\">アフィリセンター管理トップ</a>&nbsp;&gt;&gt;&nbsp;一括メール配信管理</div>\n");
      out.write("\t\t\t\t\t\t<!-- side start -->\n");
      out.write("\t\t<div class=\"side\">\n");
      out.write("\t\t\t\t\t\t<div class=\"side_box margin_b_20\">\n");
      out.write("\t\t\t\t<div class=\"side_box_inner\">\n");
      out.write("\t\t\t\t\t<div class=\"side_box_body\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"orange\">一括メール配信</h3>\n");
      out.write("\t\t\t\t\t\t<ul class=\"side_menu\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"m_orange\"><a href=\"http://crew.navy/manage/mails\">一括メール配信管理</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"m_orange\"><a href=\"http://crew.navy/manage/error_mails\">エラーメール管理</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\t</div>\n");
      out.write("\t\t<!-- side end -->\n");
      out.write("\n");
      out.write("\t\t<!-- main start -->\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t<h2 class=\"orange margin_b_20\">一括メール配信一覧</h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"rightbtn_box\">\n");
      out.write("\t\t\t\t<a href=\"http://crew.navy/manage/affiliates\" class=\"large orange button\">新規登録(アフィリエイター宛)</a>\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"main_1c\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"infotab\">\n");
      out.write("\t\t\t\t<ul class=\"clearfix\">\n");
      out.write("\t\t\t\t\t<li class=\"base\">該当件数：246件 (1件目〜100件目 100件表示)</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tbody><tr>\n");
      out.write("\t\t\t\t\t<th width=\"6%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.id/direction:asc\" class=\"desc\">ID</a></th>\n");
      out.write("\t\t\t\t\t<th><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.title/direction:asc\">タイトル</a></th>\n");
      out.write("\t\t\t\t\t<th width=\"12%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.target/direction:asc\">配信対象</a></th>\n");
      out.write("\t\t\t\t\t<th width=\"13%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.send_datetime/direction:asc\">配信予定日時</a></th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"8%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc\">ステータス</a></th>\n");
      out.write("\t\t\t\t\t<th width=\"6%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc\">配信数</a></th>\n");
      out.write("\t\t\t\t\t<th width=\"6%\"><a href=\"http://crew.navy/manage/mails/index/sort:ManageMail.status/direction:asc\">エラー</a></th>\n");
      out.write("\t\t\t\t\t<th width=\"13%\">操作</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">35109</td>\n");
      out.write("\t\t\t\t\t<td>BBPラスト</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-18 18:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t501\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:35109/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/35109\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">35033</td>\n");
      out.write("\t\t\t\t\t<td>BBP_9_17</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-17 12:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t501\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:35033/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/35033\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34949</td>\n");
      out.write("\t\t\t\t\t<td>BBP9_16_10:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-16 10:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t502\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34949/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34949\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34941</td>\n");
      out.write("\t\t\t\t\t<td>BBP9_15_19:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-15 19:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t502\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34941/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34941\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34937</td>\n");
      out.write("\t\t\t\t\t<td>BBP9_15_18:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-15 18:07</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t502\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34937/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34937\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34895</td>\n");
      out.write("\t\t\t\t\t<td>BBP9_15_10:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-15 10:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t503\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34895/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34895\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34860</td>\n");
      out.write("\t\t\t\t\t<td>BBP_9_14</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-14 18:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t503\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34860/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34860\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34846</td>\n");
      out.write("\t\t\t\t\t<td>BBP_9_13</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-13 19:30</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t502\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34846/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34846\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34756</td>\n");
      out.write("\t\t\t\t\t<td>BBP_9/12_16:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-12 16:24</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t492\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34756/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34756\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34737</td>\n");
      out.write("\t\t\t\t\t<td>BBP_9/12_12:00</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-12 12:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t491\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34737/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34737\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34685</td>\n");
      out.write("\t\t\t\t\t<td>BBP３日目１８時</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-11 18:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t491\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34685/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34685\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">34681</td>\n");
      out.write("\t\t\t\t\t<td>BBP３日目１０時</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">アフィリエイター</td>\n");
      out.write("\t\t\t\t\t<td align=\"center\">2017-09-11 10:00</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"status_leave\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t配信済み\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t487\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/error_mails/index/mail_id:34681/deleted:\" target=\"_blank\">28</a>\t\t\t\t\t</td><td align=\"center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"http://crew.navy/manage/mails/edit/34681\" class=\"small green button input\">編集</a>\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"small white button input nolink\">削除</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody></table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"paging\">\n");
      out.write("\t\t\t<span class=\"prev disabled\">&lt; 戻る</span><span class=\"current\">1</span><span><a href=\"http://crew.navy/manage/mails/index/page:2\">2</a></span><span><a href=\"http://crew.navy/manage/mails/index/page:3\">3</a></span><span class=\"next\"><a href=\"http://crew.navy/manage/mails/index/page:2\" rel=\"next\">次へ &gt;</a></span>\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- main start -->\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- contents end -->\n");
      out.write("\t<!-- footer start -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<ul class=\"footer_navi clearfix margin_b_20\">\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage\">トップページ</a></li>\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage/product_groups\">案件管理</a></li>\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage/contracts/free\">成約・アフィリエイト報酬管理</a></li>\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage/affiliates\">アフィリエイター管理</a></li>\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage/mails\">配信メール管理</a></li>\n");
      out.write("\t\t\t\t<li class=\"s_white\"><a href=\"http://crew.navy/manage/mails#\">システム設定</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<address>Copyright© <a href=\"http://kuchiko.net/\" target=\"_blank\">Ku-Chi-Ko</a> All Rights Reserved</address>\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- footer end -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"http://member.kuchiko.net/member/login.php\" id=\"GoSupport\" target=\"_blank\">\n");
      out.write("\t<input type=\"hidden\" name=\"login_id\" value=\"ceo@4lead.co.jp\">\n");
      out.write("\t<input type=\"hidden\" name=\"password\" value=\"444#crew@4lead\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!-- pagebody end -->\n");
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
