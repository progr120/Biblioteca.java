package array_funzioni;

public class ToolsEsercizio2 {
    // Riempi array con una sequenza: b, a+b, 2*a+b, 3*a+b, ...
    public static void linearSequence(int[] data, int a, int b) {
        for (int i = 0; i < data.length; i++) {
            data[i] = i * a + b;
        }
    }
    /* 
    ---------- Metodo for -------------
    public static void stampa(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    */

    // metodo while
    public static void stampa(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
