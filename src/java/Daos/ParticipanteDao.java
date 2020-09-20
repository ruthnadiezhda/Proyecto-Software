/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

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
public class ParticipanteDao extends DaoBase {

    public Participante validarUsuario(Participante participante, String usuario, String clave) {

        String sql = "select * from participante where correo = ? AND contrasenha = ? ;";
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, clave);

            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {

                    participante.setIdParticipante(Integer.parseInt(rs.getString(1)));
                    participante.setNombre(rs.getString(2));
                    participante.setApellido(rs.getString(3));
                    participante.setConstrasenha(rs.getString(4));
                    participante.setCodigo(rs.getString(5));
                    participante.setCorreo(rs.getString(6));
                    participante.setTipo(rs.getString(7));
                    participante.setFacultad(rs.getString(8));
                    participante.setTeleco(rs.getBoolean(9));
                    participante.setEgresado(rs.getBoolean(10));
                    participante.setAceptado(rs.getBoolean(11));
                    participante.setBanneado(rs.getBoolean(12));
                    participante.setEliminado(rs.getBoolean(13));

                } else {
                    participante = null;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return participante;
    }

    public void agregarParticipante(Participante p) {

        String sql = "INSERT INTO Participante (nombre, apellido, contrasenha, codigo, correo, tipo, facultad, teleco, egresado,aceptado) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, p.getNombre());
            pstmt.setString(2, p.getApellido());
            pstmt.setString(3, p.getConstrasenha());
            pstmt.setString(4, p.getCodigo());
            pstmt.setString(5, p.getCorreo());
            pstmt.setString(6, "PA");
            pstmt.setString(7, p.getFacultad());
            pstmt.setBoolean(8, true);
            pstmt.setBoolean(9, false);
            pstmt.setBoolean(10, false);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void aceptarParticipante(int idParticipante) {

        String sql = "update participante set aceptado = true where idParticipante = ?;";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idParticipante);
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bannearParticipante(int idParticipante) {

        String sql = "UPDATE Participante SET banneado = true WHERE idParticipante = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idParticipante);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarParticipante(int idParticipante) {

        String sql = "UPDATE Participante SET eliminado = true WHERE idParticipante = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, idParticipante);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Participante validarCorreoRecuperacionContrasenia(String correo) {
        Participante participante = null;

        String sql = "SELECT * FROM participante WHERE correo = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, correo);

            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    int idParticipante = rs.getInt(1);
                    participante = this.obtenerParticipante(idParticipante);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return participante;
    }

    public Participante obtenerParticipante(int idParticipante) {

        Participante participante = null;

        String sql = "SELECT * FROM participante WHERE idParticipante = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setInt(1, idParticipante);

            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    participante = new Participante();
                    participante.setIdParticipante(rs.getInt(1));
                    participante.setNombre(rs.getString(2));
                    participante.setApellido(rs.getString(3));
                    participante.setConstrasenha(rs.getString(4));
                    participante.setCodigo(rs.getString(5));
                    participante.setCorreo(rs.getString(6));
                    participante.setTipo(rs.getString(7));
                    participante.setFacultad(rs.getString(8));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return participante;
    }

    
    public Participante obtenerParticipantePorHash(String hash) {

        Participante participante = null;

        String sql = "SELECT * FROM participante WHERE hasheado = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, hash);

            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    participante = new Participante();
                    participante.setIdParticipante(rs.getInt(1));
                    participante.setNombre(rs.getString(2));
                    participante.setApellido(rs.getString(3));
                    participante.setConstrasenha(rs.getString(4));
                    participante.setCodigo(rs.getString(5));
                    participante.setCorreo(rs.getString(6));
                    participante.setTipo(rs.getString(7));
                    participante.setFacultad(rs.getString(8));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return participante;
    }
    
    
    
    public ArrayList<Participante> listarParticipantes() {

        ArrayList<Participante> listaParticipantes = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from participante;");) {

            while (rs.next()) {
                Participante participante = new Participante();
                participante.setIdParticipante(rs.getInt(1));
                participante.setNombre(rs.getString(2));
                participante.setApellido(rs.getString(3));
                participante.setConstrasenha(rs.getString(4));
                participante.setCodigo(rs.getString(5));
                participante.setCorreo(rs.getString(6));
                participante.setTipo(rs.getString(7));
                participante.setFacultad(rs.getString(8));
                participante.setTeleco(rs.getBoolean(9));
                participante.setEgresado(rs.getBoolean(10));
                participante.setAceptado(rs.getBoolean(11));
                participante.setBanneado(rs.getBoolean(12));
                participante.setEliminado(rs.getBoolean(13));

                listaParticipantes.add(participante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaParticipantes;
    }

    public ArrayList<Participante> listarParticipantesNoAceptados() {

        ArrayList<Participante> listaParticipantes = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from participante where aceptado = '0' ;");) {

            while (rs.next()) {
                Participante participante = new Participante();
                participante.setIdParticipante(rs.getInt(1));
                participante.setNombre(rs.getString(2));
                participante.setApellido(rs.getString(3));
                participante.setConstrasenha(rs.getString(4));
                participante.setCodigo(rs.getString(5));
                participante.setCorreo(rs.getString(6));
                participante.setTipo(rs.getString(7));
                participante.setFacultad(rs.getString(8));
                participante.setTeleco(rs.getBoolean(9));
                participante.setEgresado(rs.getBoolean(10));
                participante.setAceptado(rs.getBoolean(11));
                participante.setBanneado(rs.getBoolean(12));
                participante.setEliminado(rs.getBoolean(13));

                listaParticipantes.add(participante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaParticipantes;
    }

    public ArrayList<Participante> listarParticipantesAceptados() {

        ArrayList<Participante> listaParticipantes = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from participante where aceptado = '1' ;");) {

            while (rs.next()) {
                Participante participante = new Participante();
                participante.setIdParticipante(rs.getInt(1));
                participante.setNombre(rs.getString(2));
                participante.setApellido(rs.getString(3));
                participante.setConstrasenha(rs.getString(4));
                participante.setCodigo(rs.getString(5));
                participante.setCorreo(rs.getString(6));
                participante.setTipo(rs.getString(7));
                participante.setFacultad(rs.getString(8));
                participante.setTeleco(rs.getBoolean(9));
                participante.setEgresado(rs.getBoolean(10));
                participante.setAceptado(rs.getBoolean(11));
                participante.setBanneado(rs.getBoolean(12));
                participante.setEliminado(rs.getBoolean(13));

                listaParticipantes.add(participante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaParticipantes;
    }

      public void cambiarContrasenia(Participante participante) {

        try {
            try (Connection conn = this.getConnection();) {
                String sql = "UPDATE participante SET constrasenha = ?"
                        + "WHERE idParticipante = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, participante.getConstrasenha());
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public String insertarHash(Participante participante) {

        String sql = "UPDATE participante set hasheado= SHA2(?,256)"
                + "WHERE idparticipante = ?";
        String hash = "";
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, String.valueOf(participante.getIdParticipante()));
            pstmt.setInt(2, participante.getIdParticipante());
            pstmt.executeUpdate();

            sql = "select hasheado from participante WHERE idparticipante = ?";

            try (PreparedStatement pstmt2 = conn.prepareStatement(sql);) {
                pstmt2.setInt(1, participante.getIdParticipante());
                try (ResultSet rs = pstmt2.executeQuery();) {
                    if(rs.next()){
                        hash = rs.getString(1);
                    }   
                } 
            }

        } catch (SQLException ex) {
            Logger.getLogger(ParticipanteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }
    
    
    
}
