package edu.kau.fcit.cpit252;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarCloning() {
        Car originalCar = new Car("Toyota", "Corolla", 2020);
        Car clonedCar = originalCar.clone();

        assertNotSame(originalCar, clonedCar, "Cloned car should be a new object");
        assertEquals(originalCar.getMake(), clonedCar.getMake(), "Make should be the same");
        assertEquals(originalCar.getModel(), clonedCar.getModel(), "Model should be the same");
        assertEquals(originalCar.getYear(), clonedCar.getYear(), "Year should be the same");
        assertNotSame(originalCar.recalls, clonedCar.recalls, "Recalls list should be a deep copy");
    }
}
