package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class SafeSet<S> {
    private final List<S> elements = new ArrayList<>();
    public static void main(String[] args) {
        SafeSet<String> a = new SafeSet<>();
        System.out.println(a.add("ciao")); //true 
        System.out.println(a.add("mondo")); //true 
        System.out.println(a.remove("ciao")); //true
        System.out.println(a.contains("ciao")); //false
        System.out.println(a.remove("ciao")); // true
        System.out.println(a.contains("ciao")); //false
    }

    public boolean add(S element){
        if(!contains(element)){
            elements.add(element);
            return true;
        }
        return false;
    }

    public boolean remove(S element){
        if(contains(element)){
            elements.remove(element);
            return true;
        } else {
            return true;
        }
    }

    public boolean contains(S element){
        return elements.contains(element);
    }
}
