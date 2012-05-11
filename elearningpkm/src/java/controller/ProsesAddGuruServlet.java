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
import javax.swing.JOptionPane;
import model.UserList;

/**
 *
 * @author Maccio
 */
public class ProsesAddGuruServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            Integer role = (Integer) session.getAttribute("role");
            Integer id = (Integer) session.getAttribute("id");
            if (role != null && role == 1) {
                String nipnis = request.getParameter("nipnis");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String uname = request.getParameter("uname");
                String password = request.getParameter("password");
                String conpass = request.getParameter("conpass");

                User user = new User();
                UserList userList = new UserList();

                if (nipnis.equals("")) {
                    JOptionPane.showMessageDialog(null, "NIP/NIS harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (uname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (conpass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Konfirmasi Password harus diisi !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (!conpass.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Password harus sama !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else if (userList.isUsernameExist(uname)) {
                    JOptionPane.showMessageDialog(null, "Username sudah terdaftar !");
                    request.getRequestDispatcher("/admin_manajemen_guru_add.jsp").forward(request, response);
                } else {
                    user.setNipNis(nipnis);
                    user.setFName(name);
                    user.setEmail(email);
                    user.setUsername(uname);
                    user.setPassword(password);
                    userList.rekamUser(user);
                    request.getRequestDispatcher("/admin_manajemen_guru.jsp").forward(request, response);
                }
            } else if (role == null) {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
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
