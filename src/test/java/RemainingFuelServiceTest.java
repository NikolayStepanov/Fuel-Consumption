import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.*;

class RemainingFuelServiceTest {
    @Test
    void negativeFuelVolumeLValues(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car(-1, 20);
        });
    }

    @Test
    void negativeFuelConsumptionPerHundredKmValues(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car(20, -7.8);
        });
    }

    @Test
    void zeroValue() {
        Car car = new Car();
        RemainingFuelService service = new RemainingFuelService();

        car.setRefuelingDistanceKm(service.calculateRefuelingDistanceInKm(car));

        assertEquals(0, car.getRefuelingDistanceKm());

    }

    @Test
    void doubleFuelConsumption(){
        Car car = new Car(25,7.5);
        RemainingFuelService service = new RemainingFuelService();

        car.setRefuelingDistanceKm(service.calculateRefuelingDistanceInKm(car));

        assertEquals(333, car.getRefuelingDistanceKm());
    }

    @Test
    void consumptionEqualToVolume(){
        Car car = new Car(10,10);
        RemainingFuelService service = new RemainingFuelService();

        car.setRefuelingDistanceKm(service.calculateRefuelingDistanceInKm(car));

        assertEquals(100, car.getRefuelingDistanceKm());
    }

    @Test
    void fuelVolumeLessFuelConsumption(){
        Car car = new Car(5,7);
        RemainingFuelService service = new RemainingFuelService();

        car.setRefuelingDistanceKm(service.calculateRefuelingDistanceInKm(car));

        assertEquals(71,car.getRefuelingDistanceKm());
    }

    @Test
    void fuelVolumeMoreFuelConsumption(){
        Car car = new Car(40,8);
        RemainingFuelService service = new RemainingFuelService();

        car.setRefuelingDistanceKm(service.calculateRefuelingDistanceInKm(car));

        assertEquals(500,car.getRefuelingDistanceKm());
    }
}