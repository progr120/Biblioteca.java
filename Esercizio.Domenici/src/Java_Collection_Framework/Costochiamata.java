package Java_Collection_Framework;
public class Costochiamata {
    private String gestore1;
    private String gestore2;
    private double costoAlMinuto;

    public Costochiamata(String gestore1, String gestore2, double costoAlMinuto) {
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
