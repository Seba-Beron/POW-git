package Ejercicio4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import spark.Request;
import spark.Response;
import spark.Route;


public class Calculadora { 
    public static Route sumar = (Request request, Response response) -> {
        int a = Integer.parseInt(request.queryParams("nro1"));
        int b = Integer.parseInt(request.queryParams("nro2"));
        return a + " + " + b + " = " + (a+b);
    };
    public static Route restar = (Request request, Response response) -> {
        int a = Integer.parseInt(request.queryParams("nro1"));
        int b = Integer.parseInt(request.queryParams("nro2"));
        return a + "-" + b + " = " + (a-b);
    };
}

