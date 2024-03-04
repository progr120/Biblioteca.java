package array;

import java.util.Arrays;
import array_funzioni.ToolsEsercizio5;

public class Esercizio5 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2, 9, 4, 7, 6 };
        System.out.println("Array originale: " + Arrays.toString(arr));

        ToolsEsercizio5.insertionSort(arr.clone());
        System.out.println("Dopo inserire sort: " + Arrays.toString(arr));

        ToolsEsercizio5.selectionSort(arr.clone());
        System.out.println("Dopo selecionare sort: " + Arrays.toString(arr));

        ToolsEsercizio5.quickSort(arr.clone());
        System.out.println("Dopo veloce sort: " + Arrays.toString(arr));

        ToolsEsercizio5.mergeSort(arr.clone());
        System.out.println("Dopo unisci sort: " + Arrays.toString(arr));
    }
}