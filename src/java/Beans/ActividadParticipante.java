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
public class ActividadParticipante {

    private Actividad actividad;
    private Participante participante;
    private boolean solicitud;

  

    /**
     * @return the solicitud
     */
    public boolean isSolicitud() {
        return solicitud;
    }

    /**
     * @param solicitud the solicitud to set
     */
    public void setSolicitud(boolean solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * @return the Actividad
     */
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * @param Actividad the Actividad to set
     */
    public void setActividad(Actividad Actividad) {
        this.actividad = Actividad;
    }

    /**
     * @return the Participante
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * @param Participante the Participante to set
     */
    public void setParticipante(Participante Participante) {
        this.participante = Participante;
    }
}
