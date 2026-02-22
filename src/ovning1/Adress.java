package ovning1;

public class Adress {
    private String street;
    private int postalCode;

    public Adress(String street, int postalCode) {
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }
}
