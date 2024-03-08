package eccomerce;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- ECCOMERCE TEST --------------");
        System.out.println("[S] storage");
        String v = sc.nextLine();
        v = v.trim().toLowerCase();
        if (v.equals("s"))
            Storage();
    }

    public static void Storage(){
    Storage storage = new Storage();
    storage.load(new Product("caffe", 2), 100);
    storage.load(new Product("caffe milano", 5), 50);
    storage.load(new Product("pizza", 5), 0);
    storage.load(new Product("prosciuto", 8), 10);
    storage.load(new Product("coca-cola", 2.5f), 85);

    storage.logStatus();
    }
}
