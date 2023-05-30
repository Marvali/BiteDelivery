/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitedelivery;

/**
 *
 * @author Fer
 *  representa el servicio de catering
 */
public class ServicioCatering {
    //ATRIBUTOS
    private boolean comida_proporcionar;
    private boolean camareros;
    private boolean cocineros;
    private boolean decoracion;
    private boolean espacio;
    private double total;
    //CONSTRUCTOR

    public ServicioCatering(boolean comida_proporcionar, boolean camareros, boolean cocineros, boolean decoracion, boolean espacio, double total) {
        this.comida_proporcionar = comida_proporcionar;
        this.camareros = camareros;
        this.cocineros = cocineros;
        this.decoracion = decoracion;
        this.espacio = espacio;
        this.total = total;
    }
    
    
    
    
    
     //GETTERS AND SETTERS
    public boolean isDecoracion() {
        return decoracion;
    }

    public void setDecoracion(boolean decoracion) {
        this.decoracion = decoracion;
    }

    public boolean isCocineros() {
        return cocineros;
    }

    public void setCocineros(boolean cocineros) {
        this.cocineros = cocineros;
    }

    public boolean isCamareros() {
        return camareros;
    }

    public void setCamareros(boolean camareros) {
        this.camareros = camareros;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getEspacio() {
        return espacio;
    }

    public void setEspacio(boolean espacio) {
        this.espacio = espacio;
    }


    public boolean getComida_proporcionar() {
        return comida_proporcionar;
    }

    public void setComida_proporcionar(boolean comida_proporcionar) {
        this.comida_proporcionar = comida_proporcionar;
    }

    @Override
    public String toString() {
        return "ServicioCatering{" + "comida_proporcionar=" + comida_proporcionar + ", camareros=" + camareros + ", cocineros=" + cocineros + ", decoracion=" + decoracion + ", espacio=" + espacio + ", total=" + total + '}';
    }


    //METODOS
    public void Costetotal( boolean comida_proporcionar,boolean camareros,boolean cocineros,boolean decoracion,boolean espacio){
        double total =this.total;
        if (this.comida_proporcionar==true){
       total = total+ 1000;
    }
        if (this.camareros==true){
       total = total + 800; 
    }
          if (this.cocineros==true){
       total = total + 1000; 
    }
            if (this.decoracion==true){
       total = total + 500; 
    }
              if (this.espacio==true){
       total = total + 1000; 
    }
    
    }
    
    
    
    
    
}
