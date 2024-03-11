package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    public static void main(String[] args) {
        Main();
    }

    private String gestore;
    private static List<Costochiamata> costiChiamate = new ArrayList<>();

    public Cellphone(String gestore, String numeroTelefono) {
        this.gestore = gestore;
    }

    public String getGestore() {
        return gestore;
    }

    public static void setCost(String gestore1, String gestore2, double costoAlMinuto) {
        Costochiamata nuovoCosto = new Costochiamata(gestore1, gestore2, costoAlMinuto);
        for (Costochiamata costo : costiChiamate) {
            if (costo.getGestore1().equals(gestore1) && costo.getGestore2().equals(gestore2)) {
                costo.setCostoAlMinuto(costoAlMinuto);
            }
        }
        costiChiamate.add(nuovoCosto);
    }

    public double getCost(Cellphone destinazione, int durata) {
        String gestore2 = destinazione.getGestore();
        for (Costochiamata costo : costiChiamate) {
            if (costo.getGestore1().equals(this.gestore) && costo.getGestore2().equals(gestore2)) {
                return costo.getCostoAlMinuto() * durata;
            }
        }
        throw new IllegalArgumentException("Costo non definito per questa coppia di gestori");
    }

    public static void Main() {
        Cellphone a = new Cellphone("TIMMY", "3341234"),
                b = new Cellphone("Megafon", "3355678"),
                c = new Cellphone("Odissey", "3384343");
        Cellphone.setCost("TIMMY", "TIMMY", 0.05);
        Cellphone.setCost("TIMMY", "Megafon", 0.15);
        Cellphone.setCost("Megafon", "TIMMY", 0.25);
        System.out.println(a.getCost(b, 10));
        System.out.println(b.getCost(a, 8));
        System.out.println(a.getCost(c, 10));
    }
}
