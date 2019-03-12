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
    
    private int mezoHossz; 
    private final ArrayList<Tabla> TABLA;
    private IMezoTipus mezoTipus;

    public Tabla(int mezohossz) {
        this.mezoHossz = mezohossz;
        this.TABLA = tablaLetrehoz();
    }

    public ArrayList<Tabla> getTABLA() {
        return TABLA;
    }

    

    public IMezoTipus getMezoTipus() {
        return mezoTipus;
    }

    public void setMezoTipus(IMezoTipus mezoTipus) {
        this.mezoTipus = mezoTipus;
    }

    
    
    private ArrayList<Tabla> tablaLetrehoz() {
        ArrayList t = new ArrayList() ;
        tablaFeltolt(t);
        return t;
    }

    private void tablaFeltolt(ArrayList t) {
        for (int i = 0; i < mezoHossz; i++) {
            t.add(i, 0);
            }
    }

    public static void tablaKiir ( ArrayList t){
        for (int i = 0; i < t.size(); i++) {
            if (i < t.size()-1) {
                System.out.print(t.get(i) + "_");
            } else{
                System.out.print(t.get(i));
                System.out.println("");
            }
                
    }  

   
        
       
        
    }
}
    
    
    

