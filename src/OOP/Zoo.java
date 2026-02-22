package OOP;

import java.util.Scanner;

public class Zoo {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)

        try {
            System.out.println("Skriv in grodans namn: ");
            String name = scan.nextLine();

            System.out.println("Skriv in grodans ålder: ");
            int age = scan.nextInt();

            System.out.println("Hur långt hoppar grodan (m): ");
            int length = scan.nextInt();

            System.out.println("Hur många hopp ska grodan göra?: ");
            int numberOfJumps = scan.nextInt();

            Frog frog = new Frog(name, age);

            frog.printName(); //Skriver ut namnet
            frog.jump(length, numberOfJumps); //Visar beteendet
        } catch (Exception e) {
            System.out.println("Felaktig inmatning! Försök igen!");
        }
    }
}
