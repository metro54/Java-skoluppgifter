package inlamningsuppgift2;

import java.util.HashMap;

public class MorseLogic {

    // Skapar två HashMaps, En HashMaps för att slå upp morsekod till bokstäver
    //Och en HashMaps för att slå upp bokstäver till morsekod
    private HashMap<String, String> englishToMorse = new HashMap<>();
    private HashMap<String, String> morseToEnglish = new HashMap<>();

    // Här fylls alla bokstäver i och deras morsekoder
    public MorseLogic() {
        addLetter("A", ".-");
        addLetter("B", "-...");
        addLetter("C", "-.-.");
        addLetter("D", "-..");
        addLetter("E", ".");
        addLetter("F", "..-.");
        addLetter("G", "--.");
        addLetter("H", "....");
        addLetter("I", "..");
        addLetter("J", ".---");
        addLetter("K", "-.-");
        addLetter("L", ".-..");
        addLetter("M", "--");
        addLetter("N", "-.");
        addLetter("O", "---");
        addLetter("P", ".--.");
        addLetter("Q", "--.-");
        addLetter("R", ".-.");
        addLetter("S", "...");
        addLetter("T", "-");
        addLetter("U", "..-");
        addLetter("V", "...-");
        addLetter("W", ".--");
        addLetter("X", "-..-");
        addLetter("Y", "-.--");
        addLetter("Z", "--..");
    }

    // Metod som ger respektive bokstav sin motsvarande morsekod
    private void addLetter(String letter, String morse) {
        englishToMorse.put(letter, morse);
        morseToEnglish.put(morse, letter);
    }


    // Metod som översätter engelska bokstäver till morsekod
    public String toMorse(String text) {

        // Första felhanteringen
        // Kastar ett fel om texten är null eller tom
        // trim() tar bort mellanslag i början och slutet
        // isEmpty() kollar om strängen är helt tom
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Texten får inte vara tom!");
        }

        // Gör om texten till stora bokstäver så "hello" och "HELLO" fungerar lika
        text = text.toUpperCase();


        // Vi lägger vi till en morsekod i taget
        StringBuilder result = new StringBuilder();

        // Loopar igenom varje bokstav i texten
        // text.length() ger antalet bokstäver
        // text.charAt(i) ger bokstaven på position i
        for (int i = 0; i < text.length(); i++) {
            // Gör om tecknet till en String så vi kan söka i HashMap
            String letter = String.valueOf(text.charAt(i));

            // Om tecknet är ett mellanslag, hoppar vi över det och fortsätter loopen
            if (letter.equals(" ")) {
                continue;
            }

            // Andra felhanteringen
            // Kastar ett fel om bokstaven inte finns i vår uppslagsbok
            // Exempelvis om användaren skriver siffror eller specialtecken
            if (!englishToMorse.containsKey(letter)) {
                throw new IllegalArgumentException("Ogiltigt tecken: " + letter);
            }

            // Hämtar morsekoden för bokstaven och lägger till i resultatet
            result.append(englishToMorse.get(letter));

            // Lägger till ett mellanslag mellan varje bokstav
            // men inte efter sista bokstaven
            if (i < text.length() - 1) {
                result.append(" ");
            }
        }
        // trim() tar bort eventuella extra mellanslag i början/slutet
        return result.toString().trim();
    }

    // Metod som översätter morsekod till engelska bokstäver
    public String toEnglish(String morse) {

        // Felhantering 1, kastar ett fel om morsekoden är null eller tom
        if (morse == null || morse.trim().isEmpty()) {
            throw new IllegalArgumentException("Morsekoden får inte vara tom!");
        }

        // split(" ") delar upp texten vid varje mellanslag och ger en array
        String[] parts = morse.trim().split(" ");

        // StringBuilder för att bygga upp det engelska resultatet
        StringBuilder result = new StringBuilder();

        // Loopar igenom varje morsekod i arrayen
        for (String part : parts) {

            // Felhantering 2, Kastar ett fel om morsekoden inte finns i vår uppslagsbok
            if (!morseToEnglish.containsKey(part)) {
                throw new IllegalArgumentException("Okänd morsekod: " + part);
            }

            // Slår upp vad morsekoden betyder och lägger till bokstaven i resultatet
            result.append(morseToEnglish.get(part));
        }

        return result.toString();
    }
}