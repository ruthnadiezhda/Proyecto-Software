/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author samue
 */
public class EventoParticipante {

    private Evento evento;
    private Participante participante;
    private boolean rol;

    /**
     * @return the participante
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * @param participante the participante to set
     */
    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    /**
     * @return the rol
     */
    public boolean isRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(boolean rol) {
        this.rol = rol;
    }

    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
