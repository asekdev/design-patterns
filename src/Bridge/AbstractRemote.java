package Bridge;

public abstract class AbstractRemote {

    private EntertainmentDevice device;

    public AbstractRemote(EntertainmentDevice ed) {
        this.device = ed;
    }

    public EntertainmentDevice getDevice() {
        return this.device;
    }

    public void buttonFivePressed() {
        device.buttonFivePressed();
    }

    public void buttonSixPressed() {
        device.buttonSixPressed();
    }

    public abstract void buttonNinePressed();
}
