package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Clinica {
    private List<Prenotazione> prenotati;

    public Clinica() {
        prenotati = new ArrayList<>();
    }

    public void prenota(Specialista specialista, String nomePaziente) {
        if (!isPrenotato(nomePaziente)) {
            prenotati.add(new Prenotazione(specialista, nomePaziente));
        } 
    }

    public void cancellaPrenotazione(Specialista specialista, String nomePaziente) {
        prenotati.removeIf(prenotazione -> prenotazione.getSpecialista() == specialista
                && prenotazione.getNomePaziente().equals(nomePaziente));
    }

    public Collection<String> getPrenotati(Specialista specialista) {
        List<String> prenotazioni = new ArrayList<>();
        for (Prenotazione prenotazione : prenotati) {
            if (prenotazione.getSpecialista() == specialista) {
                prenotazioni.add(prenotazione.getNomePaziente());
            }
        }
        if (specialista == Specialista.PEDIATRA) {
            prenotazioni.removeIf(nomePaziente -> isPrenotato(nomePaziente));
        }
        return prenotazioni;
    }

    private boolean isPrenotato(String nomePaziente) {
        return prenotati.stream().anyMatch(prenotazione -> prenotazione.getNomePaziente().equals(nomePaziente));
    }
}