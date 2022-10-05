/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import static spark.Spark.get;


public class Eje1 {
     public static void main(String[] args) {
        get("/palindromo", (req, res) -> {    
            if (new Palindromo().esPalindromo(req.queryParams("palabra"))){
                return "La palabra " + req.queryParams("palabra") + " es un palindromo"; 
            }
                return "La palabra " + req.queryParams("palabra") + " no es un palindromo"; 
        } ); 
     }
     
}
