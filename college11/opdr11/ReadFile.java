package opdr11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static void loadFile(String Filename) {
        try {
            File myObj = new File("college11/opdr11/" + Filename);
            if (myObj.createNewFile()) {
                System.out.println("Bestand aangemaakt: " + myObj);
            }
            Scanner myReader = new Scanner(myObj);

            ArrayList<String> alle = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                alle.add(data);
            }
            verwerkData(alle);
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void verwerkData(ArrayList data) {
        System.out.println(data);
        for (Object regel : data) {
            String converted = regel.toString();
            String[] gesplit = converted.split(":");
            Double Dollar = Double.valueOf(gesplit[1]);
            berekenToEuro(Dollar);


        }

    }

    public static String berekenToEuro(Double Dollar) {
        DecimalFormat df = new DecimalFormat("0.00");
        Double DollartoEuro = Dollar;
        Double Euro = DollartoEuro * 0.918720;
        String newEuro = df.format(Euro);

        return newEuro;
    }

    public static void WriteFile(String filename) {
        try {
            File myObj = new File("college11/opdr11/" + filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
