package array_funzioni;

public class ToolsEsercizio3 {
    public static void Inicial(int[] data) {
        if (data == null || data.length == 0)
            return;
    }

    public static int minimum(int[] data) { // calcula o numero minimo da array
        ToolsEsercizio3.Inicial(data);
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min)
                min = data[i];
        }
        return min;
    }

    public static int maximum(int[] data) {
        ToolsEsercizio3.Inicial(data);
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max)
                max = data[i];
        }
        return max;
    }

    public static int somma(int[] data) {
        ToolsEsercizio3.Inicial(data);
        int somma = 0;
        for (int num : data) {
            somma += num;
        }
        return somma;
    }

    public static double media(int[] data) {
        ToolsEsercizio3.Inicial(data);
        double media = (double) somma(data) / data.length;
        return media;
    }
}

/* Stesso con while
 * public static int minimum(int[] data) {
 * ToolsEsercizio3.Inicial(data);
 * int min = data[0];
 * int i = 1;
 * 
 * while(i < data.length){
 * if(data[i] < min)
 * min = data[i];
 * i++;
 * }
 * return min;
 * }
 * 
 * public static int maximum(int[] data){
 * ToolsEsercizio3.Inicial(data);
 * int max = data[0];
 * int i = 1;
 * 
 * while(i < data.length){
 * if(data[i] > max)
 * max = data [i];
 * i++;
 * }
 * return max;
 * }
 * 
 * public static int somma(int [] data){
 * ToolsEsercizio3.Inicial(data);
 * int somma = 0;
 * int i = 0;
 * 
 * while(i < data.length){
 * somma += data[i];
 * i++;
 * }
 * return somma;
 * }
 * 
 * public static int media(int[] data){
 * ToolsEsercizio3.Inicial(data);
 * int media = somma(data) / data.length;
 * return media;
 * }
 * }
 */
