import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g) {
        if (budget >= g.huidigeWaarde() && !alleGoederen.contains(g)) {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    public String toString() {
        StringBuilder goederen = new StringBuilder();
        for (Goed goed : alleGoederen) {
            goederen.append(goed.toString());
        }
        return goederen.toString();
    }


}
