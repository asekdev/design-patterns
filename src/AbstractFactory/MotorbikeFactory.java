package AbstractFactory;

public class MotorbikeFactory implements VehicleAbstractFactory {

    private String speed;
    private String type;
    private Wheels wheels;

    public MotorbikeFactory(String speed, String type, Wheels wheels) {
        this.speed = speed;
        this.type = type;
        this.wheels = wheels;
    }

    @Override
    public Vehicle createVehicle() {
        return new Motorbike(this.type, this.speed, this.wheels);
    }
}
