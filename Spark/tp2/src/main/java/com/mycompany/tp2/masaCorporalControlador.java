/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import java.util.HashMap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author Sebastian
 */
public class masaCorporalControlador {
    public static Route inicio = (Request req, Response res)->{        
        int a = 0, p = 0;
        HashMap model = new HashMap();
        model.put("altura", a); 
        model.put("peso", p); 
        model.put("template", "templates/formEje2.vsl"); //invoca al form de templates
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    public static Route calcularIndiceMC = (Request req, Response res)->{
        String a = req.queryParams("altura");
        String p = req.queryParams("peso");
        float imc = Float.parseFloat(p)/((Float.parseFloat(a)/100)*(Float.parseFloat(a)/100));
        System.out.println(imc);
        HashMap model = new HashMap();
        model.put("imc", imc); 
        model.put("template", "templates/formEje2.vsl"); //invoca al form de templates
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
}
