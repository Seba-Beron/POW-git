/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.codehaus.jackson.map.ObjectMapper;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */
public class eje12 {

    public static Route getLibros = (Request req, Response res) -> {
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(Libro.getLibros(req.queryParams("autor")));
        return jsonStr;
    };
}

@Data
class Libro {

    private static List<Libro> Coleccion = new ArrayList<Libro>();
    private String titulo;
    private String autor;

    public Libro(String t, String a) {
        this.autor = a;
        this.titulo = t;
        Libro.Coleccion.add(this);
    }

    public static List<Libro> getLibros(String pautor) {
        List<Libro> lista = new ArrayList<Libro>();
        Libro.Coleccion.forEach((libro) -> {
            if (libro.getAutor().equals(pautor)) {
                lista.add(libro);
            }
        });
        return lista;
    }
}
