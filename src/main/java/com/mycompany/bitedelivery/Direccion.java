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
    private int numero;
    private int codigoPostal;
    private String ciudad;

    // CONSTRUCTOR
    public Direccion(String calle,int numero, int codigoPostal, String ciudad) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

 

   

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
