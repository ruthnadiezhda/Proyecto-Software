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
public class Actividad {

    private int idActividad;
    private String nombre;
    private String descripcion;
    private Participante delegado;
    private int barra;
    
    
    
    /**
     * @return the idActividad
     */
    public int getIdActividad() {
        return idActividad;
    }

    /**
     * @param idActividad the idActividad to set
     */
    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the Delegado
     */
    public Participante getDelegado() {
        return delegado;
    }

    /**
     * @param Delegado the Delegado to set
     */
    public void setDelegado(Participante Delegado) {
        this.delegado = Delegado;
    }

    /**
     * @return the barra
     */
    public int getBarra() {
        return barra;
    }

    /**
     * @param barra the barra to set
     */
    public void setBarra(int barra) {
        this.barra = barra;
    }
    
}
