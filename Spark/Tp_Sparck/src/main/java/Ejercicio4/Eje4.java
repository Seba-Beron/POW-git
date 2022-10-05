/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import static spark.Spark.get;


public class Eje4 {
    public static void main(String[] args) {  
        get("/sumar", Calculadora.sumar );
        get("/restar", Calculadora.restar);
    }
}
