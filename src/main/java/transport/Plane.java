package transport;

public class Plane extends Vehicle {
    private int numberOfEngines;

    public Plane(String brand, int year, int numberOfEngines) {
        super(brand, year);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void move() {
        System.out.println("The plane is flying in the sky.");
    }

    @Override
    public int capacity() {
        return 150;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of engines: " + numberOfEngines);
    }
}
