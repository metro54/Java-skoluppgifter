package inlamningsuppgift2;

import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {

        // Scanner för att läsa in text som användaren skriver i terminalen
        Scanner scanner = new Scanner(System.in);

        // Skapar ett objekt av logikklassen så vi kan använda dess metoder
        MorseLogic morseLogic = new MorseLogic();

        // Skriver ut menyn för användaren
        System.out.println("Morsekod-översättare");
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Engelska till Morsekod");
        System.out.println("2. Morsekod till Engelska");
        System.out.print("Ditt val (1 eller 2): ");

        // Läser in vad användaren skriver och sparar i variabeln val
        String val = scanner.nextLine();

        // Kollar vilket val användaren gjorde
        if (val.equals("1")) {

            // Alternativ 1, Engelska till morsekod
            System.out.print("Skriv in text på engelska: ");
            String text = scanner.nextLine();
            // try-catch fångar upp fel som kastas av logikklassen
            try {
                String result = morseLogic.toMorse(text);
                System.out.println("Morsekod: " + result);
            } catch (IllegalArgumentException e) {
                // e.getMessage() hämtar felmeddelandet vi skrev i logikklassen
                System.out.println("Fel: " + e.getMessage());
            }

        } else if (val.equals("2")) {

            // Alternativ 2, Morsekod till engelska
            System.out.print("Skriv in morsekod (separera bokstäver med mellanslag): ");
            String morse = scanner.nextLine();

            // Försöker översätta morsekoden till engelska
            try {
                String result = morseLogic.toEnglish(morse);
                System.out.println("Engelska: " + result);

            // Fångar upp felet och skriver ut ett felmeddelande till användaren
            } catch (IllegalArgumentException e) {
                System.out.println("Fel: " + e.getMessage());
            }

        } else {
            // Om användaren skriver något annat än 1 eller 2
            System.out.println("Fel: Ogiltigt val. Skriv 1 eller 2.");
        }

        // Stänger Scanner-objektet när vi är klara
        scanner.close();
    }
}