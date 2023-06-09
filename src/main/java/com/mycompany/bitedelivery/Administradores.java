/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitedelivery;

import java.util.logging.Logger;

/**
 *  representa los administradores de la aplicacion
 * @author Fer
 * 
 */
public class Administradores {
    //ATRIBUTOS
    private String correo;
    private String clave;
    
    //CONSTRUCTOR
    public Administradores(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
    
    //GETTERS AND SETTERS
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Administradores{" + "correo=" + correo + ", clave=" + clave + '}';
    }

}
