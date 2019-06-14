package AbstractFactory;

public abstract class Vehicle {

    private String type;
    private String speed;

    public Vehicle(String type, String speed) {
        this.type = type;
        this.speed = speed;
    }

    abstract void getSpeed();
    abstract void getType();
}
