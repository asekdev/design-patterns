package Facade;

// The Facade Design Pattern decouples or separates the client
// from all of the sub components

// The Facades aim is to simplify interfaces so you don't have
// to worry about what is going on under the hood

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountCheck acctChecker;
    PinCheck codeChecker;
    FundsCheck fundChecker;



    public BankAccountFacade(int newAcctNum, int newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;



        acctChecker = new AccountCheck();
        codeChecker = new PinCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }

    public int getSecurityCode() { return securityCode; }


    public void withdrawCash(double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeValid(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }


    public void depositCash(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeValid(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

}