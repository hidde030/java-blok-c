import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<>();

    public StringProcessor(){}

    public String verwerk(String input){
        for (OpmaakProces proces : processen){
             input = proces.maakOp(input);
        }
        return  input;
    }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}