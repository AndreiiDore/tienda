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
public class Opinion implements  Comparable<Opinion>{
    private Usuario usuario;
    private Punt puntuacion;
    private String comentario;
    private int voto_positivo;
    private int voto_negativo;

    public Opinion(){
        this.voto_positivo=0;
        this.voto_negativo=0;
    }

    public Opinion(Usuario usuario, Punt puntuacion, String comentario) {
        this.usuario = usuario;
        this.puntuacion =puntuacion;
        this.comentario = comentario;
        this.voto_positivo=0;
        this.voto_negativo=0;
    }
    public void darVotoPositivo(){
        voto_positivo++;
    }
    public void darVotoNegativo(){
        voto_negativo++;
    }
    public void añadirOpinion(Opinion opinion){
        
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario:").append(usuario);
        sb.append("\nPuntuacion:").append(puntuacion);
        sb.append("\nComentario").append(comentario);
        sb.append("\nVotos Positivos:").append(voto_positivo);
        sb.append("\nVotos Negativo:").append(voto_negativo);
        return sb.toString();
    }
    
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
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

    @Override
    public int compareTo(Opinion o) {
        //chatarra,malo,normal,bueno,estupendo;
         if (this.puntuacion.equals(o.puntuacion)) {
            return 0;
        }
        int orden =0;
        int ordenaux=0;
         switch(this.puntuacion){
             case chatarra:orden=1;break;
             case malo:orden=2;break;
             case normal:orden=3;break;
             case bueno:orden=4;break;
             case estupendo:orden=5;break;
         }
         switch(o.puntuacion){
             case chatarra:ordenaux=1;break;
             case malo:ordenaux=2;break;
             case normal:ordenaux=3;break;
             case bueno:ordenaux=4;break;
             case estupendo:ordenaux=5;break;
         }
        
        if (orden>ordenaux) {
            return 1;
        }else{
            return -1;
        }
        
    }

   

    
    
}
