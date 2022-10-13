/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.List;

class PersonaDAO {
    private List<Persona> personas;
        
    private void init(){ 
        personas = new ArrayList<Persona>();
    
        Persona p1 = new Persona("Elvis","Capuntas");
        Persona p2 = new Persona("Alicia","Tek");
        Persona p3 = new Persona("Elsa","Capuntas");
        Persona p4 = new Persona("Mar","Capuntas");
        Persona p5 = new Persona("Paula","Juarez");
        Persona p6 = new Persona("Maria","Juarez");
        Persona p7 = new Persona("Juan","Fernandez");
        Persona p8 = new Persona("Fernando","Fernandez");
        
        p1.setHijos(p3);
        p1.setHijos(p4);
        p2.setHijos(p3);
        p2.setHijos(p4);
        p3.setHijos(p5);
        p3.setHijos(p6);
        p4.setHijos(p7);
        p4.setHijos(p8);
        
        personas.add(p1); 
        personas.add(p2); 
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        personas.add(p7);
        personas.add(p8);   
    }
    
    public List<Persona> getPersonas(){
        init();
        return personas;
    } 
    
    public List<Persona> getHijos(String nombre, String apellido){
        init();
        List<Persona> hijos;
        hijos = new ArrayList<>();
        
         for (int i=0;i<personas.size();i++){
            if((personas.get(i).getNombre().equals(nombre)) & personas.get(i).getApellido().equals(apellido)){
                for (Persona p: personas.get(i).getHijos()){
                    hijos.add(p);
                }
                i=personas.size();
            }
        }       
        return hijos;
    } 
    
    public List<Persona> getNietos(String nombre, String apellido){
        init();
        List<Persona> nietos;
        nietos = new ArrayList<>(); 
        
        for (int i=0;i<personas.size();i++){
            if((personas.get(i).getNombre().equals(nombre)) & personas.get(i).getApellido().equals(apellido)){
                for (Persona p: personas.get(i).getHijos()){
                    for (Persona h: p.getHijos()){
                        nietos.add(h);
                    }
                }
                i=personas.size();
            }
        }
        return nietos;
    } 
    
    public List<Persona> getHermanos(String nombre, String apellido){
        init();
        List<Persona> hermanos;
        List<Persona> padres;
        hermanos = new ArrayList<Persona>();
        padres = new ArrayList<Persona>();
        padres = getPadres(nombre, apellido);
        
        for(int i=0; i<padres.size();i++){
            for(int j=0; j<padres.get(i).getHijos().size(); j++){
                if(!(nombre.equals(padres.get(i).getHijos().get(j).getNombre())) && (apellido.equals(padres.get(i).getHijos().get(j).getApellido()))){
                hermanos.add(padres.get(i).getHijos().get(j));
                }
            }
        }
        return hermanos;
    } 
    
    public List<Persona> getPadres(String nombre, String apellido){
        init();
        List<Persona> padres;
        padres = new ArrayList<Persona>();
        
        for(int i=0; i<personas.size();i++){        
            for(int j=0;j<personas.get(i).getHijos().size();j++){
                if(nombre.equals(personas.get(i).getHijos().get(j).getNombre())){
                    padres.add(personas.get(i));
                    break;  
                }   
            }          
        }
        return padres;
    } 
    
    public List<Persona> getTios(String nombre, String apellido) {
        init();
        List<Persona> tios;
        List<Persona> padres;
        tios = new ArrayList<Persona>();
        padres = new ArrayList<Persona>();
        
        padres=getPadres(nombre, apellido);
        for(int i=0; i<padres.size();i++){
            tios.addAll(getHermanos(padres.get(i).getNombre(), padres.get(i).getApellido()));    
        }   
        return tios;
    }
}