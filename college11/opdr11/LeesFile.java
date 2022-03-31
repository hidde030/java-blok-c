package opdr11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeesFile {

    public static void leesFile(String bron, String bestemming){
    if(bron.equals(bestemming)){
        System.out.println("Bron en bestemming mag niet gelijk zijn!");
        return;
    }
    try {
        File myObj = new File("college11/opdr11/"+bron+".txt");
        Scanner myReader = new Scanner(myObj);
        List<String> alle = new ArrayList<>();
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            alle.add(data);
        }
        verwerkData(alle, bestemming);
        myReader.close();
    } catch (FileNotFoundException e){
        System.out.println("File bestaat niet");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }

    public static void verwerkData(List data, String bestemming) throws IOException {
        String l = "college11/opdr11/"+bestemming+".txt";
        for(Object regel : data){
            String converted = regel.toString();
            String[] gesplit = converted.split(":");
            String s = gesplit[gesplit.length - 1];
            String c = convertData(s);
            FileWriter fr = new FileWriter(l, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(gesplit[0] + ": " + c + "\n");
            br.close();
            fr.close();
        }
    }

    public static String convertData(String s){
        double c = Double.parseDouble(s);
        double euro = Valuta.berekenDollarEuro(c);
        return String.format("%.2f", euro);
    }

    public static void bronBestand(){
        System.out.println("Vul het bronbestand in: \n");
    }

    public static void bestemmingBestand(){
        System.out.println("Vul het bestemmingbestand in: \n");
    }

    public static void vulKoersIn(){
        System.out.println("Vul koers in: \n");
    }

    public static String gebruikerInput(){
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }
}
