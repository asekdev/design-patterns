package AbstractFactory;

public class Car extends Vehicle {

    public Car(String type, String speed) {
        super(type, speed);
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed of 100 km/h");
    }

    @Override
    public void getType() {
        System.out.println("Type of Car");;
    }
}
