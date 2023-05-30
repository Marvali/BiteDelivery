package com.mycompany.bitedelivery;
import java.io.Serializable;

/*
*   clase que hereda de usuario y tiene los atributos de la empresa
*/
public class UsuarioEmpresa extends Usuario implements Serializable {

    // ATRIBUTOS
    private String CIF;
    private String web;
    // CONSTRUCTOR
    public UsuarioEmpresa(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjeta, int telefono, String CIF, String web) {
        super(email, password, nombre, direccion, tarjeta, telefono);
        this.CIF = CIF;
        this.web = web;


    // GETTERS Y SETTERS



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

        // Default constructor
        
         @Override
    public String toString() {
        return "UsuarioEmpresa{" + " CIF= " + CIF + ", web= " + web + " email= "+ email + " password= "+ password + " nombre= "+ nombre + " direccion= "+ direccion + " tarjeta= "+ tarjeta + " telefono= "+ telefono +'}';

    }
    }


