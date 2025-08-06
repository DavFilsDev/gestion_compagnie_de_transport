package transport;

public class Ship extends Vehicle {
    private boolean hasSails;

    public Ship(String brand, int year, boolean hasSails) {
        super(brand, year);
        this.hasSails = hasSails;
    }

    @Override
    public void move() {
        System.out.println("The ship is sailing on the ocean.");
    }

    @Override
    public int capacity() {
        return 1000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sails: " + (hasSails ? "Yes" : "No"));
    }
}

