/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author raju
 */
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            
     
            HttpSession session=request.getSession();
            Object rs=session.getAttribute("rs");
            Object name=session.getAttribute("name");
            response.setHeader("Cache-Control","No-Cache");
            response.setHeader("Cache-Control","No-Store");
            if(rs!=null)
            {
//            out.println("<h1>Home Page</h1>");
//            out.println("<h1 style='color:white;'>Welcome  :"+name+"</h1>");
////            out.println("<h1>"+"Father'Name :"+fname+"</h1>");
////            out.println("<h1>"+"Gender :"+gender+"</h1>");
////            out.println("<a href='./Profile'>"+"profile"+"</a>");
//            out.println(""+"<a href='changepass.html'>"+"Change password"+"</a>");
//             out.println(""+"<a href='LogOut'>"+"LogOut"+"</a>");

out.print("<html>\n" +
"<head>\n" +
"	<meta charset=\"utf-8\">\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	<!-- Bootstrap CSS -->\n" +
"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
"	<title>Learning.hub.com</title>\n" +
"	<style type=\"text/css\">\n" +
"		/**{\n" +
"			margin: 0!important;\n" +
"			padding: 0!important;\n" +
"		}*/\n" +
"		.main\n" +
"		{\n" +
"			background-image: url(bg2.jpeg);\n" +
"			/*height: 100!important;*/\n" +
"			background-color: red;\n" +
"			/*background-repeat: no-repeat;*/\n" +
"		}\n" +
"		.main1{\n" +
"			color: white!important;\n" +
"			background-color: rgba(0, 0, 0, 0.6);\n" +
"			border:5px solid red!important;\n" +
"			/*height: 100vh!important;*/\n" +
"			background-repeat: no-repeat;\n" +
"		}\n" +
"		.nav1{\n" +
"			background-color: black!important;\n" +
"		}\n" +
"		a:hover\n" +
"		{\n" +
"			color:green!important;\n" +
"		}\n" +
"		a{\n" +
"			font-weight: bolder!important;\n" +
"			font-size: 20px!important;\n" +
"		}\n" +
"		ul {\n" +
"			text-align: center!important;\n" +
"			margin-left:40%!important;\n" +
"			line-height: 50px!important;\n" +
"		}\n" +
"		ul li{\n" +
"			padding-left:50px!important\n" +
"		}\n" +
"		button:hover\n" +
"		{\n" +
"			background-color: red;\n" +
"			border-radius: 40px;\n" +
"			height: 50px;\n" +
"			/*color: black;*/\n" +
"			padding: 0!important;\n" +
"		}\n" +
"		button\n" +
"		{\n" +
"			\n" +
"			border-radius: 40px;\n" +
"			height: 50px;\n" +
"			padding: 0!important;\n" +
"		}\n" +
"		h5{\n" +
"			color:red!important;\n" +
"			font-weight: bolder!important;\n" +
"		}\n" +
"		p{\n" +
"			color:black;!important;\n" +
"			border: 3px solid white;\n" +
"			text-align: justify!important;\n" +
"		}\n" +
"		\n" +
"		</style>\n" +
"	\n" +
"</head>");


out.print("<body style='background-image:url(bg2.jpeg);'>");
out.print("<nav class=\" sticky-top\" style=' font-family: verdana;\n" +
"             " +
"              margin:0px 0px 0px 0px;\n" +
"              padding:0px 0px 0px 0px;\n" +
"              height:100px;\n" +
"              width: 100%;\n" +
"              background-color:rgba(0,0,0,0.6);\n" +
"              " +
"              z-index: 1;' >\n" +
"		<a style='text-decoration: none;\n" +
"            color:white;\n" +
"            font-size: 30px;\n" +
"         " +
"            font-family:all;\n" +
"            height: 100px;\n" +
"            width: 100px;\n" +
"            line-height: 100px;' href=\"\">Home </a>\n" +"\"<span style='color:white;'>Welcome  :\""+name+"\"</span>\""+
     "		<ul style='line-height: 50%;\n" +
"            float: right;\n" +
"            display: flex;\n" +
"            >\n" +
"			<li style='line-height: 50%;\n" +
"            list-style: none;'><a style='text-decoration: none;\n" +
"            color:white;\n" +
"            font-size: 30px;\n" +
"            padding-right: 80px;\n" +
"            font-family:all;\n" +
"            height: 100px;\n" +
"            width: 100px;\n" +
"            line-height: 100px;' href=\"./Profile\"><i class=\"fas fa-book-reader\"></i>profile</a></li>\n" +
"			<li styel='line-height: 70%;\n" +
"            list-style: none;'><a style='text-decoration: none;\n" +
"            color:white;\n" +
"            font-size: 30px;\n" +
"            padding-right: 80px;\n" +
"            font-family:all;\n" +
"            height: 100px;\n" +
"            width: 100px;\n" +
"            line-height: 100px;' href=\"changepass.html\"><i class=\"fas fa-user\"></i>Change Password</a></li>\n" +
"			\n" +
"			<li style='line-height: 50%;\n" +
"            list-style: none;'><a style='text-decoration: none;\n" +
"            color:white;\n" +
"            font-size: 30px;\n" +
"            padding-right: 80px;\n" +
"            font-family:all;\n" +
"            height: 100px;\n" +
"            width: 100px;\n" +
"            line-height: 100px;'   href=\"LogOut\"><i class=\"fas fa-sign-in-alt\"></i>LogOut</a></li>\n" +
"		</ul>\n" +
"	</nav>"+"<!-- 1div -->\n" +
"	<div class=\"container my-3 p-3 \">\n" +
"	 <div class=\"container\">\n" +
"	 <div class=\"row align-items-start\">\n" +
" <div class=\"col-4\">\n" +
"		       <div class=\"card mb-3\" style=\"max-height:940px!important;\">\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"java.png\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">JAVA</h5>\n" +
"        <p class=\"card-text\">Java is the #1 programming language and development platform. It reduces costs, shortens development timeframes, drives innovation, and improves application services. With millions of developers running more than 51 billion Java Virtual Machines worldwide, Java continues to be the development platform of choice for enterprises and developers.</p><p style=\"color:white!important;\">max-height:940px!importantmax-</p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://docs.oracle.com/javase/tutorial/\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>			    \n" +
" </div>\n" +
" <div class=\"col-4\">\n" +
" 	       <div class=\"card mb-3\" style=\"max-height:940px!important; \">\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"html.png\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">HTML</h5>\n" +
"        <p class=\"card-text\">The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets and scripting languages such as JavaScript.</p><p>Developed by: WHATWG\n" +
"Initial release: 1993; 29 years ago\n" +
"Latest release: Living Standard; 2022\n" +
"Extended from: SGML\n" +
"Extended to: XHTML\n" +
"Contained by: Web browser</p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://en.wikipedia.org/wiki/HTML\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"col-4\">\n" +
" 	       <div class=\"card mb-3\" style=\"max-width: 540px;\">\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"css.png\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">CSS</h5>\n" +
"        <p class=\"card-text\">Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.</p><p>Developed by: World Wide Web Consortium (W3C)\n" +
"Initial release: December 17, 1996; 25 years ago\n" +
"Latest release: CSS 2.1: Level 2 Revision 1; April 12, 2016; 5 years ago\n" +
"Container for: Style rules for HTML elements (tags)</p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://en.wikipedia.org/wiki/CSS\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
" </div>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"<!-- 1div -->\n" +
"	<div class=\"container my-3 p-3 \">\n" +
"	 <div class=\"container\">\n" +
"	 <div class=\"row align-items-start\">\n" +
" <div class=\"col-4\">\n" +
"		       <div class=\"card mb-3\" style=\"max-width: 540px;\">\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"bs.jpeg\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">BOOTSTRAP</h5>\n" +
"        <p class=\"card-text\">Bootstrap is a free and open-source CSS framework directed at responsive, mobile-first front-end web development. It contains CSS and JavaScript-based design templates for typography, forms, buttons, navigation, and other interface components.</p><p>Developer(s): Bootstrap Core Team\n" +
"License: MIT License (Apache License 2.0 prior to 3.1.0)\n" +
"Repository: Bootstrap Repository\n" +
"Written in: HTML, CSS, Less (v3), Sass (v4) and JavaScript\n" +
"Stable release: 5.1.3 / 9 October 2021; 4 months ago\n" +
"Original author(s): Mark Otto, Jacob Thornton\n" +
"Initial release: August 19, 2011; 10 years ago</p><p style=\"color:white!important;\">ma</p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://en.wikipedia.org/wiki/Bootstrap_(front-end_framework)\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>			    \n" +
" </div>\n" +
" <div class=\"col-4\">\n" +
" 	       <div class=\"card mb-3\" >\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"js.png\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">JAVA SCRIPT</h5>\n" +
"        <p class=\"card-text\">JavaScript, often abbreviated JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. Over 97% of websites use JavaScript on the client side for web page behavior, often incorporating third-party libraries. </p><p>Designed by: Brendan Eich of Netscape initially; others have also contributed to the ECMAScript standard\n" +
"First appeared: December 4, 1995; 26 years ago\n" +
"Paradigm: Multi-paradigm: event-driven, functional, imperative, object-oriented programming\n" +
"Typing discipline: Dynamic, weak, duck\n" +
"Stable release: ECMAScript 2021 / June 2021; 8 months ago</p><p style=\"color:white!important;\"></p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://en.wikipedia.org/wiki/JavaScript\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"col-4\">\n" +
" 	       <div class=\"card mb-3\" >\n" +
"           <div class=\"row g-0\">\n" +
"          <div class=\"col-md-4\">\n" +
"          <img src=\"sql.png\" class=\"img-fluid rounded-start\" alt=\"...\">\n" +
"          </div>\n" +
"        <div class=\"col-md-8\">\n" +
"        <div class=\"card-body\">\n" +
"        <h5 class=\"card-title\">SQL</h5>\n" +
"        <p class=\"card-text\">SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system, or for stream processing in a relational data stream management system. </p><p>Developer: ISO/IEC\n" +
"Paradigm: Declarative\n" +
"Family: Query language\n" +
"Typing discipline: Static, strong\n" +
"Stable release: SQL:2016 / December 2016; 5 years ago\n" +
"Designed by: Donald D. Chamberlin; Raymond F. Boyce\n" +
"First appeared: 1974; 48 years ago</p><p style=\"color:white!important;\">wwwwwwwwwwwwwwwwwwwwwwwwwwwwaaaaaaaaaaaaaaaaaaasssssssddddddddddddddddddddddddddddddddddddd</p>\n" +
"<button class=\"btn  btn-sm\"><a class=\"nav-link\" href=\"https://en.wikipedia.org/wiki/SQL\" target=\"_blank\">Start Learning..</a></button>      </div>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
" </div>\n" +
"</div>\n" +
"</div>\n" +
"</div>\n" +
"  <!-- end -->\n" +
"  </div>\n" +
"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>");

out.print("</body>");
out.print("</html");
            }
            else
            {
                response.sendRedirect("Login.html");
            }
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
