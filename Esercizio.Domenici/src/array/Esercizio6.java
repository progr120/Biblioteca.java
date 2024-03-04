package array;

public class Esercizio6 {

    public static int linearSearch(int[] data, int key) {
        if (data == null || data.length == 0) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 2, 1, 7, 5 };
        int key = 1;
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Chiave " + key + " trovato all'indice: " + index);
        } else {
            System.out.println("Chiave " + key + " non trovata in array.");
        }
    }
}