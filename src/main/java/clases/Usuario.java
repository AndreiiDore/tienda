 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Andrei
 */
public class Usuario {
    private String nombre;
    private String password;
    private String email;

    /**
     *
     */
    public Usuario(){};

    /**
     *
     * @param nombre
     * @param pass
     * @param email
     */
    public Usuario(String nombre,String pass,String email){
        nombreSeguro(nombre);
        passSegura(pass);
        emailSeguro(email);

    }
    //METODOS DE CONTROL:

    /**
     *Metodo para comporbar que una contraseña es segura
     * @param pass contraseña segura
     */
    public void passSegura(String pass){
        //La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula.
        //NO puede tener otros símbolos
        //TRUCO!!! tiene que tener 2 mayus!!!!
        if (pass.matches("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$") ) {
            setPassword(pass);
        }else{
            setPassword("Welcome1");
            
        }
    }

    /**
     *
     * @param nom
     */
    public void nombreSeguro(String nom){
        String nomf=nom;
        if (nom.matches("{6,12}$")==true) {
            setNombre(nomf);
        }else{
            for (int i = nom.length(); i < 6; i++) {
                nomf=nomf+"0";
            }
        setNombre(nomf);
        }
    }

    /**
     *
     * @param email
     */
    public void emailSeguro(String email){
        if (email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")==true) {
            setEmail(email);
        }else{
            String correo="";
            correo=email+"@tienda.com";
            setEmail(correo);
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
