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
        //get("/getNumeros", eje1.getNums); 
        get("/prueba", prueba.get); 
    }
}
