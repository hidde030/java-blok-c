import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;
        if (obj instanceof Fiets andereFiets) {
            if (this.framenummer == andereFiets.framenummer) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        int jarenOud = huidigJaar - this.bouwjaar;
        double kortingsPercentage = 0.7;
        double huidigeWaarde = 0;

        for (int i = 0; i < jarenOud + 1; i++) {
            huidigeWaarde = this.nieuwprijs * (Math.pow(kortingsPercentage, i));
        }
        return huidigeWaarde;
    }



}
