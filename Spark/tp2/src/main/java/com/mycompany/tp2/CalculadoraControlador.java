/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import spark.Request;
import spark.Response;
import spark.Route;

public class CalculadoraControlador {  
     
    
    public static Route //cuando se inicia, crea los input y les pone valor 0
            inicio = (Request req, Response res)->{
                
        String txtVisor="";
        
        HashMap model = new HashMap();
        model.put("visor", txtVisor);
        model.put("template", "templates/form5.vsl"); //invoca al form de templates
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout5.vsl"));
        
        
    };
    
    public static Route 
            calcular = new Route() {
        @Override
           
            public Object handle(Request req, Response res) throws Exception { 
                
            Calculadora calcu= new Calculadora(); 
            String txtVisor="";
                      
            if(req.queryParams("numero")!=null){
               txtVisor=calcu.btn_numero(req.queryParams("numero"));
            }
            if(req.queryParams("operacion")!=null){
                
               txtVisor=calcu.btn_operacion(req.queryParams("operacion"));
               
            }
            if(req.queryParams("igual")!=null){
                
               txtVisor=calcu.btn_igual();
               
            }
            if(req.queryParams("reset")!=null){
               
               txtVisor=calcu.reset();
            }
        
            
            HashMap model = new HashMap();
            model.put("visor", txtVisor);
            model.put("template", "templates/form5.vsl"); //invoca al form de templates
            return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout5.vsl"));
        }
    };    
}
