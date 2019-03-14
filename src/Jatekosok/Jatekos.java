/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jatekosok;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FZs
 */
public class Jatekos implements IJatekos {
    
    private String nev;
    private int hely;
    private boolean nyert;
    private List<Jatekos> jatekosLista;
    Random rd = new Random();
    public int jatekosokSzama = 3;

    public Jatekos(String nev) {
        this.nev = nev;
        this.hely = 0;
        this.nyert = false;

    }

    //<editor-fold defaultstate="collapsed" desc="Getter - Setter">
    public String getNev() {
        return nev;
    }
    
    public int getHely() {
        return hely;
    }
    
    private void setHely(int hely) {
        this.hely = hely;
    }
    
    public boolean isNyert() {
        return nyert;
    }
    
    public void setNyert(boolean nyert) {
        this.nyert = nyert;
    }

    public int getJatekosokSzama() {
        return jatekosokSzama;
    }
    
    

//</editor-fold>
    
    @Override
    public int dobas() {
        return rd.nextInt(7);
    }

    @Override
    public void lepes() {
        int random = dobas();
        setHely(getHely() + random);
    }
    
    @Override
    public String toString() {
        return "Jatekos{" + "nev=" + nev + ", hely=" + hely + ", nyert=" + nyert + '}';
    }

}
