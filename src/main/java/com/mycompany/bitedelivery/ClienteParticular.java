package com.mycompany.bitedelivery;

/*
Inherits Cliente
-DNI: String*/
public class ClienteParticular extends Cliente {
    // ATRIBUTOS
    private String DNI;
    // CONSTRUCTOR
    public ClienteParticular(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, String telefono, String DNI) {
        super(email, password, nombre, direccion, tarjetaCredito, telefono);
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