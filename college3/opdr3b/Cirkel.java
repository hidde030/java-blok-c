package opdr3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad,int x, int y) throws IllegalArgumentException{

        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
        if(this.radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString(){

        return "cirkel (" + this.radius+" "+ this.yPositie + ") met radius: " + this.radius;
    }
}
/*  - de code niet meer compileert : Komt omdat
    - de applicatie helemaal niet uitgevoerd kan worden
    - de applicatie tijdens uitvoeren stopt
    - de applicatie gewoon alles uitvoert maar de uitvoer verandert*/
