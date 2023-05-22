package com.mycompany.bitedelivery;

/*
Inherits Cliente
-DNI: String*/
public class UsuarioParticular extends Usuario {
    // ATRIBUTOS
    private String DNI;
    // CONSTRUCTOR
    public UsuarioParticular(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String DNI,String zip) {
        super(email, password, nombre, direccion, tarjetaCredito, telefono, zip);
        this.DNI = DNI;
    }
    // GETTERS Y SETTERS
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}