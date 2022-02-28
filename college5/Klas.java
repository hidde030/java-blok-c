import java.util.ArrayList;

public class Klas {
    private String klasCode;
    //    private Leerling leerling;
    private ArrayList<Leerling> leerling = new ArrayList<>();

    public Klas(String kC) {
        this.klasCode = kC;

    }

    public void voegLeerlingToe(Leerling l) {
        leerling.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {


    }
    public int aantalLeerlingen(){
//        this.leerling
    }
    public String toString() {
        return "In klas " + klasCode + " zitten de volgende leerlingen: ";
    }
}
