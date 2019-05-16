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
@WebServlet(name = "CreatePerson", urlPatterns = {"/CreatePerson"})
public class CreatePerson extends HttpServlet {

   

    

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
       String first_name = request.getParameter("name");
       String last_name = request.getParameter("lastname");
       String kinship = request.getParameter("kinship");
       String number_phone = request.getParameter("number");
       
        

        dao.PersonInChargeDao.add(new PersonInCharge(first_name, last_name, kinship, number_phone));

        response.sendRedirect("PersonList");
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
