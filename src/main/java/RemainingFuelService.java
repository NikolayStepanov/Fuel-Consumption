public class RemainingFuelService {
    public int calculateRefuelingDistanceInKm(Car car) {
        double fuelConsumption = car.getFuelConsumptionPerHundredKm()/100;
        return (int)(car.getFuelVolumeL()/fuelConsumption);
    }
}
