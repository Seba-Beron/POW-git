/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_sparck;

import java.util.ArrayList;
import java.util.List;
import static spark.Spark.init;

/**
 *
 * @author UD
 */
public class PersonaDAO {
    private List<Persona> personas;
    
    
    public Persona getPersona(String nombre, String apellido)    {
        init();
        Persona pEncontrada = personas.stream().filter(p -> nombre.equals(p.getNombre())).findAny().orElse(null);
        return pEncontrada;
    } 
    
    public List<Persona> getHijos(String nombre, String apellido)    {
        init();
        List<Persona> hijos;
        hijos = new ArrayList<>(); Persona pEncontrada = personas.stream()
        .filter(p -> nombre.equals(p.getNombre())).findAny().orElse(null);
        if (pEncontrada != null) { 
            pEncontrada.getHijo().forEach(persona ->{
                hijos.add(persona);
            } );
        }
        return hijos;
    } 
    public List<Persona> getNietos(String nombre, String apellido)    {
        init();
        List<Persona> nietos;
        nietos = new ArrayList<>(); Persona pEncontrada = personas.stream()
        .filter(p -> nombre.equals(p.getNombre())).findAny().orElse(null);
        if (pEncontrada != null) { 
            pEncontrada.getHijo().forEach(persona ->{
                nietos.addAll(persona.getHijo());
            } );
        }
        return nietos;
    } 
    
    
}

