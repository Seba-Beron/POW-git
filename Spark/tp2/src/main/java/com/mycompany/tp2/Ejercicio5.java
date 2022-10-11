/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Ejercicio5;

import static spark.Spark.get;

/**
 *
 * @author Sebastian
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        get("/inicio",CalculadoraControlador.inicio); 
        get("/calcular",CalculadoraControlador.calcular); 
       
    }
}
