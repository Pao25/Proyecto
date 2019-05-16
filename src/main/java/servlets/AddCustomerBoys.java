/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.MedicalHistory;

/**
 *
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
@WebServlet(name = "AddCustomerBoys", urlPatterns = {"/AddCustomerBoys"})
public class AddCustomerBoys extends HttpServlet {

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

        int idPersonInCharge = Integer.parseInt(request.getParameter("idPersonInCharge"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String kinship = request.getParameter("kinship");

        List<MedicalHistory> list;
        list = dao.MedicalHistoryDao.medicalList();

        request.setAttribute("list", list);
        request.setAttribute("idPersonInCharge", idPersonInCharge);
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("kinship", kinship);
        request.getRequestDispatcher("addCustomerBoys.jsp").forward(request, response);

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
