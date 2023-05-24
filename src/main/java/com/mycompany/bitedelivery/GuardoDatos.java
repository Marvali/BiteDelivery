package com.mycompany.bitedelivery;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;
public class GuardoDatos implements Serializable {

    public static ArrayList<Comidas> comidas = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> empresas = new ArrayList<>();
    public static ArrayList<UsuarioParticular> particular = new ArrayList<>();
    public static ArrayList<Restaurantes>restaurantes = new ArrayList<>();
    public static ArrayList<UsuarioEmpresa> prueba = new ArrayList<>();





    public static void loadData(){
        //load all data from .txt.
        try{
            try(FileInputStream fis = new FileInputStream("empresas.txt")){
                ObjectInputStream ois = new ObjectInputStream(fis);
                prueba = (ArrayList<UsuarioEmpresa>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }
    public static void saveDataEmpresas(){
        //save all data from txt.
        if(!empresas.isEmpty()){
            try{
                try(FileOutputStream fos = new FileOutputStream("empresas.txt")){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(empresas);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
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

    public static boolean loginEmpresa(String email, String password){
        //login a company

        for (UsuarioEmpresa empresa : empresas){
            if (empresa.getEmail().equals(email) && empresa.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
