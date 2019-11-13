import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car {
    private int fuelVolumeL;
    private double fuelConsumptionPerHundredKm;
    private int refuelingDistanceKm;

    public Car() {
        this(0,0);
    }

    public Car(int fuelVolumeL, double fuelConsumptionPerHundredKm) {
        if(fuelVolumeL < 0 || fuelConsumptionPerHundredKm < 0) {
            throw new IllegalArgumentException("fuelVolumeL and fuelConsumptionPerHundredKm can't be negative");
        }
        this.fuelVolumeL = fuelVolumeL;
        this.fuelConsumptionPerHundredKm = fuelConsumptionPerHundredKm;
    }
}
