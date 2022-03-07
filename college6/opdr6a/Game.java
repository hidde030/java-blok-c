package opdr6a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    /**
     * Methode huidigeWaarde() berekent wat de waarde in het huidige jaar is.
     * 2 games zijn hetzelfde als de naam en het releaseJaar hetzelfde zijn.
     */
    public double huidigeWaarde() {

        int huidigJaar = LocalDate.now().getYear();
        int jarenOud = huidigJaar - releaseJaar;
        double kortingsPercentage = 0.7;
        double huidigeWaarde = 0;
        for (int i = 0; i < jarenOud+1; i++) {
            huidigeWaarde = nieuwprijs * (Math.pow(kortingsPercentage, i)) ;
        }
        if (jarenOud == 0)
            return nieuwprijs;
        else
            return huidigeWaarde;
    }

}
