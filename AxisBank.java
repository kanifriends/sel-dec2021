package week3.day1;

public class AxisBank extends BankInfo {
	
	
	public void deposit() {
		System.out.println("deposit amount is 300000");
	}

	public static void main(String[] args) {
		AxisBank acc=new AxisBank();
		
        acc.fixed();
		acc.deposit();
		
	}

}

