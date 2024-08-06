package BankFramworks;


public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + getCreditLimit() >= amount) {
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + getAccBal());
        } else {
            System.out.println("Withdrawal denied. Insufficient funds including credit limit.");
        }
    }
    @Override
    public void deposit(float amount) {
        setAccBal(getAccBal() + amount);
        System.out.println("Deposit of " + amount + " successful. New balance: " + getAccBal());
    }

    @Override
    public String toString() {
        return "MMCurrentAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                ", creditLimit=" + getCreditLimit() +
                '}';
    }
}
