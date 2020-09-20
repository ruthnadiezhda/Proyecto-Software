/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Participante;
import Daos.ActividadDao;
import Daos.ParticipanteDao;
import Email.Email;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Labtel
 */
@WebServlet(name = "ParticipanteServlet", urlPatterns = {"/ParticipanteServlet"})
public class ParticipanteServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("accion") == null ? "listar" : request.getParameter("accion");
        String type = request.getParameter("type");
        ParticipanteDao participanteDao = new ParticipanteDao();
        RequestDispatcher view;
        Participante registrado = new Participante();
        ActividadDao actividadDao = new ActividadDao();
        
        switch (action) {

            case "listar":
                request.setAttribute("lista", actividadDao.listarActividades()); 
                view = request.getRequestDispatcher(type + "/" + type + "-ListaActividades.jsp");
                view.forward(request, response);
                break;

            case "registrarParticipante":
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String contrasenha = request.getParameter("constrasenha");
                String codigo = request.getParameter("codigo");
                String correo = request.getParameter("correo");
                
                Participante participante = new Participante();
                
                if(request.getParameter("egresado").equalsIgnoreCase("falsefacu")){
                    participante.setEgresado(false);
                    participante.setFacultad("F");
                }else if (request.getParameter("egresado").equalsIgnoreCase("falseeeggcc")){
                    participante.setFacultad("E");
                    participante.setEgresado(false);
                }else{
                    participante.setEgresado(true);
                }
                
                participante.setNombre(nombre);
                participante.setApellido(apellido);
                participante.setConstrasenha(contrasenha);
                participante.setCodigo(codigo);
                participante.setCorreo(correo);

                participanteDao.agregarParticipante(participante);

                response.sendRedirect("General/G-ConfirmarRegistro.jsp");

                break;

            case "bannearParticipante":
                if (request.getParameter("id") != null) {
                    String participanteId = request.getParameter("id");
                    int pId = 0;
                    try {
                        System.out.println(participanteId);
                        pId = Integer.parseInt(participanteId);
                        participanteDao.bannearParticipante(pId);
                        response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                    } catch (NumberFormatException ex) {
                        response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                    }     
                    
                } else {
                    response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                }
                break;

            case "aceptarParticipante":
                
                if (request.getParameter("id") != null) {
                    String participanteId = request.getParameter("id");
                    int pId = 0;
                    try {
                        System.out.println(participanteId);
                        pId = Integer.parseInt(participanteId);
                        participanteDao.aceptarParticipante(pId);
                        response.sendRedirect("DG/DG-SolicitudesRegistro.jsp");
                    } catch (NumberFormatException ex) {
                        response.sendRedirect("DG/DG-SolicitudesRegistro.jsp");
                    }     
                    
                } else {
                    response.sendRedirect("DG/DG-SolicitudesRegistro.jsp");
                }
                
                
                
                break;
                
            case "eliminarParticipante":
                if (request.getParameter("id") != null) {
                    String participanteId = request.getParameter("id");
                    int pId = 0;
                    try {
                        System.out.println(participanteId);
                        pId = Integer.parseInt(participanteId);
                        participanteDao.eliminarParticipante(pId);
                        response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                    } catch (NumberFormatException ex) {
                        response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                    }     
                    
                } else {
                    response.sendRedirect("DG/DG-ListaParticipantes.jsp");
                }

                break;
             
            case "listarNoAceptados":
                request.setAttribute("lista", participanteDao.listarParticipantesNoAceptados()); 
                view = request.getRequestDispatcher("DG/DG-SolicitudesRegistro.jsp");
                view.forward(request, response);
                break;
                
            case "listarAceptados":
                request.setAttribute("lista", participanteDao.listarParticipantesAceptados());
                view = request.getRequestDispatcher("DG/DG-ListaParticipantes.jsp");
                view.forward(request, response);
                break;
                
            case "recuperacontraseñaRuth":
                correo=request.getParameter("correo");
                
                Participante participador= participanteDao.validarCorreoRecuperacionContrasenia(correo);
                view = request.getRequestDispatcher("General/G-ConfirmarRecuperar.jsp");
                view.forward(request, response);
                
                PrintWriter out = response.getWriter();
                response.setContentType("text/hml");
                            
                if(participador!= null){
                    
                    String hash= participanteDao.insertarHash(participador);
                    
                    request.setAttribute("hasheado", hash);
 
                    try {

                        String ipAdd = InetAddress.getLocalHost().getHostAddress();
                        //request.setAttribute("ip", ipAdd); 
                        //String ipAdd = request.getRequestURL().toString();
                        int localPort = request.getLocalPort();
                        String context = request.getContextPath();
                        Email email = new Email() ;
                        email.sendEmail(correo, hash,ipAdd,localPort,context);
                        } catch(Exception e){
                            out.println(e);
                        }
                }else{
                    view = request.getRequestDispatcher("General/G-ConfirmarRecuperar.jsp");
                    view.forward(request, response);
                    
                                            }
                        break;
            
            case "recuperar":
                String hash=request.getParameter("hash");
                //obtienes la persona  
                Participante participante2 = participanteDao.obtenerParticipantePorHash(hash);
                
                //FALTA LA SESION PARA PODER OBTENER EL HASHEADO DE LA RECUPERACIÓN 
                
                //editas la contraseña de la persona antes buscada por hash
                String p1 = request.getParameter("pass1");
                String p2 = request.getParameter("pass2");
                
                if(p1.equals(p2)){
                    participante2.setConstrasenha(p1);
                    participanteDao.cambiarContrasenia(participante2);
                    view = request.getRequestDispatcher("General/G-RecuperarCuenta.jsp");
                    view.forward(request, response);
                }else{
                    String message = "Verificar que sean iguales";
                    request.setAttribute("mss", message);
                    view = request.getRequestDispatcher("/ParticipanteServlet?accion=recuperar&hash="+ hash);
                    view.forward(request, response);
                    
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