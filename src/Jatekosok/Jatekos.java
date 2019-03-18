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
public class Jatekos {

    private final String NEV;
    private int hely;
    private boolean nyert;
	private StringBuilder szoveg;
    Random rd = new Random();
    Nevek[] nevTomb = Nevek.values();

    public Jatekos() {
        this.NEV = nevBeallit();
        this.hely = 0;
        this.nyert = false;
    }
	
	public void createSzoveg()
	{
		this.szoveg = new StringBuilder();
	}
	
	public void addSzoveg(String szoveg)
	{
		this.szoveg.append(" " + szoveg);
	}

	public void kiirSzoveg()
	{
		System.out.println(szoveg);
	}

    //<editor-fold defaultstate="collapsed" desc="Getter - Setter">
    public String getNev() {
        return NEV;
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

    public int dobas() {
        return rd.nextInt(6)+1;
    }

    public void lepes() {
        int lepesszam = dobas();
        setHely(getHely() + lepesszam);
    }

    @Override
    public String toString() {
        return "Jatekos{" + "nev=" + NEV + ", hely=" + hely + ", nyert=" + nyert + '}';
    }

    private String nevBeallit() {
        String megnevezes = nevTomb[rd.nextInt(nevTomb.length)].toString();
        return megnevezes;
    }

}
