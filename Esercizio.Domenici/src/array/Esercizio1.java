/*
 * Scrivere un programma che dati due array di interi in input se sono uguali
 */

package array;

public class Esercizio1 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };

        // Verifica se array ha una dimensione uguale
        if (array1.length != array2.length) {
            System.out.println("Gli array hanno dimensioni diverse.");
            return;
        }

        // Confronto dei due array
        boolean sonoUguali = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                sonoUguali = false;
                break;
            }
        }

        // Messaggo basati sul risultato del confronto
        if (sonoUguali) {
            System.out.println("Gli array sono uguali.");
        } else {
            System.out.println("Gli array sono diversi.");
        }
    }
}