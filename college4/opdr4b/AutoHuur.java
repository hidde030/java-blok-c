package opdr4b;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurderAuto;
    private Klant huurder;
    public AutoHuur(){}

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        this.gehuurderAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurderAuto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }
    public Klant getHuurder(){
        return huurder;
    }
    public double totaalPrijs(){
        if(huurder == null && gehuurderAuto == null){
        return aantalDagen * gehuurderAuto.getPrijsPerDag();
        }
        return aantalDagen;
    }

    public String toString() {
        if (gehuurderAuto == null){
            return "er is geen auto bekend\n";
        }
        if(huurder == null){
            return "er is geen huurder bekend\n";
        }
        return "aantal dagen: "+ aantalDagen+  " en dat kost" + totaalPrijs();
     
    }
}
