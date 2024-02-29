/*
 * Calcolare la motiplicazione tra due numeri N e M letti in input 
 * (PS: usare solo l'operatore somma)
 * 
 * start
 *      leggi N
 *      leggi M
 *      somma = 0
 *      conta = 0
 *      while(conta<M) do
 *          somma = somma + N
 *          conta = conta +1
 *      end while
 *      stampa somma
 */

package esercizi;

import funzioni_pack.Funzioni;

public class Esercizio3 {
    public static void main(String[] args) {
        int n = Funzioni.leggiNumero("Inserisci il primo numero: ");
        int m = Funzioni.leggiNumero("Inserisci il secondo numero: ");
        int somma = 0;
        int conta = 0;
        while (conta < m) {
            somma += n;
            conta += 1;
        }
        System.out.println(somma);
    }
}
