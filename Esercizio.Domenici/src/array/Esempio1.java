package array;

import java.util.Arrays;

public class Esempio1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int numeri [] = {1, 3, 5, 7, 9};
        int numeri2 [] = {1, 3, 5, 7, 9};

        System.out.println(x == y); // true

        System.out.println(numeri == numeri2); // false

        // error, deve scrivere un [] con il numero da lista dentro
        System.out.println(numeri);
        System.out.println(numeri2);

        // stampa numero 0 della lista e doppo stampa numero 1 della lista2
        System.out.println(numeri[0]);
        System.out.println(numeri2[1]);
        
        // stampa la lista di numeri
        int idx = 0;
        System.out.println("-----Stampa Array-----");
        while(idx < numeri.length) {
            System.out.println(numeri[idx]);
            idx++;
        }

        // stampa la lista numeri
        System.out.println(Arrays.toString(numeri));

        // assegna valore true o false
        System.out.println(Arrays.equals(numeri, numeri2));
    }

    public static void casoTrue() { // caso true
        String t1 = "1,5,9";
        String t2 = "1,5,9";

        if (t1 == t2) { // caso true
            System.out.println("Sono uguale(true)");
        }
    }

    public static void casoFalso() { // caso false
        String f1 = "13,14,21";
        String f2 = "15,27,19";

        if (f1 != f2) { 
            System.out.println("Non sono ugale(false)");
        }
    }
}
