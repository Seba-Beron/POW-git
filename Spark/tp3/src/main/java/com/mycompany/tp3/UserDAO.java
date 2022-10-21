package com.mycompany.tp3;

import java.util.List;
import org.sql2o.*;

public class UserDAO {
    private List<User> usuarios;
    
    public List<User> verificarPersona( String email, String pass) {
        
        Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/spark3?serverTimezone=UTC", "root", "admin");
         
        try (Connection con = sql2o.open()) {
            
            String sql = "SELECT * FROM usuario WHERE email = :email and  pass = :pass";
            System.out.println("llego");
            usuarios = con
                .createQuery(sql)
                .addParameter("email", email)
                .addParameter("pass", pass)
                .executeAndFetch(User.class);
            System.out.println("paso");
        }
        catch(Exception e) {
            System.out.println(e);}
        return usuarios;
    }
}
