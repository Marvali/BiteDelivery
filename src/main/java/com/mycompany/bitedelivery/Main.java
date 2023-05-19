package com.mycompany.bitedelivery;

public class Main {
    public static void main(String[] args) {
        UsuarioParticular clienteParticular = new UsuarioParticular("email", "password", "nombre", new Direccion("calle", "numero", "codigoPostal", "ciudad"), new TarjetaCredito("titular", "numero", "fechaCaducidad"), "telefono", "DNI");
    }
}