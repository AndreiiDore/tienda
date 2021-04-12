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
public class Electrodomestico extends Articulo {

    private ClaseE calificacionEnergetica;
    private String gama;

    public Electrodomestico() {}

    public Electrodomestico(ClaseE calificacionEnergetica, String gama, String codigo, String nombre, float precio, int stock) {
        super(codigo, nombre, precio, stock);
        this.calificacionEnergetica = calificacionEnergetica;
        this.gama = gama;
    }
    @Override
    public String toStringFile(){
        return gama+", "+calificacionEnergetica+", "+super.getCodigo()+", "
                    +super.getNombre()+", "+super.getPrecio()+", "+super.getStock();
    }
    @Override
    public String toString(){
        return super.toString()+"Calificacion Energetica: "+this.calificacionEnergetica+"\nGama: "+this.gama+"\n";
    }
    
    /**
     * @return the calificacionEnergetica
     */
    public ClaseE getCalificacionEnergetica() {
        return calificacionEnergetica;
    }

    /**
     * @param calificacionEnergetica the calificacionEnergetica to set
     */
    public void setCalificacionEnergetica(ClaseE calificacionEnergetica) {
        this.calificacionEnergetica = calificacionEnergetica;
    }

    /**
     * @return the gama
     */
    public String getGama() {
        return gama;
    }

    /**
     * @param gama the gama to set
     */
    public void setGama(String gama) {
        this.gama = gama;
    }

    @Override
    public void applyPromo(String codigoPromo) {
        if (codigoPromo.equals("siniva")) {
            this.setPrecio(((float)this.getPrecio()*0.79));
        }
        if (codigoPromo.equals("electromo")) {
            this.setPrecio(((float)this.getPrecio()*0.9));
        }
    }

}
