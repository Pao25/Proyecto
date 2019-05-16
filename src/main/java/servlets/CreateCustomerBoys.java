/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.CustomerBoysDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CustomerBoys;

/**
 *
 * @author asus
 */
@WebServlet(name = "CreateCustomerBoys", urlPatterns = {"/CreateCustomerBoys"})
public class CreateCustomerBoys extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *metod que captura los datos del familiar del cliente del archivo jsp y los agrega en el metodo  add que se encuentra en el dao
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idPersonInCharge = Integer.parseInt(request.getParameter("idPerson"));
        int idMedical = Integer.parseInt(request.getParameter("idMedical"));
        String firstNamec = request.getParameter("firstNamec");
        String lastNamec = request.getParameter("lastNamec");
        String birthDate = request.getParameter("birthDate");
        LocalDate date = LocalDate.parse(birthDate);
        String dateAdmission = request.getParameter("dateAdmission");
        LocalDate dat = LocalDate.parse(dateAdmission);

        CustomerBoys customer = new CustomerBoys(idPersonInCharge, idMedical, firstNamec, lastNamec, date, dat);

        if (CustomerBoysDao.add(customer)) {

            System.out.println("Si funciona");
        } else {

            System.out.println("No funciona");
        }

        request.getRequestDispatcher("menu.jsp").forward(request, response);

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
