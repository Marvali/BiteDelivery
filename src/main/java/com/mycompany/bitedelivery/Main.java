package com.mycompany.bitedelivery;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsuarioParticular clienteParticular = new UsuarioParticular("Juan@gmail.com", "Bite123", "Juan", new Direccion("Avenda olimpica", 20, 28108, "Madrid"), new TarjetaCredito("Juan", "27282727V", "20/12/25"), 626678797, "51542302V");
        UsuarioParticular clienteParticular2 = new UsuarioParticular("Pedro@gmail.com", "Life123", "Pedro", new Direccion("Espartales", 2, 29708, "Madrid"), new TarjetaCredito("Pedro", "47232727B", "20/12/25"), 626277272, "51542334C");
        UsuarioParticular clienteParticular3 = new UsuarioParticular("Logan@gmail.com", "Logan123", "Logan", new Direccion("Rivas futura", 20, 24104, "Madrid"), new TarjetaCredito("Logan", "68982727H", "20/12/25"), 672878756, "52342302Y");
        //arraylist for ingredients

        ArrayList<String> ingredientesComida1 = new ArrayList<String>();
        ingredientesComida1.add("carne");
        ingredientesComida1.add("sal");
        ingredientesComida1.add("pimienta");
        Comidas Comida1 = new Comidas("Hamburguesa", ingredientesComida1, 5.5);

        Restaurantes restaurante1 = new Restaurantes("Avenida Olimpica","comida saludable",7.5,2.5,30,"True", ArraList(Comida1,Comida2,Comida3));

    }

}