package array;

import array_funzioni.ToolsEsercizio3;

public class Esercizio3 {
    public static void main(String[] args) {
        int[] td = { 12, 23, 34, 101, 59 };
        System.out.println("Minore: " + ToolsEsercizio3.minimum(td));
        System.out.println("Maggiore: " + ToolsEsercizio3.maximum(td));
        System.out.println("Somma: " + ToolsEsercizio3.somma(td));
        System.out.println("Media: " + ToolsEsercizio3.media(td));
    }
}