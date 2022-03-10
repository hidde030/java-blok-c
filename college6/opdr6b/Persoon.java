package opdr6b;

import java.util.ArrayList;
import java.util.Objects;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (g.huidigeWaarde() <= this.budget) {
            for (Game game : mijnGames) {
                if (Objects.equals(g.getNaam(), game.getNaam())) {
                    return false;
                }
            }
            mijnGames.add(g);
            this.budget -= g.huidigeWaarde();
            return true;
        } else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        for (Game game : mijnGames) {
//            Zoek naar 1 game
            if (g.equals(game) && koper.koop(g)) {
//                Als de game gelijk is van de
                this.budget += g.huidigeWaarde();
                mijnGames.remove(g);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = naam + " heeft een budget van €" + String.format("%,.2f", budget) + " en bezit de volgende games:";
        str = str.replaceAll("\\.", ",");
        for (Game game : mijnGames) {
            str = str + "\n" + game;
        }
        // For loop is hetzelfde andere manier...
        // for (int i = 0; i < mijnGames.size(); i++) {
        // str = str + mijnGames.get(i);
        // }
        return str;

    }

}
