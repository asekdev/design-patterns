package AbstractFactory;

public class Main {

    public static void main(String[] args) {


        Vehicle car = VehicleFactory.getVehicleFactory(new CarFactory("100", "Car", new Wheels("Yokohoma", "Offroading")));

        car.getSpeed();

        Vehicle bike = VehicleFactory.getVehicleFactory(new MotorbikeFactory("100", "Car", new Wheels("Perelli", "Sports")));

        bike.getSpeed();
        System.out.println(bike.getWheels().getBrand() + "tyres");
        System.out.println("Car has " + car.getWheels().getType() + " wheels");

        Vehicle v = null;

        int numWheels = 2;

        if(numWheels == 4) {
            v = VehicleFactory.getVehicleFactory(new CarFactory("100", "Car", new Wheels("Yokohoma", "Offroading")));
        } else {
            v = VehicleFactory.getVehicleFactory(new MotorbikeFactory("100", "Car", new Wheels("Perelli", "Sports")));
        }

        System.out.println("Vechicle created!");
        v.getType();

    }
}
