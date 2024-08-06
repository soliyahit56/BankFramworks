package BankFramworks;

public abstract class SavingAcc extends BankAcc {
    // Fields
    private boolean isSalaried; // Read Only
    private static final float MINBAL = 500.0f; // Read Only

    // Constructor
    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    // Getter for isSalaried
    public boolean isSalaried() {
        return isSalaried;
    }

    // Overridden withdraw method
    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            // Assuming there's a protected method in BankAcc to update accBal
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + getAccBal());
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + MINBAL + " must be maintained.");
        }
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "SavingAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                ", isSalaried=" + isSalaried +
                '}';
    }
}

