package Java_Collection_Framework;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Cellphone {
    private static HashMap<String, HashMap<String, Double>> costs = new HashMap<>();
    private String operator;
    private String phoneNumber;

    public Cellphone(String operator, String phoneNumber) {
        this.operator = operator;
        this.phoneNumber = phoneNumber;
    }

    public static void setCost(String sourceOperator, String destinationOperator, double costPerMinute) {
        if (!costs.containsKey(sourceOperator)) {
            costs.put(sourceOperator, new HashMap<>());
        }
        costs.get(sourceOperator).put(destinationOperator, costPerMinute);
    }

    public double getCost(Cellphone destination, int durationInMinutes) {
        String sourceOperator = this.operator;
        String destinationOperator = destination.operator;

        if (!costs.containsKey(sourceOperator) || !costs.get(sourceOperator).containsKey(destinationOperator)) {
            throw new IllegalArgumentException("Cost not set for the given operators.");
        }

        double costPerMinute = costs.get(sourceOperator).get(destinationOperator);
        return costPerMinute * durationInMinutes;
    }

    public static void main(String[] args) {
        Cellphone a = new Cellphone("TIMMY", "3341234");
        Cellphone b = new Cellphone("Megafon", "3355678");
        Cellphone c = new Cellphone("Odissey", "3384343");
        Cellphone.setCost("TIMMY", "TIMMY", 0.05);
        Cellphone.setCost("TIMMY", "Megafon", 0.15);
        Cellphone.setCost("Megafon", "TIMMY", 0.25);

        System.out.println(a.getCost(b, 10)); // output: 1.5
        System.out.println(b.getCost(a, 8)); // output: 2.0
        try {
            System.out.println(a.getCost(c, 10)); // provoca eccezione
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // stampa il messaggio di errore
        }
    }
}
