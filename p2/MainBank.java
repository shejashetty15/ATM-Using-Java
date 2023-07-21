package p2;
import p1.*;
import java.util.*;
public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome To India Banks");
		System.out.println("==================================================");
		checkPin cp=new checkPin();
		//after swiping the card
		int n=0;
		Withdraw w=new Withdraw();
		Deposit d=new Deposit();
		while(n<3) {
			System.out.println("Enter Your Pin Number");
		    int pin=s.nextInt();
		    boolean p=cp.PinCheck(pin);
		    if(p==false) {
	    		System.out.println("======================================");
		    	System.out.println("***Invalid pin***");
	    		System.out.println("=====================================");

		    	n++;
		    	 if(n>=3) {
		    		System.out.println("Transcation blocked");
		    		break;
		    }
		    	 continue;
		    }
		    else {
		    	System.out.println("Please Select a Option");
		    	System.out.println("1.Withdraw\n2.Deposit\n3.View Balance");
		    	switch(s.nextInt()) {
		    	case 1:
			    	System.out.println("Enter an Amount to Withdraw");
			    	System.out.println();
			    	System.out.println("****Only Multiples 100 of are Available**");
			    	int amt=s.nextInt();
			    	if(amt!=0&&amt%100==0) {
			    		System.out.println("=======================");
			    		w.process(amt);
			    	}
			    	else {
			    		System.out.println("Transaction Cancelled");
			    		System.out.println("=======================");
			    	}
			    	break;			    		
		    	case 2:
		    		System.out.println("Deposit Now");
		    		System.out.println("***Place Cash corretly on the tray***");
		    		System.out.println("Please wait while your transaction is being proccessed");
			    	System.out.println("..................");
			    	System.out.println("Enter the Deposited Amount");
			    	int amt1=s.nextInt();
		    		System.out.println("=======================");
			    	d.process(amt1);
			    	break;
		    	case 3:
		    		Balance b1=new Balance();
		    		b1.getBalance();
		    		System.out.println("=======================");
		    		System.out.println("Thank You for Banking With Us");
		    		break;
		    	default:
		    		System.out.println("wrong choice");
		    		System.out.println("Transaction Failed");
		    		System.out.println("==================================");
		    		break;
		    	}
		    	

		    	
		    
		    }
		break;
		}
		s.close();
		}

}
