/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jatekosok;

import java.util.Random;

/**
 *
 * @author FZs
 */
public class Jatekos implements IJatekos {

    private String nev;
    private int hely;
    private boolean nyert;
    Random rd = new Random();
    Nevek[] nevTomb = Nevek.values();

    public Jatekos() {
        this.nev = nevBeallit();
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

    public void setHely(int hely) {
        this.hely = hely;
    }

    public boolean isNyert() {
        return nyert;
    }

    public void setNyert(boolean nyert) {
        this.nyert = nyert;
    }

//</editor-fold>
    @Override
    public int dobas() {
        return rd.nextInt(6)+1;
    }

    @Override
    public void lepes() {
        int lepesszam = dobas();
        setHely(getHely() + lepesszam);
    }

    @Override
    public String toString() {
        return "Jatekos{" + "nev=" + nev + ", hely=" + hely + ", nyert=" + nyert + '}';
    }

    private String nevBeallit() {
        String nev = nevTomb[rd.nextInt(nevTomb.length)].toString();
        return nev;
    }

}
