/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.UserList;

/**
 *
 * @author Maccio
 */
public class ProsesRegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String idnumber = request.getParameter("idnumber");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String password2 = request.getParameter("password2");
            String role = request.getParameter("role");
            String schoolnameinput = request.getParameter("schoolnameinput");
            String schoolemail = request.getParameter("schoolemail");
            String schoolbrowse = request.getParameter("schoolbrowse");

            UserList daftarUser = new UserList();
            User user = new User();

            String jsp = "";

            if ("".equals(fname)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                jsp = "/registration.jsp";
            } else if ("".equals(lname)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                jsp = "/registration.jsp";
            }
             else if ("".equals(idnumber)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                jsp = "/registration.jsp";
            } else if ("".equals(username)) {
                JOptionPane.showMessageDialog(null, "Username tidak boleh kosong !");
                jsp = "/registration.jsp";
            } else if ("".equals(password)) {
                JOptionPane.showMessageDialog(null, "Password tidak boleh kosong !");
                jsp = "/registration.jsp";
            } else if ("".equals(password2)) {
                JOptionPane.showMessageDialog(null, "Konfirmasi Password tidak boleh kosong !");
                jsp = "/registration.jsp";
            } else if (!password.equals(password2)) {
                JOptionPane.showMessageDialog(null, "Input Password harus sama !");
                jsp = "/registration.jsp";
            } else if (daftarUser.isUsernameExist(username)) {
                JOptionPane.showMessageDialog(null, "Username sudah ada pada database !");
                jsp = "/registration.jsp";
            } else {
                user.setFName(fname);
                user.setLName(lname);
                user.setUsername(username);
                user.setPassword(password);
                user.setNipNis(idnumber);
                daftarUser.rekamUser(user);

                jsp = "home.jsp";
            }

            RequestDispatcher requestDispatcher = request.getRequestDispatcher(jsp);
            requestDispatcher.forward(request, response);

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
