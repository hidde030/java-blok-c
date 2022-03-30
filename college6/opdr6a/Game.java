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

        for (int i = 0; i < jarenOud + 1; i++) {
            huidigeWaarde = nieuwprijs * (Math.pow(kortingsPercentage, i));
        }
        return huidigeWaarde;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;
            if (this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar ) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;


    }
    public String toString() {
//        System.out.println(DecimalFormat.getCurrencyInstance(Locale.GERMAN).format(nieuwprijs));
        String str = naam + ", uitgegeven in "+releaseJaar+ "; nieuwprijs: €" + String.format("%,.2f", nieuwprijs) + " nu voor: €" + String.format("%,.2f", huidigeWaarde());
        str = str.replaceAll("\\.", ",");
        return str;
    }
}
