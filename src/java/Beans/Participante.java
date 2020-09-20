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
public class Participante {

    private int idParticipante;
    private String nombre;
    private String apellido;
    private String constrasenha;
    private String codigo;
    private String correo;
    private String tipo;
    private String facultad;
    private boolean teleco;
    private boolean egresado;
    private boolean aceptado;
    private boolean banneado;
    private boolean eliminado;
    public String hash;

    /**
     * @return the idParticipante
     */
    public int getIdParticipante() {
        return idParticipante;
    }

    /**
     * @param idParticipante the idParticipante to set
     */
    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the constrasenha
     */
    public String getConstrasenha() {
        return constrasenha;
    }

    /**
     * @param constrasenha the constrasenha to set
     */
    public void setConstrasenha(String constrasenha) {
        this.constrasenha = constrasenha;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the teleco
     */
    public boolean isTeleco() {
        return teleco;
    }

    /**
     * @param teleco the teleco to set
     */
    public void setTeleco(boolean teleco) {
        this.teleco = teleco;
    }

    /**
     * @return the egresado
     */
    public boolean isEgresado() {
        return egresado;
    }

    /**
     * @param egresado the egresado to set
     */
    public void setEgresado(boolean egresado) {
        this.egresado = egresado;
    }

    /**
     * @return the banneado
     */
    public boolean isBanneado() {
        return banneado;
    }

    /**
     * @param banneado the banneado to set
     */
    public void setBanneado(boolean banneado) {
        this.banneado = banneado;
    }

    /**
     * @return the eliminado
     */
    public boolean isEliminado() {
        return eliminado;
    }

    /**
     * @param eliminado the eliminado to set
     */
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    /**
     * @return the aceptado
     */
    public boolean isAceptado() {
        return aceptado;
    }

    /**
     * @param aceptado the aceptado to set
     */
    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

}
