package EserciziObjectOriented;

public class ElencoPersone {
    private Persona[] persone;
    int count;

    public ElencoPersone(int n) {
        persone = new Persona[n];
        count = 0;
    }

    public boolean aggiungi(Persona p){
        boolean aggiunto = false;

        if(count<persone.length){
            persone[count] = p;
            count++;
            aggiunto = true;
        }
        return aggiunto;
    }

    public String toString(){
        String s = "Elenco Persone \n";
        s += "---------------------------";

        for(int i = 0; i < count; i++){
            s += persone[i].toString()+"\n";
        }
        return s;
    }
}
