package opdr2b;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int aantalPunten;

    public Voetbalclub(String naam) {
        if(naam == "" || naam == null){
            this.naam = "FC";
        } else{
            this.naam = naam;
        }
    }

    public String getNaam() {
        return this.naam;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;

    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        } else{
            return;
        }
    }

    public int aantalPunten() {
        int aantalPunten = aantalGewonnen * 3;
        return aantalGelijk + aantalPunten;
    }

    public String toString() {
        return naam + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " "
                + aantalPunten;
    }
}