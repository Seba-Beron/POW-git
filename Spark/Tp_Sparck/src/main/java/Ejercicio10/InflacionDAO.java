/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

public class InflacionDAO {
    public String getInflacion(String monto, String meses){
        return "Sus " + monto + "pesos, seran " +  (Integer.parseInt(monto)*(Math.random()%0.1)) +  "dentro de"+ meses + "meses";
    } 
}
