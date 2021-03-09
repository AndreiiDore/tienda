/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class xD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un nombre de usuario que quieres crear:");
        String nombre=sc.nextLine();
        System.out.println("Dime una contraseña que deseas:");
        String contraseña= sc.nextLine();
        System.out.println("Dime tu correo electronico:");
        String correo=sc.nextLine();
        Usuario yo=new Usuario(nombre,contraseña,correo);
        System.out.println(yo.getNombre());
        System.out.println(yo.getPassword());
        System.out.println(yo.getEmail());
    }
    
}
