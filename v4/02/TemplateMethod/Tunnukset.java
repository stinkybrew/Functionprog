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
 * @author Simo
 */
public class Tunnukset {
    
    private final static Tunnukset instance = new Tunnukset();
    
    private final Map<String, String> tunnukset = new HashMap<>();

    private Tunnukset() {
        
    }
    
    public static Tunnukset getInstance(){
        return instance;
    }
    
    
    public void rekisteroi (String a, String tunnus){
        tunnukset.put(a,tunnus);
    }
    
    
    public boolean tarkista(String a, String tunnus){
        return tunnus.equals(tunnukset.get(a));
    }
    
    
}
