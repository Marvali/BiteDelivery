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
    private TarjetaCredito tarjeta;
    private Direccion direccion;
    private int telefono;
    private String codigoPostal;

    // GETTERS Y SETTERS


    // CONSTRUCTOR
    public Usuario(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String zip) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.tarjeta = tarjetaCredito;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = zip;
    }
}
