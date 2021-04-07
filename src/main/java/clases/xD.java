/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import enumeraciones.Punt;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class xD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Usuario user =new Usuario("Andrei","hola","andreimdroe@gmail.com");
        Opinion opi=new Opinion(user,Punt.chatarra,"");
        Opinion opi2=new Opinion(user,Punt.estupendo,"");
        //1
        opi.compareTo(opi2);
        if (opi.compareTo(opi2)==0) {
            System.out.println("Iguales");
        }
        if (opi.compareTo(opi2)==1) {
            System.out.println("Primero mas grande");
        }
        if (opi.compareTo(opi2)==-1) {
            System.out.println("Segundo mas grande");
        }
    }
    
}
