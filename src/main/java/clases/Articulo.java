/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Andrei
 */
public class Articulo {
	
	private String codigo;
	private String nombre;
	private float precio;
	private int stock;
	private ArrayList<Opinion>opiniones=new ArrayList();
        
	public Articulo() {};
	
	public Articulo(String codigo, String nombre, float precio, int stock) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
	}
        public void loggin(String user,String pass){
            
        }
        public void crearOpinion(){
            loggin();
            
        }
	public void añadirOpinion(Opinion opinion){
            opiniones.add(opinion);
        }
        public void eliminarOpinion(int posicion){
            opiniones.remove(posicion);
        }
	public String getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo: ").append(this.codigo).append("\nNombre: ").append(this.nombre).append("\nPrecio: ").append(this.precio).append("€\nStock: ").append(this.stock).append("\n");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		
		if (this.getClass() != o.getClass())
			return false;
		else
		{
			Articulo a = (Articulo) o;
			if (this.codigo.equals(a.getCodigo()))
					return true;
			else
				return false;
		}
	}
	
	public boolean disponible(int cantidad) {
		return cantidad<=stock;
	}
	
	public void ajustarStock(int cantidad) {
		this.stock += cantidad;
	}

    /**
     * @return the opiniones
     */
    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }

    /**
     * @param opiniones the opiniones to set
     */
    public void setOpiniones(ArrayList<Opinion> opiniones) {
        this.opiniones = opiniones;
    }
	
	
	
	
	
}
