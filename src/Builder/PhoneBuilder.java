package Builder;

public class PhoneBuilder {

    private String OS;
    private double screenSize;
    private String colour;

    public PhoneBuilder addOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder addScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder addColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Phone getPhone() {
        return new Phone(this.OS, this.screenSize, this.colour);
    }
}
