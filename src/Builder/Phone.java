package Builder;

public class Phone {

    private String OS;
    private double screenSize;
    private String colour;

    public Phone(String OS, double screenSize, String colour) {
        this.OS = OS;
        this.screenSize = screenSize;
        this.colour = colour;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Phone [os=" + this.getOS() + ", screen-size=" + this.getScreenSize() +
                ", colour=" + this.getColour() + "]";
    }
}
