package Proxy;

public class ATMMachine implements ATMProxy {

    private double cashInATM = 10000;
    private boolean inService = true;


    public boolean getInService() {
        return this.inService;
    }

    public void setCashInATM(double cashInATM) {
        this.cashInATM = cashInATM;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    @Override
    public double getCashInMachine() {
        return this.cashInATM;
    }

    @Override
    public void atmStatus() {
        if(this.getInService()) {
            System.out.println("ATM is running and online.");
        } else {
            System.out.println("ATM is not and offline.");
        }
    }
}
