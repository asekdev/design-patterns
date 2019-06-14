package AbstractFactory;

public class MotorbikeFactory implements VehicleAbstractFactory {

    private String speed;
    private String type;

    public MotorbikeFactory(String speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    @Override
    public Vehicle createVehicle() {
        return new Motorbike(this.type, this.speed);
    }
}
