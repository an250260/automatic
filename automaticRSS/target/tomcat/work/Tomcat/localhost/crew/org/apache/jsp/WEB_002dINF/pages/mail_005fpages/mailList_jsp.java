/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-30 08:20:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.mail_005fpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mailList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>配信メール管理 | CREW 管理</title>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/library.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function deleteAjaxCall(id) {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype : \"POST\",\r\n");
      out.write("\t\tcontentType : \"application/json\",\r\n");
      out.write("\t\turl : \"api/mail/deleteMailData\",\r\n");
      out.write("\t\tdata : JSON.stringify(id),\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\ttimeout : 100000,\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t$(\"#mailData\" + id).remove();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror : function(e) {\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdone : function(e) {\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteMailData(id){\r\n");
      out.write("\tConfirmDeleteDialog(\"削除しますか\", id);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ConfirmDeleteDialog(message, id) {\r\n");
      out.write("\t$('<div></div>')\r\n");
      out.write("\t\t\t.appendTo('body')\r\n");
      out.write("\t\t\t.html(\r\n");
      out.write("\t\t\t\t\t\"<div style='width: 200px'><h6>\" + message\r\n");
      out.write("\t\t\t\t\t\t\t+ \"?</h6></div>\")\r\n");
      out.write("\t\t\t.dialog(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tmodal : true,\r\n");
      out.write("\t\t\t\t\t\ttitle : '削除確認',\r\n");
      out.write("\t\t\t\t\t\tzIndex : 10000,\r\n");
      out.write("\t\t\t\t\t\tautoOpen : true,\r\n");
      out.write("\t\t\t\t\t\twidth : 'auto',\r\n");
      out.write("\t\t\t\t\t\tresizable : false,\r\n");
      out.write("\t\t\t\t\t\tbuttons : {\r\n");
      out.write("\t\t\t\t\t\t\tはい : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t// $(obj).removeAttr('onclick');                                \r\n");
      out.write("\t\t\t\t\t\t\t\t// $(obj).parents('.Parent').remove();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\tdeleteAjaxCall(id);\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tいいえ : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tclose : function(event, ui) {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).remove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\tfunction AjaxGetList() {\r\n");
      out.write("\t\t$\r\n");
      out.write("\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\tcontentType : \"application/json\",\r\n");
      out.write("\t\t\t\t\turl : \"api/mail/getlist\",\r\n");
      out.write("\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\ttimeout : 100000,\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tvar dataToAppend = \"\";\r\n");
      out.write("\t\t\t\t\t\tvar num = 0;\r\n");
      out.write("\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(i, item) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdataToAppend += \"<tr id='mailData\" + item.id + \"'><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.title\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.target.split(\",\").length + \" 人\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.time;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif(item.status == \"配信済み\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataToAppend += \"</td><td class='status_leave'>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataToAppend += \"</td><td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdataToAppend +=  item.status\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.sendNumber\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ item.errorNumber\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td> <td style='width:13%'><a onclick = 'sendEditForm(\" + item.id + \")' class='small green button input'>編集</a>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"<span onclick='deleteMailData(\" + item.id + \")' class='small white button input'>削除</td></tr>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnum++;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t$(\"#dataTableBody\").append(dataToAppend);\r\n");
      out.write("\t\t\t\t\t\t$(\"#RecNum\").append(\"該当件数：\" + num + \" 件 (一ページ100件限表示)\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror : function(e) {\r\n");
      out.write("\t\t\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tdone : function(e) {\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction sendEditForm(id){\r\n");
      out.write("\t\t$('#mailIdForm').val(id);\r\n");
      out.write("\t\t$('#editSubmitForm').submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tAjaxGetList();\r\n");
      out.write("\r\n");
      out.write("\t\t$('#tableData').paging({\r\n");
      out.write("\t\t\tlimit : 10\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- pagebody start -->\r\n");
      out.write("\t<div class=\"pagebody\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"contents wrapper clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/navMail.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- main start -->\r\n");
      out.write("\t\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t\t<h2 class=\"orange margin_b_20\">一括メール配信一覧</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"rightbtn_box\">\r\n");
      out.write("\t\t\t\t\t<a href=\"../affiliates/list\" class=\"large orange button\">新規登録(アフィリエイター宛)</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"main_1c\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"infotab\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"RecNum\" class=\"base\"></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"tableData\" class=\"table table-bordered table-striped\">\r\n");
      out.write("\t\t\t\t\t<thead id=\"dataTableHeader\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>タイトル</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>配信対象</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>配信予定日時</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>ステータス</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>配信数</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>エラー</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"dataTableBody\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- main start -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"../mail/manage\" id=\"editSubmitForm\" method=\"POST\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"MailIdForm\" value=\"\" id=\"mailIdForm\"/>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- footer start -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- footer end -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- pagebody end -->");
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
