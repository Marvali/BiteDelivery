package com.mycompany.bitedelivery;

public class Main {
    public static void main(String[] args) {
        ClienteParticular clienteParticular = new ClienteParticular("email", "password", "nombre", new Direccion("calle", "numero", "codigoPostal", "ciudad"), new TarjetaCredito("titular", "numero", "fechaCaducidad"), "telefono", "DNI");
    }
}