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
    public UsuarioEmpresa(String email, String password, String nombre, Direccion direccion, String tarjeta, int telefono, String CIF, String web) {
        super(email, password, nombre, direccion, tarjeta, telefono);

    // GETTERS Y SETTERS
        this.CIF = CIF;
        this.web = web;
        //get CIF


    }


}