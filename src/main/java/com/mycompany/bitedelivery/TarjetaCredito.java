package com.mycompany.bitedelivery;

/*
titular: String          |
numero: String           |
-fechaCaducidad: String */
public class TarjetaCredito {
    // ATRIBUTOS
    private String titular;
    private String numero;
    private String fechaCaducidad;
    // CONSTRUCTOR
    public TarjetaCredito(String titular, String numero, String fechaCaducidad) {
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
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
