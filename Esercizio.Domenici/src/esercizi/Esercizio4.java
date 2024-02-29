/*
 * stampare la somma dei numeri pari tra 0 e N
 * 
 * start 
 *      leggi N
 *      conta = 0
 *      somma = 0
 *      while(conta <= N) do
 *          if (conta è pari) then
 *              somma = somma + conta
 *          end if
 *          conta = conta + 1
 *      wnd while  
 *      stampa somma     
 * end
 */

package esercizi;

import funzioni_pack.Funzioni;

public class Esercizio4 {
    public static void main(String[] args) {
        int n = Funzioni.leggiNumero("Scrive un numero: ");
        int conta = 0;
        int somma = 0;
        while (conta <= n) {
            if (conta % 2 == 0) {
                somma = somma + conta;
            }
            conta += 1;
        }
        System.out.println(somma);
    }
}
