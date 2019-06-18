package Facade;

public class AccountCheck {

    private int accountNumber = 112233;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public boolean accountActive(int accNo) {
        if(accNo == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
