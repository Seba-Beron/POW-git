package com.mycompany.tp3;

import static spark.Spark.get;
import static spark.Spark.post;

public class Tp3 {
    public static void main(String[] args) {
        get("/login", UserController.getLogin); 
        post("/login", UserController.getLogin);
        get("/logout", UserController.Logout); 
        get("/index", IndexController.getIndex);
        get("/listaequipos", JugadorControlador.getListaEquipos); 
        get("/detalleequipo", JugadorControlador.getDetalleEquipo); 
        get("/detallejugador", JugadorControlador.getDetalleJugador);     
    }
}
