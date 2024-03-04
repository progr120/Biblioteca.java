package array;

public class Esercizio7 {

    // Binary Search with recursion
    public static int binarySearch(int[] data, int key) {
        if (data == null)
            return -1;
        return binarySearch(data, key, 0, data.length - 1);
    }

    protected static int binarySearch(int[] data, int key, int min, int max) {
        if (max < min)
            return -1;

        int midpoint = min + (max - min) / 2;

        if (data[midpoint] == key)
            return midpoint;
        else if (key < data[midpoint])
            return binarySearch(data, key, min, midpoint - 1);
        else
            return binarySearch(data, key, midpoint + 1, max);
    }

    // Binary Search without recursion
    public static int binarySearchIterative(int[] data, int key) {
        if (data == null)
            return -1;

        int min = 0;
        int max = data.length - 1;

        while (min <= max) {
            int midpoint = min + (max - min) / 2;
            if (data[midpoint] == key)
                return midpoint;
            else if (key < data[midpoint])
                max = midpoint - 1;
            else
                min = midpoint + 1;
        }

        return -1;
    }

    // Test function
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int key = 13;

        // Testing binary search with recursion
        int indexRecursive = binarySearch(arr, key);
        System.out.println("Chiave " + key + " trovato all'indice(ricorsivo): " + indexRecursive);

        // Testing binary search without recursion
        int indexIterative = binarySearchIterative(arr, key);
        System.out.println("Chiave " + key + " trovato all'indice(iterativo):  " + indexIterative);
    }
}