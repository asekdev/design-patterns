package Facade;

public class PinCheck {

    private int pin = 1234;

    public int getPin() {
        return this.pin;
    }

    public boolean isCodeValid(int pinToCheck) {
        if(pinToCheck == getPin()) {
            return true;
        } else {
            return false;
        }
    }
}
