package objori;

import java.util.Scanner;

public class EnumTypes {

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Scrive un giorno della setimana: ");
        String day = s.nextLine();
        Days Dayinsert = Days.valueOf(day.toUpperCase());
        System.out.println(Dayinsert);

        if (Dayinsert == Days.SUNDAY) {
            System.out.println("Oggi è domenica");
        } else if (Dayinsert == Days.MONDAY) {
            System.out.println("mannaggia, è lunedi..");
        } else if (Dayinsert == Days.SATURDAY) {
            System.out.println("ok sabb..");
        } else {
            System.out.println("Caso non contemplato..");
        }
    }
}
