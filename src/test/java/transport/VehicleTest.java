package transport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCar() {
        Car car = new Car("Tesla", 2022, 4);

        assertEquals("Tesla", car.brand);
        assertEquals(2022, car.year);
        assertEquals(5, car.capacity());

        // Tester la méthode move (ici on teste juste qu'elle ne lance pas d'exception)
        assertDoesNotThrow(car::move);

        // Tester displayInfo (on peut rediriger la sortie si on veut, ici on teste simplement qu'elle fonctionne)
        assertDoesNotThrow(car::displayInfo);

        // Interface Electric
        assertTrue(car instanceof Electric);
        assertDoesNotThrow(car::chargeBattery);
    }

    @Test
    void testPlane() {
        Plane plane = new Plane("Boeing", 2019, 2);

        assertEquals("Boeing", plane.brand);
        assertEquals(2019, plane.year);
        assertEquals(150, plane.capacity());

        assertDoesNotThrow(plane::move);
        assertDoesNotThrow(plane::displayInfo);

        assertFalse(plane instanceof Electric);
    }

    @Test
    void testShip() {
        Ship ship = new Ship("Titanic", 1912, false);

        assertEquals("Titanic", ship.brand);
        assertEquals(1912, ship.year);
        assertEquals(1000, ship.capacity());

        assertDoesNotThrow(ship::move);
        assertDoesNotThrow(ship::displayInfo);

        assertFalse(ship instanceof Electric);
    }
}
