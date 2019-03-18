/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarsasjatek;

import Jatekosok.Jatekos;
import Tabla.MezoTipusok;
import Tabla.Tabla;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FZs
 */
public abstract class Logika {

    public static void jatekIndit() {
        Tabla jatekTabla = new Tabla();
        jatekTabla.tablaKiir();
        List<Jatekos> jatekosLista = new ArrayList<>();
        jatekosokLetrehoz(jatekosLista);
        fordulo(jatekTabla, jatekosLista);

    }

    public static void jatekosokLetrehoz(List<Jatekos> jatekosLista) {
        for (int i = 1; i < 3 + 1; i++) {
            Jatekos temp = new Jatekos();
            jatekosLista.add(temp);
        }

    }

    private static void fordulo(Tabla jatekTabla, List<Jatekos> jatekosLista) {
        while (!vegeVizsgalat(jatekTabla, jatekosLista)) {
            mindenkiLep(jatekTabla, jatekosLista);
        }

    }

    private static void mindenkiLep(Tabla jatekTabla, List<Jatekos> jatekosLista) {
        for (int i = 0; i < jatekosLista.size(); i++) {
			Jatekos jatekos = jatekosLista.get(i);
            //StringBuilder sb = new StringBuilder();
			jatekos.createSzoveg();
            jatekos.addSzoveg(jatekosLista.get(i).getNev());
            jatekos.addSzoveg(" Jatekos a ___");
            jatekosLista.get(i).lepes();
            mezoHatasVizsgalat(jatekosLista.get(i), jatekTabla);
			String hely = String.valueOf(jatekosLista.get(i).getHely());
            jatekos.addSzoveg(hely);
            jatekos.addSzoveg(" mezőre lépett ");
            jatekos.kiirSzoveg();
            jatekosKiutes(jatekosLista.get(i), jatekosLista);

        }
    }

    private static void jatekosKiutes(Jatekos jatekos, List<Jatekos> jatekosLista) {
        for (int i = 0; i < jatekosLista.size(); i++) {
			StringBuilder sb4 = new StringBuilder();
            if (jatekos.getHely() != 0 && jatekos != jatekosLista.get(i)
                    && jatekos.getHely() == jatekosLista.get(i).getHely()) {
                sb4.append(jatekosLista.get(i).getNev())
                        .append(" játékost a ")
                        .append(jatekosLista.get(i).getHely())
                        .append(" helyről ");
                sb4.append(jatekos.getNev())
                        .append(" kiütötte. ")
                        .append(jatekosLista.get(i).getNev())
                        .append(" játékos a ");
                jatekosLista.get(i).setHely(0);
                sb4.append(jatekosLista.get(i).getHely())
                        .append(". mezőre került!");
                System.out.println(sb4);
            }
        }
    }

    private static void mezoHatasVizsgalat(Jatekos jatekos, Tabla jatekTabla) {
        if (jatekos.getHely() < jatekTabla.getTABLA().size()) {
			MezoTipusok jelenlegiMezo = jatekTabla.getTABLA().get(jatekos.getHely());

			switch(jelenlegiMezo){
				case SEMLEGES:
					break;
				case KARTYATHUZ:
					kartyahuz(jatekos);
					break;
				case JO: 
					joMezoTipus(jatekos);
					break;
				case ROSSZ:
					rosszMezoTipus(jatekos);
				case CEL:
					break;
				default:
					break;
			}
		}
    }

    private static void joMezoTipus(Jatekos jatekos) {
        //StringBuilder sb2 = new StringBuilder();
        jatekos.addSzoveg(" !!! játékosnak szerencséje volt ");
        jatekos.addSzoveg(String.valueOf(jatekos.getHely()));
        jatekos.addSzoveg(". helyett a ");
        jatekos.setHely(jatekos.getHely() + jatekos.dobas());
        //jatekos.addSzoveg(String.valueOf(jatekos.getHely()));
        //jatekos.addSzoveg(". mezőre lép!");
        //System.out.println(sb2);
    }

    private static void rosszMezoTipus(Jatekos jatekos) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jatekos.getNev())
                .append("  játékosnak NEM volt szerencséje ")
                .append(jatekos.getHely())
                .append(". helyett a ");
        jatekos.setHely(jatekos.getHely() - jatekos.dobas());
        sb2.append(jatekos.getHely())
                .append(". mezőre lép!");
        System.out.println(sb2);
    }
    
    private static void kartyahuz(Jatekos jatekos) {
        StringBuilder sb = new StringBuilder();
        sb.append(jatekos.getNev())
                .append("  játékos ");
                
    }

    private static boolean vegeVizsgalat(Tabla jatekTabla, List<Jatekos> jatekosLista) {
        boolean eredmeny = false;
        for (int i = 0; i < jatekosLista.size(); i++) {
            if (jatekosLista.get(i).getHely() > jatekTabla.getTABLA().size()) {
                jatekosLista.get(i).setNyert(true);
                eredmeny = true;
                System.out.println("A nyertes: " + jatekosLista.get(i));
                System.exit(i);
            }
        }
        return eredmeny;
    }

    
}
