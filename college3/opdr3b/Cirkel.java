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

        return "cirkel (" + this.xPositie+" "+ this.yPositie + ") met radius: " + this.radius;
    }
}

