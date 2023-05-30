package com.mycompany.bitedelivery;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Clase que guarda los datos de la aplicacion
 * @autor Isaac
 */
public class GuardoDatos implements Serializable {

    public static ArrayList<Comidas> comidas = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> empresas = new ArrayList<>();
    public static ArrayList<UsuarioParticular> particulares = new ArrayList<>();
    public static ArrayList<Restaurante>restaurantes = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> prueba = new ArrayList<>();
    public static ArrayList<ComidaComprar> selectedFoodArrayList = new ArrayList<>();
    public static ArrayList<Opinion> opiniones = new ArrayList<>();
     
    public static String selectedRestaurantName;
    public static String selectedFoodName;
    public static UsuarioParticular particularActual;
    public static UsuarioEmpresa empresaActual;
    public static String tipoUsuario;
    public static boolean nuevoRestaurante = false;



    /*
     * carga los datos de los ficheros de la comida
     */
     
    public static void loadDataComidas() {
        //metodo para cargar los datos de las comidas
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

    /*
     *
     * guarda los datos de los ficheros de la comida
     */
    public static void saveDataComidas(){
        //save all data from txt.
        //metodo para guardar los datos de las comidas
        
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

    /*
     * carga los datos de los ficheros de las empresas
     */
    public static void loadDataEmpresas() {
        //metodo para cargar los datos de las empresas
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


    /*
     * guarda los datos de los ficheros de los particulares
     */
    
    public static void loadDataParticulares() {
        //metodo para cargar los datos de los particulares
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

    /*
     * carga los datos de los ficheros de los particulares
     */
    public static void loadDataRestaurantes() {
        //metodo para cargar los datos de los restaurantes
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

    /*
     * guarda los datos de los ficheros de los particulares
     */

    public static void saveDataParticulares(){
        //save all data from txt.
        //metodo para guardar los datos de los particulares
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

    /*
     * guarda los datos de los ficheros de los restaurantes
     */
    public static void saveDataRestaurantes(){
        //save all data from txt.
        //metodo para guardar los datos de los restaurantes
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

    /*
     * carga los datos de los ficheros de las opiniones
     */
    public static void saveDataEmpresas(){
        //save all data from txt.
        //metodo para guardar los datos de las empresas
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

    /*
     * guarda los datos de los ficheros de las opiniones
     */
    public static void saveDataOpinion(){
        //save all data from txt.
        //metodo para guardar los datos de las opinio
            try{
                try(FileOutputStream fos = new FileOutputStream("opiniones.dat")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(opiniones);
                    //cerrar el fichero
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }

    /*
        * carga los datos de los ficheros de las opiniones
        */
    
    public static void loadDataOpinion() {
        //metodo para cargar los datos de las opiniones
        try (FileInputStream fis = new FileInputStream("opiniones.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            opiniones = (ArrayList<Opinion>) ois.readObject();
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


    /*
     *  registra un nuevo restaurante
     */
    public static boolean registerRestaurantes(Restaurante restaurante){
        //Registrar un nuevo restaurante
        if (restaurantes.contains(restaurante)){
            return false;
        }else{
            restaurantes.add(restaurante);
            return true;
        }
    }
    
    /*
     *  devuelve la lista de restaurantes
     */
    public static ArrayList<Restaurante> getRestaurantes(){
        //metodo para obtener los restaurantes
        return restaurantes;
    }

    /*
     *  registra un nueva empresa
     */

    public static boolean registerEmpresa(UsuarioEmpresa empresa){
        //registrar una nueva empresa
        //register a new company
        if (empresas.contains(empresa)){
            return false;
        }else{
            empresas.add(empresa);
            return true;
        }
    }

    /*
     *  registra un nuevo particular
     */
    public static boolean registerParticular(UsuarioParticular particular){
        //registrar un nuevo particular
        if (particulares.contains(particular)){
            return false;
        }else{
            particulares.add(particular);
            return true;
        }
    }

    /*
     *  inicia sesion de una empresa
     */

    public static boolean loginEmpresa(String email, String password){
        //inicio de sesion empresa

        for (UsuarioEmpresa empresa : empresas){
            if (empresa.getEmail().equals(email) && empresa.getPassword().equals(password)){
                empresaActual = empresa;
                tipoUsuario = "empresa";
                return true;
            }
        }
        return false;
    }

    /*
     *  inicia sesion de un particular
     */
    public static boolean loginParticular(String email, String password){
        //login particular

        for (UsuarioParticular particular : particulares){
            if (particular.getEmail().equals(email) && particular.getPassword().equals(password)){
                particularActual = particular;
                tipoUsuario = "particular";
                return true;

            }
        }
        return false;
    }

    /*
     *  busca un restaurante por nombre
     */
     
public static ArrayList<Restaurante> buscar(String nombre) {
    //buscar un restaurante por nombre
    ArrayList<Restaurante> restaurantesEncontrados = new ArrayList<>();
    for (Restaurante restaurante : restaurantes) {
        if (restaurante.getNombre().equalsIgnoreCase(nombre) ) {
            restaurantesEncontrados.add(restaurante);
        }
        
    }
    return restaurantesEncontrados;
}

    /*
     *  devuelve el restaurante actual
     */
    
public String getselectedRestaurantName(){

return selectedRestaurantName;
};

    /*
     *  metodo de la creacion del arraylist de comida que se va a comprar
     */
public static ArrayList<ComidaComprar> createFoodArrayList(String nombre, double price, int quantity) {
    //metodo para crear un arraylist de comida que se va a comprar 
    boolean found = false;
    for (ComidaComprar comidaComprar : selectedFoodArrayList) {
        if (comidaComprar.getNombre().equalsIgnoreCase(nombre)) {
            found = true;
            if (quantity == 0) {
                selectedFoodArrayList.remove(comidaComprar); // Remove the ComidaComprar object if quantity is 0
            } else {
                comidaComprar.setCantidad(comidaComprar.getCantidad() + quantity); // Update the quantity if the ComidaComprar object already exists
            }
            break;
        }
    }
    if (!found && quantity > 0) {
        ComidaComprar comidaComprar = new ComidaComprar(nombre, price, quantity);
        selectedFoodArrayList.add(comidaComprar); // Add a new ComidaComprar object if it doesn't exist
    }
    return selectedFoodArrayList;
}


}


