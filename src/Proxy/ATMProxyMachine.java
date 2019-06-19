package Proxy;

public class ATMProxyMachine implements ATMProxy {

    ATMProxy atmMachine;

    public ATMProxyMachine(ATMProxy atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public double getCashInMachine() {
       return this.atmMachine.getCashInMachine();
    }

    @Override
    public void atmStatus() {
        this.atmMachine.atmStatus();
    }
}
