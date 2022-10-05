/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import static spark.Spark.get;


public class Eje7 {
    public static void main(String[] args) {
        get("/getPersona",PersonaControlador.getPersona);
        get("/getHijos", PersonaControlador.getHijos);
        get("/getNietos", PersonaControlador.getNietos);
    }
}
