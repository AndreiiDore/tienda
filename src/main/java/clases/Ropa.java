/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import enumeraciones.Talla;

/**
 *
 * @author Andrei
 */
public class Ropa extends Articulo {
    private String color;
    private Talla talla;
    
    public Ropa(){}
    
    public Ropa(String color, Talla talla,String codigo, String nombre, float precio, int stock){
        super(codigo,nombre, precio,stock);
        this.color=color;
        this.talla=talla;
    }
    
    @Override
    public String toString(){
        return super.toString()+"Color: "+this.color+"\nTalla: "+this.talla+"\n";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the talla
     */
    public Talla getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
