package ovning1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        HashMap<String, Adress> people = new HashMap<>();

        //Lägg in några exempelposter
        people.put("Anna", new Adress("Storgatan 12", 72210));
        people.put("Gustav", new Adress("Björkvägen 7", 72345));
        people.put("Maria", new Adress("Ekvägen 3", 72430));

        Scanner scan = new Scanner(System.in);

        System.out.println("Sök efter namn:");
        String name = scan.nextLine();

        if (people.containsKey(name)) {
            Adress a = people.get(name);
            System.out.println("Gatuadress: "+a.getStreet());
            System.out.println("Postnummer: "+a.getPostalCode());
        } else {
            System.out.println("Namnet finns inte i registret.");
        }

    }
}
