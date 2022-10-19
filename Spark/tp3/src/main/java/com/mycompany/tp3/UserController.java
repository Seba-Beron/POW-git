package com.mycompany.tp3;

import spark.Request;
import spark.Response;
import spark.Route;
import java.util.List;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class UserController {

    public static Route 
        getLogin = (Request req, Response res) -> {
     
            HashMap model = new HashMap();
            
            Menu menu = new Menu();
            model.put("menu", menu.getMenu());  
            model.put("menuActivo", "login");   
            
            if(req.queryParams("pass")!=null && req.queryParams("email")!=null)
            {
                UserDAO uDAO = new UserDAO();
                List<User> user = uDAO.verificarPersona(req.queryParams("email"),req.queryParams("pass"));
                if(!user.isEmpty()){
                    model.put("template", "templates/main.vsl");
                    User usuarioLogeado = user.get(0);
                    req.session(true);                     // Crear y retornar la sesion
                    req.session().attribute("id", usuarioLogeado.getId() );       // Seteamos atributo
                    req.session().attribute("email", usuarioLogeado.getEmail() ); // Seteamos atributo
                    res.redirect("/index");
                }else{
                    model.put("template", "templates/login.vsl");
                    model.put("request",req);
                    model.put("error", "La contraseña o el email es incorrecto.");
                }
            }else{
                model.put("email","");
                model.put("template", "templates/login.vsl");   
            }
            
            return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl")); 
        }; 
    public static Route 
            Logout = (Request req, Response res) -> {
            req.session().removeAttribute("id");
            req.session().removeAttribute("email");
            res.redirect("/index");
            return null;
        };
}


