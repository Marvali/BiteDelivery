package com.mycompany.bitedelivery;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  comidas que estan en el menu de la aplicacion
 * @author Fer
 */
public class Comidas implements Serializable {
    //ATRIBUTOS
    private String titulo;
    private ArrayList ingredientes;
    private double precio_venta;
    private String fotografia;
    private int cantidad;
    //CONSTRUCTOR
    public Comidas(String titulo, ArrayList ingredientes, double precio_venta, String fotografia) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.precio_venta = precio_venta;
        this.fotografia = fotografia;
        this.cantidad = 1;
    }

    
    //GETTERS AND SETTERS
    public String getFotografia() {
        return fotografia;
    }
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    public double getPrecio_venta() {
        return precio_venta;
    }
    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    public ArrayList getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(ArrayList ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String Titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Comidas{" + "titulo=" + titulo + ", ingredientes=" + ingredientes + ", precio_venta=" + precio_venta + ", fotografia=" + fotografia + '}';
    }

}
