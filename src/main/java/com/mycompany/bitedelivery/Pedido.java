package com.mycompany.bitedelivery;

/**
* el objeto 
* @author  fer y isaac
*/
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
