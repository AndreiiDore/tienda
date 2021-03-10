/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import enumeraciones.Punt;

/**
 *
 * @author Andrei
 */
public class Opinion {
    private String usuario;
    private Punt puntuacion;
    private String comentario;
    private int voto_positivo=0;
    private int voto_negativo=0;

    public Opinion(String usuario, Punt puntuacion, String comentario) {
        this.usuario = usuario;
        this.puntuacion =puntuacion;
        this.comentario = comentario;
    }
    public void darVotoPositivo(){
        voto_positivo++;
    }
    public void darVotoNegativo(){
        voto_negativo++;
    }
    public void añadirOpinion(Opinion opinion){
        
    }
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the puntuacion
     */
    public Enum getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(Enum puntuacion) {
        this.puntuacion = (Punt) puntuacion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    
}
