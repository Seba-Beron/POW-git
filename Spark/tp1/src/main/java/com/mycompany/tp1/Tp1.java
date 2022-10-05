/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1;

import static spark.Spark.*;

/**
 *
 * @author Sebastian
 */
public class Tp1 {
    public static void main(String[] args) {
        //get("/ruta", clase.metodo);
        
        get("/hola", (request, response) -> "Hola spark");
        //http://localhost:4567/hola
        get("/convertir", eje5.ConvertirSeg);
        //http://localhost:4567/convertir?segundos=5555
        
        get("/Longitud", eje2.Longitud);
        //http://localhost:4567/Longitud?palabra=hola
        
        Partido p1 = new Partido("Boca","River","resultado1","final",true);
        Partido p2 = new Partido("San jose","River","resultado2","final",false);
        Partido p4 = new Partido("Boca","River","resultado4","semifinal",true);
        Partido p3 = new Partido("Argentina","River","resultado3","final",true);
        
        get("/getPartidos", eje8.getPartidos);
        //http://localhost:4567/getPartidos?equipo=boca
        get("/calcularInf", eje10.calcInf);
        //http://localhost:4567/calcularInf?monto=100&year=2&month=5
        
        Libro libro1 = new Libro("Biblia","jose");
        Libro libro2 = new Libro("Apocalipsis","pedro");
        Libro libro3 = new Libro("El mago de oz","ana");
        Libro libro4 = new Libro("Biblia","jose");
        Libro libro5 = new Libro("Biblia","jose");
        
        get("/BuscarLibros",eje12.getLibros);
        //http://localhost:4567/BuscarLibros?autor=jose
    }
}

