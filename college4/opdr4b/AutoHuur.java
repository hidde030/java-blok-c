package opdr4b;


public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant klant) {
        this.huurder = klant;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (huurder != null) {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKortingsPercentage() / 100);
        }
        return aantalDagen * gehuurdeAuto.getPrijsPerDag();
    }

    public String toString() {
        if (gehuurdeAuto == null && huurder == null) {
            return "\ter is geen auto bekend\n\ter is geen huurder bekend\n\taantal dagen: 0 en dat kost 0";

        } else if (gehuurdeAuto == null) {
            return "\ter is geen auto bekend" + "\n\t" + huurder.toString() + "\n" + "\taantal dagen: 0 en dat kost 0";

        } else if (huurder == null) {
            return "\t" + gehuurdeAuto.toString() + "\n\ter is geen huurder bekend\n" + "\taantal dagen: " + aantalDagen +
                    " en dat kost " + totaalPrijs();

        } else {
            return "\t" + gehuurdeAuto.toString() + "\n\t" + huurder.toString() + "\n\t" + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }
    }
}