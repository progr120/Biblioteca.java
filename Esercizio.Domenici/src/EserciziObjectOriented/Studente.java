package EserciziObjectOriented;

    public class Studente extends Persona {
    private int matricola;
    private String università;

    public Studente(String codiceFiscale, String nome, String cognome, int matricola, String università) {
        super(codiceFiscale, nome, cognome);
        this.matricola = matricola;
        this.università = università;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getUniversità() {
        return università;
    }

    public void setUniversità(String università) {
        this.università = università;
    }

    @Override
    public String toString() {
        return "Studente [matricola=" + matricola + ", università=" + università + "]";
    }
}

    class Docente extends Persona{
    private String materia;
    private double salario;

    public Docente(String codiceFiscale, String nome, String cognome, String materia, double salario){
        super(codiceFiscale, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Docente [materia=" + materia + ", salario=" + salario + "]";
    }
}
