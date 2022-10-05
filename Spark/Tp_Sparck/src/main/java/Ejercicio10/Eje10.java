/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import static spark.Spark.get;

public class Eje10 {
    public static void main(String[] args) {
         get("/valorInflacion", InflacionControlador.getInflacion); 
    }
}
