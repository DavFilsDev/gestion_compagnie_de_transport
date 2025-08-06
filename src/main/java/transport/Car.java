package transport;

public class Car extends Vehicle implements Electric {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }

    @Override
    public int capacity() {
        return 5;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the electric car's battery...");
    }
}
