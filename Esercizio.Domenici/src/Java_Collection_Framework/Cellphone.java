package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    public static void main(String[] args) {
        Main();
    }

    private String gestore;
    @SuppressWarnings("unused")
    private String numeroTelefono;
    private static List<costoChiamata> costiChiamate = new ArrayList<>();

    public Cellphone(String gestore, String numeroTelefono) {
        this.gestore = gestore;
        this.numeroTelefono = numeroTelefono;
    }

    public String getGestore() {
        return gestore;
    }

    public static void setCost(String gestore1, String gestore2, double costoAlMinuto) {
        costoChiamata nuovoCosto = new costoChiamata(gestore1, gestore2, costoAlMinuto);
        for (costoChiamata costo : costiChiamate) {
            if (costo.getGestore1().equals(gestore1)) {
                costo.setCostoAlMinuto(costoAlMinuto);
            } else if (costo.getGestore2().equals(gestore2)) {
                costo.setCostoAlMinuto(costoAlMinuto);
            }
        }
        costiChiamate.add(nuovoCosto);
    }

    public double getCost(Cellphone destinazione, int durata) {
        String gestore2 = destinazione.getGestore();
        for (costoChiamata costo : costiChiamate) {
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
        System.out.println(a.getCost(c, 10)); // provoca eccezione
    }
}

class costoChiamata {
    private String gestore1;
    private String gestore2;
    private double costoAlMinuto;

    public costoChiamata(String gestore1, String gestore2, double costoAlMinuto) {
        this.gestore1 = gestore1;
        this.gestore2 = gestore2;
        this.costoAlMinuto = costoAlMinuto;
    }

    public String getGestore1() {
        return gestore1;
    }

    public String getGestore2() {
        return gestore2;
    }

    public double getCostoAlMinuto() {
        return costoAlMinuto;
    }

    public void setCostoAlMinuto(double costoAlMinuto) {
        this.costoAlMinuto = costoAlMinuto;
    }
}
