package com.mycompany.tp3;

import java.util.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class JugadorDAO {
    private List<Jugador> jugadores;
    
    public List<Jugador> getDetalleEquipo(String id){
          
        Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/spark3?serverTimezone=UTC", "root", "admin");
         
        try (Connection con = sql2o.open()) {
            
            String sql = "SELECT * FROM jugador WHERE equipo_idEquipo = :id";
            jugadores = con
                .createQuery(sql)
                .addParameter("id",id)
                .executeAndFetch(Jugador.class);
        }
        catch(Exception e) {
            System.out.println(e);}
        return jugadores;
    }
    
    public List<Jugador> getDetalleJugador(String id){
        
         Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/spark3?serverTimezone=UTC", "root", "admin");
         
        try (Connection con = sql2o.open()) {
            
            String sql = "SELECT * FROM jugador WHERE id = :id";
            jugadores = con
                .createQuery(sql)
                .addParameter("id",id)
                .executeAndFetch(Jugador.class);
        }
        catch(Exception e) {
            System.out.println(e);}
        return jugadores;
    } 
}
