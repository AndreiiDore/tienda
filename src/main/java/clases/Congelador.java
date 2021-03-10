/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import enumeraciones.ClaseE;

/**
 *
 * @author Andrei
 */
public class Congelador extends Electrodomestico{
    private String Marca;
    private int AlmacenamientoAveria;
    private String Comentarios;
    
    public Congelador(){}

    public Congelador(String Marca, int AlmacenamientoAveria, String Comentarios, 
            ClaseE calificacionEnergetica, String gama, String codigo, String nombre,
            float precio, int stock) {
        super(calificacionEnergetica, gama, codigo, nombre, precio, stock);
        this.Marca = Marca;
        this.AlmacenamientoAveria = AlmacenamientoAveria;
        this.Comentarios = Comentarios;
    }
    @Override
    public String toString(){
        return super.toString()+"Marca: "+this.Marca+"\nAlmacenamiento en caso de averia: "+this.AlmacenamientoAveria+"\nComentarios:"+this.Comentarios+"\n";
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the AlmacenamientoAveria
     */
    public int getAlmacenamientoAveria() {
        return AlmacenamientoAveria;
    }

    /**
     * @param AlmacenamientoAveria the AlmacenamientoAveria to set
     */
    public void setAlmacenamientoAveria(int AlmacenamientoAveria) {
        this.AlmacenamientoAveria = AlmacenamientoAveria;
    }

    /**
     * @return the Comentarios
     */
    public String getComentarios() {
        return Comentarios;
    }

    /**
     * @param Comentarios the Comentarios to set
     */
    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }
    
    
    
}
