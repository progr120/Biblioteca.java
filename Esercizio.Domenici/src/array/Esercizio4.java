package array;

import java.util.Arrays;

public class Esercizio4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Array originale: " + Arrays.toString(arr));

        rotateLeft(arr);
        System.out.println("Dopo girare a sinistra: " + Arrays.toString(arr));

        rotateRight(arr);
        System.out.println("Dopo girare a destra: " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Dopo avere invertito: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] data) {
        if (data.length <= 1) {
            return;
        }
        int temp = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[data.length - 1] = temp;
    }

    public static void rotateRight(int[] data) {
        if (data.length <= 1) {
            return;
        }
        int temp = data[data.length - 1];
        for (int i = data.length - 1; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = temp;
    }

    public static void reverse(int[] data) {
        int left = 0;
        int right = data.length - 1;
        while (left < right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }
}