public abstract class Voertuig implements Goed {

    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;
        if (obj instanceof Voertuig) {
            Voertuig andereVoertuig = (Voertuig) obj;
            if (this.type.equals(andereVoertuig.type) && this.nieuwprijs == andereVoertuig.nieuwprijs && this.bouwjaar == andereVoertuig.bouwjaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        return type;
    }

}

