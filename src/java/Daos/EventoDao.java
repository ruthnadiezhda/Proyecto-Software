/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Beans.Actividad;
import Beans.Evento;
import Beans.EventoParticipante;
import Beans.Participante;
import java.sql.Connection;
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
public class EventoDao extends DaoBase {

    public ArrayList<Evento> listarEventos() {

        ArrayList<Evento> listaEventos = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from evento;");) {

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setIdEvento(rs.getInt(1));
                evento.setNombre(rs.getString(2));
                evento.setFecha(rs.getString(3));
                evento.setHora(rs.getString(3));
                evento.setDescripcion(rs.getString(3));
                Actividad actividad = new Actividad();
                actividad.setIdActividad(rs.getInt(4));
                evento.setActividad(actividad);

                listaEventos.add(evento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaEventos;
    }

    public ArrayList<EventoParticipante> listarParticipantesEventos() {
        ArrayList<EventoParticipante> listaParticipantesEventos = new ArrayList<>();

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from EventoParticipante;");) {

            while (rs.next()) {
                EventoParticipante eventoParticipante = new EventoParticipante();
                Evento evento = new Evento();
                evento.setIdEvento(rs.getInt(1));
                Participante participante = new Participante();
                participante.setIdParticipante(rs.getInt(2));

                eventoParticipante.setEvento(evento);
                eventoParticipante.setParticipante(participante);

                eventoParticipante.setRol(rs.getBoolean(3));

                listaParticipantesEventos.add(eventoParticipante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActividadDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaParticipantesEventos;
    }
}
