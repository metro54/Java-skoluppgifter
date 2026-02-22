package Extendsovning;

public class Race {
    public static void main(String[] args) {

        Car car = new Car();

        car.increaseSpeed(30);
        car.showSpeed();

        Bicycle bike = new Bicycle();
        bike.setNbrOfGears(3); // Ställ in antal växlar
        bike.increaseSpeed(5); // öka hastigheten beroende på växel
        bike.showSpeed(); //Skriv ut hastigheten


    }
}



