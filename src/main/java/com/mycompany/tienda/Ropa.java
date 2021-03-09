/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Andrei
 */
public class Ropa extends Articulo {
    String color;
    int talla;
    
    public Ropa(){}
    
    public Ropa(String codigo, String nombre, float precio, int stock,String color, int talla){
        super(codigo,nombre, precio,stock);
        this.color=color;
        this.talla=talla;
    }
    @Override
    public String toString(){
        return super.toString()+"Color: "+this.color+"\nTalla: "+this.talla;
    }
}