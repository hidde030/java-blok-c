import java.util.ArrayList;

public class BedrijfsInventaris implements Goed {
    private String bedrijfsnaam;
    private double budget;
//    private ArrayList<AlleGoederen>()
    public BedrijfsInventaris(String nm,double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g){
//        if(budget <= g.hui)
    }

    public double huidigWaarde() {
        return 0;
    }
}
