package Extendsovning;

public class Bicycle extends Vehicle {
    int nbr;

    public void setNbrOfGears(int nbr){
        this.nbr = nbr;
    }

    @Override
    public void increaseSpeed(int force) {
        speed += force * nbr;
    }
}
