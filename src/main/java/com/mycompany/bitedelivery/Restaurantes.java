package com.mycompany.bitedelivery;

import java.util.ArrayList;

/* -direccion: Direccion             |
        -especialidad: String             |
        -calificacion: double             |
        -gastosEnvio: double              |
         -tiempoMedioEnvio: int            |
        -servicioCatering: boolean


 */
public class Restaurantes {
    // ATRIBUTOS
    private Direccion direccion;
    private String especialidad;
    private double calificacion;
    private double gastosEnvio;
    private int tiempoMedioEnvio;
    private boolean servicioCatering;
    private ArrayList Comidas;

   


   //CONSTRUCTOR
 
     public Restaurantes(Direccion direccion, String especialidad, double calificacion, double gastosEnvio, int tiempoMedioEnvio, boolean servicioCatering, ArrayList Comidas) {
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosEnvio = gastosEnvio;
        this.tiempoMedioEnvio = tiempoMedioEnvio;
        this.servicioCatering = servicioCatering;
        this.Comidas = Comidas;
    }

    // GETTERS Y SETTERS
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoMedioEnvio() {
        return tiempoMedioEnvio;
    }

    public void setTiempoMedioEnvio(int tiempoMedioEnvio) {
        this.tiempoMedioEnvio = tiempoMedioEnvio;
    }

    public boolean isServicioCatering() {
        return servicioCatering;
    }

    public void setServicioCatering(boolean servicioCatering) {
        this.servicioCatering = servicioCatering;
    }
    public ArrayList getComidas() {
        return Comidas;
    }

    public void setComidas(ArrayList Comidas) {
        this.Comidas = Comidas;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "direccion=" + direccion + ", especialidad=" + especialidad + ", calificacion=" + calificacion + ", gastosEnvio=" + gastosEnvio + ", tiempoMedioEnvio=" + tiempoMedioEnvio + ", servicioCatering=" + servicioCatering + ", Comidas=" + Comidas + '}';
    }
    
}
