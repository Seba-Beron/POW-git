/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.*;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */
public class ComparadorControlador {
    //cuando se inicia, crea los input y les pone valor 0
    public static Route inicio = (Request req, Response res)->{
        
        ArrayList<String> s = new ArrayList<>(); // array de valores
        for(int i=0;i<6;i++){
            s.add("0");
        }
        
        HashMap model = new HashMap();
        model.put("numeros", s); //pasar el arrar s con el nombre numeros
        model.put("template", "templates/form.vsl"); //invoca al form de templates
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    
    
    public static Route ordenar = (Request req, Response res)->{
        
        ArrayList<String> numeros= new ArrayList<>();
        
        String a;
        for(int i=0;i<6;i++){
            a="numero_"+Integer.toString(i); //input con name= lo mete dentro del a
            a=req.queryParams(a); //toma el valor posicionado en el input de ese nombre y lo mete en a
            if(a==null){
                numeros.add("0"); //si no tiene valor, le manda 0    
            }else{
                numeros.add(a); //si tiene valor, lo asigna al array
            }
        }
        
        // ordena segun la comparacion definida en comparador
        numeros.sort(new Comparador()); //compara y ordena modificando una funcio ya usada en 
        
        HashMap model=new HashMap();
        model.put("numeros", numeros); //pasa cantidad como numero para que el form los lea
        model.put("template","templates/form.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model,"templates/layout.vsl"));
    };

    public static Route desordenar = (Request req, Response res)->{
        
        ArrayList<String> numeros= new ArrayList<>();
        
        String a;
        for(int i=0;i<6;i++){
            a="numero_"+Integer.toString(i);
            a=req.queryParams(a);
            if(a==null){
                numeros.add("0");    
            }else{
                numeros.add(a);
            }
        }
        
        Collections.shuffle(numeros); //desordena un array
        
        HashMap model=new HashMap();
        model.put("numeros", numeros);
        model.put("template","templates/form.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model,"templates/layout.vsl"));
    };
}


class Comparador implements Comparator<String>{

    @Override   //?
    public int compare(String o1, String o2) {
       Double a=Double.parseDouble(o1);
       return a.compareTo(Double.parseDouble(o2));
    }
    
}