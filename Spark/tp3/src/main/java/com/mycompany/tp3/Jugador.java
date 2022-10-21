package com.mycompany.tp3;
import lombok.Data;

@Data
public class Jugador {
    protected int id;
    protected String nombre;
    protected String posicion;
    protected String equipo;
    protected String FechaNacimiento;
    protected int equipo_idEquipo;
}
