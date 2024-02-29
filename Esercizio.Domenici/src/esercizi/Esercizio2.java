/*
 * Stampa la somma dei primi n numeri
 * 
 * inizio
 *      leggi N
 *      numeri = 0
 *      somma = 0
 *      while (numeri<=n) do
 *          numeri = numeri + 1
 *          somma = somma + numeri
 *      end while
 *      stampa somma
 * fine  
 */

package esercizi;

import funzioni_pack.Funzioni;

public class Esercizio2 {
    public static void main(String[] args) {
        int n = Funzioni.leggiNumero("Scrive un numero: ");
        int numeri = 0;
        int somma = 0;
        while (numeri <= n) {
            numeri += 1;
            somma = somma + numeri;
        }
        System.out.println(somma);
    }
}
