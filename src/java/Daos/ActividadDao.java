/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.Actividad;
import Beans.ActividadParticipante;
import Beans.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samue
 */
public class ActividadDao extends DaoBase {

    public ArrayList<Actividad> listarActividades() {

        ArrayList<Actividad> listaActividades = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from actividad;");) {

            while (rs.next()) {
                Actividad actividad = new Actividad();
                actividad.setIdActividad(rs.getInt(1));
                actividad.setNombre(rs.getString(2));
                actividad.setDescripcion(rs.getString(3));
                Participante participante = new Participante();
                participante.setIdParticipante(rs.getInt(4));
                actividad.setDelegado(participante);

                listaActividades.add(actividad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActividadDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaActividades;
    }

    public ArrayList<ActividadParticipante> listarSolicitudesDelegado() {
        ArrayList<ActividadParticipante> listaSolicitudesDelegado = new ArrayList<>();
        String sql = "select p.nombre, p.apellido, p.codigo, p.tipo, p.correo, p.idParticipante, ac.nombre, ap.solicitud, ap.idActividad, ac.idDelegado\n" +
"                    from participante p\n" +
"                    inner join actividadparticipante ap on ap.idParticipante = p.idParticipante\n" +
"                    inner join actividad ac on ac.idActividad = ap.idActividad\n" +
"                    where solicitud = 1;";
        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {

            while (rs.next()) {
                ActividadParticipante actividadParticipante = new ActividadParticipante();
                Actividad actividad = new Actividad();
                Participante participante = new Participante();
                Participante part2 = new Participante();
                participante.setNombre(rs.getString(1));
                participante.setApellido(rs.getString(2));
                participante.setCodigo(rs.getString(3));
                participante.setTipo(rs.getString(4));
                participante.setCorreo(rs.getString(5));
                participante.setIdParticipante(Integer.parseInt(rs.getString(6)));      
                actividad.setNombre(rs.getString(7));
                actividadParticipante.setSolicitud(rs.getBoolean(8));
                actividad.setIdActividad(Integer.parseInt(rs.getString(9)));             
                actividadParticipante.setActividad(actividad);
                actividadParticipante.setParticipante(participante);            
                listaSolicitudesDelegado.add(actividadParticipante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActividadDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaSolicitudesDelegado;
    }
    public void actualizarSolicitudes(int idP, int idA){
        String sql = "SELECT * FROM actividad where idACtividad = ? and idDelegado is not null";
        String sql2 = "update actividad set idDelegado = ? where idActividad = ?";
        String sql3 = "delete from actividadParticipante where idActividad = ?";
        try(Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setInt(1, idA);
            try(ResultSet rs = pstmt.executeQuery();){
                rs.next();
                if(rs.next() == false){
                    try(PreparedStatement pstmt2 = conn.prepareStatement(sql2);
                            PreparedStatement pstmt3 = conn.prepareStatement(sql3);){
                        pstmt2.setInt(1, idP);
                        pstmt2.setInt(2, idA);
                        pstmt3.setInt(1, idA);
                        pstmt3.executeUpdate();
                        pstmt2.executeUpdate();
                       
                    }catch(SQLException e){
                        Logger.getLogger(DonacionDao.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            }
       
        }catch(SQLException e){
            Logger.getLogger(DonacionDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void aceptarInscripcionActividad (int idParticipante, int idActividad ){
        
        String sql= "insert into bdgrupo1.actividadparticipante (idActividad, idParticipante)\n"
                + "values (?,?)";
        
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idActividad);
            pstmt.setInt(2, idParticipante);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ActividadDao.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
     public Actividad obtenerActividad (int idActividad) {

        Actividad actividad = null;

        String sql = "SELECT * FROM actividad WHERE idActividad = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idActividad);

            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    actividad = new Actividad();
                    actividad.setIdActividad(rs.getInt(1));
                    actividad.setNombre(rs.getString(2)); 
                    actividad.setDescripcion(rs.getString(3));
                    //COMO SE SETEA UN PARTICIPANTE, PORQUE EL PARAMETRO ES DEL TIPO PARTICIPANTE: actividad.setDelegado(rs.); 
                    actividad.setBarra(rs.getInt(5));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actividad;
    }
     
     public int busquedaActividadParticipante(int idActividad, int idParticipante){
         
        int yainscrito=0; 

        String sql = "SELECT * FROM actividadparticipante WHERE idActividad = ? and idParticipante= ?";
        
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idActividad);
            pstmt.setInt(2, idParticipante);

            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    yainscrito=1;  
                }
            }
             } catch (SQLException ex) {
            Logger.getLogger(ActividadDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return yainscrito; 
     }

}
