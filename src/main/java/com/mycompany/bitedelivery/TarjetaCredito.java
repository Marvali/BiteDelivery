package com.mycompany.bitedelivery;
import java.io.Serializable;
import java.util.Date;

/*
titular: String          |
numero: String           |
-fechaCaducidad: String */
public class TarjetaCredito implements Serializable {
    // ATRIBUTOS
    private String titular;
    private long numero;
    private Date fechaCaducidad;
    // CONSTRUCTOR
    public TarjetaCredito(String titular, long numero, Date fechaCaducidad) {
        this.titular = titular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
    // GETTERS Y SETTERS
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
