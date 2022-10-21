package com.mycompany.tp3;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class IndexController {
    
    public static Route getIndex = (Request req, Response res) -> {
            HashMap model = new HashMap();
            String email = req.session().attribute("email");
            System.out.println(email);
            
            if(email == null){
                Menu menu = new Menu();
                model.put("menu", menu.getMenu());  
                model.put("menuActivo", "index");   
                model.put("template", "templates/index.vsl");
            }else{
                Menu menu = new Menu();
                model.put("menu", menu.getMenuLog()); 
                model.put("email-usuario", email);   
                model.put("menuActivo", "index");     
                model.put("template", "templates/main.vsl");
            }
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
        };
}
