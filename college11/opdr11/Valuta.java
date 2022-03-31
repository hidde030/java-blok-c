package opdr11;

public class Valuta {
    private static double koers = 0.918720 ;

    public static void setKoers(String k){
        double koersDouble = Double.parseDouble(k);
        koers = koersDouble;
    }

    public static double berekenDollarEuro(double dollar){
        return dollar * koers;
    }

}
