/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_sparck;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author UD
 */
public class PersonaControlador {
     public static Route getPersona = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO();
        Persona p = pDAO.getPersona(request.queryParams("nombre"), request.queryParams("apellido"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
    public static Route getHijos = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getHijos(request.queryParams("nombre"), request.queryParams("apellido"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
    public static Route getNietos = (Request request, Response response) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getNietos(request.queryParams("nombre"), request.queryParams("apellido"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(p);
        return jsonStr;
    };
}
