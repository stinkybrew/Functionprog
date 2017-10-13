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
public class Asiakas {
    
    private String nimi;
    private int saldo;
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public Asiakas() {
        nimi = null;
    }
    
    public Asiakas(String nimi) {
        this.nimi = nimi;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return "Asiakas{" + "nimi=" + nimi + '}';
    }
    
    
    
    
    
}
