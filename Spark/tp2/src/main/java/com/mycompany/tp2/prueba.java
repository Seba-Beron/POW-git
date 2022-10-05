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

/**
 *
 * @author Sebastian
 */

public class prueba {
    public static Route getNums = (Request req, Response res) -> {
        String[] cars = {"hola","pedro"};
        
        HashMap model = new HashMap();
        model.put("template","templates/eje.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
}
