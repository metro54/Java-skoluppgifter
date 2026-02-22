package inlamningsuppgift2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseLogicTest {

    // Variabel som är tillgänglig i alla testmetoder
    private MorseLogic morseLogic;


    // Skapar ett nytt MorseLogic-objekt så varje test börjar fräscht
    @BeforeEach
    public void setUp() {
        morseLogic = new MorseLogic();
    }


    // Test 1, Kollar att en enskild bokstav översätts rätt till morsekod
    @Test
    public void testLetterA() {
        assertEquals(".-", morseLogic.toMorse("A"));
    }


    // Test 2, Kollar att ett helt ord översätts rätt till morsekod
    @Test
    public void testHello() {
        assertEquals(".... . .-.. .-.. ---", morseLogic.toMorse("HELLO"));
    }

    // Test 3, Kollar att små bokstäver fungerar
    @Test
    public void testLowercase() {
        assertEquals(".-", morseLogic.toMorse("a"));
    }

    // Test 4, Kollar att morsekod översätts rätt till engelska
    @Test
    public void testMorseToHello() {
        assertEquals("HELLO", morseLogic.toEnglish(".... . .-.. .-.. ---"));
    }

    // Test 5, Kollar att en enskild morsekod översätts rätt
    @Test
    public void testMorseS() {
        assertEquals("S", morseLogic.toEnglish("..."));
    }

    // Test 6, Kollar att rätt fel kastas när texten är tom (första felhanteringen)
    @Test
    public void testEmptyText() {
        assertThrows(IllegalArgumentException.class, () -> {
            morseLogic.toMorse("");
        });
    }

    // Test 7, Kollar att rätt fel kastas när morsekoden är okänd (andra felhanteringen)
    @Test
    public void testInvalidMorse() {
        assertThrows(IllegalArgumentException.class, () -> {
            morseLogic.toEnglish(".......");
        });
    }
}