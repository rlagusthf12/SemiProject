/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-31 05:01:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.shelter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.common.model.vo.PageInfo;
import java.util.ArrayList;
import com.kh.shelter.model.vo.Shelter;
import com.kh.member.model.vo.Member;

public final class shelterListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/shelter/../common/menubar.jsp", Long.valueOf(1622436758150L));
    _jspx_dependants.put("/views/shelter/../common/footerbar.jsp", Long.valueOf(1621691423750L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.common.model.vo.PageInfo");
    _jspx_imports_classes.add("com.kh.shelter.model.vo.Shelter");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
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

      out.write('\r');
      out.write('\n');

	PageInfo pi = (PageInfo)request.getAttribute("pi");
	ArrayList<Shelter> list = (ArrayList<Shelter>)request.getAttribute("list");
	
	int currentPage = pi.getCurrentPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	int maxPage = pi.getMaxPage();

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.content{\r\n");
      out.write("\t\twidth: 1200px;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t.content-area{\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("\t\tflex-direction: row;\r\n");
      out.write("\t\tflex-wrap: wrap;\r\n");
      out.write("\t}\r\n");
      out.write("\t.pet img{\r\n");
      out.write("\t\twidth: 280px;\r\n");
      out.write("\t\theight: 200px;\r\n");
      out.write("\t\tmargin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.pagination{\r\n");
      out.write("    \tjustify-content: center;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();
	Member loginUser = (Member)session.getAttribute("loginUser");
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
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
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
      out.write("                    <img src=\"resources/images/mainLogo.png\" width=\"558px\" height=\"120px\" class=\"mainLogo\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"login\" align=\"center\">\r\n");
      out.write("                            ");
 if(loginUser == null){ 
      out.write("   \r\n");
      out.write("                            <form action=\"");
      out.print( contextPath );
      out.write("/login.me\" id=\"loginform\" method=\"POST\">                \r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"id_pwd\">        \r\n");
      out.write("                                    <input type=\"text\" class=\"id\" placeholder=\"아이디\" name=\"memId\" required><br>\r\n");
      out.write("                                    <input type=\"password\" class=\"pwd\" placeholder=\"비밀번호\" name=\"memPwd\" required>                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                         \r\n");
      out.write("                                <div class=\"loginbtn\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"login\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </form>      \r\n");
      out.write("                            <a href = \"");
      out.print(contextPath);
      out.write("/searchIdPwd.me\" id=\"searchMem\" style=\"font-style: normal; text-decoration: none; color: black;\" class=\"find\">ID/PW 찾기</a> | \r\n");
      out.write("                            <a href = \"");
      out.print(contextPath);
      out.write("/joinChooseForm.me\" id=\"enrollMem\" style=\"font-style: normal; text-decoration: none; color: black;\" class=\"find\">회원가입</a>\r\n");
      out.write("                        </div>   \r\n");
      out.write("                        \r\n");
      out.write("          \r\n");
      out.write("                        <script>\r\n");
      out.write("                        \r\n");
      out.write("                            function enrollPage(){\r\n");
      out.write("                                //location.href = \"");
      out.print( contextPath );
      out.write("/views/member/memberEnrollForm.jsp\";\r\n");
      out.write("                                // 웹 애플리케이션의 디렉토리 구조가 url에 노출되면 보안에 위험함\r\n");
      out.write("                                \r\n");
      out.write("                                // 단순한 정적인 페이지 요청이라고 해도 반드시 servlet거쳐갈 것! => url에서 서블릿 매핑값만 노출됨\r\n");
      out.write("                                location.href=\"");
      out.print( contextPath);
      out.write("/enrollForm.me\";\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                            <div id=\"user-info\">\r\n");
      out.write("                                <b>");
      out.print(loginUser.getMemName() );
      out.write("님</b>의 방문을 환영합니다. <br><br>\r\n");
      out.write("                                <div align=\"center\">\r\n");
      out.write("                                <a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이페이지</a> \r\n");
      out.write("                                <a href=\"");
      out.print( contextPath );
      out.write("/logout.me\">로그아웃</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"navi\">                \r\n");
      out.write("                    <ul id=\"navi1\" >\r\n");
      out.write("                        <li><a href=\"\">코니멀 소개</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.print(contextPath);
      out.write("/list.sh?currentPage=1\">보호소</a></li>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h2 align=\"center\">보호소 소개</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- <div class=\"search-area\">\r\n");
      out.write("\t\t\t<form action=\"\" method=\"post\" id=\"area2\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"keyword\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<select name=\"area\" id=\"area1\">\r\n");
      out.write("\t\t\t\t<option value=\"seoul\">서울</option>\r\n");
      out.write("\t\t\t\t<option value=\"gyeonggi\">경기</option>\r\n");
      out.write("\t\t\t\t<option value=\"busan\">부산</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t<div class=\"search-area\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"area\" id=\"area1\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"seoul\">서울</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"gyeonggi\">경기</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"busan\">부산</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"keyword\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<br clear=\"both\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"content-area\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
if(list.isEmpty()) {
      out.write("\r\n");
      out.write("\t\t\t\t조회된 결과가 없습니다\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t");
for(Shelter s : list) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"pet\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(contextPath);
      out.write("/detail.sh?sno=");
      out.print(s.getMemNo());
      out.write("\" ><img src=\"resources/images/dog.png\" class=\"img-thumbnail\" alt=\"Cinque Terre\"></a><br>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(s.getShName() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\t\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div align=\"center\" class=\"paging-area\">\r\n");
      out.write("\t\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t");
if(currentPage != 1) { 
      out.write("\r\n");
      out.write("\t            \t<li class=\"page-item\"><a href=\"");
      out.print(contextPath);
      out.write("/list.sh?currentPage=");
      out.print(currentPage-1);
      out.write("\" class=\"page-link\">이전</a></li>\r\n");
      out.write("\t            ");
} else {
      out.write("\r\n");
      out.write("\t            \t<li class=\"page-item disabled\"><a class=\"page-link\">이전</a></li>\r\n");
      out.write("\t            ");
} 
      out.write("\r\n");
      out.write("\t            \r\n");
      out.write("\t\t        ");
for(int p = startPage; p <= endPage; p++) { 
      out.write("\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        \t");
if(p != currentPage) {
      out.write("\r\n");
      out.write("\t\t        \t\t<li class=\"page-item\"><a href=\"");
      out.print(contextPath);
      out.write("/list.sh?currentPage=");
      out.print(p);
      out.write("\" class=\"page-link\">");
      out.print(p);
      out.write("</a></li>\r\n");
      out.write("\t\t        \t");
} else { 
      out.write("\r\n");
      out.write("\t\t        \t\t<li class=\"page-item active\"><a class=\"page-link\">");
      out.print(p);
      out.write("</a></li>\r\n");
      out.write("\t\t        \t");
} 
      out.write("\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        ");
} 
      out.write(" \r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        ");
if(currentPage != maxPage) {
      out.write("\r\n");
      out.write("\t            \t<li class=\"page-item\"><a href=\"");
      out.print(contextPath );
      out.write("/list.sh?currentPage=");
      out.print(currentPage+1 );
      out.write("\" class=\"page-link\">다음</a></li>\r\n");
      out.write("\t            ");
} else {
      out.write("\r\n");
      out.write("\t            \t<li class=\"page-item disabled\"><a class=\"page-link\">다음</a></li>\r\n");
      out.write("\t            ");
} 
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
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
      out.write("\t\r\n");
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
