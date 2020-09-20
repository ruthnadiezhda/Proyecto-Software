/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.Donacion;
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
public class DonacionDao extends DaoBase {

    public void agregarDonacion(Donacion donacion) {

        String sql = "INSERT INTO donacion (cantidad,fecha,mensaje,idParticipante) "
                + "VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, donacion.getCantidad());
            pstmt.setString(2, donacion.getFecha());
            pstmt.setString(3, donacion.getMensaje());
            pstmt.setInt(4, donacion.getParticipante().getIdParticipante());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DonacionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarSolicitudes(int id){
        String sql = "update donacion set aceptada = 1 where idParticipante = ?";
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }catch(SQLException e){
            Logger.getLogger(DonacionDao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Donacion> listarDonaciones() {

        ArrayList<Donacion> listaDonaciones = new ArrayList<>();
        String sql = "select p.nombre, p.apellido, p.codigo, p.tipo, p.correo, d.cantidad, p.idParticipante\n" +
                    "from participante p \n" +
                    "inner join donacion d on d.idParticipante = p.idParticipante\n" +
                    "where d.aceptada = 0";
        try (Connection conn = this.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {

            while (rs.next()) {
                Donacion donacion = new Donacion();
                Participante participante = new Participante();
                participante.setNombre(rs.getString(1));
                participante.setApellido(rs.getString(2));
                participante.setCodigo(rs.getString(3));
                participante.setTipo(rs.getString(4));
                participante.setCorreo(rs.getString(5));
                donacion.setCantidad(rs.getString(6));
                participante.setIdParticipante(Integer.parseInt(rs.getString(7)));
                donacion.setParticipante(participante);

                listaDonaciones.add(donacion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonacionDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDonaciones;
    }

}
