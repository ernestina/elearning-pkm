/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity2.User;
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
public class ProsesUbahProfilAdminServlet extends HttpServlet {

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
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String city = request.getParameter("city");
                String province = request.getParameter("province");
                String postcode = request.getParameter("postcode");
                String religion = request.getParameter("religion");
                String uname = request.getParameter("uname");
                String password = request.getParameter("password");
                String newpassword = request.getParameter("newpassword");
                String connewpass = request.getParameter("connewpass");

                UserList userList = new UserList();
                User user = userList.findUser(id);
                if (fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (lname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (address.equals("")) {
                    JOptionPane.showMessageDialog(null, "Alamat harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (city.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kota harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (province.equals("")) {
                    JOptionPane.showMessageDialog(null, "Provinsi harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (religion.equals("")) {
                    JOptionPane.showMessageDialog(null, "Agama harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (postcode.equals("")) {
                    JOptionPane.showMessageDialog(null, "Kode Pos harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (uname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (newpassword.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (connewpass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Konfirmasi Password harus diisi !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (!newpassword.equals(connewpass)) {
                    JOptionPane.showMessageDialog(null, "Input password harus sama !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (!password.equals(newpassword)) {
                    JOptionPane.showMessageDialog(null, "Input password baru masih sama !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else if (userList.isUsernameExist(uname)) {
                    JOptionPane.showMessageDialog(null, "Username sudah terdaftar !");
                    request.getRequestDispatcher("/admin_ubah_profil.jsp").forward(request, response);
                } else {
                    user.setFName(fname);
                    user.setLName(lname);
                    user.setAddress(address);
                    user.setEmail(email);
                    user.setReligion(religion);
                    user.setCity(city);
                    user.setProvince(province);
                    user.setPostcode(postcode);
                    user.setPassword(password);
                    user.setUsername(uname);
                    userList.updateUser(user);
                    request.getRequestDispatcher("/home_admin.jsp").forward(request, response);
                }
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
