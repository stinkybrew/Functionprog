/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package templatemethod;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author silas
 */
public class Kanta {
    
    private final static Kanta instance = new Kanta();
    
    private final Map<String, Integer> rahat = new HashMap<>();

    private Kanta() {
        
    }
    
    public static Kanta getInstance(){
        return instance;
    }
    
    
    public void paivita (String tunnus, int rahaa){
        rahat.put(tunnus,rahaa);
    }
    
    
    public int hae(String tunnus){
        return rahat.get(tunnus);
    }
}
    
    