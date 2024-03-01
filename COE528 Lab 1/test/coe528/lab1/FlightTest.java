package coe528.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {

    @Test
    public void testGettersAndSetters() {
        Flight instance = new Flight(12, 80, 150, "JFK", "YYZ", "12:30pm");

        assertEquals(12, instance.getFlightNumber());
        assertEquals(80, instance.getCapacity());
        assertEquals(150, instance.getOriginalPrice());
        assertEquals("JFK", instance.getOrigin());
        assertEquals("YYZ", instance.getDestination());
        assertEquals("12:30pm", instance.getDepartureTime());

        instance.setFlightNumber(15);
        instance.setCapacity(90);
        instance.setOriginalPrice(200);
        instance.setOrigin("LAX");
        instance.setDestination("SFO");
        instance.setDepartureTime("10:00am");

        assertEquals(15, instance.getFlightNumber());
        assertEquals(90, instance.getCapacity());
        assertEquals(200, instance.getOriginalPrice());
        assertEquals("LAX", instance.getOrigin());
        assertEquals("SFO", instance.getDestination());
        assertEquals("10:00am", instance.getDepartureTime());
    }

    @Test
    public void testConstructorWithInvalidArguments() {
        System.out.println("Test constructor with invalid arguments");
        assertThrows(IllegalArgumentException.class, () -> {
            new Flight(12, 80, 150, "JFK", "JFK", "12:30pm");
        });
    }

    @Test
    public void testBookASeat() {
        System.out.println("Test bookASeat method within the Flight class");
        Flight instance = new Flight(12, 80, 150, "JFK", "YYZ", "12:30pm");
        boolean expResult = true;
        boolean result = instance.bookASeat();

        assertEquals(expResult, result);
    }
}
