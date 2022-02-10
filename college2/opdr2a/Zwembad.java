package opdr2a;
public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    public Zwembad( ) {

    }
    public Zwembad( double breedte,double lengte,double diepte)
    {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public double getBreedte(){
        return this.breedte;
    }
    public double getLengte(){
        return this.lengte;
    }
    public double getDiepte(){
        return this.diepte;
    }

    public void setBreedte(Double nwBreedte){
        this.breedte = nwBreedte;

    }
    public void setLengte(Double nwLengte ){
        this.lengte = nwLengte;
    }


    public void setDiepte(Double nwDiepte){
        this.diepte = nwDiepte;

    }
    public String toString(){
        String str= "De breedte is " + this.breedte + ".  De lengte is " + this.lengte + " en de diepte is "+ this.diepte;
        return str;
    }
    public double inhoud(){
        return  breedte * lengte *diepte;
    }
}
