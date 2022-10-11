/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author valen
 */
public class RadioControlador {
    public static Route CalcPerimeter = (Request request, Response response) -> {
        HashMap model = new HashMap();
        if (request.queryParams("radio") != null) {
            double radio = Double.parseDouble(request.queryParams("radio"));
            double area =Math.pow((double)radio,2)*Math.PI;
            double perimetro = 2*radio*Math.PI;

            model.put("radio", radio);
            model.put("area", area);
            model.put("perimetro", perimetro);
            model.put("template", "templates/radio.vsl");
        }
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout4.vsl"));
    };
}

