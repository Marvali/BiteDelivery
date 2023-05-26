package com.mycompany.bitedelivery;
import java.io.Serializable;

/*
    Clase Cliente
    -nombre
    -apellido

    -email: String
    -password: String
    -tarjeta: Tarjeta
    -direccion: Direccion
    -tarjetaCredito: TarjetaCredito
    -telefono: String
  
 */


public class Usuario implements Serializable {
    // ATRIBUTOS
    private String nombre;
 
    private String email;
    private String password;
    private TarjetaCredito tarjeta;
    private Direccion direccion;
    private int telefono;
    




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




    // CONSTRUCTOR
    public Usuario(String email, String password, String nombre, Direccion direccion,TarjetaCredito tarjeta, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.telefono = telefono;
       
    }
}
