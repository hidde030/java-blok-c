package opdr11;

public class Main {
    public static void main(String[] args){
        LeesFile.bronBestand();
        String bron = LeesFile.gebruikerInput();
        LeesFile.bestemmingBestand();
        String bestemming = LeesFile.gebruikerInput();
        LeesFile.vulKoersIn();
        String koers = LeesFile.gebruikerInput();
        Valuta.setKoers(koers);
        LeesFile.leesFile(bron, bestemming);
    }

}
