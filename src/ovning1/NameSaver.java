package ovning1;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSaver {

    static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("Skriv ett namn (eller stop för att avsluta): ");
            input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            names.add(input);
    }
        System.out.println("Alla namn sparade");
        for (String name : names) {
            System.out.println(name);
        }
        if (!names.isEmpty()) {
            names.set(0, "NyttNamn");
        }
        if (names.size() > 1) {
            String first = names.get(0);
            String last = names.get(names.size() - 1);

            names.set(0,last);
            names.set(names.size() - 1, first);
        }
        System.out.println("Efter ändringar");
        for (String name: names) {
            System.out.println(name);
        }
    }
}
