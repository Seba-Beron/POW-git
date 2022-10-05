/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import static spark.Spark.init;


class PersonaDAO {
    private List<Persona> personas;
    
    public PersonaDAO(){
        Persona p1=new Persona("Susana","Oria");
        p1.nacimiento(new Persona("Elvis","Tek"));
        p1.nacimiento(new Persona("Alicia","Tek"));
        p1.getHijos().get(1).nacimiento(new Persona("Elsa","Capuntas"));
        p1.getHijos().get(1).nacimiento(new Persona("Mar","Capuntas"));
        
        personas.add(p1);
        personas.add(p1.getHijos().get(0));
        personas.add(p1.getHijos().get(1));
        personas.add(p1.getHijos().get(1).getHijos().get(0));
        personas.add(p1.getHijos().get(1).getHijos().get(0));
    } 
  
    public Persona getPersona(String nombre, String apellido)    {
        init();
        Persona pEncontrada=null;
        for (int i=0;i<personas.size();i++){
            if((personas.get(i).getNombre().equals(nombre)) & personas.get(i).getApellido().equals(apellido)){
                pEncontrada=personas.get(i);
            }
        }  
        return pEncontrada;
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
    
    
}

