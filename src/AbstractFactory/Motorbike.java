package AbstractFactory;

public class Motorbike extends Vehicle {

    public Motorbike(String type, String speed, Wheels wheels) {
        super(type, speed, wheels);
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
