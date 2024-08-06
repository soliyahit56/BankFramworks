package BankFramworks;

public abstract class CurrentAcc extends BankAcc {
	
    private final float creditLimit; // Read Only

   
    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

   
    public float getCreditLimit() {
        return creditLimit;
    }

   
    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + getAccBal());
        } else {
            System.out.println("Withdrawal denied. Insufficient funds including credit limit.");
        }
    }

   
    @Override
    public String toString() {
        return "CurrentAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", accBal=" + getAccBal() +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
