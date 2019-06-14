package AbstractFactory;

public class Car extends Vehicle {

    public Car(String type, String speed, Wheels wheels) {
        super(type, speed, wheels);
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
