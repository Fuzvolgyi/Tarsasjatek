/*
 A feladat egy klasszikus társasjáték megvalósítása. Legyenek benne sima mezők, melyekre
 lépve nem történik semmi a bábuval. Legyenek olyan jó és rossz mezők melyek előre vagy hátra
 dobják a bábut n mezőnyit (0 < n < 6), aztán legyenek olyan mezők melyekre kerülve egy kártyát kell
 húzni. A kártyákból négy féle van:
 vicces szöveget vagy intését tartalmazó, nincs következménye (pl.: átkelés előtt mindig nézz körül, ez
 már jogvédett ☺)
 előre vagy hátra dobó, valami indoklással (pl.: nem mostál kezet étkezés előtt lépj vissza 3 mezőt)
 és egy és csak egy darab azonnali nyerést biztosító.
 Amennyiben két játékos egy és ugyanazon mezőre lép, akkor a már ott álló bábú kiütésre kerül és
 visszamegy a start mezőre. A tábla mezői véletlenszerűen legyenek elrendezve, de ne lehessen
 különleges mezőről különleges mezőre lépni, (azaz ha egy olyan mezőre lép a bábú ami előre dobja,
 akkor az ne olyan mezőre dobja előre ami kártyát ad vagy visszadobja).
 A szimulációt tejes egészében a program vezényelje le, ne kelljen semmilyen felhasználói
 beavatkozás egy-egy játék lejátszásához. A megjelenítés elég ha kiírja, hogy mi történt:
 a Jóska nevű vagy piros játékos a 3. mezőre lépett ez előre dobta 2 mezőt, így a 5. mezőn áll.
 */
package tarsasjatek;



/**
 *
 * @author FZs
 */
public class Tarsasjatek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Logika.jatekIndit();

    }

}
