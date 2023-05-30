/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitedelivery;
import java.io.Serializable;
/**
 *   la comida que se va a comprar
 * @author isaac
 */

// atributes name price and quantity
public class ComidaComprar implements Serializable {
    //atributes
    private String nombre;
    private double precio;
    private int cantidad;
    //constructor
    public ComidaComprar(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "ComidaComprar{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
}
