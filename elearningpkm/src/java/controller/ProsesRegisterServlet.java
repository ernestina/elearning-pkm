/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity2.School;
import entity2.User;
import entity2.UserRole;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import model.UserRoleList;
import model.SchoolList;
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
            String roleName = request.getParameter("role");
            Integer roleId = Integer.parseInt(roleName);
            String schoolname = request.getParameter("schoolname");
            String schoolemail = request.getParameter("schoolemail");
            String schoolbrowse = request.getParameter("schoolbrowse");

            SchoolList daftarSchool = new SchoolList();
            School school = new School();
            /*List<School> listSchool = daftarSchool.findSchoolById(schoolname);
            if (listSchool.isEmpty()) {
            school = null;
            } else {
            school = listSchool.get(0);
            
            }*/

            UserList daftarUser = new UserList();
            User user = new User();

            //UserRole roleUser = new UserRole();
            UserRoleList roleList = new UserRoleList();
            UserRole userRole = roleList.findUserRole(roleId);
            //List<UserRole> listRole = roleList.findUserRoleByName(roleName);



            String jsp = "";

            if ("".equals(fname)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if ("".equals(lname)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if ("".equals(idnumber)) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if ("".equals(username)) {
                JOptionPane.showMessageDialog(null, "Username tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if ("".equals(password)) {
                JOptionPane.showMessageDialog(null, "Password tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if ("".equals(password2)) {
                JOptionPane.showMessageDialog(null, "Konfirmasi Password tidak boleh kosong !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if (!password.equals(password2)) {
                JOptionPane.showMessageDialog(null, "Input Password harus sama !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else if (daftarUser.isUsernameExist(username)) {
                JOptionPane.showMessageDialog(null, "Username sudah ada pada database !");
                List<School> schoolList = daftarSchool.getSchool();
                request.setAttribute("schoolList", schoolList);
                //List<UserRole> userRole = roleList.getUserRole();
                //request.setAttribute("userRole", userRole);
                jsp = "/registration.jsp";
            } else {
                school.setSchoolName(schoolname);
                school.setSchoolEmail(schoolemail);
                daftarSchool.rekamSchool(school);

                user.setFName(fname);
                user.setLName(lname);
                user.setUsername(username);
                user.setPassword(password);
                user.setNipNis(idnumber);
                user.setRoleId(userRole);
                user.setSchoolName(schoolname);
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
