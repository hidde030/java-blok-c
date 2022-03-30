import javafx.event.ActionEvent;

import javax.management.InstanceNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public LuchtvaartMaatschappij lvmInladen(String bestandsNaam) throws IOException, ClassNotFoundException {
        InputStream is = new Files.newInputStream(Path.of(bestandsNaam));
        ObjectInputStream ois = new ObjectInputStream(is);
        LuchtvaartMaatschappij deLvm = (LuchtvaartMaatschappij) ois.readObject();
        ois.close();
        return deLvm;



    }
    public void handleLvmLaden(ActionEvent event) {
        try {
            String Bestandsnaam = bestandsnaam.getText();
            LuchtvaartMaatschappij lvm = manager.lvmInladen(Bestandsnaam);
            if(lvm != null){
                meldingen.setText("Lvm gevonden");
            }else {
                meldingen.setText("Lvm niet gevonden");
            }



        }
        catch (FileNotFoundException e) {
            meldingen.setText("Probleem met inladen lvm");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
