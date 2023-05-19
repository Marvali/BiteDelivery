package com.mycompany.bitedelivery;

/*
    Clase Cliente
    -email: String
    -password: String
    -nombre: String
    -direccion: Direccion
    -tarjetaCredito: TarjetaCredito
    -telefono: String
 */


public class Usuario {
    // ATRIBUTOS
    private String email;
    private String password;
    private String nombre;
    private Direccion direccion;
    private TarjetaCredito tarjetaCredito;
    private String telefono;

    // CONSTRUCTOR
    public Usuario(String email, String password, String nombre, Direccion direccion, TarjetaCredito tarjetaCredito, String telefono) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
    }
    // GETTERS Y SETTERS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + ", password=" + password + ", nombre=" + nombre + ", direccion=" + direccion + ", tarjetaCredito=" + tarjetaCredito + ", telefono=" + telefono + '}';
    }
}
