package com.mycompany.bitedelivery;
import java.io.Serializable;

/*
*   clase pradre de los usuarios , tiene los atributos comunes de los usuarios 
 */


public class Usuario implements Serializable {
    // ATRIBUTOS
    protected String nombre;
 
    protected String email;
    protected String password;
    protected TarjetaCredito tarjeta;
    protected Direccion direccion;
    protected int telefono;
    




    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
   
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //get correo
    public String getCorreo() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //telefono
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }




    // CONSTRUCTOR
    public Usuario(String email, String password, String nombre, Direccion direccion,TarjetaCredito tarjeta, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.telefono = telefono;
       
    }
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", password=" + password + ",  tarjeta=" + tarjeta + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
