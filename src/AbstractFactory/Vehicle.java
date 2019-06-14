package AbstractFactory;

public abstract class Vehicle {

    private String type;
    private String speed;
    private Wheels wheels;

    public Vehicle(String type, String speed, Wheels wheels) {
        this.type = type;
        this.speed = speed;
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    abstract void getSpeed();
    abstract void getType();
}
