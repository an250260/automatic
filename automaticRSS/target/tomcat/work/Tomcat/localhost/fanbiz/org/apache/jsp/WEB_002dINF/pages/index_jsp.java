/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-21 09:45:07 UTC
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/biz.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/notosansjapanese.css\" />\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.10.1.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.bxslider.min.js\"></script>\n");
      out.write("<script src=\"js/top_main.js\"></script>\n");
      out.write("\n");
      out.write("<title>fanpAd (ファンプ・アド) | Facebook Messenger専用\"会話広告(チャットボット)\"サービス</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"\">\n");
      out.write("\n");
      out.write("  <header id=\"sp_fix_header\" class=\"sp_fix_header sp\">\n");
      out.write("    <div class=\"logo-img\">\n");
      out.write("      <a href=\"https://fanp.me/ad#\">\n");
      out.write("        <img src=\"image/fanp_ad_f.png\" alt=\"\">\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu-btn\"></div>\n");
      out.write("  </header>\n");
      out.write("  <div id=\"side-menu\" class=\"side-menu sp\">\n");
      out.write("    <div class=\"side-menu-title\">MENU</div>\n");
      out.write("    <ul class=\"side-menu-list\">\n");
      out.write("      <li><a href=\"https://fanp.me/ad#about\">fanp Adとは？</a></li>\n");
      out.write("      <li><a href=\"https://fanp.me/ad#feature\">特徴</a></li>\n");
      out.write("      <li><a href=\"https://fanp.me/ad#step\">CVまでの流れ</a></li>\n");
      out.write("      <li><a href=\"http://blog.fanp.me/\">導入事例</a></li>\n");
      out.write("      <li><a href=\"http://zeals.co.jp/#contact\">お問い合わせ</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- <div class=\"change_lang_select_area\">\n");
      out.write("      <div class=\"lang_icon\"><img src=\"/static/images/ad_icon_lang.png\"></div>\n");
      out.write("      <span class=\"change_lang_select\">\n");
      out.write("        <a href=\"/change_language/en\">English</a>\n");
      out.write("      </span>\n");
      out.write("    </div> -->\n");
      out.write("    <div id=\"side-menu-close-btn\" class=\"close-btn\"><span class=\"icon_close\"></span></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"side-menu-overlay\" class=\"side-menu-overlay sp\"></div>\n");
      out.write("\n");
      out.write("  <header id=\"header\" class=\"header pc\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"logo_img\"><a href=\"https://fanp.me/ad#\"><img src=\"image/fanp_ad_f.png\" alt=\"fanp\"></a></h1>\n");
      out.write("      <ul class=\"menu_list\">\n");
      out.write("        <li><a href=\"https://fanp.me/ad#about\">fanp Adとは？</a></li>\n");
      out.write("        <li><a href=\"https://fanp.me/ad#feature\">特徴</a></li>\n");
      out.write("        <li><a href=\"https://fanp.me/ad#step\">CVまでの流れ</a></li>\n");
      out.write("        <li><a href=\"http://blog.fanp.me/\">導入事例</a></li>\n");
      out.write("        <li><a href=\"http://zeals.co.jp/#contact\">お問い合わせ</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <a href=\"http://zeals.co.jp/#contact\" class=\"main_button\">資料請求する</a>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <div id=\"main_visual\" class=\"main_visual clearfix\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"heading_box\" style='margin-top:320px'>\n");
      out.write("        <h3 class=\"section_title\">一方的な広告体験を <br class=\"sp\">\"接客\" に変える</h3>\n");
      out.write("        <p class=\"heading_text\">WebサイトのCVRを凌駕する<br class=\"sp\"><span> 会話広告 </span>パッケージ</p>\n");
      out.write("        <a href=\"http://zeals.co.jp/#contact\" class=\"start_button\">まずは資料請求</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"achievement\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <ul class=\"achievement_list\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"https://www.green-japan.com/\" target=\"_blank\"><img src=\"image/logo_green.png\" width=\"96\"></a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"https://type.jp/\" target=\"_blank\"><img src=\"image/logo_attype.png\" width=\"120\"></a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"https://finc.com/\" target=\"_blank\"><img src=\"image/logo_finc.svg\" width=\"90\"></a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"https://libinc.jp/\" target=\"_blank\"><img src=\"image/logo_libzcareer.png\" width=\"208\"></a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"https://itpropartners.jp/\" target=\"_blank\"><img src=\"image/logo_itpro.png\" width=\"280\"></a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <span class=\"other_achievement\">その他累計500社が利用（※fanp含む）</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\t\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <section id=\"news\" class=\"news clearfix pc\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"news_title\">NEWS</p>\n");
      out.write("      <ul id=\"news_slider\" class=\"news_slider pc\">\n");
      out.write("        <li>\n");
      out.write("          <ul class=\"news_slider_list\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://prtimes.jp/main/html/rd/p/000000026.000019209.html\" target=\"_blank\">\n");
      out.write("                <div class=\"thumb\">\n");
      out.write("                  <img src=\"image/news_itpro.jpg\" alt=\"ITプロパートナーズ\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"explain\">\n");
      out.write("                  <span class=\"date\">2017/09/08</span>\n");
      out.write("                  <p class=\"article_title\">【チャットボット発表】プロフェッショナル仕事紹介の「ITプロパートナーズ」に Facebook Messenger \"会話広告\" ...</p>\n");
      out.write("                  <p class=\"explain_text\">Facebook Messenger を活用した “会話広告” パッケージ「fanp Ad」を展開する株式会社 ZEALS（ジールス）（所在地：東京都品...</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://prtimes.jp/main/html/rd/p/000000023.000019209.html\" target=\"_blank\">\n");
      out.write("                <div class=\"thumb\">\n");
      out.write("                  <img src=\"image/news_green.jpg\" alt=\"Green\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"explain\">\n");
      out.write("                  <span class=\"date\">2017/08/21</span>\n");
      out.write("                  <p class=\"article_title\">【チャットボット発表】エンジニア転職に強い「Green」を展開するアトラエに Facebook Messenger \"会話広告\"パッ...</p>\n");
      out.write("                  <p class=\"explain_text\">Facebook Messenger を活用した “会話広告” パッケージ「fanp Ad」を展開する株式会社 ZEALS（ジールス）（所在地：東京都品...</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"https://prtimes.jp/main/html/rd/p/000000025.000019209.html\" target=\"_blank\">\n");
      out.write("                <div class=\"thumb\">\n");
      out.write("                  <img src=\"image/news_finc.jpg\" alt=\"FiNC\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"explain\">\n");
      out.write("                  <span class=\"date\">2017/08/23</span>\n");
      out.write("                  <p class=\"article_title\">【チャットボット発表】続けられるNo.1ダイエットアプリを展開するFiNCにFacebook Messenger \"会話広告\"パッ...</p>\n");
      out.write("                  <p class=\"explain_text\">Facebook Messenger を活用した“会話広告”サービス「fanp Ad」を展開する株式会社 ZEALS（ジールス）（所在地：東京都品...</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <ul class=\"news_slider_list\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"http://type.jp/s/pressroom/2017/170127.html\" target=\"_blank\">\n");
      out.write("                <div class=\"thumb\">\n");
      out.write("                  <img src=\"image/news_at_type.png\" alt=\"@type\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"explain\">\n");
      out.write("                  <span class=\"date\">2017/02/08</span>\n");
      out.write("                  <p class=\"article_title\">新機能：Facebook Messengerを利用した求人情報のご案内を開始いたします</p>\n");
      out.write("                  <p class=\"explain_text\">株式会社キャリアデザインセンター（以下 CDC、本社：東京都港区、代表取締役社長兼会長:多田弘實）が運営する総合転職サイ...</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("  <section id=\"news\" class=\"news clearfix sp\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"news_title\">NEWS</p>\n");
      out.write("      <ul class=\"sp_news_list\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"https://prtimes.jp/main/html/rd/p/000000026.000019209.html\" target=\"_blank\">\n");
      out.write("            <div class=\"entry_img\">\n");
      out.write("              <img src=\"image/news_itpro.jpg\" alt=\"ITプロパートナーズ\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"explain\">\n");
      out.write("              <span class=\"date\">2017/09/08</span>\n");
      out.write("              <p class=\"article_title\">【チャットボット発表】プロフェッショナル仕事紹介の「ITプロパートナーズ」に Fac...</p>\n");
      out.write("              <p class=\"explain_text\">Facebook Messenger を活用した “会話広告” パッケージ「fanp Ad」を展開する株式会社 ZEALS（ジ...</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"https://prtimes.jp/main/html/rd/p/000000023.000019209.html\" target=\"_blank\">\n");
      out.write("            <div class=\"entry_img\">\n");
      out.write("              <img src=\"image/news_green.jpg\" alt=\"Green\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"explain\">\n");
      out.write("              <span class=\"date\">2017/08/21</span>\n");
      out.write("              <p class=\"article_title\">【チャットボット発表】エンジニア転職に強い「Green」を展開するアトラエに Facebook Messenger \"会...</p>\n");
      out.write("              <p class=\"explain_text\">Facebook Messenger を活用した “会話広告” パッケージ「fanp Ad」を展開する株式会社 ZEALS（ジールス）（所...</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"https://prtimes.jp/main/html/rd/p/000000025.000019209.html\" target=\"_blank\">\n");
      out.write("            <div class=\"entry_img\">\n");
      out.write("              <img src=\"image/news_finc.jpg\" alt=\"FiNC\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"explain\">\n");
      out.write("              <span class=\"date\">2017/08/23</span>\n");
      out.write("              <p class=\"article_title\">【チャットボット発表】続けられるNo.1ダイエットアプリを展開するFiNCにFacebook Messenger \"会話広...</p>\n");
      out.write("              <p class=\"explain_text\">Facebook Messenger を活用した“会話広告”サービス「fanp Ad」を展開する株式会社 ZEALS（ジールス）（所...</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"http://type.jp/s/pressroom/2017/170127.html\" target=\"_blank\">\n");
      out.write("            <div class=\"entry_img\">\n");
      out.write("              <img src=\"image/news_at_type.png\" alt=\"@type\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"explain\">\n");
      out.write("              <span class=\"date\">2017/02/08</span>\n");
      out.write("              <p class=\"article_title\">新機能：Facebook Messengerを利用した求人情報のご案内を開始いたします</p>\n");
      out.write("              <p class=\"explain_text\">株式会社キャリアデザインセンター（以下 CDC、本社：東京都港区、代表取締役社長兼会長:多田弘實）が運営する...</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section id=\"about\" class=\"about clearfix\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h3 class=\"section_title\">あなたの商品を会話で紹介する <br class=\"pc\">\"会話広告\" パッケージ</h3>\n");
      out.write("      <ul class=\"about_list\">\n");
      out.write("        <li>Facebook広告から直接リンクする<br>Messengerボット</li>\n");
      out.write("        <li>会話によるサービス紹介で、<br>CVRを150％改善</li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"user_info_samplae_img\">\n");
      out.write("        <img src=\"image/about_userinfo.png\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"demo_movie pc\">\n");
      out.write("        <img src=\"image/green_bot.jpg\" alt=\"fanp demo\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <div class=\"demo_movie sp\">\n");
      out.write("    <img src=\"image/green_bot.jpg\" alt=\"fanp demo\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <section id=\"feature\" class=\"feature clearfix\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <span class=\"feature_title\">Question</span>\n");
      out.write("      <p class=\"heading_text\">サイトのCVRが<br class=\"sp\">低くて困ってませんか？</p>\n");
      out.write("      <div class=\"question_list_area\">\n");
      out.write("        <div class=\"under_arrow_img\"><img src=\"image/ad_qa_arrow.png\"></div>\n");
      out.write("\n");
      out.write("        <ul class=\"question_list feature_list\">\n");
      out.write("          <li>\n");
      out.write("            <div class=\"question_img feature_img\"><img src=\"image/ad_icon_question1.png\"></div>\n");
      out.write("            <p class=\"question_list_title\">Webで中々サービスを<br>理解してもらえない</p>\n");
      out.write("            <ul class=\"question_problem_list\">\n");
      out.write("              <li>お客様にサービスを中々理解して<br>もらえないのでCVRが低い。</li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <div class=\"question_img feature_img\"><img src=\"image/ad_icon_question2.png\"></div>\n");
      out.write("            <p class=\"question_list_title\">ユーザー情報が<br>取得できていない</p>\n");
      out.write("            <ul class=\"question_problem_list\">\n");
      out.write("              <li>自社サイトに訪れるユーザーを<br>把握できていない</li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <div class=\"question_img feature_img\"><img src=\"image/ad_icon_question3.png\"></div>\n");
      out.write("            <p class=\"question_list_title\">プッシュでメッセージが<br>送れず、再訪してもらえない</p>\n");
      out.write("            <ul class=\"question_problem_list\">\n");
      out.write("              <li>コンテンツを更新しても顧客への<br>通知する手段がない・メールマガジンを<br>送っても見てもらえないことが多い。</li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <span class=\"feature_title\">Answer</span>\n");
      out.write("      <p class=\"heading_text\">会話広告の「fanp Ad」なら<br>コンバージョンレートが劇的に改善</p>\n");
      out.write("      <ul class=\"answer_list feature_list\">\n");
      out.write("        <li>\n");
      out.write("          <div class=\"answer_img\"><img src=\"image/ad_icon_answer1.png\"></div>\n");
      out.write("          <p class=\"answer_list_title\">チャットコミュニケーションで<br>理解度が大幅に向上</p>\n");
      out.write("          <ul class=\"question_problem_list\">\n");
      out.write("            <li>慣れ親しんだチャットで双方向の<br class=\"pc\">会話を<br class=\"sp\">行うことでユーザーの<br class=\"pc\">理解度が向上する。</li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"answer_img\"><img src=\"image/ad_icon_answer2.png\"></div>\n");
      out.write("          <p class=\"answer_list_title\">Facebookの<br>プロフィールが取得できる</p>\n");
      out.write("          <ul class=\"question_problem_list\">\n");
      out.write("            <li>Facebook上の情報が取れるだけ<br>ではなく、会話のログを追うことで<br>ユーザーの行動も可視化できる。</li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"answer_img\"><img src=\"image/ad_icon_answer3.png\"></div>\n");
      out.write("          <p class=\"answer_list_title\">メールより開封率１５倍・<br>クリック率１３倍のチャット配信</p>\n");
      out.write("          <ul class=\"question_problem_list\">\n");
      out.write("            <li>Messengerにコンテンツを<br class=\"pc\">届けられるので<br class=\"sp\">メール以上のユーザーナーチャリングができる</li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"start clearfix\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <a href=\"http://zeals.co.jp/#contact\" class=\"start_button_white\">まずは資料請求</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section class=\"clearfix\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h3 class=\"section_title\">国内No.1 の Facebook Messenger<br>\"会話広告\" パッケージ</h3>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"user_list_menu fanp_menu clearfix\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"fanp_menu_box\">\n");
      out.write("      <p class=\"fanp_menu_title\">Facebook広告と<br>Messengerボットが連携</p>\n");
      out.write("      <p class=\"fanp_menu_explain\">Facebook広告のクリック先をMessengerボット<br>にした \"会話広告\" で集客ができる</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fanp_display_sample_img\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"analytics_menu fanp_menu clearfix\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"fanp_menu_box\">\n");
      out.write("      <p class=\"fanp_menu_title\">見込み客の詳細情報を<br>可視化できる</p>\n");
      out.write("      <p class=\"fanp_menu_explain\">ユーザー全体から一人ひとりまで、行動データや<br>CVRの計測ができる。<br class=\"pc\">(Facebook情報とリンク)</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fanp_display_sample_img\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"chatmagazine_menu fanp_menu clearfix\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"fanp_menu_box\">\n");
      out.write("      <p class=\"fanp_menu_title\">メッセージをパーソナライズ<br>して届けられる</p>\n");
      out.write("      <p class=\"fanp_menu_explain\">管理画面からコンテンツを設定してユーザーを<br>選んで配信。メルマガより手軽に作れて、<br>パーソナライズ配信までできる。</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fanp_display_sample_img\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section id=\"step\" class=\"step\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h3 class=\"section_title\">fanp Adによる<br>コンバージョンまでの流れ</h3>\n");
      out.write("    <ul class=\"step_list\">\n");
      out.write("      <li>Facebook広告から<br class=\"sp\">直接<br class=\"pc\">Messengerボット<br class=\"sp\">にリンク</li>\n");
      out.write("      <li>Messengerボットの<br>会話によるサービス<br class=\"sp\">紹介</li>\n");
      out.write("      <li>申込・登録をチャット上<br class=\"sp\">で完了<br>（コンバージョン）</li>\n");
      out.write("      <li>各ユーザーのスコアに<br class=\"sp\">応じた<br class=\"pc\">チャット配信で<br class=\"sp\">ナーチャリング</li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"start\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <a href=\"http://zeals.co.jp/#contact\" class=\"start_button_white\">まずは資料請求</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section class=\"publish\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <p class=\"publish_title\">掲載メディア</p>\n");
      out.write("    <ul class=\"publish_list pc\">\n");
      out.write("      <li class=\"pr_times\">\n");
      out.write("        <a href=\"https://fanp.me/ad\" target=\"_blank\"><img src=\"image/logo_prtimes.png\"></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"tech_crunch\">\n");
      out.write("        <a href=\"https://fanp.me/ad\" target=\"_blank\"><img src=\"image/logo_tech_crunch.png\"></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"the_bridge\">\n");
      out.write("        <a href=\"https://fanp.me/ad\" target=\"_blank\"><img src=\"image/logo_the_bridge.png\"></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"dijimalab\">\n");
      out.write("        <a href=\"https://fanp.me/ad\" target=\"_blank\"><img src=\"image/logo_dijimalab.png\"></a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <div class=\"sp_publish sp\"><img src=\"image/sp_media_logo.png\"></div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"fb-area\">\n");
      out.write("\n");
      out.write("  <div class=\"fb-page zeals_fb\" data-href=\"https://www.facebook.com/fanp.me/\" data-tabs=\"timeline,messages\" data-small-header=\"false\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\"><blockquote cite=\"https://www.facebook.com/fanp.me/\" class=\"fb-xfbml-parse-ignore\"><a href=\"https://www.facebook.com/fanp.me/\">Fanp-ファンプ</a></blockquote></div>\n");
      out.write("\n");
      out.write("  <div class=\"fb-page\" data-href=\"https://www.facebook.com/zeals.co.jp\" data-tabs=\"timeline,messages\" data-small-header=\"false\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\"><blockquote cite=\"https://www.facebook.com/zeals.co.jp\" class=\"fb-xfbml-parse-ignore\"><a href=\"https://www.facebook.com/zeals.co.jp\">ZEALS - ジールス</a></blockquote></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\" class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <ul class=\"footer_list\">\n");
      out.write("        <li><a href=\"http://zeals.co.jp/wp-content/uploads/2017/05/b0dffca4c1505995340ac3e183350782.pdf\" target=\"_blank\">プライバシーポリシー</a></li>\n");
      out.write("        <li><a href=\"http://zeals.co.jp/\" target=\"_blank\">会社概要</a></li>\n");
      out.write("        <li><a href=\"http://zeals.co.jp/wp-content/uploads/2017/08/0f289337684b2b9a44957b75b8af0917.pdf\">特定商取引法に基づく表記</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"logo_fanp_ad_white sp\"><a href=\"https://fanp.me/ad\"><img src=\"image/logo_fanp_ad_white.png\"></a></div>\n");
      out.write("      <p class=\"copy_right_text\">©2016 ZEALS Co.,Ltd.</p>\n");
      out.write("      <div class=\"logo_fanp_ad_white pc\"><a href=\"https://fanp.me/ad\"><img src=\"image/logo_fanp_ad_white.png\"></a></div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Facebook Pixel Code -->\n");
      out.write("<script>\n");
      out.write("!function(f,b,e,v,n,t,s){if(f.fbq)return;n=f.fbq=function(){n.callMethod?\n");
      out.write("n.callMethod.apply(n,arguments):n.queue.push(arguments)};if(!f._fbq)f._fbq=n;\n");
      out.write("n.push=n;n.loaded=!0;n.version='2.0';n.queue=[];t=b.createElement(e);t.async=!0;\n");
      out.write("t.src=v;s=b.getElementsByTagName(e)[0];s.parentNode.insertBefore(t,s)}(window,\n");
      out.write("document,'script','https://connect.facebook.net/en_US/fbevents.js');\n");
      out.write("fbq('init', '1878946495717506'); // Insert your pixel ID here.\n");
      out.write("fbq('track', 'PageView');\n");
      out.write("</script>\n");
      out.write("<noscript><img height='1' width='1' style='display:none'\n");
      out.write("src='https://www.facebook.com/tr?id=1878946495717506&ev=PageView&noscript=1'\n");
      out.write("/></noscript>\n");
      out.write("<!-- DO NOT MODIFY -->\n");
      out.write("<!-- End Facebook Pixel Code -->\n");
      out.write("\n");
      out.write("<div id=\"fb-root\"></div>\n");
      out.write("<!-- facobook -->\n");
      out.write("<script>(function(d, s, id) {\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("  if (d.getElementById(id)) return;\n");
      out.write("  js = d.createElement(s); js.id = id;\n");
      out.write("  js.src = \"//connect.facebook.net/ja_JP/sdk.js#xfbml=1&version=v2.9&appId=1294668920545482\";\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/fanp_plugin.min.js\" data-title=\"fanpAdメッセンジャーマガジンで最新情報をお届け！\" data-subtitle=\"Facebook MessengerにてfanpAdのノウハウなど配信しています。\" data-btn-title=\"クリックして登録\" id=\"fanp_plugin\" data-img-url=\"https://graph.facebook.com/v2.7/114042472557536/picture\" data-link-url=\"https://m.me/ngocan232\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write(" <!-- \n");
      out.write("<div id=\"coFrameDiv\" style=\"height:0px;display:none;\"><iframe id=\"coToolbarFrame\" src=\"./fanpAd (ファンプ・アド) _ Facebook Messenger専用_会話広告(チャットボット)_サービス_files/placeholder.html\" style=\"height: 0px; width: 100%; display: none;\"></iframe></div></html>\n");
      out.write("-->");
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
