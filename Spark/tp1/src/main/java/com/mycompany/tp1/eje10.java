/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Scanner;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Sebastian
 */
public class eje10 {

    public static Route calcInf = (Request req, Response res) -> {
        float ipc =  (float) 2.5;
        int monto = Integer.parseInt(req.queryParams("monto"));
        int year = Integer.parseInt(req.queryParams("year"));
        int month = Integer.parseInt(req.queryParams("month"));
        return monto + year*ipc + month*(ipc/12);
    };
}
