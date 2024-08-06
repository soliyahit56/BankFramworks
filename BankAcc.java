package BankFramworks;

public abstract class BankAcc {
    private int accNo; 
    private String accNm;
    private float accBal;
    
    // Constructor
    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    

    public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public String getAccNm() {
		return accNm;
	}



	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}



	public float getAccBal() {
		return accBal;
	}



	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}



	public abstract void withdraw(float amount);

    public abstract void deposit(float amount);


    @Override
    public String toString() {
        return "BankAcc{" +
                "accNo=" + accNo +
                ", accNm='" + accNm + '\'' +
                ", accBal=" + accBal +
                '}';
    }
}
