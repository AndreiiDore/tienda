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
public class Users {
    private ArrayList<Usuario>users=new ArrayList();
    
    public void newUser(String name,String pass,String mail){
        Usuario nuevo=new Usuario(name,pass,mail);
        users.add(nuevo);
    }
}
