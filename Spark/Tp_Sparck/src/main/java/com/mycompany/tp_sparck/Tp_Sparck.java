/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_sparck;
import static spark.Spark.*;

public class Tp_Sparck {
    public static void main(String[] args) {
        get("/hola", (req, res) -> {
            return "Hola Spark " + req.queryParams("nombre"); 
        } ); 
        //Ejercicio_1        
        /*Las clases tienen un solo metodo, por hay
        combiene ponerlos como metosdos de esta clase*/
        get("/palindromo", (req, res) -> {    
            if (new Palindromo().esPalindromo(req.queryParams("palabra"))){
                return "La palabra " + req.queryParams("palabra") + " es un palindromo"; 
            }
                return "La palabra " + req.queryParams("palabra") + " no es un palindromo"; 
        } ); 
        //Ejercicio_4
        get("/sumar", Calculadora.sumar );
        get("/restar", Calculadora.restar);

        //Ejercicio_7

        
        get("/getPersona",PersonaControlador.getPersona);
        get("/getHijos", PersonaControlador.getHijos);
        get("/getNietos", PersonaControlador.getNietos);
        
        
        
        //Ejercicio_10
         get("/valorInflacion", (req, res) -> {
            String str1 = req.queryParams("monto");              
            String str2 =  req.queryParams("meses");
            return "Hola Spark " ; 
        } ); 
    } 
}


            /*int nro1=Integer.parseInt(req.queryParams("nro1"));
            int nro2=Integer.parseInt(req.queryParams("nro2"));
            return nro1 + " + " + nro2 + " = " + (nro1+nro2) + "\n" + nro1 + " - " + nro2 + " = " + (nro1-nro2); */