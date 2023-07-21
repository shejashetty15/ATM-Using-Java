package p1;

public class Deposit implements Transactions{
	public void process(int amt) {
		b.totBal=b.totBal+amt;
		System.out.println("Deposited Amount is "+amt);
		System.out.println("Current Balance "+b.totBal);
		System.out.println("Thank You for Banking With Us");

	}

}
