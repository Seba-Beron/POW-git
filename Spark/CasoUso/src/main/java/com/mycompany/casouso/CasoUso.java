/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.casouso;

import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.get;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author Sebastian
 */
public class CasoUso {  // sistema
    
    public static ArrayList<Producto> p = new ArrayList<>(); 
    
    public static void crearProductos(){
        Producto p1 = new Producto(1,12.50);
        Producto p2 = new Producto(2,150);
        Producto p3 = new Producto(3,299.99);
        p.add(p1);
        p.add(p2);
        p.add(p3);
    }
    
    public static Route inicio = (Request req, Response res)->{ 
        HashMap model = new HashMap();
        model.put("productos", CasoUso.p);
        model.put("cantidad", "0");
        model.put("template", "templates/form.vsl"); 
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    
    public static void main(String[] args) { 
        CasoUso.crearProductos();
        Usuario u = new Usuario();
        get("/inicio",CasoUso.inicio);
        get("/agregarAlCarito",Usuario.agregarCarrito);
    }
}
