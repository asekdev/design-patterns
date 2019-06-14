package AbstractFactory;

public class CarFactory implements VehicleAbstractFactory {

    private String speed;
    private String type;
    private Wheels wheels;

    public CarFactory(String speed, String type, Wheels wheels) {
        this.speed = speed;
        this.type = type;
        this.wheels = wheels;
    }

    @Override
    public Vehicle createVehicle() {
        //You can add logic in here to determine what type of car
        //we want to send
        return new Car(this.type, this.speed, this.wheels);
    }
}
