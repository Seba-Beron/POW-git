package com.mycompany.tp3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap; 

public class Menu {
    List<HashMap> menu = new ArrayList();
    public void init() {
            HashMap item = new HashMap();
            item.put("label", "Home");
            item.put("url", "index");
            menu.add(item);
            
            item = new HashMap();
            item.put("label", "Login");
            item.put("url", "login");
            menu.add(item);
            
            item = new HashMap();
            item.put("label", "Equipos");
            item.put("url", "listaequipos");
            menu.add(item);
    }
    public void initLog() {
            HashMap item = new HashMap();
            item.put("label", "Home");
            item.put("url", "index");
            menu.add(item);
            
            item = new HashMap();
            item.put("label", "Logout");
            item.put("url", "logout");
            menu.add(item);
            
            item = new HashMap();
            item.put("label", "Equipos");
            item.put("url", "listaequipos");
            menu.add(item);
    }
    public List<HashMap> getMenu() {
        init();
        return menu;
    }
    public List<HashMap> getMenuLog() {
        initLog();
        return menu;
    }
}
