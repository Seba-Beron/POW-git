/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_sparck;
import java.util.ArrayList;
import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author UD
 */
public class Persona {
    String nombre;
    String apellido;
    List<Persona> hijos;
    
    public Persona (String nbre, String ape) {
        nombre = nbre; apellido = ape;
        hijos = new ArrayList<>();
    } 
    public void nacimiento(Persona bebe) {
        hijos.add(bebe);
    }
      
    public String getNombre(){return nombre;}
    public List<Persona> getHijo(){return hijos;}
  
   
}
