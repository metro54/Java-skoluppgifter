package ovning1;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    static void main(String[] args) {

    NameAgeLookUp lookup = new NameAgeLookUp();

    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv ett namn");
    String name = scan.nextLine();

    if (lookup.getAge(name) > 0) {
        System.out.println(name+" är "+lookup.getAge(name)+" år.");
    } else {
        System.out.println("Namnet finns inte i listan.");
    }


    }
}
