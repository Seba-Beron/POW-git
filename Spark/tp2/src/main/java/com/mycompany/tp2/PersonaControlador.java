/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap; 
import java.util.List;

/**
 *
 * @author valen
 */

public class PersonaControlador {
    
    public static Route inicio = (Request request, Response response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/inicio3.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl")); 
    };
    
    public static Route getPersonas = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO(); 
        List<Persona> p = pDAO.getPersonas(); 
        
        HashMap model = new HashMap();
        model.put("personas", p);
        model.put("template", "templates/personas.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl"));
    };
    
    public static Route getHijos = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = request.queryParams("nombre");
        String ape = request.queryParams("apellido");
        System.out.printf(" Nombre " + nbre + "Apellido" + ape);
        List<Persona> hijos = pDAO.getHijos(nbre, ape); 
            
        HashMap model = new HashMap();
        model.put("hijos", hijos);
        model.put("nombre", nbre);
        model.put("template", "templates/hijos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl")); };
    
    public static Route getNietos = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = request.queryParams("nombre");
        String ape = request.queryParams("apellido");
        System.out.printf(" Nombre " + nbre + "Apellido "+ ape);
        List<Persona> nietos = pDAO.getNietos(nbre, ape); 

        HashMap model = new HashMap();
        model.put("nietos", nietos);
        model.put("nombre", nbre);
        model.put("template", "templates/nietos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl"));
    };
    
    public static Route getPadres = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        String ape = req.queryParams("apellido");
        System.out.printf(" Nombre " + nbre + " Apellido "+ ape);
        List<Persona> padres = pDAO.getPadres(nbre, ape); 

        HashMap model = new HashMap();
        model.put("padres", padres);
        model.put("nombre", nbre);
        model.put("template", "templates/padres.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl")); 
    };
    
    public static Route getHermanos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        String ape = req.queryParams("apellido");
        System.out.printf(" Nombre " + nbre + "Apellido"+ ape);
        List<Persona> hermanos = pDAO.getHermanos(nbre, ape); 

        HashMap model = new HashMap();
        model.put("hermanos", hermanos);
        model.put("nombre", nbre);
        model.put("template", "templates/hermanos.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl")); 
    };
    
    public static Route getTios = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nbre = req.queryParams("nombre");
        String ape = req.queryParams("apellido");
        System.out.printf(" Nombre " + nbre + "Apellido"+ ape);
        List<Persona> tios = pDAO.getTios(nbre, ape); 

        HashMap model = new HashMap();
        model.put("tios", tios);
        model.put("nombre", nbre);
        model.put("template", "templates/tios.vsl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout3.vsl")); 
    };

}
