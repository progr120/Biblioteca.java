package Java_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltraLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        List<Integer> pares = numeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());

        System.out.println("Numeros pares:");
        pares.forEach(System.out::println);
    }
}
