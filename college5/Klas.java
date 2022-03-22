import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerling = new ArrayList<>();

    public Klas(String kC) {
        this.klasCode = kC;

    }

    public void voegLeerlingToe(Leerling l) {
        leerling.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerling) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
                break;
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerling;
    }

    public int aantalLeerlingen(){
        return leerling.size();

    }
    public String toString() {
        String str =  "In klas " + klasCode + " zitten de volgende leerlingen: \n";

        for (int i = 0; i <leerling.size() ; i++) {
            str = str  + leerling.get(i) + '\n';
        }
        return str;
    }
}
