package BankFramworks;

public abstract class BankFactory {
    // Abstract method to create a new SavingAcc
    public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);

    // Abstract method to create a new CurrentAcc
    public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}
