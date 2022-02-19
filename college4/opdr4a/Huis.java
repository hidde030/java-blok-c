package opdr4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;
    public Huis(String adr, int bwjr){
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        this.huisbaas = hb;
    }
    public Persoon getHuisbaas(){
        return huisbaas;
    }
    public String toString(){
        String str = "Huis "+ adres + " is gebouwd in " + bouwjaar;
        str += "\nen heeft huisbaas" + huisbaas.toString();
        return str;
    }
}
