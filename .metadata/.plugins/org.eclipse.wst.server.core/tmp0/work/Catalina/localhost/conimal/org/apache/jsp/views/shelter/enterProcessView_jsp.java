/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-28 15:28:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.shelter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enterProcessView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/shelter/../common/menubar.jsp", Long.valueOf(1622202128832L));
    _jspx_dependants.put("/views/shelter/../common/footerbar.jsp", Long.valueOf(1621691423750L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t.content{\r\n");
      out.write("\t\twidth: 1200px;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t.process-area{\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("\t\tjustify-content: space-between;\r\n");
      out.write("\t\tmargin-left: 15%;\r\n");
      out.write("\t\tmargin-right: 15%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.pa{\r\n");
      out.write("\t\tbackground: #e0e0e0;\r\n");
      out.write("\t\twidth: 180px;\r\n");
      out.write("\t\theight: 240px;\r\n");
      out.write("\t\tborder-radius: 30px;\r\n");
      out.write("\t}\r\n");
      out.write("    .shelter-area{\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: wrap;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("    }\r\n");
      out.write("    .sh{\r\n");
      out.write("\t\tbackground: #e0e0e0;\r\n");
      out.write("        width: 400px;\r\n");
      out.write("        height: 100px;\r\n");
      out.write("        margin: 15px;\r\n");
      out.write("\t}\r\n");
      out.write("    table{\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        margin-top: 4%;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    td{padding: 3px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();

	String alertMsg = (String)session.getAttribute("alertMsg");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .on{\r\n");
      out.write("         width: 1200px;\r\n");
      out.write("         height: 180px;         \r\n");
      out.write("         margin: 0 auto;\r\n");
      out.write("         }\r\n");
      out.write("    .mainLogo{\r\n");
      out.write("\r\n");
      out.write("        margin-left: 302px;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login {           \r\n");
      out.write("        float:right; \r\n");
      out.write("        margin-top:40px;\r\n");
      out.write("     }\r\n");
      out.write("   #loginform>*{\r\n");
      out.write("    \r\n");
      out.write("    float:left;\r\n");
      out.write("    }\r\n");
      out.write("    .id_pwd{width: 65%; height: 70px; } .loginbtn{width: 35%;}\r\n");
      out.write("\r\n");
      out.write("    .pwd,.id{\r\n");
      out.write("        color: rgb(94, 94, 94);\r\n");
      out.write("        border-style: solid; \r\n");
      out.write("        border-color: rgb(204, 204, 204);\r\n");
      out.write("        width:100%;\r\n");
      out.write("        height:50%;\r\n");
      out.write("    }\r\n");
      out.write("    .loginbtn>input{        \r\n");
      out.write("        font-size: 24px; \r\n");
      out.write("        width: 80%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        color: rgb(255, 255, 255); \r\n");
      out.write("        line-height: 3.2em;        \r\n");
      out.write("        background-color: rgb(171, 198, 223); \r\n");
      out.write("        text-align: center;\r\n");
      out.write("        border-radius: 4px;        \r\n");
      out.write("        border:0px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .find{\r\n");
      out.write("    text-decoration-line: underline;\r\n");
      out.write("    font-style: italic;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    line-height: 3.2em;      \r\n");
      out.write("    }\r\n");
      out.write("               \r\n");
      out.write("    .navi{\r\n");
      out.write("            width: 1200px; height: 55px;\r\n");
      out.write("            background-color: rgb(187, 208, 227);            \r\n");
      out.write("            margin: 0 auto;         \r\n");
      out.write("     }\r\n");
      out.write("     #navi1{\r\n");
      out.write("            list-style-type:none;\r\n");
      out.write("            margin:0;\r\n");
      out.write("            padding:0;\r\n");
      out.write("            height:100%;\r\n");
      out.write("            text-decoration:none;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("        #navi1>li{\r\n");
      out.write("            margin-left: 8px;\r\n");
      out.write("            float:left;\r\n");
      out.write("            width:16%;\r\n");
      out.write("            height:100%;\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("        #navi1 a{\r\n");
      out.write("            line-height: 2.8em; \r\n");
      out.write("            font-size: 20px; \r\n");
      out.write("            color: rgb(110, 109, 109);\r\n");
      out.write("            font-family: HanSans; \r\n");
      out.write("            width: 16.6%;   \r\n");
      out.write("            font-weight: bold; \r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("            height:100%;\r\n");
      out.write("            width:100%;\r\n");
      out.write("            display:block;\r\n");
      out.write("            text-decoration:none; \r\n");
      out.write("            z-index: 6;\r\n");
      out.write("        }\r\n");
      out.write("        #navi1 a:hover{color: white;}\r\n");
      out.write("        #navi1>li>ul{\r\n");
      out.write("            list-style-type:none;\r\n");
      out.write("            display:none;           \r\n");
      out.write("            margin-top:0px;\r\n");
      out.write("            padding:10px;\r\n");
      out.write("            background-color: rgb(184, 183, 183); \r\n");
      out.write("            font-family: HanSans;            \r\n");
      out.write("            line-height: 2.8em; \r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            z-index: 6;\r\n");
      out.write("        }\r\n");
      out.write("        #navi1>li>ul a{font-size:15px;}\r\n");
      out.write("        #navi1>li>a:hover+ul{display:block;}\r\n");
      out.write("        #navi1>li>ul:hover{display:block;}\r\n");
      out.write("     </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar msg = \"");
      out.print( alertMsg );
      out.write("\";\r\n");
      out.write("\t\t// var msg = \"메세지\" / \"null\"\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(msg != \"null\") {\r\n");
      out.write("\t\t\talert(msg);\r\n");
      out.write("\t\t\t// 알림창을 띄워준 후 session에 담긴 해당 메시지는 지워줘야한다\r\n");
      out.write("\t\t\t// 안그러면 menubar.jsp가 로딩될때마다 매번 alert가 뜸\r\n");
      out.write("\t\t\t");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"on\">  \r\n");
      out.write("\r\n");
      out.write("                    <image src=\"resources/images/mainLogo.png\" width=\"558px\" height=\"120px\" class=\"mainLogo\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"login\" align=\"center\">\r\n");
      out.write("                   \r\n");
      out.write("                            <form action=\"\" id=\"loginform\">                \r\n");
      out.write("                           \r\n");
      out.write("                                <div class=\"id_pwd\">        \r\n");
      out.write("                                    <input type=\"text\" class=\"id\" value=\"아이디\"><br>\r\n");
      out.write("                                    <input type=\"password\" class=\"pwd\" value=\"비밀번호\" >                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                         \r\n");
      out.write("                                <div class=\"loginbtn\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"login\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>      \r\n");
      out.write("                            <span class=\"find\">ID/PW 찾기 | 회원가입</span>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                       \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navi\">                \r\n");
      out.write("                    <ul id=\"navi1\" >\r\n");
      out.write("                        <li><a href=\"\">코니멀 소개</a></li>\r\n");
      out.write("                        <li><a href=\"\">보호소</a></li>\r\n");
      out.write("                        <li><a href=\"\">입양문의</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath);
      out.write("/list.dog?currentPage=1\">보호중인 동물</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath);
      out.write("/process.ad\">입양 절차</a></li>\r\n");
      out.write("                                <li><a href=\"\">입양 신청</a></li>\r\n");
      out.write("                                <li><a href=\"\">입양 후기</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"\">입소문의</a>                        \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"");
      out.print(contextPath);
      out.write("/process.en\">입소 절차</a></li>\r\n");
      out.write("                                <li><a href=\"\">입소 신청</a></li>                      \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"\">후원 &amp; 자원봉사</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.print(contextPath);
      out.write("/list.vo?currentPage=1\">자원봉사</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.print(contextPath);
      out.write("/list.do?currentPage=1\">후원</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>\r\n");
      out.write("                        <li><a href=\"\">커뮤니티</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">자유 게시판</a></li>\r\n");
      out.write("                            <li><a href=\"\">공지사항</a></li>\r\n");
      out.write("                            <li><a href=\"\">고객센터</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("            </div>            \r\n");
      out.write("        \r\n");
      out.write("           \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t    <br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t    <h2 align=\"center\">입소 절차</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t    <p class=\"info\" align=\"center\">\r\n");
      out.write("\t        코니멀은 아이가 정말로 좋아할 수 있는 안락하고 행복한 생활을 지향합니다\r\n");
      out.write("\t    </p>\r\n");
      out.write("\t\r\n");
      out.write("\t    <br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"process-area\">\r\n");
      out.write("\t        <div class=\"pa\" align=\"center\">\r\n");
      out.write("\t            <br><br><br>\r\n");
      out.write("\t            <img src=\"resources/images/phone.png\" width=\"80\">\r\n");
      out.write("\t            <br><br>\r\n");
      out.write("\t            <h5>입소 상담 신청</h5>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"pa\" align=\"center\">\r\n");
      out.write("\t            <br><br><br>\r\n");
      out.write("\t            <img src=\"resources/images/house.png\" width=\"80\">\r\n");
      out.write("\t            <br><br>\r\n");
      out.write("\t            <h5>보호소 방문</h5>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"pa\" align=\"center\">\r\n");
      out.write("\t            <br><br><br>\r\n");
      out.write("\t            <img src=\"resources/images/people.png\" width=\"80\">\r\n");
      out.write("\t            <br><br>\r\n");
      out.write("\t            <h5>방문 상담</h5>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"pa\" align=\"center\">\r\n");
      out.write("\t            <br><br><br>\r\n");
      out.write("\t            <img src=\"resources/images/success.png\" width=\"80\">\r\n");
      out.write("\t            <br><br>\r\n");
      out.write("\t            <h5>입소 완료</h5>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t    <br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t    <div class=\"shelter-area\">\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"sh\">\r\n");
      out.write("\t            <table>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td width=\"250\">XX보호소</td>\r\n");
      out.write("\t                    <td><button type=\"button\" class=\"btn btn-primary\">입소상담</button></td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                    <td>서울시 강남구 테헤란로 14길 6</td>\r\n");
      out.write("\t                    <td>02-1234-5678</td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t            </table>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" .footerbar{\r\n");
      out.write("        \r\n");
      out.write("         width: 1200px;\r\n");
      out.write("         height: 180px;\r\n");
      out.write("         margin: 0 auto;\r\n");
      out.write("     }\r\n");
      out.write("     .call{\r\n");
      out.write("         width:30%;\r\n");
      out.write("         height: 100%;\r\n");
      out.write("         float:left;\r\n");
      out.write("         margin-left: 60px;\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("     .minLogo{\r\n");
      out.write("                 \r\n");
      out.write("         padding-top: 30px;\r\n");
      out.write("         height: 100%;\r\n");
      out.write("         float:left;  \r\n");
      out.write("     }\r\n");
      out.write("     .ex{\r\n");
      out.write("        width:40%;\r\n");
      out.write("        float:left;        \r\n");
      out.write("        height:100%; \r\n");
      out.write("        padding-top: 25px; \r\n");
      out.write("    }\r\n");
      out.write("     .ect{\r\n");
      out.write("        \r\n");
      out.write("        font-size: 13px; \r\n");
      out.write("        color: rgb(127, 127, 127);\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        width:450px;\r\n");
      out.write("        padding-left: 60px;\r\n");
      out.write("       \r\n");
      out.write("     }\r\n");
      out.write("     .ect2{\r\n");
      out.write("        font-weight: bold; font-size: 24px; text-align: center; color: rgb(94, 94, 94);\r\n");
      out.write("     }\r\n");
      out.write("     .ect3{\r\n");
      out.write("        font-weight: bold; font-size: 33px; text-align: center; color: rgb(94, 94, 94);\r\n");
      out.write("     }\r\n");
      out.write("     #al{                   \r\n");
      out.write("        width: 250px;\r\n");
      out.write("        padding-left: 125px;   \r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"footerbar\">\r\n");
      out.write("            <div class=\"minLogo\">\r\n");
      out.write("                <div>\r\n");
      out.write("                 <image src=\"resources/images/mainLogo.png\" width=\"300\" height=\"60\"></image>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"ex\">\r\n");
      out.write("             <div class=\"ect\">\r\n");
      out.write("                    본사 : 서울특별시 강남구 테헤란로 14길 6 남도빌딩 3F, 4F, 5F<br><br>\r\n");
      out.write("            \r\n");
      out.write("                    상호 : (주) 코니멀 대표자: 김현솔 | 사업자 등록번호 : 987-65-12345 <br><br>    \r\n");
      out.write("                \r\n");
      out.write("                    신고 : 112 | 개인정보보호책임자 : 김아무개<br><br> \r\n");
      out.write("          \r\n");
      out.write("                    TEL : 1235-9876 | FAX : 02 - 1234 - 9876 | 이메일  :  conimal@gmail.com\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("            <div class=\"call\">\r\n");
      out.write("                <div class=\"ect2\" >\r\n");
      out.write("                    고객센터\r\n");
      out.write("                    <div class=\"ect3\">\r\n");
      out.write("                    1235-9876\r\n");
      out.write("                                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"ect\" id=\"al\">                    \r\n");
      out.write("                    평일 : 10:00-16:00<br>\r\n");
      out.write("                    점심시간 : 13:00-14:00<br>\r\n");
      out.write("                    (토/일/공휴일은 휴뮤입니다.)                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
