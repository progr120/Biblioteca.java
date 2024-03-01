/*
 * boolean isNumeroPrimo(num)
 * 
 * start
 *      if(num == 0) then
 *          return false
 *      end if
 * 
 *      conta = 2
 *      while (conta < num) do
 *          if(num % conta == 0) then
 *              return false
 *          end if
 *          conta=conta+1
 *      end while   
 *      return true
 * end
 * 
 * Altro modo
 * 
 *  * start
 *      risultato = true
 * 
 *      if(num == 0) then
 *          risultato = false
 *      end if
 * 
 *      conta = 2
 *      while (conta < num and risultato) do
 *          if(num % conta == 0) then
 *              risultato = false
 *          end if
 *          conta=conta+1
 *      end while   
 *      return risultato
 * end
 * 
 */
package funzioni_pack;

import java.util.Scanner;

public class Funzioni {

    public static int leggiNumero() {
        return leggiNumero("Scrive un numero: ");
    }
    @SuppressWarnings("resource")
    public static int leggiNumero(String msg) {
        System.out.println(msg);
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return n;
    }

    public static boolean isNumeroPrimo(int num) {
        if (num < 2)
            return false;
        int conta = 2;
        while (conta < num) {
            if (num % conta == 0)
                return false;
            conta += 1;
        }
        return true;
    }
}
