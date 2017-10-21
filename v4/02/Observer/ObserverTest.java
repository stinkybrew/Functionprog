/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simo
 */
public class ObserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Subject s1 = new Subject();
        //Subject s2 = new Subject();
                
        List<Integer> list1 = new ArrayList<>(); 
        List<Integer> list2 = new ArrayList<>(); 
        
        s1.addObserver((Observable o, Object arg) -> {
            /*if ((Integer)arg % 2 == 0) */list1.add((Integer)arg);
        });
        
        s1.addObserver((Observable o, Object arg) -> {
            if ((Integer)arg % 2 != 0) list2.add((Integer)arg);
        });
        
        Thread t1 = new Thread(s1);
        t1.start();
        //Thread t2 = new Thread(s2);
        //t2.start();
           
        try {
            t1.join();
          //  t2.join();
        } catch (InterruptedException ex) {
        }
        
        list1.forEach (System.out::println);
        list2.forEach (System.out::println);
        
    }
    
}
