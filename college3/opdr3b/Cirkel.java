package opdr3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius,int xPositie, int yPositie){
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }
    public String getMessage(){
        String str = "Radius moet groter dan 0 zijn!";
        return str;
    }
    public String toString(){
        String str = "cirkel (" +xPositie+" "+ yPositie + ") met radius: " + radius;
        return str;
    }
}
