/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2;

import static spark.Spark.get;

/**
 *
 * @author Sebastian
 */
public class Tp2 {

    public static void main(String[] args) {
        //Ejericio 1
        get("/inicio",ComparadorControlador.inicio); //funcion principal
        get("/ordenar",ComparadorControlador.ordenar); // funciones secundarias que va a llamar el form.vsl
        get("/desordenar",ComparadorControlador.desordenar); // funciones secundarias que va a llamar el form.vsl
        //Ejericio 2
        get("/inicioI",masaCorporalControlador.inicio); 
        get("/calcularIndiceMC",masaCorporalControlador.calcularIndiceMC); 
        
        //Ejercicio 4
         get("/perimetroyarea", RadioControlador.CalcPerimeter);
        //http://localhost:4567/perimetroyarea?radio=6
        
    }
}
