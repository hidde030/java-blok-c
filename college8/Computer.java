
import java.time.LocalDate;

public class Computer implements Goed {

    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        int jarenOud = huidigJaar - productieJaar;
        double kortingsPercentage = 0.6;
        double huidigeWaarde = 0;

        for (int i = 0; i < jarenOud + 1; i++) {
            huidigeWaarde = aanschafPrijs * (Math.pow(kortingsPercentage, i));
        }
        return huidigeWaarde;
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Computer) {
            Computer andereComputer = (Computer) obj;
            if (this.type.equals(andereComputer.type) &&
                    this.macAdres.equals(andereComputer.macAdres)
                    && this.aanschafPrijs == andereComputer.aanschafPrijs
                    && this.productieJaar == andereComputer.productieJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString() {
        return "Het type is : "+ type + " en de huidigwaarde : " + Utils.euroBedrag(huidigeWaarde());
    }
}
