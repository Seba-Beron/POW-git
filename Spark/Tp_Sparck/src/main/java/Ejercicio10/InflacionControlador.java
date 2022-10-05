/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import org.codehaus.jackson.map.ObjectMapper;
import spark.Request;
import spark.Response;
import spark.Route;


public class InflacionControlador {
    public static Route getInflacion = (Request request, Response response) -> {
        InflacionDAO iDAO = new InflacionDAO();
        String m = iDAO.getInflacion(request.queryParams("monto"), request.queryParams("meses"));
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonStr = mapperObj.writeValueAsString(m);
        return jsonStr;
    };
}
