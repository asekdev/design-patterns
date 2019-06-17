package Bridge;

public abstract class EntertainmentDevice {

    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void buttonSevenPressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonEightPressed() {
        if(volumeLevel != 0) {
            volumeLevel--;
        }
        System.out.println("Volume at: " + volumeLevel);
    }
}
