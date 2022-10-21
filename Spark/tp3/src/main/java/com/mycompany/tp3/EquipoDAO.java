/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.List;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class EquipoDAO {
    
    List<Equipo> equipos;
    public List<Equipo> getEquipos(){
        Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/spark3?serverTimezone=UTC", "root", "admin");
         
        try (Connection con = sql2o.open()) {
            
            String sql = "SELECT * FROM equipo";
            
             equipos = con
                .createQuery(sql)
                .executeAndFetch(Equipo.class);
            
        }
        catch(Exception e) {
            System.out.println(e);}
        return equipos;
    }
}
    

