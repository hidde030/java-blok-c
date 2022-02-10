package opdr2b;

public class Voetbalclub {

    private char ch;
    private String club;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    public Voetbalclub(String club){
       this.club = club;
    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }


    public int aantalGespeeld(int aantalGewonnen, int aantalGelijk, int aantalVerloren) {

    }

    public int aantalPunten(int aantalGewonnen, int aantalGelijk, int aantalVerloren) {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    public String toString(){
        String str = "";
        return str;
    }
