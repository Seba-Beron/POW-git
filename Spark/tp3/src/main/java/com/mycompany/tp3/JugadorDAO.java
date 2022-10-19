package com.mycompany.tp3;

import java.util.*;

public class JugadorDAO {
    private List<Jugador> jugadores;
    
    private void init(){ 
        jugadores = new ArrayList<Jugador>();

        Jugador a=new Jugador("Guillermo", "La Fuente","pow", "9", "Delantero Centro", "0000-00-00");
        Jugador b=new Jugador("Gustavo", "La Fuente", "pow", "1", "Arquero", "0000-00-00");
        Jugador c=new Jugador("Dino", "Cisterna","pow", "5", "Mediocampista Centro", "0000-00-00");
        
        jugadores.add(a); 
        jugadores.add(b); 
        jugadores.add(c);
        
    }
    
    public List<Jugador> getListaEquipos(){
        init();
        List<Jugador> equipos;
        equipos = new ArrayList<Jugador>();
        equipos.add(jugadores.get(0));
        for(int i=1; i<jugadores.size()-1; i++){
            if(jugadores.get(i-1).equipo != jugadores.get(i).equipo){
                equipos.add(jugadores.get(i));
            }
        }
        return equipos;
        
    }
     
    
    public List<Jugador> getDetalleEquipo(String eq){
        init();
        List<Jugador> equipo;
        equipo = new ArrayList<Jugador>();
        for (Jugador j : jugadores) {
            if(j.equipo == null ? eq == null : j.equipo.equals(eq)){
                equipo.add(j);
            }
        }
        return equipo;
    }
    
     public List<Jugador> getDetalleJugador(String nombre){
        init();
        List<Jugador> jugador;
        jugador = new ArrayList<Jugador>();
        for (Jugador j : jugadores) {
            if(j.nombre.equals(nombre)){
                jugador.add(j);
            } 
        }
        return jugador;
    }
    
}
