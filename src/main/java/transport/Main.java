package transport;

public class Main {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[] {
                new Car("Tesla", 2022, 4),
                new Plane("Boeing", 2019, 2),
                new Ship("Titanic", 1912, false)
        };

        for (Vehicle v : fleet) {
            System.out.println("---- Vehicle Info ----");
            v.displayInfo();
            v.move();
            System.out.println("Capacity: " + v.capacity() + " people");
            if (v instanceof Electric) {
                ((Electric) v).chargeBattery();
            }
            System.out.println();
        }
    }
}
