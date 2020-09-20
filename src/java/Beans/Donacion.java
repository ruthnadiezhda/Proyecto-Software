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
public class Donacion {

    private int idDonacion;
    private String cantidad;
    private String fecha;
    private String mensaje;
    private boolean aceptada;
    private Participante participante;

    /**
     * @return the idDonacion
     */
    public int getIdDonacion() {
        return idDonacion;
    }

    /**
     * @param idDonacion the idDonacion to set
     */
    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the aceptada
     */
    public boolean isAceptada() {
        return aceptada;
    }

    /**
     * @param aceptada the aceptada to set
     */
    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

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

}
