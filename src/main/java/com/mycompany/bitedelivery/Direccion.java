package com.mycompany.bitedelivery;
import java.io.Serializable;

/*
*-calle: String        |
 -numero: String       |
 -zip: String |

* */
public class Direccion implements Serializable {
    // ATRIBUTOS
    private String calle;
    private int numero;
    private int zip;


    // CONSTRUCTOR
    public Direccion(String calle,int numero, int zip) {
        this.calle = calle;
        this.numero = numero;
        this.zip = zip;

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

    //zip get and set
    public int getZip() {
        return zip;
    }
        public void setZip(int zip) {
        this.zip = zip;

        }
}


