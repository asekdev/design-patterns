package Bridge;

public class Main {

    public static void main(String[] args) {

        //Create the devices
        AbstractRemote tv = new TVRemote(new TVDevice(1, 100));

        tv.buttonFivePressed();
        tv.buttonSixPressed();
        tv.getDevice().buttonEightPressed();
        tv.buttonNinePressed();

        System.out.println();

        AbstractRemote dvd = new DVDRemote(new DVDDevice(1, 100));

        dvd.buttonFivePressed();
        dvd.buttonNinePressed();
        dvd.buttonSixPressed();
        dvd.getDevice().buttonEightPressed();
//
//        DeviceFactory deviceFactory = new DeviceFactory(1, 100);
//
//        AbstractRemote dvdDevice = deviceFactory.createDevice("dvd");
//
//        dvdDevice.getDevice().buttonEightPressed();
//        System.out.println("DVD AREA -------");
//        dvdDevice.buttonSixPressed();
//        dvdDevice.buttonFivePressed();
//        dvdDevice.buttonNinePressed();
//        dvdDevice.getDevice().buttonEightPressed();
//
//        AbstractRemote tvDevice = deviceFactory.createDevice("tv");
//        System.out.println("TV AREA --------");
//        tvDevice.buttonSixPressed();
//        tvDevice.buttonFivePressed();
//        tvDevice.getDevice().buttonSevenPressed();
//        tvDevice.getDevice().buttonEightPressed();
//        tvDevice.buttonNinePressed();

    }
}
