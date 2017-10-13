/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package templatemethod;

import java.util.Scanner;

/**
 *
 * @author silas
 */
public class Ottomaatti {
    
    // Tällä automaatilla voi nostaa tasan 100 € kerralla
    
    Scanner scan = new Scanner(System.in);
    
    public void toimi(){
                
        new OnlinePankkiTemplateMethod().kasitteleAsiakas(
                () -> "Welcome!",
                () -> new Asiakas(),
                (Asiakas a) -> {              
                        System.out.println("Anna tunnus");
                        String tunnus = scan.nextLine();
                        a.setNimi(tunnus);
                        System.out.println("Anna salasana");
                        String sala = scan.nextLine();
                        return Tunnukset.getInstance().tarkista(a.getNimi(), sala);
                },
                (Asiakas a) -> a.getSaldo() > -100,
                (Asiakas a) -> a.setSaldo(a.getSaldo()-100),
                (Asiakas a) -> System.out.println(
                        "Näkemiin " + a.toString() +
                        "Tilillesi jäi " + a.getSaldo())
        );
        
    }   

}