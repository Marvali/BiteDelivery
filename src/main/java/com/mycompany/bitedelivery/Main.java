package com.mycompany.bitedelivery;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    
     ArrayList Ingredientes_comida1 = new ArrayList();
     Ingredientes_comida1.add("carne");
     Ingredientes_comida1.add("salsa de tomate");
     Ingredientes_comida1.add("cebolla");
     Ingredientes_comida1.add("sal");
     Comidas Comida1 = new Comidas("carne en salsa",Ingredientes_comida1,12);
    ArrayList Ingredientes_comida2 = new ArrayList();
    Ingredientes_comida2.add("lechuga");
    Ingredientes_comida2.add("pasta");
    Ingredientes_comida2.add("tomate");
    Ingredientes_comida2.add("aceite");
    Ingredientes_comida2.add("vinagre");
    Ingredientes_comida2.add("sal");
    Comidas Comida2 = new Comidas("Ensalada de pasta",Ingredientes_comida2,8);
    ArrayList Ingredientes_comida3 = new ArrayList();
    Ingredientes_comida3.add("espaguetis");
    Ingredientes_comida3.add("carne");
    Ingredientes_comida3.add("tomate");
    Ingredientes_comida3.add("queso");
    Comidas Comida3 = new Comidas("Espaguetis a la Boloñesa",Ingredientes_comida3,13);
    ArrayList restaurante1_comida = new ArrayList();
    restaurante1_comida.add(Comida1);
    restaurante1_comida.add(Comida2);
    restaurante1_comida.add(Comida3);
    Restaurantes Restaurante1 = new Restaurantes(new Direccion("Los Espartales",29,25105),"Pasta",7.3,13,34,true,restaurante1_comida);
    
    ArrayList Ingredientes_comida4 = new ArrayList();
    Ingredientes_comida4.add("emperador");
    Ingredientes_comida4.add("sal gorda");
    Ingredientes_comida4.add("salsa agridulce");
    Ingredientes_comida4.add("panecillos");
    Comidas Comida4 = new Comidas("Emperador con guarnicion",Ingredientes_comida4,17);
    ArrayList Ingredientes_comida5 = new ArrayList();
    Ingredientes_comida5.add("lubina");
    Ingredientes_comida5.add("sal");
    Ingredientes_comida5.add("aceite de oliva");
    Ingredientes_comida5.add("patata y cebolla");
    Comidas Comida5 = new Comidas("Lubina a la sal",Ingredientes_comida5,21);
    ArrayList Ingredientes_comida6 = new ArrayList();
    Ingredientes_comida6.add("Dorada ");
    Ingredientes_comida6.add("sal");
    Ingredientes_comida6.add("aceite de oliva");
    Comidas Comida6 = new Comidas("Dorada a la sal",Ingredientes_comida6,18);
    
    ArrayList restaurante2_comida = new ArrayList();
    restaurante2_comida.add(Comida4);
    restaurante2_comida.add(Comida5);
    restaurante2_comida.add(Comida6);
    Restaurantes Restaurante2 = new Restaurantes(new Direccion("Los Martos",49,24735),"Pescado",6.5,10,54,false,restaurante2_comida);
    
    
    
    }

}