/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package chainofresponsibility;

/**
 *
 * @author Simo
 */
public class Pyynto {

    private double palkka;
    private double korotuspyynto;
    private boolean kasitelty = false;
    public Pyynto(double palkka, double korotuspyynto) {
        this.palkka = palkka;
        this.korotuspyynto = korotuspyynto;
    }

    public double getPalkka() {
        return palkka;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }

    public double getKorotuspyynto() {
        return korotuspyynto;
    }

    public void setKorotuspyynto(double korotuspyynto) {
        this.korotuspyynto = korotuspyynto;
    }
    
   

    public boolean isKasitelty() {
        return kasitelty;
    }

    public void setKasitelty(boolean kasitelty) {
        this.kasitelty = kasitelty;
    }
    
   
}
