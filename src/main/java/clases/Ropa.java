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
public final class Ropa extends Articulo implements Reciclable{
    private String color;
    private Talla talla;
    private int reciclada=0;
    
    public Ropa(){}
    
    public Ropa(String color, Talla talla,int reciclada,String codigo, String nombre, float precio, int stock){
        super(codigo,nombre, precio,stock);
        this.color=color;
        this.talla=talla;
        this.reciclada=reciclada;
    }
    @Override
    public String toStringFile(){
            return color+", "+talla+", "+reciclada+", "+super.getCodigo()+", "
                    +super.getNombre()+", "+super.getPrecio()+", "+super.getStock();
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
    @Override
    public boolean esReciclable(){
        if (this.reciclada<3&&0<this.reciclada) {
            return true;
        }else{
            return false;
        }
    }
    public void applyDiscount(){
        if (this.esReciclable()==true) {
            this.setPrecio(((float)this.getPrecio()*0.5));
        }
    }
    
    @Override
    public void applyPromo(String codigoPromo) {
        /*
        si el codigo promocial es ropapromo le doy un 10%
        */
        if (codigoPromo.equals("ropapromo")) {
            this.setPrecio(((float)this.getPrecio()*0.8));
        }
    }
}
