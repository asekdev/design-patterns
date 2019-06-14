package AbstractFactory;

public class Main {

    public static void main(String[] args) {


        Vehicle car = VehicleFactory.getVehicleFactory(new CarFactory("100", "Car"));

        car.getSpeed();

        Vehicle bike = VehicleFactory.getVehicleFactory(new MotorbikeFactory("100", "Car"));

        bike.getSpeed();

    }
}
