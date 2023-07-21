package p1;

public class Withdraw implements Transactions {
	public  void process(int amt) {
		if (amt>b.totBal) {
			System.out.println("No Sufficient Amount");
			System.out.println("Transaction Not  Succesful");
			System.out.println("Thank You for Banking With Us");

		}
		else {
			System.out.println("Transaction Succesful");
			System.out.println("Amount Withdrawn "+amt);
			b.totBal=b.totBal-amt;
			System.out.println("Current Balance "+b.totBal);
			System.out.println("Thank You for Banking With Us");

		}
	}

}
