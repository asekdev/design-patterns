package AbstractFactory;

public class Motorbike extends Vehicle {

    public Motorbike(String type, String speed) {
        super(type, speed);
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed of 250 km/h");
    }

    @Override
    public void getType() {
        System.out.println("Type of Motorbike");;
    }
}
