package opdr4a;

public class Persoon {
    private String naam;
    private int leeftijd;
    public Persoon(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }
    public String toString(){
        String str = "huisbaas "+ naam + "; leeftijd "+ leeftijd+  " jaar";
        return str;
    }
}
