package AbstractFactory;

public class CarFactory implements VehicleAbstractFactory {

    private String speed;
    private String type;

    public CarFactory(String speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(this.type, this.speed);
    }
}
