package opdr4b;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    public void testStringGeenhuur() {
        AutoHuur ah1 = new AutoHuur();
        assertEquals("\ter is geen auto bekend\n\ter is geen huurder bekend\n\taantal dagen: 0 en dat kost 0", ah1.toString());
        //Geen huurder Geen huurder
    }

    @Test
    public void testStringWelAutoGeenHuur() {
        AutoHuur ah2 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        ah2.setGehuurdeAuto(a1);
        assertEquals("\tautotype: Peugeot 207 met prijs per dag: 50.0\n\ter is geen huurder bekend\n\taantal dagen: 0 en dat kost 0.0", ah2.toString());
    }
    @Test
    public void testStringGeenAutoWelKorting(){
        AutoHuur ah3 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah3.setHuurder(k);
        ah3.setAantalDagen(1);
        assertEquals("\ter is geen auto bekend\n\top naam van Mijnheer de Vries korting : 10.0%\n\taantal dagen: 0 en dat kost 0", ah3.toString());
    }
    @Test
    public void testStringGeenAutoGeenKorting(){
        AutoHuur ah3 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ah3.setHuurder(k);
        assertEquals("\ter is geen auto bekend\n\top naam van Mijnheer de Vries korting : 0.0%\n\taantal dagen: 0 en dat kost 0", ah3.toString());
    }
    @Test
    public void testStringWelAutoWelKorting(){
        AutoHuur ah4 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah4.setAantalDagen(1);
        ah4.setGehuurdeAuto(a1);
        ah4.setHuurder(k);
        assertEquals("\tautotype: Peugeot 207 met prijs per dag: 50.0\n\top naam van Mijnheer de Vries korting : 10.0%\n\taantal dagen: 1 en dat kost 45.0", ah4.toString());
    }
    @Test
    public void testStringWelAutoGeenKorting() {
        AutoHuur ah4 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        ah4.setAantalDagen(1);
        ah4.setGehuurdeAuto(a1);
        ah4.setHuurder(k);
        assertEquals("\tautotype: Peugeot 207 met prijs per dag: 50.0\n\top naam van Mijnheer de Vries korting : 0.0%\n\taantal dagen: 1 en dat kost 50.0", ah4.toString());
    }
}