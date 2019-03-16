/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarsasjatek;

import Jatekosok.Jatekos;
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
            mindenkiLep(jatekosLista);
        }

    }

    private static void mindenkiLep(List<Jatekos> jatekosLista) {
        for (int i = 0; i < jatekosLista.size(); i++) {
            jatekosLista.get(i).lepes();
            jatekosKiutes(jatekosLista.get(i), jatekosLista);
            System.out.println(jatekosLista.get(i));
        }
    }

    private static boolean vegeVizsgalat(Tabla jatekTabla, List<Jatekos> jatekosLista) {
        boolean eredmeny = false;
        for (int i = 0; i < jatekosLista.size(); i++) {
            if (jatekosLista.get(i).getHely() > jatekTabla.getTABLA().size()) {
                jatekosLista.get(i).setNyert(true);
                eredmeny = true;
                System.out.println("A nyertes: " + jatekosLista.get(i));
            }
        }
        return eredmeny;
    }

    private static void jatekosKiutes(Jatekos jatekos, List<Jatekos> jatekosLista) {
        for (int i = 0; i < jatekosLista.size(); i++) {
            if (jatekos.getHely() != 0 && jatekos != jatekosLista.get(i) 
                    && jatekos.getHely() == jatekosLista.get(i).getHely()) {
                jatekosLista.get(i).setHely(0);
                System.err.println(jatekos.getNev() + " Kiütötte a " + jatekosLista.get(i).getNev() 
                        + " Játékost... Vissza a Start mezőre!");
//                System.out.println(jatekos.getNev() + " Kiütötte a " + jatekosLista.get(i).getNev() 
//                        + " Játékost... Vissza a Start mezőre!");
            }
        }
    }

    
    
    
    
}
