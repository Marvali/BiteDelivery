/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitedelivery;

/**
 *
 * @author Fer
 */
public class ServicioCatering {
    //ATRIBUTOS
    private int comida_proporcionar;
    private int servicios;
    private int espacio;
    private int total;
    //CONSTRUCTOR

    public ServicioCatering(int comida_proporcionar, int servicios, int espacio, int total) {
        this.comida_proporcionar = comida_proporcionar;
        this.servicios = servicios;
        this.espacio = espacio;
        this.total = total;
    }
    
    //GETTERS AND SETTERS
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getServicios() {
        return servicios;
    }

    public void setServicios(int servicios) {
        this.servicios = servicios;
    }

    public int getComida_proporcionar() {
        return comida_proporcionar;
    }

    public void setComida_proporcionar(int comida_proporcionar) {
        this.comida_proporcionar = comida_proporcionar;
    }

    @Override
    public String toString() {
        return "ServicioCatering{" + "comida_proporcionar=" + comida_proporcionar + ", servicios=" + servicios + ", espacio=" + espacio + ", total=" + total + '}';
    }

}
