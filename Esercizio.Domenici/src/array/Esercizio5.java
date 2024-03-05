package array;

import java.util.Arrays;
import array_funzioni.ToolsEsercizio5;

public class Esercizio5 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2, 9, 4, 7, 6 };
        System.out.println("Originale: " + Arrays.toString(arr));

        int[] arrClone = arr.clone();

        ToolsEsercizio5.insertionSort(arrClone);
        System.out.println("Insertion: " + Arrays.toString(arrClone));

        arrClone = arr.clone(); 

        ToolsEsercizio5.selectionSort(arrClone);
        System.out.println("Selection: " + Arrays.toString(arrClone));

        arrClone = arr.clone(); 

        ToolsEsercizio5.quickSort(arrClone);
        System.out.println("Quick: " + Arrays.toString(arrClone));

        arrClone = arr.clone(); 

        ToolsEsercizio5.mergeSort(arrClone);
        System.out.println("Merge: " + Arrays.toString(arrClone));
    }
}