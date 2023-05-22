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
    public UsuarioEmpresa(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, int telefono, String CIF, String web) {
        super(email, password, nombre, direccion, tarjetaCredito, telefono);
        this.CIF = CIF;
        this.web = web;
    }
    // GETTERS Y SETTERS
    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}