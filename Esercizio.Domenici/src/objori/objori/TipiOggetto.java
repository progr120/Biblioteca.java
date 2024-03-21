package objori;

import java.time.LocalDate;

public class TipiOggetto {
    public static void main(String[] args) {
        String message = new String("CIAO");

        String message1 = "hello";

        int x = 10;

        LocalDate oggi = LocalDate.now();

        LocalDate dopodomani = oggi.plusDays(2);

        String messageUpperCase = message.toLowerCase();

        String message1UpperCase = message1.toUpperCase();

        System.out.println(message);
        System.out.println(message1);
        System.out.println(x);
        System.out.println(oggi);
        System.out.println(dopodomani);
        System.out.println(messageUpperCase);
        System.out.println(message1UpperCase);
    }
}
