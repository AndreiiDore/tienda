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
public class Usuario {
    private String nombre;
    private String password;
    private String email;

    
    public Usuario(){};
    public Usuario(String nombre,String pass,String email){
        nombreSeguro(nombre);
        passSegura(pass);
        setEmail(email);
    }
    //METODOS DE CONTROL:
    public void passSegura(String pass){
        if (pass.length()>7) {
            int mayus=0;
            int minus=0;
            for (int i = 0; i < pass.length(); i++) {
                if (pass.charAt(i)>=65&&pass.charAt(i)<=90) {
                    mayus++;
                }else{
                    minus++;
                }
            }
            if (mayus!=0||minus!=0) {
                setPassword(pass);
            }
            else{
                 setPassword("Welcome1");
            }
        }else{
            setPassword("Welcome1");
        }
    }
    public void nombreSeguro(String nom){
        String nomf=nom;
        if (nom.length()>5) {
            setNombre(nomf);
        }else{
            for (int i = nom.length(); i < 6; i++) {
                nomf=nomf+"0";
            }
        setNombre(nomf);
        }
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
