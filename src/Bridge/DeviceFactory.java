package Bridge;

public class DeviceFactory {

    private int deviceMax;
    private int deviceState;

    public DeviceFactory(int deviceState,int deviceMax) {
        this.deviceMax = deviceMax;
        this.deviceState = deviceState;
    }

    public AbstractRemote createDevice(String type) {

        AbstractRemote device = null;

        if(type.equalsIgnoreCase("dvd")) {
            device = new DVDRemote(new DVDDevice(this.deviceState, this.deviceMax));
        } else {
            device = new TVRemote(new TVDevice(this.deviceState, this.deviceMax));
        }

        return device;
    }
}
