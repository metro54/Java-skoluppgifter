import java.util.InputMismatchException;
import java.util.Scanner;

public class NamePicker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] tal = new int[5];
        int index = 0;

        while (index<tal.length) {
            try {
                System.out.println("Skriv heltal "+ (index+1)+": ");
                tal[index] = scan.nextInt();
                index++;
            } catch (InputMismatchException e) {
                System.out.println("Fel: Du måste skriva ett heltal");
                scan.nextLine();
            }
        }
        // Steg 2, låt användaren välja index i all oändlighet
        while (true) {
            try {
                System.out.println("Skriv vilket index du vill se (0-4)");
                int val = scan.nextInt();
                System.out.println("Värdet på index "+val+" är: "+tal[val]);
            } catch (InputMismatchException e) {
                System.out.println("Fel: Du måste skriva ett heltal.");
                scan.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Fel: Indexet finns inte i arrayen.");
                System.out.println("Giltiga index är 0 till "+(tal.length-1));
            }
        }
        }

    }
