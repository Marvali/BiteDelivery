/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitedelivery;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 *
 * @author isaac
 */
public class Opinion implements Serializable {
    //atributes calificacion comentario y fecha
    private int calificacion;
    private String comentario;
    private Date fechaOpinion; 
    //constructor
    public Opinion(int calificacion, String comentario,Date fechaOpinion) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaOpinion = fechaOpinion;
        
    }
    public int getCalificacion() {
        return calificacion;
    }
    public String getComentario() {
        return comentario;
    }
    public Date getFechaOpinion() {
        return fechaOpinion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public void setFechaOpinion(Date fechaOpinion) {
        this.fechaOpinion = fechaOpinion;
    }
    @Override
    public String toString() {
        return "Opinion{" + "calificacion=" + calificacion + ", comentario=" + comentario + ", fechaOpinion=" + fechaOpinion + '}';
    
    }  

}