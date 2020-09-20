/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Participante;
import Beans.Actividad;
import Beans.ActividadParticipante;
import Daos.ActividadDao;
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
 * @author Labtel
 */
@WebServlet(name = "ActividadServlet", urlPatterns = {"/ActividadServlet"})
public class ActividadServlet extends HttpServlet {

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
        
        String action = request.getParameter("accion") == null ? "listar" : request.getParameter("accion");
        String type = request.getParameter("type");
        ParticipanteDao participanteDao = new ParticipanteDao();
        ActividadDao actividadDao = new ActividadDao();
        Participante registrado = new Participante();
        RequestDispatcher view;
        RequestDispatcher view1;

        switch (action) {

        case "listar":
                actividadDao.listarActividades();
                request.setAttribute("lista", actividadDao.listarActividades()); 
                view = request.getRequestDispatcher(type + "/" + type + "-ListaActividades.jsp");
                view.forward(request, response);
                break;
                
        case "listarsolicitudesdelegado":
                //actividadDao.listarSolicitudesDelegado();
                request.setAttribute("listaSolicitudesDelegado", actividadDao.listarSolicitudesDelegado()); 
                view1 = request.getRequestDispatcher("DG/DG-SolicitudesDelegado.jsp");
                view1.forward(request, response);
                break;
        case "aceptar":
            if(request.getParameter("id")!=null){
                String idString = request.getParameter("id");
                String idString2 = request.getParameter("id2");
                int id=0, id2 =0;
                try{
                    id = Integer.parseInt(idString);
                    id2 = Integer.parseInt(idString2);
                }catch(NumberFormatException e){
                    response.sendRedirect("ActividadServlet");
                }
                actividadDao.actualizarSolicitudes(id, id2);
                request.setAttribute("listaSolicitudesDelegado", actividadDao.listarSolicitudesDelegado()); 
                view1 = request.getRequestDispatcher("DG/DG-SolicitudesDelegado.jsp");
                view1.forward(request, response);
            }else{
                response.sendRedirect("ActividadServlet");
            }
            break;     
            
        case "aceptarinscripcionactividad":
            // Deberias obtener el id de la actvidad y del participante por medio de la sesion
            // o no se como, por ahora lo he puesto como objetos nuevos 
            Actividad actividad = new Actividad();
            Participante participante = new Participante ();
            
            //Obtienes participante  y actividad
            Actividad acti = actividadDao.obtenerActividad(actividad.getIdActividad());
            Participante parti = participanteDao.obtenerParticipante(participante.getIdParticipante());
            
            //Valida si ya estaba inscrito antes
            int busqueda;
                busqueda = actividadDao.busquedaActividadParticipante(acti.getIdActividad(), parti.getIdParticipante());
            
            if (busqueda==1){
                actividadDao.aceptarInscripcionActividad(acti.getIdActividad(),parti.getIdParticipante());
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
