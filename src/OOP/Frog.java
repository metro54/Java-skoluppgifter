package OOP;

public class Frog {
    String name; //attribut för djurets namn
    int age;

    // konstruktor som tar emot namnet
    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //metod som skriver ut namnet
    public void printName() {
        System.out.println("Frog's name is: "+name+", Age: "+age);
    }

    //metod som representerar ett beteende
    public void jump(int length, int numberOfJumps) {
        System.out.println(name+" jumps "+length+"m and jumps "+numberOfJumps+" each times he jumps");
    }
}
