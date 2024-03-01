/*
 * Creare un array e stampare i numeri, prima dall'inizio e dopo dal fondo!
 */

package array;

public class Esercizio1_5 {
    public static void main(String[] args) {
        int intArray[] = { 1, 2, 3, 4, 5 };

        System.out.println("Con for: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }

        System.out.println("Con while: ");
        int u = 0;
        boolean inizioafine = true;
        // metodo (true) = Array[0] a Array[4]
        while (u >= 0 && u < intArray.length) {
            System.err.println(intArray[u]);
            if (inizioafine) {
                u++;
            } else {
                u--;
            }

            // processo (falso) = Array[4] a Array[0]
            if (u == intArray.length) {
                inizioafine = false;
                u = intArray.length - 1;
            } else if (u == -1) {
                break;
            }
        }
    }
}