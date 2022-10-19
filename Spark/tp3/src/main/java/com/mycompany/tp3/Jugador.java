package com.mycompany.tp3;

public class Jugador {
    protected String nombre;
    protected String apellido;
    protected String equipo;
    protected String numero;
    protected String posicion;
    protected String nacimiento;
    
    public Jugador(String nbre, String apel, String eq, String num, String pos, String nac){
        nombre = nbre;
        apellido = apel;
        equipo = eq;
        numero = num;
        posicion = pos;
        nacimiento = nac;
    }
    
    public String getNombre() {
        return nombre;
    }
    
     public String getApellido() {
        return apellido;
    }
    
    public String getEquipo() {
        return equipo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getPosicion() {
        return posicion;
    }
    
    public String getNacimiento() {
        return nacimiento;
    }
}
