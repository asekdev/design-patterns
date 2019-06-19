package Proxy;

public class Main {

    public static void main(String[] args) {

        //Create the ATM Machine
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.setCashInATM(20000);

        //Create object as interface reference (hiding our internal methods)
        //we can only access the methods from within the Interface
        ATMProxy realATM = atmMachine;

        //Dependency injection with ATMProxy object created above.
        ATMProxy proxyATM = new ATMProxyMachine(atmMachine);

        //We do not have access to getters/setters. Only the methods from the interfaces.
        System.out.println("Money in ATM: $" + proxyATM.getCashInMachine());
        proxyATM.atmStatus();

    }
}
