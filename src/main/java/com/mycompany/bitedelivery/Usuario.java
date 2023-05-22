package com.mycompany.bitedelivery;

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
    -codigo postal
 */


public class Usuario {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String tarjeta;
    private Direccion direccion;
    private int telefono;
 

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getTarjeta() {
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
    public Usuario(String email, String password, String nombre, Direccion direccion,String tarjeta, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.telefono = telefono;
       
    }
}
