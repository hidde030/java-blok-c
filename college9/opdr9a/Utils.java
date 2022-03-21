package opdr9a;


import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    private double bedrag;
    private int precisie;

    public static String euroBedrag(double bedrag) {
     return NumberFormat.getCurrencyInstance(new Locale("nl", "NL")).format(bedrag);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        String str =  NumberFormat.getCurrencyInstance(new Locale("nl", "NL")).format(bedrag);
        return str;
    }

}

