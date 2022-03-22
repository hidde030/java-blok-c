//public class Main {

//    Maak een BedrijfsInventaris-object aan met voldoende budget.
//    Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
//    Doe dit ook voor Fiets en Auto.
//    Maak ook nog een auto, fiets en computer met andere eigenschappen.
//    Probeer alle objecten aan de bedrijfsinventaris toe te voegen.
//    Print de BedrijfsInventaris
//}


public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris Binv = new BedrijfsInventaris("Apple", 10000);
        Computer pc = new Computer("DELL", "123-33-332-223", 100, 2020);
        Computer pc1 = new Computer("DELL", "123-33-332-223", 100, 2020);
        System.out.println(pc.equals(pc1));
        Auto auto = new Auto("BMW", 1000, 2020, "43-hhh-2");
        Auto auto2 = new Auto("BMW", 1000, 2020, "43-hhh-2");
        System.out.println("De huidige waarde van de auto"+ auto.huidigeWaarde());
        Fiets fiets = new Fiets("Gazelle", 120, 2020, 123);
        Fiets fiets1 = new Fiets("Gazelle", 120, 2020, 123);
        System.out.println(pc.huidigeWaarde());
        System.out.println("De huidige waarde van de auto"+ pc.huidigeWaarde());
        Binv.schafAan(pc);
        Binv.schafAan(pc1);
        Binv.schafAan(auto);
        Binv.schafAan(auto2);
        Binv.schafAan(fiets);
        Binv.schafAan(fiets1);

        System.out.println(Binv.toString());
    }
}