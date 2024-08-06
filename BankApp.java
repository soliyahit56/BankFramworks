package BankFramworks;
public class BankApp {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();
        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "Hit Soliya", 1000.0f, true);
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(102, "Hit Soliya", 2000.0f, 500.0f);
        savingAcc.withdraw(200.0f);
        currentAcc.withdraw(2500.0f);
        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}
