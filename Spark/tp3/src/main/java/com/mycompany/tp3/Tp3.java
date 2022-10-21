package com.mycompany.tp3;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Tp3 {
    public static void main(String[] args) {
        staticFiles.location("/img");
        get("/login", UserController.getLogin); 
        post("/login", UserController.getLogin);
        get("/logout", UserController.Logout); 
        get("/index", IndexController.getIndex);
        get("/detalleequipo", JugadorControlador.getDetalleEquipo); 
        get("/detallejugador", JugadorControlador.getDetalleJugador);
        get("/listaequipos", EquipoController.getEquipos);
    }
}
