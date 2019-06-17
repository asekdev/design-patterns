package Bridge;

public class DVDDevice extends EntertainmentDevice{

    public DVDDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Skip back");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Skip forward");
    }
}
