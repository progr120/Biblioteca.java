package Java_Collection_Framework;

class Prenotazione {
    private Specialista specialista;
    private String nomePaziente;

    public Prenotazione(Specialista specialista, String nomePaziente) {
        this.specialista = specialista;
        this.nomePaziente = nomePaziente;
    }

    public Specialista getSpecialista() {
        return specialista;
    }

    public String getNomePaziente() {
        return nomePaziente;
    }
}

enum Specialista {
    OCULISTA, PEDIATRA;
}
