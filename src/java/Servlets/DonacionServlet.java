/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Participante;
import Daos.ActividadDao;
import Daos.DonacionDao;
import Daos.ParticipanteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "DonacionServlet", urlPatterns = {"/DonacionServlet"})
public class DonacionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("accion") == null ? "listar" : request.getParameter("accion");
            String type = request.getParameter("type");
            DonacionDao donacionDao = new DonacionDao();
            ActividadDao actividadDao = new ActividadDao();
            ParticipanteDao participanteDao = new ParticipanteDao();
            RequestDispatcher view;

        switch (action) {
            case "listar":
                donacionDao.listarDonaciones();
                request.setAttribute("listaDonaciones", donacionDao.listarDonaciones()); 
                view = request.getRequestDispatcher("DG/DG-SolicitudesDonacion.jsp");
                view.forward(request, response);
                break;
            case "aceptar":
                if(request.getParameter("id")!=null){
                    String idString = request.getParameter("id");
                    int id = 0;
                    try{
                        id = Integer.parseInt(idString);
                    }catch(NumberFormatException e){
                        response.sendRedirect("DonacionServlet");
                    }
                    donacionDao.actualizarSolicitudes(id);
                    request.setAttribute("listaDonaciones", donacionDao.listarDonaciones()); 
                    view = request.getRequestDispatcher("DG/DG-SolicitudesDonacion.jsp");
                    view.forward(request, response);
                }else{
                    response.sendRedirect("DonacionServlet");
                }
                break;
            
            
        }
    }

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
        processRequest(request, response);
    }

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
