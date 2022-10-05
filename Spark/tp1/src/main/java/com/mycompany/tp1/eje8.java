/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import lombok.Data;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */
public class eje8 {

    public static Route getPartidos = (Request req, Response res) -> {
        
        List<Partido> partidos = Partido.getPartidos(req.queryParams("equipo")); // busco los partidos
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(partidos); // paso a JSON
        return jsonStr;
    };
}

@Data
class Partido {    
    
    private static List<Partido> partidos = new ArrayList<Partido>(); // TODOS los partidos
    String equipo1;
    String equipo2;
    String resultado;
    String ronda;
    boolean jugado;
    
    public Partido(String equipo1, String equipo2, String resultado, String ronda, boolean jugado){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
        this.ronda = ronda;
        this.jugado = jugado;
        Partido.partidos.add(this);
    }
    
    public static List<Partido> getPartidos(String nombre) {
        List<Partido> partidosEncontrados = new ArrayList<Partido>(); // los partidos buscados
        Partido.partidos.forEach((Partido)-> {
                if(Partido.getEquipo1().equals(nombre)){
                    partidosEncontrados.add(Partido);
                }
            }
        );
        
        return partidosEncontrados;
    }
}