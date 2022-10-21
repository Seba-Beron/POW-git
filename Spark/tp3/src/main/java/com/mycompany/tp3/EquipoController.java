/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author Sebastian
 */
public class EquipoController {
     public static Route getEquipos = (Request req, Response res) -> {
        EquipoDAO eDAO = new EquipoDAO();
        List<Equipo> equipo = eDAO.getEquipos();  
        
        HashMap model = new HashMap();
        model.put("equipos", equipo);
        model.put("template", "templates/listaequipos.vsl");
        
        Menu menu = new Menu();
        model.put("menu", menu.getMenu());  
        model.put("menuActivo", "listaequipos");   
                
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
    };
}
