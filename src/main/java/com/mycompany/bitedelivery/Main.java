package com.mycompany.bitedelivery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



     // Example 1
ArrayList<String> ingredientes1 = new ArrayList<>();
ingredientes1.add("Espaguetis");
ingredientes1.add("Carne picada");
ingredientes1.add("Tomate");
Comidas Comida1 = new Comidas("Espaguetis a la Boloñesa", ingredientes1, 13, "foto1.jpg");

// Example 2
ArrayList<String> ingredientes2 = new ArrayList<>();
ingredientes2.add("Pollo");
ingredientes2.add("Arroz");
ingredientes2.add("Verduras");
Comidas Comida2 = new Comidas("Arroz con Pollo", ingredientes2, 15, "foto2.jpg");

// Example 3
ArrayList<String> ingredientes3 = new ArrayList<>();
ingredientes3.add("Carne");
ingredientes3.add("Papas");
ingredientes3.add("Cebolla");
Comidas Comida3 = new Comidas("Lomo Saltado", ingredientes3, 18, "foto3.jpg");

// Example 4
ArrayList<String> ingredientes4 = new ArrayList<>();
ingredientes4.add("Salmón");
ingredientes4.add("Arroz");
ingredientes4.add("Verduras");
Comidas Comida4 = new Comidas("Salmón Teriyaki", ingredientes4, 20, "foto4.jpg");

// Example 5
ArrayList<String> ingredientes5 = new ArrayList<>();
ingredientes5.add("Hamburguesa");
ingredientes5.add("Queso");
ingredientes5.add("Lechuga");
Comidas Comida5 = new Comidas("Hamburguesa con Queso", ingredientes5, 12, "foto5.jpg");

// Example 6
ArrayList<String> ingredientes6 = new ArrayList<>();
ingredientes6.add("Pizza");
ingredientes6.add("Pepperoni");
ingredientes6.add("Queso");
Comidas Comida6 = new Comidas("Pizza de Pepperoni", ingredientes6, 16, "foto6.jpg");

// Example 7
ArrayList<String> ingredientes7 = new ArrayList<>();
ingredientes7.add("Ensalada");
ingredientes7.add("Pollo");
ingredientes7.add("Tomate");
Comidas Comida7 = new Comidas("Ensalada César", ingredientes7, 9, "foto7.jpg");

// Example 8
ArrayList<String> ingredientes8 = new ArrayList<>();
ingredientes8.add("Sopa");
ingredientes8.add("Pollo");
ingredientes8.add("Fideos");
Comidas Comida8 = new Comidas("Sopa de Pollo", ingredientes8, 6, "foto8.jpg");

// Example 9
ArrayList<String> ingredientes9 = new ArrayList<>();
ingredientes9.add("Tacos");
ingredientes9.add("Carne");
ingredientes9.add("Cebolla");
Comidas Comida9 = new Comidas("Tacos de Carne Asada", ingredientes9, 10, "foto9.jpg");

// Example 10
ArrayList<String> ingredientes10 = new ArrayList<>();
ingredientes10.add("Sushi");
ingredientes10.add("Arroz");
ingredientes10.add("Pescado");
Comidas Comida10 = new Comidas("Sushi de Salmón", ingredientes10, 18, "foto10.jpg");

// Example 11
ArrayList<String> ingredientes11 = new ArrayList<>();
ingredientes11.add("Huevos");
ingredientes11.add("Tocino");
ingredientes11.add("Pan");
Comidas Comida11 = new Comidas("Desayuno Americano", ingredientes11, 7, "foto11.jpg");

// Example 12
ArrayList<String> ingredientes12 = new ArrayList<>();
ingredientes12.add("Pollo");
ingredientes12.add("Arroz");
ingredientes12.add("Verduras");
Comidas Comida12 = new Comidas("Pollo al Curry", ingredientes12, 14, "foto12.jpg");

// Example 13
ArrayList<String> ingredientes13 = new ArrayList<>();
ingredientes13.add("Pasta");
ingredientes13.add("Salsa de Tomate");
ingredientes13.add("Queso");
Comidas Comida13 = new Comidas("Pasta a la Boloñesa", ingredientes13, 11, "foto13.jpg");

// Example 14
ArrayList<String> ingredientes14 = new ArrayList<>();
ingredientes14.add("Ensalada");
ingredientes14.add("Atún");
ingredientes14.add("Lechuga");
Comidas Comida14 = new Comidas("Ensalada de Atún", ingredientes14, 8, "foto14.jpg");

// Example 15
ArrayList<String> ingredientes15 = new ArrayList<>();
ingredientes15.add("Hamburguesa");
ingredientes15.add("Bacon");
ingredientes15.add("Queso");
Comidas Comida15 = new Comidas("Hamburguesa con Bacon", ingredientes15, 13, "foto15.jpg");

// Example 16
ArrayList<String> ingredientes16 = new ArrayList<>();
ingredientes16.add("Pizza");
ingredientes16.add("Jamón");
ingredientes16.add("Queso");
Comidas Comida16 = new Comidas("Pizza de Jamón y Queso", ingredientes16, 15, "foto16.jpg");
    // Example 1
ArrayList<Comidas> restaurante1_comida = new ArrayList<>();
restaurante1_comida.add(Comida1);
restaurante1_comida.add(Comida2);
restaurante1_comida.add(Comida3);
Restaurante Restaurante1 = new Restaurante("La Pizzeria", new Direccion("Calle Mayor", 123, 28001), "Pizza", 8.5, 15, 50, true, restaurante1_comida);
GuardoDatos.registerRestaurantes(Restaurante1);


// Example 2
ArrayList<Comidas> restaurante2_comida = new ArrayList<>();
restaurante2_comida.add(Comida4);
restaurante2_comida.add(Comida5);
restaurante2_comida.add(Comida6);
Restaurante Restaurante2 = new Restaurante("El Asador", new Direccion("Calle del Sol", 45, 28002), "Carne", 12.0, 20, 80, false, restaurante2_comida);
GuardoDatos.registerRestaurantes(Restaurante2);


// Example 3
ArrayList<Comidas> restaurante3_comida = new ArrayList<>();
restaurante3_comida.add(Comida7);
restaurante3_comida.add(Comida8);
restaurante3_comida.add(Comida9);
Restaurante Restaurante3 = new Restaurante("La Taberna", new Direccion("Calle de la Luna", 67, 28003), "Tapas", 5.0, 10, 30, true, restaurante3_comida);
GuardoDatos.registerRestaurantes(Restaurante3);



ArrayList<Comidas> restaurante4_comida = new ArrayList<>();
restaurante4_comida.add(Comida10);
restaurante4_comida.add(Comida11);
restaurante4_comida.add(Comida12);
Restaurante Restaurante4 = new Restaurante("El Japones", new Direccion("Calle de las Estrellas", 89, 28004), "Japonesa", 15.0, 20, 60, false, restaurante4_comida);
GuardoDatos.registerRestaurantes(Restaurante4);


// Example 5
ArrayList<Comidas> restaurante5_comida = new ArrayList<>();
restaurante5_comida.add(Comida13);
restaurante5_comida.add(Comida14);
restaurante5_comida.add(Comida15);
Restaurante Restaurante5 = new Restaurante("La Trattoria", new Direccion("Calle de las Flores", 101, 28005), "Italiana", 10.0, 15, 40, true, restaurante5_comida);
GuardoDatos.registerRestaurantes(Restaurante5);

GuardoDatos.saveDataRestaurantes();

    }

}