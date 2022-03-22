import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    private double bedrag;
    private int precisie;
    private static int totaal = 0;

    public static String euroBedrag(double bedrag) {
        totaal++;

        return NumberFormat.getCurrencyInstance(new Locale("nl", "NL")).format(bedrag);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        totaal++;
        return String.format("€ "+"%."+ precisie +"f",bedrag);
    }
    public static int getTotaal(){
        return totaal;
    }

}

