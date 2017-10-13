/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package templatemethod;
/**
 *
 * @author Simo
 */
public class OnlinePankkiMain {
     
    public static void main(String[] args){
    
        // Taustaa kuntoon:
        Tunnukset tunnukset = Tunnukset.getInstance();
        tunnukset.rekisteroi("1234", "sala");
        tunnukset.rekisteroi("5678", "kala");
 
        Kanta kanta = Kanta.getInstance();
        kanta.paivita("1234", 1000);
        kanta.paivita("5678", 2000);
        
        
        Ottomaatti otto = new Ottomaatti();
        
        for (int i=1; i<= 4; i++){
            otto.toimi();
        }
   } 
}
