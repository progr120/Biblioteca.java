package Texts_and_Exemples;

import java.util.Arrays;

public class LoopVari {
    public static void main(String[] args) {
        int[] numeri = { 3, 6, 4, 7, 67, 45, 2, 123, 4 };

        // while
        int idx = 0;
        while (idx < numeri.length) {
            System.out.println(numeri[idx]);
            idx++;
        }

        // while eseguito almeno una volta
        idx = 0;
        do{
            System.out.println(numeri[idx]);
            idx++;
        }while(idx < numeri.length);

        // for stile
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        // foreach
        for (int numero : numeri) {
            System.out.println(numero);
        }

        // stream, method reference
        Arrays.asList(1,4,6,85,56,78,93,45)
        .forEach(System.out::println);

        stampaNumeri(numeri);
    }
    
    public static void stampaNumeri(int... nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
