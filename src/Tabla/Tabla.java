/*
 Legyenek benne sima mezők, melyekre lépve nem történik semmi a bábuval. 
 Legyenek olyan jó és rossz mezők melyek előre vagy hátra dobják a bábut 
 n mezőnyit (0 < n < 6), aztán legyenek olyan mezők melyekre kerülve egy 
 kártyát kell húzni.
 */
package Tabla;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author FZs
 */
public class Tabla {

    private final int MEZOHOSSZ = 60;
    private ArrayList<MezoTipusok> tabla;
    private MezoTipusok mezoTipus;
    private MezoTipusok[] mezoTipusTomb = MezoTipusok.values();
    private int kiamaradoMezokSzama = 3;
    Random rd = new Random();
    

    public Tabla() {
        this.tabla = tablaLetrehoz();
    }

    public ArrayList<MezoTipusok> getTABLA() {
        return tabla;
    }

    public MezoTipusok getMezoTipus() {
        return mezoTipus;
    }

    public void setMezoTipus(MezoTipusok mezoTipus) {
        this.mezoTipus = mezoTipus;
    }

    private ArrayList<MezoTipusok> tablaLetrehoz() {
        tabla = new ArrayList<>();
        tablafeltolt();
        return tabla;
    }

    private void tablafeltolt() {
        tabla.add(0, MezoTipusok.START);
        int semlegesSzamlalo = 0;
        for (int i = 1; i < MEZOHOSSZ - 1; i++) {
            if (semlegesSzamlalo > 5) {
                tabla.add(mezoTipusTomb[rd.nextInt(2)+4]) ;
                semlegesSzamlalo = 0;
            }else{
                if (rd.nextInt(100) < 30 && tabla.get( i-1) != mezoTipus.KARTYATHUZ) {
                    tabla.add(mezoTipus.KARTYATHUZ);
                }else{
                tabla.add(mezoTipus.SEMLEGES);
                }
                semlegesSzamlalo++;
            }
        }
        tabla.add(MezoTipusok.CEL);
    }
    
    public void tablaKiir() {
        for (int i = 0; i < tabla.size() - 1; i++) {
            System.out.print(tabla.get(i) + "_");
        }
        System.out.println(tabla.get(MEZOHOSSZ - 1));
        System.out.println(System.lineSeparator());
    }

    

    
}
