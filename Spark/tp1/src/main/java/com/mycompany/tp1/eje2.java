/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */
public class eje2 {
    public static Route Longitud=(Request req,Response res)->{
        String str = req.queryParams("palabra");
        return "Longitud: " + str.length();
    };
}
