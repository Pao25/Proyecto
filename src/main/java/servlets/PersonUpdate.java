/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.PersonInCharge;

/**
 *
 * @author asus
 */
@WebServlet(name = "PersonUpdate", urlPatterns = {"/PersonUpdate"})
public class PersonUpdate extends HttpServlet {

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
        PersonInCharge per;

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        String first_name = request.getParameter("firstName");
        String last_name = request.getParameter("lastName");
        System.out.println("apellido:" + last_name);
        String number_phone = request.getParameter("number");
        System.out.println(number_phone); 
        

        per = new PersonInCharge(id, first_name, last_name, number_phone);

        dao.PersonInChargeDao.update(per);

        response.sendRedirect("PersonById?id=" + id);

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
