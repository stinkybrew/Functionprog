/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Thread.sleep;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simo
 */
public class Subject extends Observable implements Runnable{

    @Override
    public void run() {
         for (int i=1; i < 20; i++){
             try {
                 setChanged();
                 notifyObservers(i);
                 sleep(100);
             } catch (InterruptedException ex) {
             }
         }
    }
    
    
    
    
    
    
}
