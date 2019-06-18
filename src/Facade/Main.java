package Facade;

public class Main {

    public static void main(String[] args) {
        BankAccountFacade account = new BankAccountFacade(112233,1234);

        account.withdrawCash(100);
    }
}
