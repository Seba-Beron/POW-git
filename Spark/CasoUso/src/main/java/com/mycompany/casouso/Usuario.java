/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import java.util.ArrayList;

import java.util.HashMap; 
import lombok.Data;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */

public class Usuario {
    private int id;
    public Carrito carrito;
    public static Usuario user;   // usuario unico
    
    public Usuario(){
        id = 0; // temporal
        carrito = new Carrito();
        user = this;
    }
    
    public static Route agregarCarrito = (Request req, Response res)->{

        // referencio al carrito del unico usuario (estatico) del sistema
        int id = Integer.parseInt(req.queryParams("id"));
        int cant = Integer.parseInt(req.queryParams("cantidad"));
        System.out.println("id: " + id + "/ cant: " + cant);

        Usuario.user.carrito.agregarAlCarrito(CasoUso.p,id,cant);
        Usuario.user.carrito.mostrar();
        
        HashMap model = new HashMap();
        model.put("agregado",true); // para el mensaje de alerta
        model.put("productos", CasoUso.p);
        model.put("cantidad", "0");
        model.put("template", "templates/form.vsl"); 
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
            
}

class Carrito{  // definir constructor
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();
    
    public void agregarAlCarrito(ArrayList<Producto> p, int id, int cant){
        productos.add(p.get(id-1));
        cantidades.add(cant);
    }
    public void mostrar(){
        System.out.println("ids: ");
        productos.forEach((p)->System.out.print(p.getId()));
        System.out.println("cants: ");
        cantidades.forEach((n)->System.out.print(n));
    }
}

@Data
class Producto{
    private int id;
    public double precio;
    
    public Producto(int i, double p){
        this.id = i;
        this.precio = p;
    }
}