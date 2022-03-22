import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;
    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;
        if (obj instanceof Auto andereAuto) {
            if (this.kenteken.equals(andereAuto.kenteken)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        int jarenOud = huidigJaar - super.bouwjaar;
        double kortingsPercentage = 0.7;
        double huidigeWaarde = 0;

        for (int i = 0; i < jarenOud + 1; i++) {
            huidigeWaarde = this.nieuwprijs * (Math.pow(kortingsPercentage, i));
        }
        return huidigeWaarde;
    }
}
