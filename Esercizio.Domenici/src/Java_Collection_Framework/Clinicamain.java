package Java_Collection_Framework;

import java.util.Collection;

public class Clinicamain {
    public static void main(String[] args) {
        Clinica c = new Clinica();
        c.prenota(Specialista.OCULISTA, "Pippo Franco");
        c.prenota(Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Specialista.PEDIATRA, "Ciccio Ingrassia");
        c.prenota(Specialista.PEDIATRA, "Leo Gullotta");
        c.cancellaPrenotazione(Specialista.PEDIATRA, "Ciccio Ingrassia");

        Collection<String> ocu = c.getPrenotati(Specialista.OCULISTA);
        System.out.println(ocu);
        System.out.println(c.getPrenotati(Specialista.PEDIATRA));
    }
}
