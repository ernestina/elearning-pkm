/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserList;

/**
 *
 * @author Accio
 */
public class LoginServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            UserList usr = new UserList();
            User user = new User();
            user = usr.getUser(username,password);

            if (username.equals("") || password.equals("")) {
                //request.setAttribute("error", "Username/Password tidak boleh kosong!");
                //request.getRequestDispatcher("/index2.jsp").forward(request, response);
                out.println("Username dan password tidak boleh kosong!");
                request.getRequestDispatcher("index.jsp").include(request, response);
            } else if (usr.check(username,password) == false) {
                //request.setAttribute("error2", "Username/Password tidak terdaftar");
                //request.getRequestDispatcher("/index2.jsp").forward(request, response);
                out.println("Username dan password tidak terdaftar!");
                request.getRequestDispatcher("index.jsp").include(request, response);
            } else {
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                session.setAttribute("role", user.getRoleId().getRoleId());
                session.setAttribute("id", user.getId());
                response.sendRedirect("home"); //om kok kl pake yang dibawah baru mau ya???
                //request.getRequestDispatcher("/home").forward(request, response);

            }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
