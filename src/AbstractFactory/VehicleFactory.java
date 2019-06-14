package AbstractFactory;

public class VehicleFactory {

    public static Vehicle getVehicleFactory(VehicleAbstractFactory vehicle) {
        return vehicle.createVehicle();
    }
}
