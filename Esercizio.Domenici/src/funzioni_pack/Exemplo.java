/*
 * 
 * start
 *      leggi N
 *      risultato = true
 *      if (n < 2) then
 *          risultato = false
 *      end if
 *  
 *        conta = 2
 *        while (conta < n and risultato == true) do
 *          if (resto di n/conta == 0) then
 *                  risultato = false
 *          end if
 *          conta++
 *        end while
 *        stampa risultato 
 */

package funzioni_pack;

public class Exemplo {
    public static boolean numeroPrimo(int num) {
        boolean ris = true;
        if (num < 2) {
            ris = false;
        }
        int conta = 2;
        while (conta < num && ris) {
            if (num % conta == 0) {
                ris = false;
            }
            conta += 1;
        }
        System.out.println(ris);
        return ris;
    }
}