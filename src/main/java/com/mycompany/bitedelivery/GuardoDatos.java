package com.mycompany.bitedelivery;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GuardoDatos {

    public static ArrayList<Comidas> comidas = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> empresas = new ArrayList<>();
    public static ArrayList<UsuarioParticular> particular = new ArrayList<>();
    public static ArrayList<Restaurantes>restaurantes = new ArrayList<>();






    public static void loadData(){
        //load all data from txt.
        try{
            try(FileInputStream fis = new FileInputStream("empresas.txt")){
                ObjectInputStream ois = new ObjectInputStream(fis);
                empresas = (ArrayList<UsuarioEmpresa>) ois.readObject();


            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


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
}
