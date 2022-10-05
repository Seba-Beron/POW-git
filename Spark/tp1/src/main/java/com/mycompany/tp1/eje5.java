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
public class eje5 {
    public static Route ConvertirSeg=(Request req,Response res)->{
        int seg = Integer.parseInt(req.queryParams("segundos"));
        return "tiempo: " + seg/(60*60) + ":" + (seg%(60*60))/60 + ":" + (seg%(60*60))%60;
    };
}