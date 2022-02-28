package opdr6a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> game = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        // return this.game.koop

    }

    public boolean verkoop(Game g2, Persoon p2) {
        return false;
    }

}
