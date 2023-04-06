package com.mycompany.bitedelivery;

/*
*
*
-titular: String          |
-numero: String           |
-fechaCaducidad: String
*
* */
public class Pedido {
    // ATRIBUTOS
    private String titular;
    private String numero;
    private String fechaCaducidad;
    // CONSTRUCTOR
    public Pedido(String titular, String numero, String fechaCaducidad) {
        this.titular = titular;
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }
    // GETTERS Y SETTERS
    public String getTitular() {
        return titular;
    }

}
