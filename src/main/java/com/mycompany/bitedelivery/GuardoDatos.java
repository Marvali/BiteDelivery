package com.mycompany.bitedelivery;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class GuardoDatos implements Serializable {

    public static ArrayList<Comidas> comidas = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> empresas = new ArrayList<>();
    public static ArrayList<UsuarioParticular> particulares = new ArrayList<>();
    public static ArrayList<Restaurante>restaurantes = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> prueba = new ArrayList<>();
     public static ArrayList<ComidaComprar> selectedFoodArrayList = new ArrayList<>();
     private static ArrayList<Comidas> comidasArrayList = new ArrayList<>();
    public static String selectedRestaurantName;
    public static String selectedFoodName;




    public static void loadDataComidas() {
        try (FileInputStream fis = new FileInputStream("comidas.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            selectedFoodArrayList = (ArrayList<ComidaComprar>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle IO exception
            System.err.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle class not found exception
            System.err.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
    public static void saveDataComidas(){
        //save all data from txt.
        
            try{
                try(FileOutputStream fos = new FileOutputStream("comidas.dat")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(selectedFoodArrayList);
                    //cerrar el fichero
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        
    }
    public static void loadDataEmpresas() {
    try (FileInputStream fis = new FileInputStream("empresas.dat");
         ObjectInputStream ois = new ObjectInputStream(fis)) {
        empresas = (ArrayList<UsuarioEmpresa>) ois.readObject();
    } catch (FileNotFoundException e) {
        // Handle file not found exception
        System.err.println("File not found: " + e.getMessage());
    } catch (IOException e) {
        // Handle IO exception
        System.err.println("Error reading file: " + e.getMessage());
    } catch (ClassNotFoundException e) {
        // Handle class not found exception
        System.err.println("Class not found: " + e.getMessage());
    } catch (Exception e) {
        // Handle any other exception
        System.err.println("Error loading data: " + e.getMessage());
    }
}


    public static void loadDataParticulares() {
        try (FileInputStream fis = new FileInputStream("particulares.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            particulares = (ArrayList<UsuarioParticular>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle IO exception
            System.err.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle class not found exception
            System.err.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
    public static void loadDataRestaurantes() {
        try (FileInputStream fis = new FileInputStream("restaurantes.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            restaurantes = (ArrayList<Restaurante>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle IO exception
            System.err.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Handle class not found exception
            System.err.println("Class not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception
            System.err.println("Error loading data: " + e.getMessage());
        }
    }

    public static void saveDataParticulares(){
        //save all data from txt.
        if(!particulares.isEmpty()){
            try{
                try(FileOutputStream fos = new FileOutputStream("particulares.dat")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(particulares);
                    //cerrar el fichero
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void saveDataRestaurantes(){
        //save all data from txt.
        if(!restaurantes.isEmpty()){
            try{
                try(FileOutputStream fos = new FileOutputStream("restaurantes.dat")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(restaurantes);
                    //cerrar el fichero
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void saveDataEmpresas(){
        //save all data from txt.
        if(!empresas.isEmpty()){
            try{
                try(FileOutputStream fos = new FileOutputStream("empresas.dat")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(empresas);
                    //cerrar el fichero
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static boolean registerRestaurantes(Restaurante restaurante){
        if (restaurantes.contains(restaurante)){
            return false;
        }else{
            restaurantes.add(restaurante);
            return true;
        }
    }
    public static ArrayList<Restaurante> getRestaurantes(){
        return restaurantes;
    }

    public static boolean registerEmpresa(UsuarioEmpresa empresa){
        //register a new company
        if (empresas.contains(empresa)){
            return false;
        }else{
            empresas.add(empresa);
            return true;
        }
    }
    public static boolean registerParticular(UsuarioParticular particular){
        //register a new company
        if (particulares.contains(particular)){
            return false;
        }else{
            particulares.add(particular);
            return true;
        }
    }

    public static boolean loginEmpresa(String email, String password){
        //login a company

        for (UsuarioEmpresa empresa : empresas){
            if (empresa.getEmail().equals(email) && empresa.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public static boolean loginParticular(String email, String password){
        //login particular

        for (UsuarioParticular particular : particulares){
            if (particular.getEmail().equals(email) && particular.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
public static ArrayList<Restaurante> buscar(String nombre) {
    ArrayList<Restaurante> restaurantesEncontrados = new ArrayList<>();
    for (Restaurante restaurante : restaurantes) {
        if (restaurante.getNombre().equalsIgnoreCase(nombre) ) {
            restaurantesEncontrados.add(restaurante);
        }
        
    }
    return restaurantesEncontrados;
}

public String getselectedRestaurantName(){

return selectedRestaurantName;
};

//selected foodarraylist
public static ArrayList<ComidaComprar> createFoodArrayList(String nombre,double price, int quantity) {

//make a new list for the shipping cart with food
ComidaComprar comidaComprar = new ComidaComprar(nombre,price,quantity);
selectedFoodArrayList.add(comidaComprar);
return selectedFoodArrayList;
}


}


