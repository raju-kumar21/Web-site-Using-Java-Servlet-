/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author raju
 */
public class Profile extends HttpServlet {

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
            Object name=session.getAttribute("name");
//            Object fname=session.getAttribute("fname");
//            Object gender=session.getAttribute("gender");
//            Object phone=session.getAttribute("phone");
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Profile</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            
// out.print("<table border='5' cellpadding='10'>");
// out.print("<tr>");
// out.print("<th>"+"Name:"+"</th>");
// out.print("<td  >"+name+"</td>");
// out.print("</tr>");
// out.print("<tr>");
// out.print("<th >"+"Father's Name:"+"</th>");
// out.print("<td>"+fname+"</td>");
// out.print("</tr>");
// out.print("<tr>");
// out.print("<th >"+"Gender:"+"</th>");
// out.print("<td>"+gender+"</td>");
// out.print("</tr>");
// out.print("<tr>");
// out.print("<th >"+"Mobile:"+"</th>");
// out.print("<td >"+phone+"</td>");
// out.print("</tr>");
//out.print("</table>"); 
// out.println("</body>");out.println("</html>");           
            
            ResultSet rs=(ResultSet) session.getAttribute("rs");
            response.setHeader("Cache-Control","No-Cache");
            response.setHeader("Cache-Control","No-Store");
            try
            {
                ResultSetMetaData rsmd=rs.getMetaData();
                out.print("<body style='background-image:url(bg2.jpeg);'>");
                out.print("<button style=\"background-color:white\"><a href='Home' style=\"color:black\" >Back</a></button>");
                out.println("<h3 style='color:white; position:fixed; z-index:1;'>Wlecome "+"<span style='color:red;'>"+name+"</span>"+" Your Profile"+"</h3>");
                out.print("<div style='height:100%;width:100% padding:40%;  align:center; background-color:rgba(0,0,0,0.5);   '>");
                out.print("<table align='center' border='10' cellspacing='10'cellpadding='5' style='color:white; font-size:30px; border-radius:5px; border-color:white;' >");
                int i=1;
                while(i<rsmd.getColumnCount())
                {
                    out.print("<tr>");
                        out.print("<td>");
                        if(i==2)
                            i++;
                            out.print(rsmd.getColumnName(i));
                        out.print("</td>");   
                        out.print("<td>");
                       
                            out.print(rs.getString(i));
                        out.print("</td>"); 
                    out.print("</tr>"); 
                    i++;
                }
               out.print("</table>");
               out.print("</div>");
               out.print("</body>");
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                out.print(ex);
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
