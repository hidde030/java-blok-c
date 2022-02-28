package opdr6a;

import java.time.LocalDate;

import javax.swing.text.html.HTMLDocument.RunElement;

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
     * 
     * @return
     */
    public double huidigeWaarde() {

        return huidigeWaarde();
    }

}
