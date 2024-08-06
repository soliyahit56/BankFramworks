package BankFramworks;

public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 500.0f;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + getAccBal());
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + MINBAL + " must be maintained.");
        }
    }

    @Override
    public void deposit(float amount) {
        setAccBal(getAccBal() + amount);
        System.out.println("Deposit of " + amount + " successful. New balance: " + getAccBal());
    }

    @Override
    public String toString() {
        return "MMSavingAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                ", isSalaried=" + isSalaried() +
                '}';
    }
}
