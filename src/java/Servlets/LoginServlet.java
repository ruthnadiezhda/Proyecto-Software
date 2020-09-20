/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Participante;
import Daos.ParticipanteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Email.Email;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;


/**
 *
 * @author Labtel
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet", ""})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MessagingException {
        response.setContentType("text/html;charset=UTF-8");

        ParticipanteDao participanteDao = new ParticipanteDao();
        RequestDispatcher view;
        String action = request.getParameter("accion") == null ? "primero" : request.getParameter("accion");

        switch (action) {
            case "validar":
                String usuario = request.getParameter("usuario");
                String clave = request.getParameter("clave");
                Participante participante = new Participante();
                Participante registrado = participanteDao.validarUsuario(participante, usuario, clave);
                
                
                 
                    
                if (registrado != null) {
                    String var = registrado.getTipo();
                    if (var.equalsIgnoreCase("PA")){
                        var = "Participante";
                    }
                    response.sendRedirect("ActividadServlet?type=" + var);
                } else {
                    System.out.println("entro a else");
                    request.setAttribute("msg_error", "login error");
                    view = request.getRequestDispatcher("General/G-IniciarSesion.jsp");
                    view.forward(request, response);
                }
                break;
            case "primero":
                
                view = request.getRequestDispatcher("General/G-IniciarSesion.jsp");
                view.forward(request, response);
                break;
               
                
            case "logout":
                HttpSession session = request.getSession();
                session.invalidate();
                response.sendRedirect(request.getContextPath());   
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
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
