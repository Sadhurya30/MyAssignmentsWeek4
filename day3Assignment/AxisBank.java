package week4.day3Assignment;

public class AxisBank extends  BankInfo {
	
	public void deposit() {
		System.out.println("Fixed and recurring deposit are available");
	}

	public static void main(String[] args) {
		
      AxisBank axis = new AxisBank();
      axis.deposit();
      
	}

}
