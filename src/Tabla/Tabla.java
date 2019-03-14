/*
Legyenek benne sima mezők, melyekre lépve nem történik semmi a bábuval. 
Legyenek olyan jó és rossz mezők melyek előre vagy hátra dobják a bábut 
n mezőnyit (0 < n < 6), aztán legyenek olyan mezők melyekre kerülve egy 
kártyát kell húzni.
 */

package Tabla;

import java.util.ArrayList;

/**
 *
 * @author FZs
 */
public class Tabla {
    
    private int mezoHossz = 60; 

    private ArrayList<MezoTipus> tabla;
    private MezoTipus mezoTipus;

    public Tabla() {
        this.tabla = tablaLetrehoz();
        
    }

    public ArrayList<MezoTipus> getTABLA() {
        return tabla;
    }

    public MezoTipus getMezoTipus() {
        return mezoTipus;
    }

    public void setMezoTipus(MezoTipus mezoTipus) {
        this.mezoTipus = mezoTipus;
    }

    private ArrayList<MezoTipus> tablaLetrehoz() {
        tabla = new ArrayList<>();
        tablafeltolt();
        return tabla;
    }

    private void tablafeltolt() {
        tabla.add(0, MezoTipus.START);
        for (int i = 1; i < mezoHossz - 1; i++) {
            tabla.add(i ,mezoTipus.SEMLEGES);
        }
          tabla.add(MezoTipus.CEL);
    }

    public void tablaKiir(){
        for (int i = 0; i < tabla.size() - 1; i++) {
            System.out.print(tabla.get(i) + "_");
        }
        System.out.println(tabla.get(mezoHossz - 1));
        System.out.println(System.lineSeparator());
    }

    
    
   
   

   
                
   }

   