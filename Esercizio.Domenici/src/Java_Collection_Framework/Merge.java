package Java_Collection_Framework;

import java.util.LinkedList;

public class Merge {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        LinkedList<Integer> mergedList = merge(lista1, lista2);
        System.out.println(mergedList);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> lista1, LinkedList<Integer> lista2){
        if(lista1.size() != lista2.size()){
            throw new IllegalArgumentException("Le liste devono avere la stessa misura");
        }

        LinkedList<Integer> mergedList = new LinkedList<>();
        for(int i = 0; i < lista1.size(); i++){
            mergedList.add(lista1.get(i));
            mergedList.add(lista2.get(i));
        }
        return mergedList;
    }
}
