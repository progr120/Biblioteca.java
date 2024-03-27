package Java_Lambda;

import java.util.ArrayList;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("banana");
        lista.add("abacaxi");
        lista.add("laranja");
        lista.add("uva");
        lista.add("pera");

        lista.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Lista Ordenada: ");
        for(String list : lista){
            System.out.println(list);
        }
    }
}
