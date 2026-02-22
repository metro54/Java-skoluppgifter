package ovning1;

import java.util.HashMap;
import java.util.Scanner;

public class Character1 {
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();

        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

        //Loopa igenom alla positioner i stärngarna
        for (int i=0;i<alfabet.length();i++) {
            char letter = alfabet.charAt(i);
            char symbol = symbols.charAt(i);

            //lägger in i Hashmap
            map.put(letter,symbol);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett ord med små bokstäver: ");
        String input = scan.nextLine();

        System.out.println("Konverterat: ");
        for (int i=0;i<input.length();i++) {
            char letter = input.charAt(i);
            char symbol = map.get(letter);
            System.out.println(symbol);
        }

    }
}
