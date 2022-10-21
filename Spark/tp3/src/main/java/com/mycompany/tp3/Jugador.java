package com.mycompany.tp3;
import lombok.Data;


@Data
public class Jugador {
    protected int id;
    protected String nombre;
    //protected String apellido;
    
    protected String posicion;
    protected String equipo;
    
    //protected String numero;
    protected String FechaNacimiento;
    protected int equipo_idEquipo;
    
    
    /*public Jugador(String nbre, String apel, String eq, String num, String pos, String nac){
        nombre = nbre;
        apellido = apel;
        equipo = eq;
        numero = num;
        posicion = pos;
        nacimiento = nac;
    }*/
}
