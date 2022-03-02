package opdr2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    @Test
    public void clubnaamLeeg() {
        Voetbalclub voetbal = new Voetbalclub("");
        assertEquals("FC", voetbal.getNaam());
    }

    @Test
    public void verwerkResultaatTest() {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('p');
        assertEquals(0, feij.aantalGespeeld());
    }

    @Test
    public void aantalPuntenTest() {
        Voetbalclub ajax = new Voetbalclub("Ajax");
        ajax.verwerkResultaat('g');
        assertEquals(1, ajax.aantalPunten());
    }

}