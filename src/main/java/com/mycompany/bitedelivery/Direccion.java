package com.mycompany.bitedelivery;


/*
*-calle: String        |
 -numero: String       |
 -codigoPostal: String |
 -ciudad: String
* */
public class Direccion {
    // ATRIBUTOS
    private String calle;
    private String numero;
    private String codigoPostal;
    private String ciudad;

    // CONSTRUCTOR
    public Direccion(String calle, String numero, String codigoPostal, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
    // GETTERS Y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
