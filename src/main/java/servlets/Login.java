/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import static dao.UserDao.getUserByUserName;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author asus
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        String userName, pass;
        try {
            userName = request.getParameter("user_name");
            pass = request.getParameter("pass");
        } catch (Exception e) {
            userName = "";
            pass = null;
        }

        User user = getUserByUserName(userName.trim());

        if (user != null && user.getPassword().equals(pass)) {
            session.setAttribute("user", user);
            session.setAttribute("isAuthenticated", true);
            request.getRequestDispatcher("menu.jsp").forward(request, response);
//response.sendRedirect(request.getContextPath());
        } else {
            System.out.println(session.getAttribute("isAuthenticated") + "no");

            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

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
