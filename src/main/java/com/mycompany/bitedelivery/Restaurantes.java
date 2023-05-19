package com.mycompany.bitedelivery;

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
    private Comidas comidas;

   //CONsTRUCTOR

    public Restaurantes(Direccion direccion, String especialidad, double calificacion, double gastosEnvio, int tiempoMedioEnvio, boolean servicioCatering, Comidas comidas) {
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosEnvio = gastosEnvio;
        this.tiempoMedioEnvio = tiempoMedioEnvio;
        this.servicioCatering = servicioCatering;
        this.comidas = comidas;
    }


   // GETTERS Y SETTERS
    public Comidas getComidas() {
        return comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }
    
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
}
