package com.mycompany.bitedelivery;

/*extends cliente
*
*Inherits Cliente                  |
|-CIF: String                      |
|-web: String
*
*  */
public class UsuarioEmpresa extends Usuario {

    // ATRIBUTOS
    private String CIF;
    private String web;
    // CONSTRUCTOR
    public UsuarioEmpresa(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String CIF, String web,String zip) {
        super(email, password, nombre, direccion, tarjetaCredito, telefono, zip);

    // GETTERS Y SETTERS
        

    }
}